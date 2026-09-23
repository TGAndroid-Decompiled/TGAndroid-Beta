package xh;
public final class v1 implements Runnable {
    public final int f46116a;
    public final o2 f46117b;
    public final int f46118c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f46116a = i11;
        this.f46117b = o2Var;
        this.f46118c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46116a) {
            case 0:
                this.f46117b.f46002f.scrollBy(0, this.f46118c);
                return;
            default:
                j2 j2Var = this.f46117b.f46002f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f46118c);
                    return;
                }
                return;
        }
    }
}
