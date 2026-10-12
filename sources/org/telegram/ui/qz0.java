package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class qz0 extends org.telegram.ui.Components.jr0 {
    public final rz0 f39562b1;

    public qz0(rz0 rz0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f39562b1 = rz0Var;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new hz0(this, hVar, i10, 2), 250L);
    }
}
