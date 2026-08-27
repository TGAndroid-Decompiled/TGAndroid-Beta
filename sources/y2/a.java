package y2;

public final class a implements oc.a {

    public static final Object f49452c = new Object();

    public volatile b f49453a;

    public volatile Object f49454b;

    public static oc.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f49454b = f49452c;
        aVar.f49453a = bVar;
        return aVar;
    }

    @Override
    public final Object mo28get() {
        Object objMo28get;
        Object obj = this.f49454b;
        Object obj2 = f49452c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objMo28get = this.f49454b;
                if (objMo28get == obj2) {
                    objMo28get = this.f49453a.mo28get();
                    Object obj3 = this.f49454b;
                    if (obj3 != obj2 && obj3 != objMo28get) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objMo28get + ". This is likely due to a circular dependency.");
                    }
                    this.f49454b = objMo28get;
                    this.f49453a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objMo28get;
    }
}
