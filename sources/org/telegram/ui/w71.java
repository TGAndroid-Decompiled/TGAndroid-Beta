package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class w71 extends org.telegram.ui.Components.mr0 {
    public final d81 f45000a1;

    public w71(d81 d81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f45000a1 = d81Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new fy0(this, hVar, i10, 22), 250L);
    }
}
