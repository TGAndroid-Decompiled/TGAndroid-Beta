package pg;
public final class o0 implements Runnable {
    public final int f40948a;
    public final q0 f40949b;
    public final a5.a f40950c;

    public o0(q0 q0Var, a5.a aVar, int i10) {
        this.f40948a = i10;
        this.f40949b = q0Var;
        this.f40950c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f40948a) {
            case 0:
                this.f40949b.p(this.f40950c, true);
                return;
            default:
                q0 q0Var = this.f40949b;
                q0Var.f40973f.f(new o0(q0Var, this.f40950c, 0));
                return;
        }
    }
}
