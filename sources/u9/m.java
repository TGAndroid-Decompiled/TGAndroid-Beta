package u9;
public final class m implements ua.b {
    public static final Object f56387c = new Object();
    public volatile Object f56388a = f56387c;
    public volatile ua.b f56389b;

    public m(ua.b bVar) {
        this.f56389b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f56388a;
        Object obj3 = f56387c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f56388a;
                    if (obj == obj3) {
                        obj = this.f56389b.get();
                        this.f56388a = obj;
                        this.f56389b = null;
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
