package qh;
public final class j2 implements Runnable {
    public final int f46461a;
    public final o3 f46462b;
    public final int f46463c;
    public final int d;

    public j2(o3 o3Var, int i9, int i10, int i11) {
        this.f46461a = i11;
        this.f46462b = o3Var;
        this.f46463c = i9;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f46461a) {
            case 0:
                this.f46462b.Y1(this.f46463c, this.d);
                return;
            default:
                this.f46462b.g4(this.f46463c, this.d);
                return;
        }
    }
}
