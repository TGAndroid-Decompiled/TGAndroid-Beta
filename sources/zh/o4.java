package zh;
public final class o4 implements Runnable {
    public final int f53180a;
    public final y4 f53181b;

    public o4(y4 y4Var, int i10) {
        this.f53180a = i10;
        this.f53181b = y4Var;
    }

    @Override
    public final void run() {
        switch (this.f53180a) {
            case 0:
                this.f53181b.Y(false);
                return;
            case 1:
                this.f53181b.Y(true);
                return;
            case 2:
                y4.U(this.f53181b);
                return;
            case 3:
                y4.T(this.f53181b);
                return;
            case 4:
                y4.R(this.f53181b);
                return;
            default:
                this.f53181b.dismiss();
                return;
        }
    }
}
