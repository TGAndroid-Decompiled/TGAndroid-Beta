package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class qs0 extends org.telegram.ui.Components.zy0 {
    public final rs0 f41227v0;

    public qs0(rs0 rs0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.d6 d6Var) {
        super(activity, messageObject, tLObject, d6Var);
        this.f41227v0 = rs0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f41227v0.f41508b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
