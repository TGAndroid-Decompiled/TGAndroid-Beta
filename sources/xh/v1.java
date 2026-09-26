package xh;
public final class v1 implements Runnable {
    public final int f46443a;
    public final o2 f46444b;
    public final int f46445c;

    public v1(o2 o2Var, int i10, int i11) {
        this.f46443a = i11;
        this.f46444b = o2Var;
        this.f46445c = i10;
    }

    @Override
    public final void run() {
        switch (this.f46443a) {
            case 0:
                this.f46444b.f46329f.scrollBy(0, this.f46445c);
                return;
            default:
                j2 j2Var = this.f46444b.f46329f;
                if (j2Var != null) {
                    j2Var.setSpanCount(this.f46445c);
                    return;
                }
                return;
        }
    }
}
