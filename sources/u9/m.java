package u9;
public final class m implements ua.b {
    public static final Object f58552c = new Object();
    public volatile Object f58553a = f58552c;
    public volatile ua.b f58554b;

    public m(ua.b bVar) {
        this.f58554b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f58553a;
        Object obj3 = f58552c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f58553a;
                    if (obj == obj3) {
                        obj = this.f58554b.get();
                        this.f58553a = obj;
                        this.f58554b = null;
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
