package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class v71 extends org.telegram.ui.Components.ir0 {
    public final c81 f42632e1;

    public v71(c81 c81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f42632e1 = c81Var;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new o71(this, hVar, i10), 250L);
    }
}
