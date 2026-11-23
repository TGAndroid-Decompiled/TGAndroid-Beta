package sg;

import org.telegram.ui.Components.jn;
public final class e0 implements Runnable {
    public final int f57229a;
    public final i0 f57230b;

    public e0(i0 i0Var, int i7) {
        this.f57229a = i7;
        this.f57230b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f57229a) {
            case 0:
                i0 i0Var = this.f57230b;
                i0Var.f57268c = null;
                jn jnVar = i0Var.f57266a;
                if (jnVar != null) {
                    jnVar.l();
                    return;
                }
                return;
            default:
                this.f57230b.b();
                return;
        }
    }
}
