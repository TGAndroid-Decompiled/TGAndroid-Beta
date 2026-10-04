package xh;
public final class v1 implements Runnable {
    public final int f50267a;
    public final o2 f50268b;
    public final int f50269c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f50267a = i11;
        this.f50268b = o2Var;
        this.f50269c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50267a) {
            case 0:
                this.f50268b.f50148f.scrollBy(0, this.f50269c);
                return;
            default:
                j2 j2Var = this.f50268b.f50148f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f50269c);
                    return;
                }
                return;
        }
    }
}
