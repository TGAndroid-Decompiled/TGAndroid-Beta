package ug;
public final class d0 implements Runnable {
    public final int f47664a;
    public final f0 f47665b;

    public d0(f0 f0Var, int i10) {
        this.f47664a = i10;
        this.f47665b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f47664a) {
            case 0:
                f0.f0(this.f47665b);
                return;
            default:
                f0.e0(this.f47665b);
                return;
        }
    }
}
