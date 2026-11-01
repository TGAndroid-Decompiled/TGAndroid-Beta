package td;
public final class c1 implements d1 {
    public final ld.l f48616a;

    public c1(ld.l lVar) {
        this.f48616a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f48616a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f48616a.getClass().getSimpleName() + '@' + e0.k(this) + ']';
    }
}
