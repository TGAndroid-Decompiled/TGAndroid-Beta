package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class wu0 extends org.telegram.ui.Components.ap0 {
    public final xu0 V2;

    public wu0(xu0 xu0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.V2 = xu0Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.h3(new ur0(this, hVar, i7, 15), 250L);
    }
}
