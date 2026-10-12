package r9;
public final class n implements qa.b {
    public static final Object f44053c = new Object();
    public volatile Object f44054a = f44053c;
    public volatile qa.b f44055b;

    public n(qa.b bVar) {
        this.f44055b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f44054a;
        Object obj3 = f44053c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f44054a;
                    if (obj == obj3) {
                        obj = this.f44055b.get();
                        this.f44054a = obj;
                        this.f44055b = null;
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
