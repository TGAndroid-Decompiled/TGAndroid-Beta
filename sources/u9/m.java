package u9;
public final class m implements ua.b {
    public static final Object f56363c = new Object();
    public volatile Object f56364a = f56363c;
    public volatile ua.b f56365b;

    public m(ua.b bVar) {
        this.f56365b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f56364a;
        Object obj3 = f56363c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f56364a;
                    if (obj == obj3) {
                        obj = this.f56365b.get();
                        this.f56364a = obj;
                        this.f56365b = null;
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
