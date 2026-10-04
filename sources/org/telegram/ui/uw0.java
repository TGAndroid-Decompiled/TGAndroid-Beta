package org.telegram.ui;
public final class uw0 extends t61 {
    public final PremiumPreviewFragment f41369e;

    public uw0(PremiumPreviewFragment premiumPreviewFragment, tw0 tw0Var) {
        super(tw0Var);
        this.f41369e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f41369e.f34147s0 = null;
    }
}
