package zh;
public final class l1 implements Runnable {
    public final int f60308a;
    public final a2 f60309b;
    public final int f60310c;

    public l1(a2 a2Var, int i7, int i10) {
        this.f60308a = i10;
        this.f60309b = a2Var;
        this.f60310c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60308a) {
            case 0:
                this.f60309b.f60085f.scrollBy(0, this.f60310c);
                return;
            default:
                fi.w3 w3Var = this.f60309b.f60085f;
                if (w3Var != null) {
                    w3Var.setSpanCount(this.f60310c);
                    return;
                }
                return;
        }
    }
}
