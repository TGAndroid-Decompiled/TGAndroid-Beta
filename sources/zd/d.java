package zd;
public final class d implements k {
    public final c[] f60060a;

    public d(c[] cVarArr) {
        this.f60060a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f60060a) {
            l0 l0Var = cVar.f60056f;
            if (l0Var != null) {
                l0Var.dispose();
            } else {
                kotlin.jvm.internal.j.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f60060a + ']';
    }
}
