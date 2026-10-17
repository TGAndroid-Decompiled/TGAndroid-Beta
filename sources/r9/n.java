package r9;
public final class n implements qa.b {
    public static final Object f45168c = new Object();
    public volatile Object f45169a = f45168c;
    public volatile qa.b f45170b;

    public n(qa.b bVar) {
        this.f45170b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f45169a;
        Object obj3 = f45168c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f45169a;
                    if (obj == obj3) {
                        obj = this.f45170b.get();
                        this.f45169a = obj;
                        this.f45170b = null;
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
