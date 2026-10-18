package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class s71 extends org.telegram.ui.Components.dr0 {
    public final z71 f41054b1;

    public s71(z71 z71Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f41054b1 = z71Var;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new m71(this, hVar, i10), 250L);
    }
}
