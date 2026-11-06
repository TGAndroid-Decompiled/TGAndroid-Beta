package q5;
public final class a implements fd.a {
    public static final Object f53712c = new Object();
    public volatile b f53713a;
    public volatile Object f53714b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f53714b = f53712c;
        obj.f53713a = bVar;
        return obj;
    }

    @Override
    public final Object mo24get() {
        Object obj;
        Object obj2 = this.f53714b;
        Object obj3 = f53712c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f53714b;
                    if (obj == obj3) {
                        obj = this.f53713a.mo24get();
                        Object obj4 = this.f53714b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f53714b = obj;
                        this.f53713a = null;
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
