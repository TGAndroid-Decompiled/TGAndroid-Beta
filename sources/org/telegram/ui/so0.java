package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;
public final class so0 extends org.telegram.ui.Components.yv0 {
    public final to0 f49905r2;

    public so0(to0 to0Var, Activity activity, org.telegram.messenger.ij ijVar, TLObject tLObject, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity, ijVar, tLObject, h6Var);
        this.f49905r2 = to0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f49905r2.f50316b;
        if (photoViewer.T3 == this) {
            photoViewer.T3 = null;
        }
    }
}
