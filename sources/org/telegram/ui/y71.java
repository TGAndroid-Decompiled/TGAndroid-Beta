package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class y71 extends org.telegram.ui.Components.nr0 {
    public final f81 f45876a1;

    public y71(f81 f81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f45876a1 = f81Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new by0(this, hVar, i10, 23), 250L);
    }
}
