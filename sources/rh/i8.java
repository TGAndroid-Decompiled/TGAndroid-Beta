package rh;
public final class i8 implements Runnable {
    public final int f47116a;
    public final y8 f47117b;

    public i8(y8 y8Var, int i10) {
        this.f47116a = i10;
        this.f47117b = y8Var;
    }

    @Override
    public final void run() {
        switch (this.f47116a) {
            case 0:
                y8 y8Var = this.f47117b;
                y8Var.K1 = true;
                y8Var.J0(null);
                org.telegram.messenger.i0.h3(new i8(y8Var, 1), 240L);
                return;
            case 1:
                this.f47117b.dismiss();
                return;
            default:
                n8 n8Var = this.f47117b.f47786p1;
                n8Var.F = false;
                n8Var.invalidate();
                return;
        }
    }
}
