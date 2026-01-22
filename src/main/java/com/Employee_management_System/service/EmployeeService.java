package com.Employee_management_System.service;

import com.Employee_management_System.dto.EmployeeDTO;
import com.Employee_management_System.entity.EmployeeEntity;
import com.Employee_management_System.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Convert entity to DTO
    private EmployeeDTO toDTO(EmployeeEntity employee) {
        return new EmployeeDTO(employee.getId(), employee.getName(), employee.getEmail(), employee.getRole());
    }

    // Convert DTO to entity
    private EmployeeEntity toEntity(EmployeeDTO dto) {
        EmployeeEntity employee = new EmployeeEntity();
        employee.setName(dto.getName());
        employee.setEmail(dto.getEmail());
        employee.setRole(dto.getRole());
        return employee;
    }

    // Get all employees
    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    // Get employee by ID
    public EmployeeDTO getEmployeeById(Long id) {
        EmployeeEntity employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
        return toDTO(employee);
    }

    // Create a single employee
    public EmployeeDTO createEmployee(EmployeeDTO dto) {
        EmployeeEntity employee = toEntity(dto);
        EmployeeEntity saved = employeeRepository.save(employee);
        return toDTO(saved);
    }

    // Create multiple employees at once
    public List<EmployeeDTO> createEmployees(List<EmployeeDTO> dtos) {
        return dtos.stream()
                .map(this::createEmployee)
                .collect(Collectors.toList());
    }

    // Update employee
    public EmployeeDTO updateEmployee(Long id, EmployeeDTO dto) {
        EmployeeEntity employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
        employee.setName(dto.getName());
        employee.setEmail(dto.getEmail());
        employee.setRole(dto.getRole());
        EmployeeEntity updated = employeeRepository.save(employee);
        return toDTO(updated);
    }

    // Delete employee
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
