package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ty0 extends org.telegram.ui.Components.mq0 {
    public final uy0 Y0;

    public ty0(uy0 uy0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.Y0 = uy0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (!z4) {
            return;
        }
        AndroidUtilities.runOnUIThread(new br0(this, hVar, i10, 24), 250L);
    }
}
