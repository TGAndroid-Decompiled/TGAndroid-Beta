package qh;
public final class d2 implements Runnable {
    public final int f46344a;
    public final o3 f46345b;
    public final int f46346c;

    public d2(o3 o3Var, int i9, int i10) {
        this.f46344a = i10;
        this.f46345b = o3Var;
        this.f46346c = i9;
    }

    @Override
    public final void run() {
        switch (this.f46344a) {
            case 0:
                this.f46345b.d4(this.f46346c);
                return;
            case 1:
                this.f46345b.f4(this.f46346c);
                return;
            case 2:
                this.f46345b.scrollBy(0, this.f46346c);
                return;
            default:
                this.f46345b.e4(this.f46346c);
                return;
        }
    }
}
