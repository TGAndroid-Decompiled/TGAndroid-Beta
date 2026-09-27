package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class rz0 extends org.telegram.ui.Components.vq0 {
    public final ProfileActivity X0;

    public rz0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.X0 = profileActivity;
    }

    @Override
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new by0(this, iVar, i10, 9), 250L);
    }
}
