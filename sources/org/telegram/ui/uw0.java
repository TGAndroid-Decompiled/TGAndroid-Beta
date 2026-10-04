package org.telegram.ui;
public final class uw0 extends t61 {
    public final PremiumPreviewFragment f41362e;

    public uw0(PremiumPreviewFragment premiumPreviewFragment, tw0 tw0Var) {
        super(tw0Var);
        this.f41362e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f41362e.f34141s0 = null;
    }
}
