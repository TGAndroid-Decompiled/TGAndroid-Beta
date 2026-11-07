package zh;
public final class l1 implements Runnable {
    public final int f60338a;
    public final a2 f60339b;
    public final int f60340c;

    public l1(a2 a2Var, int i7, int i10) {
        this.f60338a = i10;
        this.f60339b = a2Var;
        this.f60340c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60338a) {
            case 0:
                this.f60339b.f60115f.scrollBy(0, this.f60340c);
                return;
            default:
                fi.w3 w3Var = this.f60339b.f60115f;
                if (w3Var != null) {
                    w3Var.setSpanCount(this.f60340c);
                    return;
                }
                return;
        }
    }
}
