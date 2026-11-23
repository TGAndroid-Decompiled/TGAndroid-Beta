package zd;
public final class d implements k {
    public final c[] f61962a;

    public d(c[] cVarArr) {
        this.f61962a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f61962a) {
            l0 l0Var = cVar.f61958f;
            if (l0Var != null) {
                l0Var.dispose();
            } else {
                kotlin.jvm.internal.j.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f61962a + ']';
    }
}
