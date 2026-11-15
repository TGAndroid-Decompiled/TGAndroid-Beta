package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class tu0 extends org.telegram.ui.Components.po0 {
    public final uu0 V2;

    public tu0(uu0 uu0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.V2 = uu0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.i3(new mp0(this, hVar, i7, 20), 250L);
    }
}
