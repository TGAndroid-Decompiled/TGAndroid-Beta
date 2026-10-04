package xh;
public final class v1 implements Runnable {
    public final int f50275a;
    public final o2 f50276b;
    public final int f50277c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f50275a = i11;
        this.f50276b = o2Var;
        this.f50277c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50275a) {
            case 0:
                this.f50276b.f50156f.scrollBy(0, this.f50277c);
                return;
            default:
                j2 j2Var = this.f50276b.f50156f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f50277c);
                    return;
                }
                return;
        }
    }
}
