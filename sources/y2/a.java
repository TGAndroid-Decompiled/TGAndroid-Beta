package y2;
public final class a implements nc.a {
    public static final Object f49462c = new Object();
    public volatile b f49463a;
    public volatile Object f49464b;

    public static nc.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f49464b = f49462c;
        obj.f49463a = bVar;
        return obj;
    }

    @Override
    public final Object mo28get() {
        Object obj;
        Object obj2 = this.f49464b;
        Object obj3 = f49462c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f49464b;
                    if (obj == obj3) {
                        obj = this.f49463a.mo28get();
                        Object obj4 = this.f49464b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f49464b = obj;
                        this.f49463a = null;
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
