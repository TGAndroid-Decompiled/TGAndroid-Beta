package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;
public final class ro0 extends org.telegram.ui.Components.zv0 {
    public final so0 f49549o2;

    public ro0(so0 so0Var, Activity activity, org.telegram.messenger.ij ijVar, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, ijVar, tLObject, g6Var);
        this.f49549o2 = so0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f49549o2.f49967b;
        if (photoViewer.T3 == this) {
            photoViewer.T3 = null;
        }
    }
}
