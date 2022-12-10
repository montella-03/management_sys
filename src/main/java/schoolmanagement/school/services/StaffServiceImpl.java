package schoolmanagement.school.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import schoolmanagement.school.Entity.StaffEntity;
import schoolmanagement.school.model.StaffModel;
import schoolmanagement.school.repository.StaffRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    private StaffRepository staffRepository;
    @Override
    public StaffModel createStaff(StaffModel staffModel) {
        StaffEntity staffEntity = new StaffEntity();
        BeanUtils.copyProperties(staffModel,staffEntity);
        staffRepository.save(staffEntity);
        return staffModel;
    }

    @Override
    public List<StaffModel> getAllStaff() {
        List<StaffEntity> staffEntities = staffRepository.findAll();
        return staffEntities.stream().map(staffEntity ->
                new StaffModel(staffEntity.getId(),
                        staffEntity.getFirstName(),
                        staffEntity.getLastName(),
                        staffEntity.getDepartment(),
                        staffEntity.getEmail()))
                .collect(Collectors.toList());
    }
}
