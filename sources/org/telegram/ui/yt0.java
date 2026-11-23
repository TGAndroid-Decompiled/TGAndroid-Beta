package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class yt0 implements View.OnClickListener {
    public final int f54427a;
    public final ProfileActivity f54428b;

    public yt0(ProfileActivity profileActivity, int i7) {
        this.f54427a = i7;
        this.f54428b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f54427a;
        ProfileActivity profileActivity = this.f54428b;
        switch (i7) {
            case 0:
                ProfileActivity.k0(profileActivity);
                return;
            case 1:
                if (profileActivity.f43761s.getTag() == null) {
                    profileActivity.L4();
                    return;
                }
                return;
            case 2:
                RectF rectF = ProfileActivity.Z6;
                profileActivity.finishPreviewFragment();
                return;
            case 3:
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.o5();
                return;
            case 4:
                TLRPC.UserFull userFull = profileActivity.f43791w2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.x3(profileActivity, profileActivity.f43658d0, profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43666e1)), profileActivity.f43791w2.wallet_card));
                    return;
                }
                return;
            case 5:
                ProfileActivity.m0(profileActivity);
                return;
            case 6:
                RectF rectF3 = ProfileActivity.Z6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f43674f1);
                bundle.putLong("user_id", profileActivity.f43666e1);
                profileActivity.presentFragment(new ci.j0(bundle));
                return;
            case 7:
                ProfileActivity.n0(profileActivity);
                return;
            case 8:
                RectF rectF4 = ProfileActivity.Z6;
                profileActivity.n5();
                return;
            case 9:
                RectF rectF5 = ProfileActivity.Z6;
                profileActivity.n5();
                return;
            case 10:
                RectF rectF6 = ProfileActivity.Z6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i10 = 0;
                    while (i10 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) profileActivity.getParentLayout().getFragmentStack().get(i10);
                        if (g2Var instanceof bx) {
                            bx bxVar = (bx) g2Var;
                            wv wvVar = bxVar.H3;
                            if (wvVar != null) {
                                org.telegram.ui.ActionBar.g2 fragment = wvVar.getFragment();
                                if ((fragment instanceof w91) && (-((w91) fragment).f53216a) == profileActivity.a()) {
                                    bxVar.H3.a();
                                }
                            }
                        } else if (g2Var instanceof bn) {
                            if (((bn) g2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(g2Var, false);
                                i10--;
                            }
                        } else if (g2Var instanceof w91) {
                            if ((-((w91) g2Var).f53216a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(g2Var, false);
                                i10--;
                            }
                        } else if ((g2Var instanceof ProfileActivity) && g2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) g2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f43747q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(g2Var, false);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f43674f1);
                HashSet hashSet = w91.f53215s1;
                profileActivity.presentFragment(w91.I0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                return;
            case 11:
                ProfileActivity.a0(profileActivity);
                return;
            case 12:
                RectF rectF7 = ProfileActivity.Z6;
                profileActivity.K4(view);
                return;
            default:
                RectF rectF8 = ProfileActivity.Z6;
                profileActivity.K4(view);
                return;
        }
    }
}
