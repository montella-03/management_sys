package schoolmanagement.school.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import schoolmanagement.school.model.StaffModel;
import schoolmanagement.school.services.StaffServiceImpl;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class StaffController {
    @Autowired
    private final StaffServiceImpl staffServiceImpl;

    public StaffController(StaffServiceImpl staffServiceImpl) {
        this.staffServiceImpl = staffServiceImpl;
    }
    @PostMapping("/staff")
    public StaffModel createStaff(@RequestBody StaffModel staffModel){
        return staffServiceImpl.createStaff(staffModel);
    }
    @GetMapping("/staff")
    public List<StaffModel> getAllStaff(){
        return staffServiceImpl.getAllStaff();

    }
}
