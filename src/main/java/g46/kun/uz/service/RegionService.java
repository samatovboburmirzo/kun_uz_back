package g46.kun.uz.service;

import g46.kun.uz.dto.RegionDTO;
import g46.kun.uz.entity.RegionEntity;
import g46.kun.uz.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class RegionService {
@Autowired
private RegionRepository regionRepository;
    public RegionDTO create(RegionDTO dto) {
        RegionEntity entity=new RegionEntity();
        entity.setNameUz(dto.getNameUz());
        entity.setNameEn(dto.getNameEn());
        entity.setNameRu(dto.getNameRu());
        entity.setKey(dto.getKey());
        entity.setVisible(true);
        entity.setCreatedDate(LocalDateTime.now());
        this.regionRepository.save(entity);

        dto.setId(entity.getId());
        dto.setCreatedDate(entity.getCreatedDate());
        return dto;
    }

    public RegionDTO getById(Integer id) {

        return null;
    }

    public RegionDTO update(Integer id, RegionDTO dto) {
        return null;
    }

    public Boolean delete(Integer id) { // will update status only
        return null;
    }

    public List<RegionDTO> list() {
        return null;
    }
}
