package r9;
public final class n implements qa.b {
    public static final Object f45154c = new Object();
    public volatile Object f45155a = f45154c;
    public volatile qa.b f45156b;

    public n(qa.b bVar) {
        this.f45156b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f45155a;
        Object obj3 = f45154c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f45155a;
                    if (obj == obj3) {
                        obj = this.f45156b.get();
                        this.f45155a = obj;
                        this.f45156b = null;
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
