package com.example.car_and_pie.service;
import com.example.car_and_pie.model.BanhTrung;

import java.util.List;

public interface IBanhTrungService {
    List<BanhTrung> getAllBanhTrung();
    BanhTrung getBanhTrungById(int id);
    void addBanhTrung(BanhTrung banhTrung);
    void updateBanhTrung(BanhTrung banhTrung);
    void deleteBanhTrung(int id);
}