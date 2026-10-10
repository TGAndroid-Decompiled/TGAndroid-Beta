package xh;
public final class v1 implements Runnable {
    public final int f51590a;
    public final o2 f51591b;
    public final int f51592c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f51590a = i11;
        this.f51591b = o2Var;
        this.f51592c = i10;
    }

    @Override
    public final void run() {
        switch (this.f51590a) {
            case 0:
                this.f51591b.f51483f.scrollBy(0, this.f51592c);
                return;
            default:
                j2 j2Var = this.f51591b.f51483f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f51592c);
                    return;
                }
                return;
        }
    }
}
