package ph;
public final class i extends org.telegram.ui.Components.j6 {
    public final int W;
    public final j X;

    public i(j jVar, int i10) {
        super(true, false, false, false);
        this.W = i10;
        this.X = jVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.W) {
            case 0:
                this.X.invalidateSelf();
                return;
            default:
                this.X.invalidateSelf();
                return;
        }
    }
}
