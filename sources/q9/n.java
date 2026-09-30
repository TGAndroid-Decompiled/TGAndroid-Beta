package q9;
public final class n implements pa.b {
    public static final Object f41489c = new Object();
    public volatile Object f41490a = f41489c;
    public volatile pa.b f41491b;

    public n(pa.b bVar) {
        this.f41491b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f41490a;
        Object obj3 = f41489c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f41490a;
                    if (obj == obj3) {
                        obj = this.f41491b.get();
                        this.f41490a = obj;
                        this.f41491b = null;
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
