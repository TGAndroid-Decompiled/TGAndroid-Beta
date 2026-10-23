package r9;
public final class n implements qa.b {
    public static final Object f45566c = new Object();
    public volatile Object f45567a = f45566c;
    public volatile qa.b f45568b;

    public n(qa.b bVar) {
        this.f45568b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f45567a;
        Object obj3 = f45566c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f45567a;
                    if (obj == obj3) {
                        obj = this.f45568b.get();
                        this.f45567a = obj;
                        this.f45568b = null;
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
