package interfaces;

import classes.Administrator;

public interface AdministratorOperations {
    boolean insertInstructor(Administrator ins);

    boolean removeInstructor(Administrator ins);

    Administrator searchInstructor(String insId);

    void showAllInstructors();
}