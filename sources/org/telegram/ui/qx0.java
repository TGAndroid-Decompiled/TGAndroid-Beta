package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class qx0 implements View.OnClickListener {
    public final int f40716a;
    public final ProfileActivity f40717b;

    public qx0(ProfileActivity profileActivity, int i10) {
        this.f40716a = i10;
        this.f40717b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f40716a;
        ProfileActivity profileActivity = this.f40717b;
        switch (i10) {
            case 0:
                ProfileActivity.i0(profileActivity);
                return;
            case 1:
                if (profileActivity.v.getTag() == null) {
                    profileActivity.u4();
                    return;
                }
                return;
            case 2:
                profileActivity.finishPreviewFragment();
                return;
            case 3:
                profileActivity.R4();
                return;
            case 4:
                ProfileActivity.g0(profileActivity);
                return;
            case 5:
                ProfileActivity.a0(profileActivity);
                return;
            case 6:
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f34577c1);
                bundle.putLong("user_id", profileActivity.f34569b1);
                profileActivity.presentFragment(new o21(bundle));
                return;
            case 7:
                ProfileActivity.h0(profileActivity);
                return;
            case 8:
                profileActivity.Q4();
                return;
            case 9:
                profileActivity.Q4();
                return;
            case 10:
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i11 = 0;
                    while (i11 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (p2Var instanceof py) {
                            py pyVar = (py) p2Var;
                            kx kxVar = pyVar.C3;
                            if (kxVar != null) {
                                org.telegram.ui.ActionBar.p2 fragment = kxVar.getFragment();
                                if ((fragment instanceof mf1) && (-((mf1) fragment).f39102a) == profileActivity.a()) {
                                    pyVar.C3.a();
                                }
                            }
                        } else if (p2Var instanceof xn) {
                            if (((xn) p2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(p2Var, false);
                                i11--;
                            }
                        } else if (p2Var instanceof mf1) {
                            if ((-((mf1) p2Var).f39102a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(p2Var, false);
                                i11--;
                            }
                        } else if ((p2Var instanceof ProfileActivity) && p2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) p2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f34653n1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(p2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.G1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f34577c1);
                HashSet hashSet = mf1.f39101k1;
                profileActivity.presentFragment(mf1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                return;
            case 11:
                profileActivity.t4(view);
                return;
            default:
                profileActivity.t4(view);
                return;
        }
    }
}
