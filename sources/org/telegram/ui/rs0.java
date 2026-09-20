package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class rs0 extends org.telegram.ui.Components.gy0 {
    public final ss0 f37221v0;

    public rs0(ss0 ss0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, messageObject, tLObject, f6Var);
        this.f37221v0 = ss0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f37221v0.f37521b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
