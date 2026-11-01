package vh;
public final class i extends org.telegram.ui.Components.e6 {
    public final int f51282d0;
    public final j f51283e0;

    public i(j jVar, int i10) {
        super(true, false, false);
        this.f51282d0 = i10;
        this.f51283e0 = jVar;
    }

    @Override
    public final void invalidateSelf() {
        switch (this.f51282d0) {
            case 0:
                this.f51283e0.invalidateSelf();
                return;
            default:
                this.f51283e0.invalidateSelf();
                return;
        }
    }
}
