package r9;
public final class n implements qa.b {
    public static final Object f46456c = new Object();
    public volatile Object f46457a = f46456c;
    public volatile qa.b f46458b;

    public n(qa.b bVar) {
        this.f46458b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f46457a;
        Object obj3 = f46456c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f46457a;
                    if (obj == obj3) {
                        obj = this.f46458b.get();
                        this.f46457a = obj;
                        this.f46458b = null;
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
