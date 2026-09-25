package zd;
public final class c1 implements d1 {
    public final rd.l f49147a;

    public c1(rd.l lVar) {
        this.f49147a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f49147a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f49147a.getClass().getSimpleName() + '@' + e0.k(this) + ']';
    }
}
