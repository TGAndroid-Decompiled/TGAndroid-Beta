package vh;
public final class l2 implements Runnable {
    public final int f51466a;
    public final n2 f51467b;

    public l2(n2 n2Var, int i10) {
        this.f51466a = i10;
        this.f51467b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f51466a) {
            case 0:
                this.f51467b.dismiss();
                return;
            default:
                n2.I0(this.f51467b);
                return;
        }
    }
}
