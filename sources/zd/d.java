package zd;
public final class d implements k {
    public final c[] f51560a;

    public d(c[] cVarArr) {
        this.f51560a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f51560a) {
            o0 o0Var = cVar.f51557f;
            if (o0Var != null) {
                o0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f51560a + ']';
    }
}
