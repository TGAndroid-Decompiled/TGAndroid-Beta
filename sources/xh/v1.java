package xh;
public final class v1 implements Runnable {
    public final int f46464a;
    public final o2 f46465b;
    public final int f46466c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f46464a = i11;
        this.f46465b = o2Var;
        this.f46466c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46464a) {
            case 0:
                this.f46465b.f46350f.scrollBy(0, this.f46466c);
                return;
            default:
                j2 j2Var = this.f46465b.f46350f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f46466c);
                    return;
                }
                return;
        }
    }
}
