public abstract class Logistics {

    public Transport planDeliver() {
        Transport t = createTransport();
        t.deliver();
        return t;
    }

    protected abstract Transport createTransport();
}