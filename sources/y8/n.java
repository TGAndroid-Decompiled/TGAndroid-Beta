package y8;
public final class n implements x9.b {
    public static final Object f49648c = new Object();
    public volatile Object f49649a = f49648c;
    public volatile x9.b f49650b;

    public n(x9.b bVar) {
        this.f49650b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f49649a;
        Object obj3 = f49648c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f49649a;
                    if (obj == obj3) {
                        obj = this.f49650b.get();
                        this.f49649a = obj;
                        this.f49650b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return obj;
        }
        return obj2;
    }
}
