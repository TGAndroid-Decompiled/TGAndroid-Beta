package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class xx0 implements View.OnClickListener {
    public final int f45793a;
    public final ProfileActivity f45794b;

    public xx0(ProfileActivity profileActivity, int i10) {
        this.f45793a = i10;
        this.f45794b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f45793a;
        ProfileActivity profileActivity = this.f45794b;
        switch (i10) {
            case 0:
                ProfileActivity.V(profileActivity);
                return;
            case 1:
                ProfileActivity.d0(profileActivity);
                return;
            case 2:
                if (profileActivity.f36098s.getTag() == null) {
                    profileActivity.B4();
                    return;
                }
                return;
            case 3:
                int i11 = ProfileActivity.R6;
                profileActivity.finishPreviewFragment();
                return;
            case 4:
                int i12 = ProfileActivity.R6;
                profileActivity.c5();
                return;
            case 5:
                TLRPC.UserFull userFull = profileActivity.f36122v2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.y2(profileActivity, profileActivity.f35988c0, profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f36003e1)), profileActivity.f36122v2.wallet_card));
                    return;
                }
                return;
            case 6:
                ProfileActivity.f0(profileActivity);
                return;
            case 7:
                int i13 = ProfileActivity.R6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f36011f1);
                bundle.putLong("user_id", profileActivity.f36003e1);
                profileActivity.presentFragment(new ai.z0(bundle));
                return;
            case 8:
                ProfileActivity.b0(profileActivity);
                return;
            case 9:
                int i14 = ProfileActivity.R6;
                profileActivity.b5();
                return;
            case 10:
                int i15 = ProfileActivity.R6;
                profileActivity.b5();
                return;
            case 11:
                int i16 = ProfileActivity.R6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i17 = 0;
                    while (i17 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) profileActivity.getParentLayout().getFragmentStack().get(i17);
                        if (r2Var instanceof ey) {
                            ey eyVar = (ey) r2Var;
                            vw vwVar = eyVar.G3;
                            if (vwVar != null) {
                                org.telegram.ui.ActionBar.r2 fragment = vwVar.getFragment();
                                if ((fragment instanceof cf1) && (-((cf1) fragment).f38288a) == profileActivity.a()) {
                                    eyVar.G3.a();
                                }
                            }
                        } else if (r2Var instanceof wn) {
                            if (((wn) r2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(r2Var, false);
                                i17--;
                            }
                        } else if (r2Var instanceof cf1) {
                            if ((-((cf1) r2Var).f38288a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(r2Var, false);
                                i17--;
                            }
                        } else if ((r2Var instanceof ProfileActivity) && r2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) r2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f36086q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).c0(r2Var, false);
                                i17--;
                            }
                        }
                        i17++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f36011f1);
                HashSet hashSet = cf1.f38287q1;
                profileActivity.presentFragment(cf1.E0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                return;
            case 12:
                int i18 = ProfileActivity.R6;
                profileActivity.A4(view);
                return;
            default:
                int i19 = ProfileActivity.R6;
                profileActivity.A4(view);
                return;
        }
    }
}
