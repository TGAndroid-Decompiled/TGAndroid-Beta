package q9;
public final class n implements pa.b {
    public static final Object f40575c = new Object();
    public volatile Object f40576a = f40575c;
    public volatile pa.b f40577b;

    public n(pa.b bVar) {
        this.f40577b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f40576a;
        Object obj3 = f40575c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f40576a;
                    if (obj == obj3) {
                        obj = this.f40577b.get();
                        this.f40576a = obj;
                        this.f40577b = null;
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
