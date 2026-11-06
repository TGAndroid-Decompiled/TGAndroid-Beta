package ug;
public final class s0 extends j1 {
    @Override
    public final void setOffset(float f10) {
        boolean z9;
        if (f10 == 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        setAutoPlayEnabled(z9);
        super.setOffset(f10);
    }
}
