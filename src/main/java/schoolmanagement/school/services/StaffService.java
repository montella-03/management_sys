package schoolmanagement.school.services;

import schoolmanagement.school.model.StaffModel;

import java.util.List;

public interface StaffService {
    StaffModel createStaff(StaffModel staffModel);

    List<StaffModel> getAllStaff();
}
