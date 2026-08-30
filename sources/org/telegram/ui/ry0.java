package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ry0 extends org.telegram.ui.Components.lq0 {
    public final sy0 Y0;

    public ry0(sy0 sy0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.Y0 = sy0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (!z4) {
            return;
        }
        AndroidUtilities.runOnUIThread(new zq0(this, hVar, i10, 25), 250L);
    }
}
