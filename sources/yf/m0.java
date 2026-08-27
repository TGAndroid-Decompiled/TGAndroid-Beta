package yf;

public final class m0 implements Runnable {

    public final int f49980a;

    public final p0 f49981b;

    public m0(p0 p0Var, int i10) {
        this.f49980a = i10;
        this.f49981b = p0Var;
    }

    @Override
    public final void run() {
        switch (this.f49980a) {
            case 0:
                p0 p0Var = this.f49981b;
                p0Var.f50013c = null;
                n1.d dVar = p0Var.f50011a;
                if (dVar != null) {
                    dVar.C();
                }
                break;
            default:
                this.f49981b.b();
                break;
        }
    }
}
