package yf;

public final class n0 implements Runnable {

    public final int f49986a;

    public final p0 f49987b;

    public final b6.a f49988c;

    public n0(p0 p0Var, b6.a aVar, int i10) {
        this.f49986a = i10;
        this.f49987b = p0Var;
        this.f49988c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f49986a) {
            case 0:
                this.f49987b.p(this.f49988c, true);
                break;
            default:
                p0 p0Var = this.f49987b;
                p0Var.f50015f.f(new n0(p0Var, this.f49988c, 0));
                break;
        }
    }
}
