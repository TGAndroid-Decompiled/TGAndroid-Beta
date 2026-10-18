package r9;
public final class n implements qa.b {
    public static final Object f45188c = new Object();
    public volatile Object f45189a = f45188c;
    public volatile qa.b f45190b;

    public n(qa.b bVar) {
        this.f45190b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f45189a;
        Object obj3 = f45188c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f45189a;
                    if (obj == obj3) {
                        obj = this.f45190b.get();
                        this.f45189a = obj;
                        this.f45190b = null;
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
