package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class ts0 extends org.telegram.ui.Components.dz0 {
    public final us0 f42286v0;

    public ts0(us0 us0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, messageObject, tLObject, c6Var);
        this.f42286v0 = us0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f42286v0.f42563b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
