package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class uu0 extends org.telegram.ui.Components.mo0 {
    public final vu0 R2;

    public uu0(vu0 vu0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.R2 = vu0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (!z9) {
            return;
        }
        org.telegram.messenger.g0.i3(new qn0(this, hVar, i7, 23), 250L);
    }
}
