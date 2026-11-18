package u9;
public final class m implements ua.b {
    public static final Object f58553c = new Object();
    public volatile Object f58554a = f58553c;
    public volatile ua.b f58555b;

    public m(ua.b bVar) {
        this.f58555b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f58554a;
        Object obj3 = f58553c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f58554a;
                    if (obj == obj3) {
                        obj = this.f58555b.get();
                        this.f58554a = obj;
                        this.f58555b = null;
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
