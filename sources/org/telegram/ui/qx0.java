package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class qx0 implements MessagesStorage.BooleanCallback, gs {
    public final ProfileActivity f40948a;
    public final TLRPC.User f40949b;

    public qx0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f40948a = profileActivity;
        this.f40949b = user;
    }

    @Override
    public void b() {
        ProfileActivity.g0(this.f40948a, this.f40949b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        ProfileActivity profileActivity = this.f40948a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                o2Var = (org.telegram.ui.ActionBar.o2) si.o0.g(2, fragmentStack);
            } else {
                o2Var = null;
            }
            if (o2Var instanceof sn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Z(fragmentStack.size() - 2);
            }
        }
        profileActivity.O1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f33951j1), this.f40949b, profileActivity.F2, Boolean.valueOf(z10));
    }
}
