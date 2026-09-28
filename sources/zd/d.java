package zd;
public final class d implements k {
    public final c[] f49148a;

    public d(c[] cVarArr) {
        this.f49148a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f49148a) {
            o0 o0Var = cVar.f49145f;
            if (o0Var != null) {
                o0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f49148a + ']';
    }
}
