package vh;
public final class w7 implements y1 {
    public final o8 f52135a;

    public w7(o8 o8Var) {
        this.f52135a = o8Var;
    }

    @Override
    public final void setInvert(float f7) {
        boolean z10;
        o8 o8Var = this.f52135a;
        n8 n8Var = o8Var.f51659n;
        int i10 = (f7 > 0.5f ? 1 : (f7 == 0.5f ? 0 : -1));
        boolean z11 = false;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.messenger.i0.n3(n8Var, z10);
        n8 n8Var2 = o8Var.f51659n;
        if (i10 > 0) {
            z11 = true;
        }
        org.telegram.messenger.i0.q3(n8Var2, z11);
    }

    @Override
    public final void invalidate() {
    }
}
