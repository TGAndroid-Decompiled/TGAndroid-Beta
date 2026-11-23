package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class uu0 extends org.telegram.ui.Components.zo0 {
    public final vu0 V2;

    public uu0(vu0 vu0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.V2 = vu0Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.h3(new mp0(this, hVar, i7, 21), 250L);
    }
}
