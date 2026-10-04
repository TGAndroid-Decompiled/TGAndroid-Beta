package zd;
public final class d implements k {
    public final c[] f53207a;

    public d(c[] cVarArr) {
        this.f53207a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f53207a) {
            o0 o0Var = cVar.f53204f;
            if (o0Var != null) {
                o0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f53207a + ']';
    }
}
