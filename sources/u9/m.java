package u9;
public final class m implements ua.b {
    public static final Object f58678c = new Object();
    public volatile Object f58679a = f58678c;
    public volatile ua.b f58680b;

    public m(ua.b bVar) {
        this.f58680b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f58679a;
        Object obj3 = f58678c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f58679a;
                    if (obj == obj3) {
                        obj = this.f58680b.get();
                        this.f58679a = obj;
                        this.f58680b = null;
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
