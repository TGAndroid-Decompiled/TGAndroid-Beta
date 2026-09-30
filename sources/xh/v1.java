package xh;
public final class v1 implements Runnable {
    public final int f46552a;
    public final o2 f46553b;
    public final int f46554c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f46552a = i11;
        this.f46553b = o2Var;
        this.f46554c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46552a) {
            case 0:
                this.f46553b.f46438f.scrollBy(0, this.f46554c);
                return;
            default:
                j2 j2Var = this.f46553b.f46438f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f46554c);
                    return;
                }
                return;
        }
    }
}
