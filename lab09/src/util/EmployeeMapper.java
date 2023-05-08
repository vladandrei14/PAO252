package util;

import exception.EntityNotFoundException;
import model.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeMapper {

    public static Employee mapEntity(ResultSet resultSet) throws EntityNotFoundException {
        List<Employee> result = mapEntities(resultSet);
        if (result.size() != 0) {
            return result.get(0);
        }
        throw new EntityNotFoundException();
    }

    public static List<Employee> mapEntities(ResultSet resultSet) {
        List<Employee> result = new ArrayList<>();
        try {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String department = resultSet.getString("department");
                result.add(new Employee(id, name, department));
            }
        } catch (SQLException e) {
            System.out.println("DB access issue");
        }
        return result;
    }
}

