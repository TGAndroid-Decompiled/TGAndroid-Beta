package q5;
public final class a implements fd.a {
    public static final Object f53737c = new Object();
    public volatile b f53738a;
    public volatile Object f53739b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f53739b = f53737c;
        obj.f53738a = bVar;
        return obj;
    }

    @Override
    public final Object mo24get() {
        Object obj;
        Object obj2 = this.f53739b;
        Object obj3 = f53737c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f53739b;
                    if (obj == obj3) {
                        obj = this.f53738a.mo24get();
                        Object obj4 = this.f53739b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f53739b = obj;
                        this.f53738a = null;
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
