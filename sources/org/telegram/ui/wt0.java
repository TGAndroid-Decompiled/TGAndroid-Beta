package org.telegram.ui;

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class wt0 implements org.telegram.messenger.qr, mr {
    public final ProfileActivity f51491a;
    public final TLRPC.User f51492b;

    public wt0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f51491a = profileActivity;
        this.f51492b = user;
    }

    @Override
    public void a() {
        ProfileActivity.b0(this.f51491a, this.f51492b);
    }

    @Override
    public void k(boolean z9) {
        org.telegram.ui.ActionBar.f2 f2Var;
        RectF rectF = ProfileActivity.S6;
        ProfileActivity profileActivity = this.f51491a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                f2Var = (org.telegram.ui.ActionBar.f2) rf.b.g(2, fragmentStack);
            } else {
                f2Var = null;
            }
            if (f2Var instanceof an) {
                ((ActionBarLayout) profileActivity.getParentLayout()).b0(fragmentStack.size() - 2);
            }
        }
        profileActivity.M1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(profileActivity.f41717h1), this.f51492b, profileActivity.D2, Boolean.valueOf(z9));
    }
}
