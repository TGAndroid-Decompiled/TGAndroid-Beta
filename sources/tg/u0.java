package tg;
public final class u0 implements Runnable {
    public final int f43255a;
    public final a1 f43256b;

    public u0(a1 a1Var, int i10) {
        this.f43255a = i10;
        this.f43256b = a1Var;
    }

    @Override
    public final void run() {
        switch (this.f43255a) {
            case 0:
                this.f43256b.W(true);
                return;
            case 1:
                this.f43256b.b0(true, false);
                return;
            case 2:
                this.f43256b.R();
                return;
            case 3:
                this.f43256b.b0(true, false);
                return;
            case 4:
                this.f43256b.b0(true, false);
                return;
            case 5:
                this.f43256b.b0(true, false);
                return;
            case 6:
                a1 a1Var = this.f43256b;
                a1Var.f43095e0.clear();
                a1Var.f43096f0.clear();
                a1Var.dismiss();
                return;
            default:
                this.f43256b.dismiss();
                return;
        }
    }
}
