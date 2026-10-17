package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class zr0 extends org.telegram.ui.Components.oy0 {
    public final as0 f43797v0;

    public zr0(as0 as0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, messageObject, tLObject, d6Var);
        this.f43797v0 = as0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f43797v0.f35490b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
