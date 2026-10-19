package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
public final class y21 extends org.telegram.ui.ActionBar.j {
    public final int f43327a;
    public final Object f43328b;

    public y21(Object obj, int i10) {
        this.f43327a = i10;
        this.f43328b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        switch (this.f43327a) {
            case 0:
                if (i10 == -1) {
                    ((a31) this.f43328b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) this.f43328b).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((SecretMediaViewer) this.f43328b).e(true, false);
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((SessionsActivity) this.f43328b).finishFragment();
                    return;
                }
                return;
            case 4:
                x71 x71Var = (x71) this.f43328b;
                if (i10 == -1) {
                    if (x71Var.M) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", x71Var.getUserConfig().getClientUserId());
                        bundle.putBoolean("immediate", true);
                        x71Var.presentFragment(new zh.m0(bundle));
                        return;
                    }
                    x71Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    x71Var.l0(new org.telegram.ui.ActionBar.n2(null));
                    return;
                } else {
                    return;
                }
            case 5:
                if (i10 == -1) {
                    ((p91) this.f43328b).finishFragment();
                    return;
                }
                return;
            case 6:
                StickersActivity stickersActivity = (StickersActivity) this.f43328b;
                if (i10 == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                StickersActivity.d0(stickersActivity, i10);
                return;
            case 7:
                oc1 oc1Var = (oc1) this.f43328b;
                if (i10 == -1) {
                    oc1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    oc1.Y(oc1Var);
                    return;
                } else {
                    return;
                }
            case 8:
                if (i10 == -1) {
                    ((gd1) this.f43328b).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i10 == -1) {
                    ((xe1) this.f43328b).finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f43328b;
                    if (twoStepVerificationActivity.X >= 0) {
                        twoStepVerificationActivity.x0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 11:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f43328b;
                if (i10 == -1) {
                    if (userInfoActivity.onBackPressed(true)) {
                        userInfoActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    userInfoActivity.c0(true);
                    return;
                } else {
                    return;
                }
            case 12:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f43328b;
                if (i10 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i10 == 1) {
                    usersSelectActivity.X();
                    return;
                } else {
                    return;
                }
            case 13:
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) this.f43328b;
                if (i10 == -1) {
                    i9Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity = i9Var.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) i9Var).currentAccount;
                    org.telegram.ui.Wallet.o5.E0(parentActivity, i11, i9Var.getResourceProvider());
                    return;
                } else if (i10 == 3) {
                    i9Var.o0();
                    return;
                } else {
                    return;
                }
            case 14:
                if (i10 == -1) {
                    ((sg.y0) this.f43328b).dismiss();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((yh.g4) this.f43328b).finishFragment();
                    return;
                }
                return;
        }
    }
}
