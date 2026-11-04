package t9;
public final class n implements ta.b {
    public static final Object f55067c = new Object();
    public volatile Object f55068a = f55067c;
    public volatile ta.b f55069b;

    public n(ta.b bVar) {
        this.f55069b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f55068a;
        Object obj3 = f55067c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f55068a;
                    if (obj == obj3) {
                        obj = this.f55069b.get();
                        this.f55068a = obj;
                        this.f55069b = null;
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
