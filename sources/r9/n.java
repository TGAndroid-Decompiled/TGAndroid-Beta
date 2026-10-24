package r9;
public final class n implements qa.b {
    public static final Object f45565c = new Object();
    public volatile Object f45566a = f45565c;
    public volatile qa.b f45567b;

    public n(qa.b bVar) {
        this.f45567b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f45566a;
        Object obj3 = f45565c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f45566a;
                    if (obj == obj3) {
                        obj = this.f45567b.get();
                        this.f45566a = obj;
                        this.f45567b = null;
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
