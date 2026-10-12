package q9;
public final class n implements pa.b {
    public static final Object f45970c = new Object();
    public volatile Object f45971a = f45970c;
    public volatile pa.b f45972b;

    public n(pa.b bVar) {
        this.f45972b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f45971a;
        Object obj3 = f45970c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f45971a;
                    if (obj == obj3) {
                        obj = this.f45972b.get();
                        this.f45971a = obj;
                        this.f45972b = null;
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
