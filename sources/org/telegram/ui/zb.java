package org.telegram.ui;
public final class zb extends x01 {
    public final pc f52598e;

    public zb(pc pcVar, yb ybVar) {
        super(ybVar);
        this.f52598e = pcVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f52598e.R = null;
    }
}
