package zd;
public final class c1 implements d1 {
    public final rd.l f47992a;

    public c1(rd.l lVar) {
        this.f47992a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f47992a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f47992a.getClass().getSimpleName() + '@' + e0.k(this) + ']';
    }
}
