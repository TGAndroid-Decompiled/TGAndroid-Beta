package rg;
public final class s0 extends o1 {
    @Override
    public final void setOffset(float f7) {
        boolean z10;
        if (f7 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        setAutoPlayEnabled(z10);
        super.setOffset(f7);
    }
}
