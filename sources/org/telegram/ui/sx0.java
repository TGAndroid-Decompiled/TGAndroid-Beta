package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class sx0 implements MessagesStorage.BooleanCallback, ns {
    public final ProfileActivity f41390a;
    public final TLRPC.User f41391b;

    public sx0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f41390a = profileActivity;
        this.f41391b = user;
    }

    @Override
    public void a() {
        ProfileActivity.j0(this.f41390a, this.f41391b);
    }

    @Override
    public void run(boolean z4) {
        org.telegram.ui.ActionBar.p2 p2Var;
        ProfileActivity profileActivity = this.f41390a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                p2Var = (org.telegram.ui.ActionBar.p2) yh.j(2, fragmentStack);
            } else {
                p2Var = null;
            }
            if (p2Var instanceof xn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.K1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f34598f1), this.f41391b, profileActivity.B2, Boolean.valueOf(z4));
    }
}
