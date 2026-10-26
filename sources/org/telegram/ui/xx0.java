package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class xx0 implements MessagesStorage.BooleanCallback, is {
    public final ProfileActivity f45898a;
    public final TLRPC.User f45899b;

    public xx0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f45898a = profileActivity;
        this.f45899b = user;
    }

    @Override
    public void a() {
        ProfileActivity.c0(this.f45898a, this.f45899b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.r2 r2Var;
        int i10 = ProfileActivity.R6;
        ProfileActivity profileActivity = this.f45898a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                r2Var = (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(2, fragmentStack);
            } else {
                r2Var = null;
            }
            if (r2Var instanceof un) {
                ((ActionBarLayout) profileActivity.getParentLayout()).a0(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f36008i1), this.f45899b, profileActivity.E2, Boolean.valueOf(z10));
    }
}
