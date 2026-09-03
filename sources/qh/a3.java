package qh;
public final class a3 implements Runnable {
    public final int f44919a;
    public final c3 f44920b;

    public a3(c3 c3Var, int i10) {
        this.f44919a = i10;
        this.f44920b = c3Var;
    }

    @Override
    public final void run() {
        switch (this.f44919a) {
            case 0:
                this.f44920b.dismiss();
                return;
            default:
                c3.m(this.f44920b);
                return;
        }
    }
}
