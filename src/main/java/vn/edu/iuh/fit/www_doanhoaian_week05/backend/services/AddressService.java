package vn.edu.iuh.fit.www_doanhoaian_week05.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.models.Address;
import vn.edu.iuh.fit.www_doanhoaian_week05.backend.reponsitories.AddressRepository;


import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepository;
    public List<Address> findAll(){
        return addressRepository.findAll();
    }


    public  void addAddress (Address address){
        addressRepository.save(address);
    }



}
