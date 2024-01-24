package com.example.car_and_pie.service;
import com.example.car_and_pie.model.BanhTrung;

import com.example.car_and_pie.repository.BanhTrungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BanhTrungService implements IBanhTrungService {

    @Autowired
    private BanhTrungRepository banhTrungRepository;

    @Override
    public List<BanhTrung> getAllBanhTrung() {
        return banhTrungRepository.getAllBanhTrung();
    }

    @Override
    public BanhTrung getBanhTrungById(int id) {
        return banhTrungRepository.getBanhTrungById(id);
    }

    @Override
    public void addBanhTrung(BanhTrung banhTrung) {
        banhTrungRepository.addBanhTrung(banhTrung);
    }

    @Override
    public void updateBanhTrung(BanhTrung banhTrung) {
        banhTrungRepository.updateBanhTrung(banhTrung);
    }

    @Override
    public void deleteBanhTrung(int id) {
        banhTrungRepository.deleteBanhTrung(id);
    }
}