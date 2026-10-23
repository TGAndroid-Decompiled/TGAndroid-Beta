package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class rx0 implements MessagesStorage.BooleanCallback, gs {
    public final ProfileActivity f41265a;
    public final TLRPC.User f41266b;

    public rx0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f41265a = profileActivity;
        this.f41266b = user;
    }

    @Override
    public void b() {
        ProfileActivity.g0(this.f41265a, this.f41266b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        ProfileActivity profileActivity = this.f41265a;
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
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f33949j1), this.f41266b, profileActivity.F2, Boolean.valueOf(z10));
    }
}
