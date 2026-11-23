package org.telegram.ui;

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class yt0 implements org.telegram.messenger.mr, pr {
    public final ProfileActivity f54254a;
    public final TLRPC.User f54255b;

    public yt0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f54254a = profileActivity;
        this.f54255b = user;
    }

    @Override
    public void a() {
        ProfileActivity.j0(this.f54254a, this.f54255b);
    }

    @Override
    public void d(boolean z10) {
        org.telegram.ui.ActionBar.g2 g2Var;
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.f54254a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                g2Var = (org.telegram.ui.ActionBar.g2) p5.c.h(2, fragmentStack);
            } else {
                g2Var = null;
            }
            if (g2Var instanceof bn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).b0(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ls.K2, Long.valueOf(profileActivity.f43579i1), this.f54255b, profileActivity.F2, Boolean.valueOf(z10));
    }
}
