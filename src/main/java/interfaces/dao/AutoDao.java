package interfaces.dao;

import models.Auto;

public interface AutoDao extends MainDao<Auto> {
    boolean removeByUser(int id);
}
