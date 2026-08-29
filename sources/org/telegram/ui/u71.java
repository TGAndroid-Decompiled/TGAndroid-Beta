package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class u71 extends org.telegram.ui.Components.dq0 {
    public final b81 X0;

    public u71(b81 b81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.X0 = b81Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new t31(this, hVar, i10), 250L);
    }
}
