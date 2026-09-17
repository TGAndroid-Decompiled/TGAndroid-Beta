package zd;
public final class d implements k {
    public final c[] f48898a;

    public d(c[] cVarArr) {
        this.f48898a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f48898a) {
            o0 o0Var = cVar.f48895f;
            if (o0Var != null) {
                o0Var.dispose();
            } else {
                kotlin.jvm.internal.i.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f48898a + ']';
    }
}
