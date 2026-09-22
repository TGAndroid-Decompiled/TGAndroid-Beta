package q9;
public final class n implements pa.b {
    public static final Object f41521c = new Object();
    public volatile Object f41522a = f41521c;
    public volatile pa.b f41523b;

    public n(pa.b bVar) {
        this.f41523b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f41522a;
        Object obj3 = f41521c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f41522a;
                    if (obj == obj3) {
                        obj = this.f41523b.get();
                        this.f41522a = obj;
                        this.f41523b = null;
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
