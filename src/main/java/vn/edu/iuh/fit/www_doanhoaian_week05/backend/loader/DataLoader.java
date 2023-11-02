//package vn.edu.iuh.fit.www_doanhoaian_week05.backend.loader;
//
//import com.neovisionaries.i18n.CountryCode;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Address;
//import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Candidate;
//import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.AddressService;
//import vn.edu.iuh.fit.www_doanhoaian_week05.backend.services.CandidateService;
//
//import java.time.LocalDate;
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
//    @Override
//    public void run(String... args) throws Exception {
//        // Example: Adding an address
//        Address address = new Address("123 Binh Thanh", "HCM", CountryCode.VN, "123456", "10001");
//        addressService.addAddress(address);
//
//        // Example: Adding a candidate with the saved address
//        Candidate candidate = new Candidate(LocalDate.of(2002, 1, 9), "123.doe@example.com", "Hoai An", "123456789", address);
//        candidateService.addCan(candidate);
//    }
//}
