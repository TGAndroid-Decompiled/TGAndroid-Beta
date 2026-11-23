package p4;
public final class f0 implements Runnable {
    public final int f55263a;
    public final n0 f55264b;

    public f0(n0 n0Var, int i7) {
        this.f55263a = i7;
        this.f55264b = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f55263a) {
            case 0:
                n0 n0Var = this.f55264b;
                h2.l0.W(n0Var.h.f55241l, new f0(n0Var, 1));
                return;
            default:
                this.f55264b.o0();
                return;
        }
    }
}
