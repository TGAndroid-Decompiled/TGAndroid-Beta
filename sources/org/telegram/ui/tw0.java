package org.telegram.ui;
public final class tw0 extends q61 {
    public final PremiumPreviewFragment e;

    public tw0(PremiumPreviewFragment premiumPreviewFragment, sw0 sw0Var) {
        super(sw0Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f31150s0 = null;
    }
}
