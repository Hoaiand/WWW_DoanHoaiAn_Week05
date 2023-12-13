//package vn.edu.iuh.fit.www_doanhoaian_week05.backend.loader;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.CandidateService;
//
//@Component
//public class DataLoader implements CommandLineRunner {
//
//    @Autowired
//    private CandidateService candidateService;
//
//    @Autowired
//    private AddressService addressService;
//
//    @Autowired
//    private SkillService skillService;
//    private SkillService skillServices;
//
//    @Override
//    public void run(String... args) throws Exception {
//        // Example: Adding an address
////        Address address = new Address("123 Binh Thanh", "HCM", CountryCode.VN, "123456", "10001");
////        addressService.addAddress(address);
////
////        // Example: Adding a candidate with the saved address
////        Candidate candidate = new Candidate(LocalDate.of(2002, 1, 9), "123.doe@example.com", "Hoai An", "123456789", address);
////        candidateService.addCan(candidate);
//
//        Skill skill1 = new Skill("React", "ReactJS", SkillType.FONT_END);
//
//        Skill skill2 = new Skill("Spring Boot", "Spring", SkillType.BACK_END);
//
//        Skill skill3 = new Skill("Fullstack", "Fullstack", SkillType.FULL_STACK);
//
//
//        skillService.saveSkill(skill1);
//        skillService.saveSkill(skill2);
//        skillService.saveSkill(skill3);
//
//
//    }
//}
