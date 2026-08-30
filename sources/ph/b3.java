package ph;
public final class b3 implements Runnable {
    public final int f41294a;
    public final d3 f41295b;

    public b3(d3 d3Var, int i10) {
        this.f41294a = i10;
        this.f41295b = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f41294a) {
            case 0:
                this.f41295b.dismiss();
                return;
            default:
                d3.m(this.f41295b);
                return;
        }
    }
}
