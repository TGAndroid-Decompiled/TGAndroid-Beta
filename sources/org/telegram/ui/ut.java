package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class ut extends org.telegram.ui.Components.ap0 {
    public final vt V2;

    public ut(vt vtVar, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.V2 = vtVar;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.h3(new ss(this, hVar, i7), 250L);
    }
}
