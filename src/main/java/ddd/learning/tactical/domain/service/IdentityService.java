package ddd.learning.tactical.domain.service;

public class IdentityService {
    private static Integer id = 0;

    public static Integer getNextId() {
        return ++id;
    }
}
