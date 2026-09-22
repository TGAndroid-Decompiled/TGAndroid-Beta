package zd;
public final class c1 implements d1 {
    public final rd.l f49193a;

    public c1(rd.l lVar) {
        this.f49193a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f49193a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f49193a.getClass().getSimpleName() + '@' + e0.k(this) + ']';
    }
}
