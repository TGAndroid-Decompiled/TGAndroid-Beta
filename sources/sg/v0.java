package sg;
public final class v0 implements Runnable {
    public final int f42015a;
    public final c1 f42016b;

    public v0(c1 c1Var, int i10) {
        this.f42015a = i10;
        this.f42016b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f42015a) {
            case 0:
                this.f42016b.W(true);
                return;
            case 1:
                this.f42016b.b0(true, false);
                return;
            case 2:
                this.f42016b.R();
                return;
            case 3:
                this.f42016b.b0(true, false);
                return;
            case 4:
                this.f42016b.b0(true, false);
                return;
            case 5:
                this.f42016b.b0(true, false);
                return;
            case 6:
                c1 c1Var = this.f42016b;
                c1Var.f41883e0.clear();
                c1Var.f41884f0.clear();
                c1Var.dismiss();
                return;
            default:
                this.f42016b.dismiss();
                return;
        }
    }
}
