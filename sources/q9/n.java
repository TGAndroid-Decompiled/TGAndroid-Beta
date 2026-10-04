package q9;
public final class n implements pa.b {
    public static final Object f44870c = new Object();
    public volatile Object f44871a = f44870c;
    public volatile pa.b f44872b;

    public n(pa.b bVar) {
        this.f44872b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f44871a;
        Object obj3 = f44870c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f44871a;
                    if (obj == obj3) {
                        obj = this.f44872b.get();
                        this.f44871a = obj;
                        this.f44872b = null;
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
