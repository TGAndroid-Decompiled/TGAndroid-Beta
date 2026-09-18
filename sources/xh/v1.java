package xh;
public final class v1 implements Runnable {
    public final int f46417a;
    public final o2 f46418b;
    public final int f46419c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f46417a = i11;
        this.f46418b = o2Var;
        this.f46419c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46417a) {
            case 0:
                this.f46418b.f46303f.scrollBy(0, this.f46419c);
                return;
            default:
                j2 j2Var = this.f46418b.f46303f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f46419c);
                    return;
                }
                return;
        }
    }
}
