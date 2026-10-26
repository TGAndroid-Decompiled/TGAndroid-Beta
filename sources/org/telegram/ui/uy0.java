package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class uy0 extends org.telegram.ui.Components.mr0 {
    public final vy0 f44552a1;

    public uy0(vy0 vy0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f44552a1 = vy0Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new fy0(this, hVar, i10, 5), 250L);
    }
}
