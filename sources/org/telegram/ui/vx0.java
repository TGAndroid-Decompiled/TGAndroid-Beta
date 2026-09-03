package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class vx0 implements View.OnClickListener {
    public final int f39217a;
    public final ProfileActivity f39218b;

    public vx0(ProfileActivity profileActivity, int i10) {
        this.f39217a = i10;
        this.f39218b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f39217a;
        ProfileActivity profileActivity = this.f39218b;
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
                bundle.putLong("chat_id", profileActivity.f32019c1);
                bundle.putLong("user_id", profileActivity.f32011b1);
                profileActivity.presentFragment(new u21(bundle));
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
                        if (p2Var instanceof qy) {
                            qy qyVar = (qy) p2Var;
                            lx lxVar = qyVar.C3;
                            if (lxVar != null) {
                                org.telegram.ui.ActionBar.p2 fragment = lxVar.getFragment();
                                if ((fragment instanceof sf1) && (-((sf1) fragment).f38175a) == profileActivity.a()) {
                                    qyVar.C3.a();
                                }
                            }
                        } else if (p2Var instanceof zn) {
                            if (((zn) p2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(p2Var, false);
                                i11--;
                            }
                        } else if (p2Var instanceof sf1) {
                            if ((-((sf1) p2Var).f38175a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(p2Var, false);
                                i11--;
                            }
                        } else if ((p2Var instanceof ProfileActivity) && p2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) p2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f32094n1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(p2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.G1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f32019c1);
                HashSet hashSet = sf1.f38174k1;
                profileActivity.presentFragment(sf1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
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
