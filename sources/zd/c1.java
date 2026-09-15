package zd;
public final class c1 implements d1 {
    public final rd.l f48873a;

    public c1(rd.l lVar) {
        this.f48873a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f48873a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f48873a.getClass().getSimpleName() + '@' + e0.k(this) + ']';
    }
}
