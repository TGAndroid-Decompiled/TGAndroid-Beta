package r9;
public final class n implements qa.b {
    public static final Object f46445c = new Object();
    public volatile Object f46446a = f46445c;
    public volatile qa.b f46447b;

    public n(qa.b bVar) {
        this.f46447b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f46446a;
        Object obj3 = f46445c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f46446a;
                    if (obj == obj3) {
                        obj = this.f46447b.get();
                        this.f46446a = obj;
                        this.f46447b = null;
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
