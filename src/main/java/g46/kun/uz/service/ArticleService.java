package g46.kun.uz.service;

import g46.kun.uz.dto.ArticleDTO;
import g46.kun.uz.dto.ArticleFilterDTO;
import org.springframework.data.domain.Page;

import java.util.List;

public class ArticleService {

    public ArticleDTO create(ArticleDTO dto) {
        return null;
    }

    public ArticleDTO getById(ArticleDTO dto) {
        return null;
    }

    public ArticleDTO update(Integer id, ArticleDTO dto) {
        return null;
    }

    public ArticleDTO publish(Integer id) {
        return null;
    }

    public ArticleDTO block(Integer id) {
        return null;
    }

    public List<ArticleDTO> list(int page, int size) {
        return null;
    }

    public List<ArticleDTO> listByProfile(int page, int size) {
        return null;
    }

    public List<ArticleDTO> listByCategory(int page, int size) {
        return null;
    }

    public List<ArticleDTO> listByRegion(int page, int size) {
        return null;
    }

    public Page<ArticleDTO> filter(ArticleFilterDTO filter) {
        return null;
    }

    // oxirgi qo'shilgan 8tasi
    public List<ArticleDTO> lastAdded() {
        // sortBy createdDate
        return null;
    }

    // ko'p o'qilganlar oxirgi 8tasi
    public List<ArticleDTO> mostRead() {
        return null;
    }

    // dolzarb oxirgi 4tasi
    public List<ArticleDTO> popular() {
        return null;
    }

    // kategoriya bo'yicha eng oxirgi yangiliklar
    public List<ArticleDTO> lastNewByCategory() {
        return null;
    }

    // region bo'yicha eng oxirgi yangiliklar
    public List<ArticleDTO> lastNewByRegion() {
        return null;
    }
}
