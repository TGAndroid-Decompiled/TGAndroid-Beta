package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class u71 extends org.telegram.ui.Components.hr0 {
    public final b81 f42342e1;

    public u71(b81 b81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f42342e1 = b81Var;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new n71(this, hVar, i10), 250L);
    }
}
