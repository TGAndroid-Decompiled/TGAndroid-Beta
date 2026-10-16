package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class xs0 extends org.telegram.ui.Components.uy0 {
    public final ys0 f41631v0;

    public xs0(ys0 ys0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity, messageObject, tLObject, c6Var);
        this.f41631v0 = ys0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f41631v0.f41955b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
