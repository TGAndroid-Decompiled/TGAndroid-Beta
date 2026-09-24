package zd;
public final class c1 implements d1 {
    public final rd.l f49135a;

    public c1(rd.l lVar) {
        this.f49135a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f49135a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f49135a.getClass().getSimpleName() + '@' + e0.k(this) + ']';
    }
}
