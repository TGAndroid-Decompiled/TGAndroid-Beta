package q9;
public final class n implements pa.b {
    public static final Object f41586c = new Object();
    public volatile Object f41587a = f41586c;
    public volatile pa.b f41588b;

    public n(pa.b bVar) {
        this.f41588b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f41587a;
        Object obj3 = f41586c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f41587a;
                    if (obj == obj3) {
                        obj = this.f41588b.get();
                        this.f41587a = obj;
                        this.f41588b = null;
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
