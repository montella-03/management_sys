package schoolmanagement.school.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffModel {
    private Long id;
    private String firstName;
    private String lastName;
    private String Department;
    private String email;
}
