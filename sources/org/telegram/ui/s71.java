package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class s71 extends org.telegram.ui.Components.rp0 {
    public final z71 X0;

    public s71(z71 z71Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.X0 = z71Var;
    }

    @Override
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new n21(this, hVar, i9), 250L);
    }
}
