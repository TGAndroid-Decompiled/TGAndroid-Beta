package u9;
public final class m implements ua.b {
    public static final Object f58598c = new Object();
    public volatile Object f58599a = f58598c;
    public volatile ua.b f58600b;

    public m(ua.b bVar) {
        this.f58600b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f58599a;
        Object obj3 = f58598c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f58599a;
                    if (obj == obj3) {
                        obj = this.f58600b.get();
                        this.f58599a = obj;
                        this.f58600b = null;
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
