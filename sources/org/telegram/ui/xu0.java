package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class xu0 extends org.telegram.ui.Components.no0 {
    public final yu0 R2;

    public xu0(yu0 yu0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.R2 = yu0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (!z9) {
            return;
        }
        org.telegram.messenger.g0.i3(new sn0(this, hVar, i7, 24), 250L);
    }
}
