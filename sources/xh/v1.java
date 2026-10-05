package xh;
public final class v1 implements Runnable {
    public final int f50282a;
    public final o2 f50283b;
    public final int f50284c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f50282a = i11;
        this.f50283b = o2Var;
        this.f50284c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50282a) {
            case 0:
                this.f50283b.f50163f.scrollBy(0, this.f50284c);
                return;
            default:
                j2 j2Var = this.f50283b.f50163f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f50284c);
                    return;
                }
                return;
        }
    }
}
