package yh;
public final class s1 implements Runnable {
    public final int f50541a;
    public final m2 f50542b;
    public final int f50543c;

    public s1(m2 m2Var, int i10, int i11) {
        this.f50541a = i11;
        this.f50542b = m2Var;
        this.f50543c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50541a) {
            case 0:
                this.f50542b.f50422f.scrollBy(0, this.f50543c);
                return;
            default:
                h2 h2Var = this.f50542b.f50422f;
                if (h2Var != null) {
                    h2Var.setSpanCount(this.f50543c);
                    return;
                }
                return;
        }
    }
}
