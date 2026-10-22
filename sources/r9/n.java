package r9;
public final class n implements qa.b {
    public static final Object f45153c = new Object();
    public volatile Object f45154a = f45153c;
    public volatile qa.b f45155b;

    public n(qa.b bVar) {
        this.f45155b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f45154a;
        Object obj3 = f45153c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f45154a;
                    if (obj == obj3) {
                        obj = this.f45155b.get();
                        this.f45154a = obj;
                        this.f45155b = null;
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
