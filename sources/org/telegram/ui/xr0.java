package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class xr0 extends org.telegram.ui.Components.yx0 {
    public final yr0 f43453s0;

    public xr0(yr0 yr0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, messageObject, tLObject, g6Var);
        this.f43453s0 = yr0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f43453s0.f43699b;
        if (photoViewer.R3 == this) {
            photoViewer.R3 = null;
        }
    }
}
