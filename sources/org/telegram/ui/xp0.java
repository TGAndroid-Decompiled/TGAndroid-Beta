package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;
public final class xp0 extends org.telegram.ui.Components.dx0 {
    public final yp0 f43443o2;

    public xp0(yp0 yp0Var, Activity activity, org.telegram.messenger.kj kjVar, TLObject tLObject, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity, kjVar, tLObject, p6Var);
        this.f43443o2 = yp0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f43443o2.f43706b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
