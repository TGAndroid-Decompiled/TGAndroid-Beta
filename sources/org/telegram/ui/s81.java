package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class s81 extends org.telegram.ui.Components.uq0 {
    public final z81 f37627b1;

    public s81(z81 z81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f37627b1 = z81Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new p81(this, iVar, i10), 250L);
    }
}
