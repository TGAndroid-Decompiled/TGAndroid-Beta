package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class vu0 extends org.telegram.ui.Components.yo0 {
    public final wu0 V2;

    public vu0(wu0 wu0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.V2 = wu0Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.h3(new tr0(this, hVar, i7, 15), 250L);
    }
}
