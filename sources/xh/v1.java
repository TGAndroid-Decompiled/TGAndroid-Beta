package xh;
public final class v1 implements Runnable {
    public final int f51667a;
    public final o2 f51668b;
    public final int f51669c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f51667a = i11;
        this.f51668b = o2Var;
        this.f51669c = i10;
    }

    @Override
    public final void run() {
        switch (this.f51667a) {
            case 0:
                this.f51668b.f51560f.scrollBy(0, this.f51669c);
                return;
            default:
                j2 j2Var = this.f51668b.f51560f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f51669c);
                    return;
                }
                return;
        }
    }
}
