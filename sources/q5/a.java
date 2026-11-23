package q5;
public final class a implements fd.a {
    public static final Object f55862c = new Object();
    public volatile b f55863a;
    public volatile Object f55864b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f55864b = f55862c;
        obj.f55863a = bVar;
        return obj;
    }

    @Override
    public final Object mo24get() {
        Object obj;
        Object obj2 = this.f55864b;
        Object obj3 = f55862c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f55864b;
                    if (obj == obj3) {
                        obj = this.f55863a.mo24get();
                        Object obj4 = this.f55864b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f55864b = obj;
                        this.f55863a = null;
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
