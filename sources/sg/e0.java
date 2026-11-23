package sg;

import org.telegram.ui.Components.jn;
public final class e0 implements Runnable {
    public final int f57194a;
    public final i0 f57195b;

    public e0(i0 i0Var, int i7) {
        this.f57194a = i7;
        this.f57195b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f57194a) {
            case 0:
                i0 i0Var = this.f57195b;
                i0Var.f57233c = null;
                jn jnVar = i0Var.f57231a;
                if (jnVar != null) {
                    jnVar.l();
                    return;
                }
                return;
            default:
                this.f57195b.b();
                return;
        }
    }
}
