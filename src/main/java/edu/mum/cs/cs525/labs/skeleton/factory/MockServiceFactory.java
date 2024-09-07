package edu.mum.cs.cs525.labs.skeleton.factory;

public class MockServiceFactory extends ServiceFactory {
    @Override
    public DAOFactory createDAOFactory() {
        return new MockDAOFactory();
    }
}
