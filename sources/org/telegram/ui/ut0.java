package org.telegram.ui;

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ut0 implements org.telegram.messenger.nr, or {
    public final ProfileActivity f52023a;
    public final TLRPC.User f52024b;

    public ut0(ProfileActivity profileActivity, TLRPC.User user) {
        this.f52023a = profileActivity;
        this.f52024b = user;
    }

    @Override
    public void a() {
        ProfileActivity.j0(this.f52023a, this.f52024b);
    }

    @Override
    public void j(boolean z10) {
        org.telegram.ui.ActionBar.e2 e2Var;
        RectF rectF = ProfileActivity.X6;
        ProfileActivity profileActivity = this.f52023a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (fragmentStack != null && fragmentStack.size() >= 2) {
                e2Var = (org.telegram.ui.ActionBar.e2) r.b.h(2, fragmentStack);
            } else {
                e2Var = null;
            }
            if (e2Var instanceof an) {
                ((ActionBarLayout) profileActivity.getParentLayout()).b0(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ns.K2, Long.valueOf(profileActivity.f43123i1), this.f52024b, profileActivity.F2, Boolean.valueOf(z10));
    }
}
