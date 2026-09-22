package zd;
public final class d implements k {
    public final c[] f49195a;

    public d(c[] cVarArr) {
        this.f49195a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f49195a) {
            o0 o0Var = cVar.f49192f;
            if (o0Var != null) {
                o0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f49195a + ']';
    }
}
