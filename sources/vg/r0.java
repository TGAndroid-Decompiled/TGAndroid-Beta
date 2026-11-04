package vg;
public final class r0 extends m1 {
    @Override
    public final void setOffset(float f10) {
        boolean z10;
        if (f10 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        setAutoPlayEnabled(z10);
        super.setOffset(f10);
    }
}
