package xh;
public final class v1 implements Runnable {
    public final int f51544a;
    public final o2 f51545b;
    public final int f51546c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f51544a = i11;
        this.f51545b = o2Var;
        this.f51546c = i10;
    }

    @Override
    public final void run() {
        switch (this.f51544a) {
            case 0:
                this.f51545b.f51437f.scrollBy(0, this.f51546c);
                return;
            default:
                j2 j2Var = this.f51545b.f51437f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f51546c);
                    return;
                }
                return;
        }
    }
}
