package zd;
public final class c1 implements d1 {
    public final rd.l f51528a;

    public c1(rd.l lVar) {
        this.f51528a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f51528a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f51528a.getClass().getSimpleName() + '@' + e0.k(this) + ']';
    }
}
