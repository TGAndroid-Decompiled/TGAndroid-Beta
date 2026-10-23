package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ry0 extends org.telegram.ui.Components.ir0 {
    public final sy0 f41267e1;

    public ry0(sy0 sy0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f41267e1 = sy0Var;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new mv0(this, hVar, i10, 15), 250L);
    }
}
