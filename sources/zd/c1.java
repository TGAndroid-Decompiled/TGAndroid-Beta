package zd;
public final class c1 implements d1 {
    public final rd.l f49254a;

    public c1(rd.l lVar) {
        this.f49254a = lVar;
    }

    @Override
    public final void a(Throwable th2) {
        this.f49254a.invoke(th2);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f49254a.getClass().getSimpleName() + '@' + e0.k(this) + ']';
    }
}
