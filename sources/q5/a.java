package q5;
public final class a implements fd.a {
    public static final Object f53736c = new Object();
    public volatile b f53737a;
    public volatile Object f53738b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f53738b = f53736c;
        obj.f53737a = bVar;
        return obj;
    }

    @Override
    public final Object mo24get() {
        Object obj;
        Object obj2 = this.f53738b;
        Object obj3 = f53736c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f53738b;
                    if (obj == obj3) {
                        obj = this.f53737a.mo24get();
                        Object obj4 = this.f53738b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f53738b = obj;
                        this.f53737a = null;
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
