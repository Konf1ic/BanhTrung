package com.example.car_and_pie.repository;

import com.example.car_and_pie.model.BanhTrung;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BanhTrungRepository {

    private List<BanhTrung> banhTrungList = new ArrayList<>();

    public List<BanhTrung> getAllBanhTrung() {
        return banhTrungList;
    }

    public BanhTrung getBanhTrungById(int id) {
        for (BanhTrung banhTrung : banhTrungList) {
            if (banhTrung.getId() == id) {
                return banhTrung;
            }
        }
        return null;
    }

    public void addBanhTrung(BanhTrung banhTrung) {
        banhTrungList.add(banhTrung);
    }

    public void updateBanhTrung(BanhTrung banhTrung) {
        for (int i = 0; i < banhTrungList.size(); i++) {
            if (banhTrungList.get(i).getId() == banhTrung.getId()) {
                banhTrungList.set(i, banhTrung);
                return;
            }
        }
    }

    public void deleteBanhTrung(int id) {
        banhTrungList.removeIf(banhTrung -> banhTrung.getId() == id);
    }
}