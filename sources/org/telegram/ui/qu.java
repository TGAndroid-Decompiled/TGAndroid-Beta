package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class qu extends org.telegram.ui.Components.pp0 {
    public final ru R2;

    public qu(ru ruVar, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.R2 = ruVar;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.u(this, hVar, i10), 250L);
    }
}
