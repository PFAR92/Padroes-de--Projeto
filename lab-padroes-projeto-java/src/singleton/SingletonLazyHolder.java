package singleton;
//Singleton Lazy Holder

public class SingletonLazyHolder {

    private static class InstanceHolder{
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    
    private void SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
