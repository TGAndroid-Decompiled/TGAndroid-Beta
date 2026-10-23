package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class vx0 implements View.OnClickListener {
    public final int f42854a;
    public final ProfileActivity f42855b;

    public vx0(ProfileActivity profileActivity, int i10) {
        this.f42854a = i10;
        this.f42855b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f42854a;
        ProfileActivity profileActivity = this.f42855b;
        switch (i10) {
            case 0:
                ProfileActivity.c0(profileActivity);
                return;
            case 1:
                if (profileActivity.v.getTag() == null) {
                    profileActivity.w4();
                    return;
                }
                return;
            case 2:
                profileActivity.finishPreviewFragment();
                return;
            case 3:
                profileActivity.U4();
                return;
            case 4:
                TLRPC.UserFull userFull = profileActivity.f34040w2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.y2(profileActivity, profileActivity.f33905d0, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33921f1)), profileActivity.f34040w2.wallet_card));
                    return;
                }
                return;
            case 5:
                ProfileActivity.e0(profileActivity);
                return;
            case 6:
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f33928g1);
                bundle.putLong("user_id", profileActivity.f33921f1);
                profileActivity.presentFragment(new zh.n0(bundle));
                return;
            case 7:
                ProfileActivity.f0(profileActivity);
                return;
            case 8:
                profileActivity.T4();
                return;
            case 9:
                profileActivity.T4();
                return;
            case 10:
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i11 = 0;
                    while (i11 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) profileActivity.getParentLayout().getFragmentStack().get(i11);
                        if (o2Var instanceof ey) {
                            ey eyVar = (ey) o2Var;
                            yw ywVar = eyVar.G3;
                            if (ywVar != null) {
                                org.telegram.ui.ActionBar.o2 fragment = ywVar.getFragment();
                                if ((fragment instanceof ye1) && (-((ye1) fragment).f43792a) == profileActivity.a()) {
                                    eyVar.G3.a();
                                }
                            }
                        } else if (o2Var instanceof sn) {
                            if (((sn) o2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).b0(o2Var, false);
                                i11--;
                            }
                        } else if (o2Var instanceof ye1) {
                            if ((-((ye1) o2Var).f43792a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).b0(o2Var, false);
                                i11--;
                            }
                        } else if ((o2Var instanceof ProfileActivity) && o2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) o2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f34002r1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).b0(o2Var, false);
                                i11--;
                            }
                        }
                        i11++;
                    }
                }
                profileActivity.K1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f33928g1);
                HashSet hashSet = ye1.f43791q1;
                profileActivity.presentFragment(ye1.D0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                return;
            case 11:
                ProfileActivity.U(profileActivity);
                return;
            case 12:
                profileActivity.v4(view);
                return;
            default:
                profileActivity.v4(view);
                return;
        }
    }
}
