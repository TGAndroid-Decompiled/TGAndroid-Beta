package xh;
public final class v1 implements Runnable {
    public final int f46430a;
    public final o2 f46431b;
    public final int f46432c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f46430a = i11;
        this.f46431b = o2Var;
        this.f46432c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46430a) {
            case 0:
                this.f46431b.f46316f.scrollBy(0, this.f46432c);
                return;
            default:
                j2 j2Var = this.f46431b.f46316f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f46432c);
                    return;
                }
                return;
        }
    }
}
