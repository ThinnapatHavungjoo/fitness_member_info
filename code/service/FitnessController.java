package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class FitnessController{
    @RequestMapping("/check")
    Iterable check() {
        return repository.findAll();
    }
    
    @RequestMapping("/save")
    String save() {
        try {
            Member_info m = new Member_info();
            m.name = "Devid Thonchai";
            m.gender = 'M';
            m.style = "cadio";
            m.email = "devid.t@mymail.com";
        } catch (Exception e) {
            System.out.println(e);
        }
        return "Success";
    }

    @RequestMapping("/api/add-member")
    String addMember(
        String name,
        char gender,
        String style,
        String email
        ) {
            Member_info newMember = new Member_info();
            newMember.name = name;
            newMember.gender = gender;
            newMember.style = style;
            newMember.email = email;
            repository.save(newMember);
            return "Success";
    }
    
    
    @Autowired FitnessRepository repository;
}
/*
@RestController
class FitnessController{
    @RequestMapping("/api/add-member")
    String addMember(
        String name,
        char gender,
        String style,
        String email
        ) {
            Member_info newMember = new Member_info();
            newMember.name = name;
            newMember.gender = gender;
            newMember.style = style;
            newMember.email = email;
            fitnessRepository.save(newMember);
            return "Success";
    }
    
    @RequestMapping("/api/list-all")
    Iterable showAll() {
        return fitnessRepository.findAll();
    }
    
    @Autowired FitnessRepository fitnessRepository;
}
*/

/*
@RestController
class FitnessController{
    @RequestMapping("/api/add-member")
    String addMember(String first_name,
                     String last_name,
                     String nickname,
                     char gender,
                     double height,
                     double weight,
                     String style,
                     String email
                     ) {
        Member_info newMember = new Member_info();
        newMember.first_name = first_name;
        newMember.last_name = last_name;
        newMember.nickname = nickname;
        newMember.gender = gender;
        newMember.height = height;
        newMember.weight = weight;
        newMember.style = style;
        newMember.email = email;
        fitnessRepository.save(newMember);
        return "Success";
    }
    
    @RequestMapping("/api/list-all")
    Iterable showAll() {
        return fitnessRepository.findAll();
    }
    
    @Autowired FitnessRepository fitnessRepository;
}
*/
