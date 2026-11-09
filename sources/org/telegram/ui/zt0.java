package org.telegram.ui;

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class zt0 implements org.telegram.messenger.qr, or {
    public final ProfileActivity f52670a;
    public final TLRPC.User f52671b;

    public zt0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f52670a = profileActivity;
        this.f52671b = user;
    }

    @Override
    public void a() {
        ProfileActivity.j0(this.f52670a, this.f52671b);
    }

    @Override
    public void k(boolean z9) {
        org.telegram.ui.ActionBar.f2 f2Var;
        RectF rectF = ProfileActivity.V6;
        ProfileActivity profileActivity = this.f52670a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                f2Var = (org.telegram.ui.ActionBar.f2) rf.b.g(2, fragmentStack);
            } else {
                f2Var = null;
            }
            if (f2Var instanceof cn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).b0(fragmentStack.size() - 2);
            }
        }
        profileActivity.M1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(profileActivity.f41752h1), this.f52671b, profileActivity.D2, Boolean.valueOf(z9));
    }
}
