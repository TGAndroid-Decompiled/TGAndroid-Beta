package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class ys0 extends org.telegram.ui.Components.ty0 {
    public final zs0 f42278v0;

    public ys0(zs0 zs0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, messageObject, tLObject, c6Var);
        this.f42278v0 = zs0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f42278v0.f42710b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
