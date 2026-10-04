package xh;
public final class v1 implements Runnable {
    public final int f50266a;
    public final o2 f50267b;
    public final int f50268c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f50266a = i11;
        this.f50267b = o2Var;
        this.f50268c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50266a) {
            case 0:
                this.f50267b.f50147f.scrollBy(0, this.f50268c);
                return;
            default:
                j2 j2Var = this.f50267b.f50147f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f50268c);
                    return;
                }
                return;
        }
    }
}
