package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class qx0 implements MessagesStorage.BooleanCallback, ms {
    public final ProfileActivity f37858a;
    public final TLRPC.User f37859b;

    public qx0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f37858a = profileActivity;
        this.f37859b = user;
    }

    @Override
    public void a() {
        ProfileActivity.j0(this.f37858a, this.f37859b);
    }

    @Override
    public void run(boolean z4) {
        org.telegram.ui.ActionBar.p2 p2Var;
        ProfileActivity profileActivity = this.f37858a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                p2Var = (org.telegram.ui.ActionBar.p2) yh.k(2, fragmentStack);
            } else {
                p2Var = null;
            }
            if (p2Var instanceof xn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.K1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f32065f1), this.f37859b, profileActivity.B2, Boolean.valueOf(z4));
    }
}
