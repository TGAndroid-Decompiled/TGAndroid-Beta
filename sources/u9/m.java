package u9;
public final class m implements ua.b {
    public static final Object f56388c = new Object();
    public volatile Object f56389a = f56388c;
    public volatile ua.b f56390b;

    public m(ua.b bVar) {
        this.f56390b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f56389a;
        Object obj3 = f56388c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f56389a;
                    if (obj == obj3) {
                        obj = this.f56390b.get();
                        this.f56389a = obj;
                        this.f56390b = null;
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
