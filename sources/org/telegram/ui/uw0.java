package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class uw0 extends org.telegram.ui.Components.op0 {
    public final ProfileActivity R2;

    public uw0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.R2 = profileActivity;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.i0.h3(new et0(this, hVar, i10, 17), 250L);
    }
}
