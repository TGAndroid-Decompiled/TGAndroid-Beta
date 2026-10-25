package zh;
public final class o4 implements Runnable {
    public final int f53177a;
    public final y4 f53178b;

    public o4(y4 y4Var, int i10) {
        this.f53177a = i10;
        this.f53178b = y4Var;
    }

    @Override
    public final void run() {
        switch (this.f53177a) {
            case 0:
                this.f53178b.Y(false);
                return;
            case 1:
                this.f53178b.Y(true);
                return;
            case 2:
                y4.U(this.f53178b);
                return;
            case 3:
                y4.T(this.f53178b);
                return;
            case 4:
                y4.R(this.f53178b);
                return;
            default:
                this.f53178b.dismiss();
                return;
        }
    }
}
