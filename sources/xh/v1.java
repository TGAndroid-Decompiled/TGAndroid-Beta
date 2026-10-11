package xh;
public final class v1 implements Runnable {
    public final int f51633a;
    public final o2 f51634b;
    public final int f51635c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f51633a = i11;
        this.f51634b = o2Var;
        this.f51635c = i10;
    }

    @Override
    public final void run() {
        switch (this.f51633a) {
            case 0:
                this.f51634b.f51526f.scrollBy(0, this.f51635c);
                return;
            default:
                j2 j2Var = this.f51634b.f51526f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f51635c);
                    return;
                }
                return;
        }
    }
}
