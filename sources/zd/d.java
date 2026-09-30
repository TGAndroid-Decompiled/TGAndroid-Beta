package zd;
public final class d implements k {
    public final c[] f49150a;

    public d(c[] cVarArr) {
        this.f49150a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f49150a) {
            o0 o0Var = cVar.f49147f;
            if (o0Var != null) {
                o0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f49150a + ']';
    }
}
