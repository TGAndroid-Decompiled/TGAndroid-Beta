package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class tt extends org.telegram.ui.Components.zo0 {
    public final ut V2;

    public tt(ut utVar, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.V2 = utVar;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.o(this, hVar, i7), 250L);
    }
}
