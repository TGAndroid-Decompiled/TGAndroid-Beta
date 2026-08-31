package qh;
public final class b3 implements Runnable {
    public final int f44942a;
    public final d3 f44943b;

    public b3(d3 d3Var, int i10) {
        this.f44942a = i10;
        this.f44943b = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f44942a) {
            case 0:
                this.f44943b.dismiss();
                return;
            default:
                d3.m(this.f44943b);
                return;
        }
    }
}
