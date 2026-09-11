package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class qs0 extends org.telegram.ui.Components.ux0 {
    public final rs0 f39976v0;

    public qs0(rs0 rs0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, messageObject, tLObject, f6Var);
        this.f39976v0 = rs0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f39976v0.f40230b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
