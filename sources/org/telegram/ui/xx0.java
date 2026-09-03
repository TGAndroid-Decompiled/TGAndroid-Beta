package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class xx0 implements MessagesStorage.BooleanCallback, os {
    public final ProfileActivity f40090a;
    public final TLRPC.User f40091b;

    public xx0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f40090a = profileActivity;
        this.f40091b = user;
    }

    @Override
    public void a() {
        ProfileActivity.j0(this.f40090a, this.f40091b);
    }

    @Override
    public void run(boolean z4) {
        org.telegram.ui.ActionBar.p2 p2Var;
        ProfileActivity profileActivity = this.f40090a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                p2Var = (org.telegram.ui.ActionBar.p2) ai.j(2, fragmentStack);
            } else {
                p2Var = null;
            }
            if (p2Var instanceof zn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.K1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f32039f1), this.f40091b, profileActivity.B2, Boolean.valueOf(z4));
    }
}
