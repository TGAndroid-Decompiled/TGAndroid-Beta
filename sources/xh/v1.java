package xh;
public final class v1 implements Runnable {
    public final int f51546a;
    public final o2 f51547b;
    public final int f51548c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f51546a = i11;
        this.f51547b = o2Var;
        this.f51548c = i10;
    }

    @Override
    public final void run() {
        switch (this.f51546a) {
            case 0:
                this.f51547b.f51439f.scrollBy(0, this.f51548c);
                return;
            default:
                j2 j2Var = this.f51547b.f51439f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f51548c);
                    return;
                }
                return;
        }
    }
}
