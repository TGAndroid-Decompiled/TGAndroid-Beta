package org.telegram.ui;
public final class uw0 extends t61 {
    public final PremiumPreviewFragment e;

    public uw0(PremiumPreviewFragment premiumPreviewFragment, tw0 tw0Var) {
        super(tw0Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f31467s0 = null;
    }
}
