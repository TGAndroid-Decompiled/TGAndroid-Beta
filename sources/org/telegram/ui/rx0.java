package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class rx0 implements View.OnClickListener {
    public final int f40828a;
    public final ProfileActivity f40829b;

    public rx0(ProfileActivity profileActivity, int i10) {
        this.f40828a = i10;
        this.f40829b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f40828a;
        ProfileActivity profileActivity = this.f40829b;
        switch (i10) {
            case 0:
                ProfileActivity.c0(profileActivity);
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
                TLRPC.UserFull userFull = profileActivity.f33726w2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.x2(profileActivity, profileActivity.f33591d0, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33607f1)), profileActivity.f33726w2.wallet_card));
                    return;
                }
                return;
            case 5:
                ProfileActivity.f0(profileActivity);
                return;
            case 6:
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f33614g1);
                bundle.putLong("user_id", profileActivity.f33607f1);
                profileActivity.presentFragment(new zh.m0(bundle));
                return;
            case 7:
                ProfileActivity.g0(profileActivity);
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
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (n2Var instanceof ey) {
                            ey eyVar = (ey) n2Var;
                            yw ywVar = eyVar.G3;
                            if (ywVar != null) {
                                org.telegram.ui.ActionBar.n2 fragment = ywVar.getFragment();
                                if ((fragment instanceof te1) && (-((te1) fragment).f41679a) == profileActivity.a()) {
                                    eyVar.G3.a();
                                }
                            }
                        } else if (n2Var instanceof sn) {
                            if (((sn) n2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        } else if (n2Var instanceof te1) {
                            if ((-((te1) n2Var).f41679a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        } else if ((n2Var instanceof ProfileActivity) && n2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) n2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f33688r1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).a0(n2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.K1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f33614g1);
                HashSet hashSet = te1.f41678n1;
                profileActivity.presentFragment(te1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                return;
            case 11:
                ProfileActivity.U(profileActivity);
                return;
            case 12:
                profileActivity.t4(view);
                return;
            default:
                profileActivity.t4(view);
                return;
        }
    }
}
