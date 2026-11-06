package zd;
public final class d implements k {
    public final c[] f59936a;

    public d(c[] cVarArr) {
        this.f59936a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f59936a) {
            l0 l0Var = cVar.f59932f;
            if (l0Var != null) {
                l0Var.dispose();
            } else {
                kotlin.jvm.internal.j.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f59936a + ']';
    }
}
