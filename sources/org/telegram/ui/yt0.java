package org.telegram.ui;

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class yt0 implements org.telegram.messenger.lr, pr {
    public final ProfileActivity f54246a;
    public final TLRPC.User f54247b;

    public yt0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f54246a = profileActivity;
        this.f54247b = user;
    }

    @Override
    public void a() {
        ProfileActivity.j0(this.f54246a, this.f54247b);
    }

    @Override
    public void d(boolean z10) {
        org.telegram.ui.ActionBar.h2 h2Var;
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.f54246a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                h2Var = (org.telegram.ui.ActionBar.h2) p5.c.h(2, fragmentStack);
            } else {
                h2Var = null;
            }
            if (h2Var instanceof bn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).b0(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ks.K2, Long.valueOf(profileActivity.f43569i1), this.f54247b, profileActivity.F2, Boolean.valueOf(z10));
    }
}
