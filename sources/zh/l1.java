package zh;
public final class l1 implements Runnable {
    public final int f60333a;
    public final a2 f60334b;
    public final int f60335c;

    public l1(a2 a2Var, int i7, int i10) {
        this.f60333a = i10;
        this.f60334b = a2Var;
        this.f60335c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60333a) {
            case 0:
                this.f60334b.f60110f.scrollBy(0, this.f60335c);
                return;
            default:
                fi.w3 w3Var = this.f60334b.f60110f;
                if (w3Var != null) {
                    w3Var.setSpanCount(this.f60335c);
                    return;
                }
                return;
        }
    }
}
