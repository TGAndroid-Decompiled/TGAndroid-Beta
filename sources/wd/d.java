package wd;
public final class d implements k {
    public final c[] f57479a;

    public d(c[] cVarArr) {
        this.f57479a = cVarArr;
    }

    @Override
    public final void a(Throwable th2) {
        b();
    }

    public final void b() {
        for (c cVar : this.f57479a) {
            l0 l0Var = cVar.f57475f;
            if (l0Var != null) {
                l0Var.dispose();
            } else {
                kotlin.jvm.internal.j.h("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f57479a + ']';
    }
}
