package z8;

public final class m implements y9.b {

    public static final Object f50244c = new Object();

    public volatile Object f50245a = f50244c;

    public volatile y9.b f50246b;

    public m(y9.b bVar) {
        this.f50246b = bVar;
    }

    @Override
    public final Object get() {
        Object obj;
        Object obj2 = this.f50245a;
        Object obj3 = f50244c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f50245a;
                if (obj == obj3) {
                    obj = this.f50246b.get();
                    this.f50245a = obj;
                    this.f50246b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
