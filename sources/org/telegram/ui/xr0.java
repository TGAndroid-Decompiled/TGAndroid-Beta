package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class xr0 extends org.telegram.ui.Components.py0 {
    public final yr0 f43258v0;

    public xr0(yr0 yr0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, messageObject, tLObject, d6Var);
        this.f43258v0 = yr0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f43258v0.f43538b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
