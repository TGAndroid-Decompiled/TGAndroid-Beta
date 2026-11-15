package zd;
public final class d implements k {
    public final c[] f61268a;

    public d(c[] cVarArr) {
        this.f61268a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f61268a) {
            l0 l0Var = cVar.f61264f;
            if (l0Var != null) {
                l0Var.dispose();
            } else {
                kotlin.jvm.internal.j.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f61268a + ']';
    }
}
