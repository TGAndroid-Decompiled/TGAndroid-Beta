package s9;
public final class o implements ra.b {
    public static final Object f48045c = new Object();
    public volatile Object f48046a = f48045c;
    public volatile ra.b f48047b;

    public o(ra.b bVar) {
        this.f48047b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f48046a;
        Object obj3 = f48045c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f48046a;
                    if (obj == obj3) {
                        obj = this.f48047b.get();
                        this.f48046a = obj;
                        this.f48047b = null;
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
