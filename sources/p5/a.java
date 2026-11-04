package p5;
public final class a implements cd.a {
    public static final Object f53206c = new Object();
    public volatile b f53207a;
    public volatile Object f53208b;

    public static cd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f53208b = f53206c;
        obj.f53207a = bVar;
        return obj;
    }

    @Override
    public final Object mo5get() {
        Object obj;
        Object obj2 = this.f53208b;
        Object obj3 = f53206c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f53208b;
                    if (obj == obj3) {
                        obj = this.f53207a.mo5get();
                        Object obj4 = this.f53208b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f53208b = obj;
                        this.f53207a = null;
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
