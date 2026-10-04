package q9;
public final class n implements pa.b {
    public static final Object f44862c = new Object();
    public volatile Object f44863a = f44862c;
    public volatile pa.b f44864b;

    public n(pa.b bVar) {
        this.f44864b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f44863a;
        Object obj3 = f44862c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f44863a;
                    if (obj == obj3) {
                        obj = this.f44864b.get();
                        this.f44863a = obj;
                        this.f44864b = null;
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
