package tg;
public final class e2 implements Runnable {
    public final int f55647a;
    public final i2 f55648b;

    public e2(i2 i2Var, int i7) {
        this.f55647a = i7;
        this.f55648b = i2Var;
    }

    @Override
    public final void run() {
        switch (this.f55647a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                org.telegram.messenger.g0.h3(new e2(this.f55648b, 0));
                return;
            case 2:
                this.f55648b.dismiss();
                return;
            default:
                i2 i2Var = this.f55648b;
                ai.i iVar = i2Var.H;
                if (iVar != null) {
                    iVar.a(null);
                    i2Var.H = null;
                }
                i2Var.dismiss();
                return;
        }
    }
}
