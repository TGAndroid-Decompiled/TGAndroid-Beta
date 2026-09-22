package xh;
public final class v1 implements Runnable {
    public final int f46485a;
    public final o2 f46486b;
    public final int f46487c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f46485a = i11;
        this.f46486b = o2Var;
        this.f46487c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46485a) {
            case 0:
                this.f46486b.f46371f.scrollBy(0, this.f46487c);
                return;
            default:
                j2 j2Var = this.f46486b.f46371f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f46487c);
                    return;
                }
                return;
        }
    }
}
