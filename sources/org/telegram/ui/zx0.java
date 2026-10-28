package org.telegram.ui;

import java.util.List;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class zx0 implements MessagesStorage.BooleanCallback, ks {
    public final ProfileActivity f46415a;
    public final TLRPC.User f46416b;

    public zx0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f46415a = profileActivity;
        this.f46416b = user;
    }

    @Override
    public void a() {
        ProfileActivity.c0(this.f46415a, this.f46416b);
    }

    @Override
    public void run(boolean z10) {
        org.telegram.ui.ActionBar.r2 r2Var;
        int i10 = ProfileActivity.R6;
        ProfileActivity profileActivity = this.f46415a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                r2Var = (org.telegram.ui.ActionBar.r2) org.telegram.ui.Components.b10.h(2, fragmentStack);
            } else {
                r2Var = null;
            }
            if (r2Var instanceof wn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).a0(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(profileActivity.f36032i1), this.f46416b, profileActivity.E2, Boolean.valueOf(z10));
    }
}
