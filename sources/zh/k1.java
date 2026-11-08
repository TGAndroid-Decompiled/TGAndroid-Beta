package zh;
public final class k1 implements Runnable {
    public final int f60412a;
    public final z1 f60413b;
    public final int f60414c;

    public k1(z1 z1Var, int i7, int i10) {
        this.f60412a = i10;
        this.f60413b = z1Var;
        this.f60414c = i7;
    }

    @Override
    public final void run() {
        switch (this.f60412a) {
            case 0:
                this.f60413b.f60625f.scrollBy(0, this.f60414c);
                return;
            default:
                fi.w3 w3Var = this.f60413b.f60625f;
                if (w3Var != null) {
                    w3Var.setSpanCount(this.f60414c);
                    return;
                }
                return;
        }
    }
}
