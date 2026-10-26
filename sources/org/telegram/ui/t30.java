package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class t30 implements nh.a {
    public final v50 f43668a;

    public t30(v50 v50Var) {
        this.f43668a = v50Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        boolean z10 = R instanceof ProfileActivity;
        v50 v50Var = this.f43668a;
        if (z10 && ((ProfileActivity) R).a() == groupCallMessage.fromId) {
            v50Var.dismiss();
            return;
        }
        int P0 = v50Var.P0();
        Bundle bundle = new Bundle();
        long j10 = groupCallMessage.fromId;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        boolean z11 = true;
        if (groupCallMessage.fromId == v50Var.d.getUserConfig().getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (P0 > 0 && P0 != Integer.MAX_VALUE) {
            z11 = false;
        }
        R.presentFragment(profileActivity, false, z11);
        v50Var.dismiss();
    }
}
