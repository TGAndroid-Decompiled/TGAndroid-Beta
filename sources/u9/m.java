package u9;
public final class m implements ua.b {
    public static final Object f58594c = new Object();
    public volatile Object f58595a = f58594c;
    public volatile ua.b f58596b;

    public m(ua.b bVar) {
        this.f58596b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f58595a;
        Object obj3 = f58594c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f58595a;
                    if (obj == obj3) {
                        obj = this.f58596b.get();
                        this.f58595a = obj;
                        this.f58596b = null;
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
