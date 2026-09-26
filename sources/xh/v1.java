package xh;
public final class v1 implements Runnable {
    public final int f46444a;
    public final o2 f46445b;
    public final int f46446c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f46444a = i11;
        this.f46445b = o2Var;
        this.f46446c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46444a) {
            case 0:
                this.f46445b.f46330f.scrollBy(0, this.f46446c);
                return;
            default:
                j2 j2Var = this.f46445b.f46330f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f46446c);
                    return;
                }
                return;
        }
    }
}
