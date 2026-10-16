package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class qy0 implements MessagesStorage.BooleanCallback, vs {
    public final ProfileActivity f39239a;
    public final TLRPC.User f39240b;

    public qy0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f39239a = profileActivity;
        this.f39240b = user;
    }

    @Override
    public void b() {
        ProfileActivity.j0(this.f39239a, this.f39240b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.m2 m2Var;
        ProfileActivity profileActivity = this.f39239a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                m2Var = (org.telegram.ui.ActionBar.m2) t8.b.g(2, fragmentStack);
            } else {
                m2Var = null;
            }
            if (m2Var instanceof fo) {
                ((ActionBarLayout) profileActivity.getParentLayout()).Y(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f32290i1), this.f39240b, profileActivity.E2, Boolean.valueOf(z10));
    }
}
