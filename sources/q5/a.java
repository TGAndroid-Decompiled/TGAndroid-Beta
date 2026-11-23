package q5;
public final class a implements fd.a {
    public static final Object f55975c = new Object();
    public volatile b f55976a;
    public volatile Object f55977b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f55977b = f55975c;
        obj.f55976a = bVar;
        return obj;
    }

    @Override
    public final Object mo23get() {
        Object obj;
        Object obj2 = this.f55977b;
        Object obj3 = f55975c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f55977b;
                    if (obj == obj3) {
                        obj = this.f55976a.mo23get();
                        Object obj4 = this.f55977b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f55977b = obj;
                        this.f55976a = null;
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
