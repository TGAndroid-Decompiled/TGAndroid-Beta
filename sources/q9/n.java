package q9;
public final class n implements pa.b {
    public static final Object f46108c = new Object();
    public volatile Object f46109a = f46108c;
    public volatile pa.b f46110b;

    public n(pa.b bVar) {
        this.f46110b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f46109a;
        Object obj3 = f46108c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f46109a;
                    if (obj == obj3) {
                        obj = this.f46110b.get();
                        this.f46109a = obj;
                        this.f46110b = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return obj;
        }
        return obj2;
    }
}
