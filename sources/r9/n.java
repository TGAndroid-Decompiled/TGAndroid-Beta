package r9;
public final class n implements qa.b {
    public static final Object f45150c = new Object();
    public volatile Object f45151a = f45150c;
    public volatile qa.b f45152b;

    public n(qa.b bVar) {
        this.f45152b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f45151a;
        Object obj3 = f45150c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f45151a;
                    if (obj == obj3) {
                        obj = this.f45152b.get();
                        this.f45151a = obj;
                        this.f45152b = null;
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
