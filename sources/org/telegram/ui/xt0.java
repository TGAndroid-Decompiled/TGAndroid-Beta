package org.telegram.ui;
public final class xt0 extends z21 {
    public final PremiumPreviewFragment e;

    public xt0(PremiumPreviewFragment premiumPreviewFragment, wt0 wt0Var) {
        super(wt0Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f33715u0 = null;
    }
}
