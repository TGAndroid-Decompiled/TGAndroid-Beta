package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;
public final class ro0 extends org.telegram.ui.Components.kw0 {
    public final so0 f51719s2;

    public ro0(so0 so0Var, Activity activity, org.telegram.messenger.gj gjVar, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, gjVar, tLObject, h6Var);
        this.f51719s2 = so0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f51719s2.f52063b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
