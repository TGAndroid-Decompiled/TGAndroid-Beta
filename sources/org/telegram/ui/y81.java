package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class y81 extends org.telegram.ui.Components.vq0 {
    public final f91 f39728b1;

    public y81(f91 f91Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f39728b1 = f91Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new x81(this, iVar, i10), 250L);
    }
}
