package org.telegram.ui;
public final class uw0 extends t61 {
    public final PremiumPreviewFragment f41361e;

    public uw0(PremiumPreviewFragment premiumPreviewFragment, tw0 tw0Var) {
        super(tw0Var);
        this.f41361e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f41361e.f34140s0 = null;
    }
}
