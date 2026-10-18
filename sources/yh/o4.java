package yh;
public final class o4 implements Runnable {
    public final int f50474a;
    public final y4 f50475b;

    public o4(y4 y4Var, int i10) {
        this.f50474a = i10;
        this.f50475b = y4Var;
    }

    @Override
    public final void run() {
        switch (this.f50474a) {
            case 0:
                this.f50475b.Z(false);
                return;
            case 1:
                this.f50475b.Z(true);
                return;
            case 2:
                y4.V(this.f50475b);
                return;
            case 3:
                y4.U(this.f50475b);
                return;
            case 4:
                y4.S(this.f50475b);
                return;
            default:
                this.f50475b.dismiss();
                return;
        }
    }
}
