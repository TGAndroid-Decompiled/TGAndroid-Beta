package qh;
public final class s3 implements Runnable {
    public final int f46036a;
    public final b5 f46037b;
    public final eg.z2 f46038c;

    public s3(b5 b5Var, eg.z2 z2Var, int i10) {
        this.f46036a = i10;
        this.f46037b = b5Var;
        this.f46038c = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f46036a) {
            case 0:
                this.f46037b.D0(this.f46038c, true);
                return;
            default:
                this.f46037b.C0(this.f46038c);
                return;
        }
    }
}
