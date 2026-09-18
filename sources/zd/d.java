package zd;
public final class d implements k {
    public final c[] f49129a;

    public d(c[] cVarArr) {
        this.f49129a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f49129a) {
            o0 o0Var = cVar.f49126f;
            if (o0Var != null) {
                o0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f49129a + ']';
    }
}
