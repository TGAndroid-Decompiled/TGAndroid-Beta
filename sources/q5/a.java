package q5;
public final class a implements fd.a {
    public static final Object f53830c = new Object();
    public volatile b f53831a;
    public volatile Object f53832b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f53832b = f53830c;
        obj.f53831a = bVar;
        return obj;
    }

    @Override
    public final Object mo24get() {
        Object obj;
        Object obj2 = this.f53832b;
        Object obj3 = f53830c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f53832b;
                    if (obj == obj3) {
                        obj = this.f53831a.mo24get();
                        Object obj4 = this.f53832b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f53832b = obj;
                        this.f53831a = null;
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
