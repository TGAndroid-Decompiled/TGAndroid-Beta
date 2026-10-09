package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class rs0 extends org.telegram.ui.Components.xy0 {
    public final ss0 f41479v0;

    public rs0(ss0 ss0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity, messageObject, tLObject, e6Var);
        this.f41479v0 = ss0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f41479v0.f41765b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
