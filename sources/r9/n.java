package r9;
public final class n implements qa.b {
    public static final Object f45142c = new Object();
    public volatile Object f45143a = f45142c;
    public volatile qa.b f45144b;

    public n(qa.b bVar) {
        this.f45144b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f45143a;
        Object obj3 = f45142c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f45143a;
                    if (obj == obj3) {
                        obj = this.f45144b.get();
                        this.f45143a = obj;
                        this.f45144b = null;
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
