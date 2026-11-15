package org.telegram.ui;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class wt0 implements View.OnClickListener {
    public final int f52995a;
    public final ProfileActivity f52996b;

    public wt0(ProfileActivity profileActivity, int i7) {
        this.f52995a = i7;
        this.f52996b = profileActivity;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f52995a;
        ProfileActivity profileActivity = this.f52996b;
        switch (i7) {
            case 0:
                ProfileActivity.k0(profileActivity);
                return;
            case 1:
                if (profileActivity.f43189s.getTag() == null) {
                    profileActivity.K4();
                    return;
                }
                return;
            case 2:
                RectF rectF = ProfileActivity.X6;
                profileActivity.finishPreviewFragment();
                return;
            case 3:
                RectF rectF2 = ProfileActivity.X6;
                profileActivity.n5();
                return;
            case 4:
                TLRPC.UserFull userFull = profileActivity.f43219w2;
                if (userFull != null && userFull.wallet_card != null && profileActivity.getParentActivity() != null) {
                    profileActivity.showDialog(new org.telegram.ui.Wallet.o3(profileActivity, profileActivity.f43086d0, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f43094e1)), profileActivity.f43219w2.wallet_card));
                    return;
                }
                return;
            case 5:
                ProfileActivity.m0(profileActivity);
                return;
            case 6:
                RectF rectF3 = ProfileActivity.X6;
                profileActivity.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", profileActivity.f43102f1);
                bundle.putLong("user_id", profileActivity.f43094e1);
                profileActivity.presentFragment(new ci.i0(bundle));
                return;
            case 7:
                ProfileActivity.n0(profileActivity);
                return;
            case 8:
                RectF rectF4 = ProfileActivity.X6;
                profileActivity.m5();
                return;
            case 9:
                RectF rectF5 = ProfileActivity.X6;
                profileActivity.m5();
                return;
            case 10:
                RectF rectF6 = ProfileActivity.X6;
                if (profileActivity.getParentLayout() != null && profileActivity.getParentLayout().getFragmentStack() != null) {
                    int i10 = 0;
                    while (i10 < profileActivity.getParentLayout().getFragmentStack().size()) {
                        org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) profileActivity.getParentLayout().getFragmentStack().get(i10);
                        if (e2Var instanceof yw) {
                            yw ywVar = (yw) e2Var;
                            uv uvVar = ywVar.H3;
                            if (uvVar != null) {
                                org.telegram.ui.ActionBar.e2 fragment = uvVar.getFragment();
                                if ((fragment instanceof u91) && (-((u91) fragment).f51835a) == profileActivity.a()) {
                                    ywVar.H3.a();
                                }
                            }
                        } else if (e2Var instanceof an) {
                            if (((an) e2Var).a() == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(e2Var, false);
                                i10--;
                            }
                        } else if (e2Var instanceof u91) {
                            if ((-((u91) e2Var).f51835a) == profileActivity.a()) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(e2Var, false);
                                i10--;
                            }
                        } else if ((e2Var instanceof ProfileActivity) && e2Var != profileActivity) {
                            ProfileActivity profileActivity2 = (ProfileActivity) e2Var;
                            if (profileActivity2.a() == profileActivity.a() && profileActivity2.f43175q1) {
                                ((ActionBarLayout) profileActivity.getParentLayout()).d0(e2Var, false);
                                i10--;
                            }
                        }
                        i10++;
                    }
                }
                profileActivity.J1 = 0;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", profileActivity.f43102f1);
                HashSet hashSet = u91.f51834r1;
                profileActivity.presentFragment(u91.I0(profileActivity.getMessagesController(), profileActivity.getMessagesStorage(), bundle2));
                return;
            case 11:
                ProfileActivity.a0(profileActivity);
                return;
            case 12:
                RectF rectF7 = ProfileActivity.X6;
                profileActivity.J4(view);
                return;
            default:
                RectF rectF8 = ProfileActivity.X6;
                profileActivity.J4(view);
                return;
        }
    }
}
