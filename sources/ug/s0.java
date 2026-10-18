package ug;
public final class s0 implements Runnable {
    public final int f47754a;
    public final y0 f47755b;

    public s0(y0 y0Var, int i10) {
        this.f47754a = i10;
        this.f47755b = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f47754a) {
            case 0:
                this.f47755b.X(true);
                return;
            case 1:
                this.f47755b.c0(true, false);
                return;
            case 2:
                this.f47755b.S();
                return;
            case 3:
                this.f47755b.c0(true, false);
                return;
            case 4:
                this.f47755b.c0(true, false);
                return;
            case 5:
                this.f47755b.c0(true, false);
                return;
            case 6:
                y0 y0Var = this.f47755b;
                y0Var.f47779e0.clear();
                y0Var.f47780f0.clear();
                y0Var.dismiss();
                return;
            default:
                this.f47755b.dismiss();
                return;
        }
    }
}
