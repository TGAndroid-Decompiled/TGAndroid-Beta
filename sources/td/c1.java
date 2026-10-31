package td;
public final class c1 implements d1 {
    public final ld.l f48605a;

    public c1(ld.l lVar) {
        this.f48605a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f48605a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f48605a.getClass().getSimpleName() + '@' + e0.k(this) + ']';
    }
}
