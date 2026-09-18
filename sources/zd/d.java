package zd;
public final class d implements k {
    public final c[] f48903a;

    public d(c[] cVarArr) {
        this.f48903a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f48903a) {
            o0 o0Var = cVar.f48900f;
            if (o0Var != null) {
                o0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f48903a + ']';
    }
}
