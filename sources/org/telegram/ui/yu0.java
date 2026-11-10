package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class yu0 extends org.telegram.ui.Components.mo0 {
    public final zu0 U2;

    public yu0(zu0 zu0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.U2 = zu0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (!z9) {
            return;
        }
        org.telegram.messenger.g0.i3(new tn0(this, hVar, i7, 25), 250L);
    }
}
