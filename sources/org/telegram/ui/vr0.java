package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class vr0 extends org.telegram.ui.Components.xx0 {
    public final wr0 f39240s0;

    public vr0(wr0 wr0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, messageObject, tLObject, f6Var);
        this.f39240s0 = wr0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f39240s0.f39788b;
        if (photoViewer.R3 == this) {
            photoViewer.R3 = null;
        }
    }
}
