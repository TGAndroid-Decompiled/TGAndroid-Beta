package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;
public final class zp0 extends org.telegram.ui.Components.cx0 {
    public final aq0 f44211o2;

    public zp0(aq0 aq0Var, Activity activity, org.telegram.messenger.jj jjVar, TLObject tLObject, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity, jjVar, tLObject, p6Var);
        this.f44211o2 = aq0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f44211o2.f35697b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
