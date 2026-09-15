package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class x81 extends org.telegram.ui.Components.hq0 {
    public final e91 f39524b1;

    public x81(e91 e91Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f39524b1 = e91Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new iy0(this, iVar, i10, 26), 250L);
    }
}
