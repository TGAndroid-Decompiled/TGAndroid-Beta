package r9;
public final class n implements qa.b {
    public static final Object f45140c = new Object();
    public volatile Object f45141a = f45140c;
    public volatile qa.b f45142b;

    public n(qa.b bVar) {
        this.f45142b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f45141a;
        Object obj3 = f45140c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f45141a;
                    if (obj == obj3) {
                        obj = this.f45142b.get();
                        this.f45141a = obj;
                        this.f45142b = null;
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
