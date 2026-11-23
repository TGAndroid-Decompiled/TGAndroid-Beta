package q5;
public final class a implements fd.a {
    public static final Object f55897c = new Object();
    public volatile b f55898a;
    public volatile Object f55899b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f55899b = f55897c;
        obj.f55898a = bVar;
        return obj;
    }

    @Override
    public final Object mo24get() {
        Object obj;
        Object obj2 = this.f55899b;
        Object obj3 = f55897c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f55899b;
                    if (obj == obj3) {
                        obj = this.f55898a.mo24get();
                        Object obj4 = this.f55899b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f55899b = obj;
                        this.f55898a = null;
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
