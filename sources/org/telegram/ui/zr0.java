package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class zr0 extends org.telegram.ui.Components.sy0 {
    public final as0 f44199x0;

    public zr0(as0 as0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity, messageObject, tLObject, g6Var);
        this.f44199x0 = as0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f44199x0.f35833b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
