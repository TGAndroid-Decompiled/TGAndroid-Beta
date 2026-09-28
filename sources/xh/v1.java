package xh;
public final class v1 implements Runnable {
    public final int f46445a;
    public final o2 f46446b;
    public final int f46447c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f46445a = i11;
        this.f46446b = o2Var;
        this.f46447c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46445a) {
            case 0:
                this.f46446b.f46331f.scrollBy(0, this.f46447c);
                return;
            default:
                j2 j2Var = this.f46446b.f46331f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f46447c);
                    return;
                }
                return;
        }
    }
}
