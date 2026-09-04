package sg;
public final class u0 extends s1 {
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
