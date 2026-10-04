package zd;
public final class c1 implements d1 {
    public final rd.l f53200a;

    public c1(rd.l lVar) {
        this.f53200a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f53200a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f53200a.getClass().getSimpleName() + '@' + e0.k(this) + ']';
    }
}
