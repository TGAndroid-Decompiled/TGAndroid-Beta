package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class rt extends org.telegram.ui.Components.no0 {
    public final st R2;

    public rt(st stVar, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.R2 = stVar;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (!z9) {
            return;
        }
        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.m51(this, hVar, i7), 250L);
    }
}
