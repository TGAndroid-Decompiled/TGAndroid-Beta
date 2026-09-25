package q9;
public final class n implements pa.b {
    public static final Object f41488c = new Object();
    public volatile Object f41489a = f41488c;
    public volatile pa.b f41490b;

    public n(pa.b bVar) {
        this.f41490b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f41489a;
        Object obj3 = f41488c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f41489a;
                    if (obj == obj3) {
                        obj = this.f41490b.get();
                        this.f41489a = obj;
                        this.f41490b = null;
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
