package zh;
public final class k1 implements Runnable {
    public final int f60413a;
    public final z1 f60414b;
    public final int f60415c;

    public k1(z1 z1Var, int i7, int i10) {
        this.f60413a = i10;
        this.f60414b = z1Var;
        this.f60415c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60413a) {
            case 0:
                this.f60414b.f60626f.scrollBy(0, this.f60415c);
                return;
            default:
                fi.w3 w3Var = this.f60414b.f60626f;
                if (w3Var != null) {
                    w3Var.setSpanCount(this.f60415c);
                    return;
                }
                return;
        }
    }
}
