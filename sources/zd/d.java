package zd;
public final class d implements k {
    public final c[] f61832a;

    public d(c[] cVarArr) {
        this.f61832a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f61832a) {
            l0 l0Var = cVar.f61828f;
            if (l0Var != null) {
                l0Var.dispose();
            } else {
                kotlin.jvm.internal.j.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f61832a + ']';
    }
}
