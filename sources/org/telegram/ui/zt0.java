package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class zt0 implements View.OnClickListener {
    public final int f52681a;
    public final ProfileActivity f52682b;

    public zt0(ProfileActivity profileActivity, int i7) {
        this.f52681a = i7;
        this.f52682b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f52681a;
        ProfileActivity profileActivity = this.f52682b;
        switch (i7) {
            case 0:
                ProfileActivity.l0(profileActivity);
                return;
            case 1:
                if (profileActivity.f41818s.getTag() == null) {
                    profileActivity.I4();
                    return;
                }
                return;
            case 2:
                RectF rectF = ProfileActivity.S6;
                profileActivity.finishPreviewFragment();
                return;
            case 3:
                RectF rectF2 = ProfileActivity.S6;
                profileActivity.l5();
                return;
            case 4:
                TLRPC.UserFull userFull = profileActivity.f41833u2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.o3(profileActivity, profileActivity.f41708c0, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41716d1)), profileActivity.f41833u2.wallet_card));
                    return;
                }
                return;
            case 5:
                ProfileActivity.n0(profileActivity);
                return;
            case 6:
                RectF rectF3 = ProfileActivity.S6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f41723e1);
                bundle.putLong("user_id", profileActivity.f41716d1);
                profileActivity.presentFragment(new ai.s0(bundle));
                return;
            case 7:
                ProfileActivity.o0(profileActivity);
                return;
            case 8:
                RectF rectF4 = ProfileActivity.S6;
                profileActivity.k5();
                return;
            case 9:
                RectF rectF5 = ProfileActivity.S6;
                profileActivity.k5();
                return;
            case 10:
                RectF rectF6 = ProfileActivity.S6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i10 = 0;
                    while (i10 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) profileActivity.getParentLayout().getFragmentStack().get(i10);
                        if (f2Var instanceof ww) {
                            ww wwVar = (ww) f2Var;
                            sv svVar = wwVar.F3;
                            if (svVar != null) {
                                org.telegram.ui.ActionBar.f2 fragment = svVar.getFragment();
                                if ((fragment instanceof w91) && (-((w91) fragment).f50992a) == profileActivity.a()) {
                                    wwVar.F3.a();
                                }
                            }
                        } else if (f2Var instanceof an) {
                            if (((an) f2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(f2Var, false);
                                i10--;
                            }
                        } else if (f2Var instanceof w91) {
                            if ((-((w91) f2Var).f50992a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(f2Var, false);
                                i10--;
                            }
                        } else if ((f2Var instanceof ProfileActivity) && f2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) f2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f41797p1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(f2Var, false);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
                profileActivity.I1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f41723e1);
                HashSet hashSet = w91.f50991q1;
                profileActivity.presentFragment(w91.I0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                return;
            case 11:
                ProfileActivity.a0(profileActivity);
                return;
            case 12:
                RectF rectF7 = ProfileActivity.S6;
                profileActivity.H4(view);
                return;
            default:
                RectF rectF8 = ProfileActivity.S6;
                profileActivity.H4(view);
                return;
        }
    }
}
