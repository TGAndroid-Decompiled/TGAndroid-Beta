package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;
public final class qo0 extends org.telegram.ui.Components.kw0 {
    public final ro0 f51313s2;

    public qo0(ro0 ro0Var, Activity activity, org.telegram.messenger.fj fjVar, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, fjVar, tLObject, h6Var);
        this.f51313s2 = ro0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f51313s2.f51685b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
