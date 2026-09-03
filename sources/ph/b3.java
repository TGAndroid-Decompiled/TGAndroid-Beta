package ph;
public final class b3 implements Runnable {
    public final int f41323a;
    public final d3 f41324b;

    public b3(d3 d3Var, int i10) {
        this.f41323a = i10;
        this.f41324b = d3Var;
    }

    @Override
    public final void run() {
        switch (this.f41323a) {
            case 0:
                this.f41324b.dismiss();
                return;
            default:
                d3.m(this.f41324b);
                return;
        }
    }
}
