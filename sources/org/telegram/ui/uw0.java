package org.telegram.ui;
public final class uw0 extends r61 {
    public final PremiumPreviewFragment f41404e;

    public uw0(PremiumPreviewFragment premiumPreviewFragment, tw0 tw0Var) {
        super(tw0Var);
        this.f41404e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f41404e.f34160s0 = null;
    }
}
