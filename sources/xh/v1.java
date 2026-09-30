package xh;
public final class v1 implements Runnable {
    public final int f46446a;
    public final o2 f46447b;
    public final int f46448c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f46446a = i11;
        this.f46447b = o2Var;
        this.f46448c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46446a) {
            case 0:
                this.f46447b.f46332f.scrollBy(0, this.f46448c);
                return;
            default:
                j2 j2Var = this.f46447b.f46332f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f46448c);
                    return;
                }
                return;
        }
    }
}
