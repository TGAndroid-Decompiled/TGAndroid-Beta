package sg;

import org.telegram.ui.Components.jn;
public final class e0 implements Runnable {
    public final int f57225a;
    public final i0 f57226b;

    public e0(i0 i0Var, int i7) {
        this.f57225a = i7;
        this.f57226b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f57225a) {
            case 0:
                i0 i0Var = this.f57226b;
                i0Var.f57264c = null;
                jn jnVar = i0Var.f57262a;
                if (jnVar != null) {
                    jnVar.l();
                    return;
                }
                return;
            default:
                this.f57226b.b();
                return;
        }
    }
}
