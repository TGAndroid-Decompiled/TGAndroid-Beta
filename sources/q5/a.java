package q5;
public final class a implements fd.a {
    public static final Object f55852c = new Object();
    public volatile b f55853a;
    public volatile Object f55854b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f55854b = f55852c;
        obj.f55853a = bVar;
        return obj;
    }

    @Override
    public final Object mo24get() {
        Object obj;
        Object obj2 = this.f55854b;
        Object obj3 = f55852c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f55854b;
                    if (obj == obj3) {
                        obj = this.f55853a.mo24get();
                        Object obj4 = this.f55854b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f55854b = obj;
                        this.f55853a = null;
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
