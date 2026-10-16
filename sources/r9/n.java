package r9;
public final class n implements qa.b {
    public static final Object f43812c = new Object();
    public volatile Object f43813a = f43812c;
    public volatile qa.b f43814b;

    public n(qa.b bVar) {
        this.f43814b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f43813a;
        Object obj3 = f43812c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f43813a;
                    if (obj == obj3) {
                        obj = this.f43814b.get();
                        this.f43813a = obj;
                        this.f43814b = null;
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
