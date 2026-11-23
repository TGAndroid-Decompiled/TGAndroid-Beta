package u9;
public final class m implements ua.b {
    public static final Object f58563c = new Object();
    public volatile Object f58564a = f58563c;
    public volatile ua.b f58565b;

    public m(ua.b bVar) {
        this.f58565b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f58564a;
        Object obj3 = f58563c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f58564a;
                    if (obj == obj3) {
                        obj = this.f58565b.get();
                        this.f58564a = obj;
                        this.f58565b = null;
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
