package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
public final class ts0 extends org.telegram.ui.Components.wx0 {
    public final us0 f37861v0;

    public ts0(us0 us0Var, Activity activity, MessageObject messageObject, TLObject tLObject, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity, messageObject, tLObject, f6Var);
        this.f37861v0 = us0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f37861v0.f38192b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
