package sg;

import org.telegram.messenger.ou;
public final class e0 implements Runnable {
    public final int f56610a;
    public final i0 f56611b;

    public e0(i0 i0Var, int i7) {
        this.f56610a = i7;
        this.f56611b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f56610a) {
            case 0:
                i0 i0Var = this.f56611b;
                i0Var.f56649c = null;
                ou ouVar = i0Var.f56647a;
                if (ouVar != null) {
                    ouVar.E0();
                    return;
                }
                return;
            default:
                this.f56611b.b();
                return;
        }
    }
}
