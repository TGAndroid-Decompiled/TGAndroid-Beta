package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLObject;
public final class qo0 extends org.telegram.ui.Components.iw0 {
    public final ro0 f51299s2;

    public qo0(ro0 ro0Var, Activity activity, org.telegram.messenger.fj fjVar, TLObject tLObject, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity, fjVar, tLObject, i6Var);
        this.f51299s2 = ro0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.f51299s2.f51721b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
