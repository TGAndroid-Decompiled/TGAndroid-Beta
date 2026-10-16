package org.telegram.ui;

import android.app.Activity;
public final class w41 extends org.telegram.ui.ActionBar.j {
    public final int f40858a;
    public final Object f40859b;

    public w41(Object obj, int i10) {
        this.f40858a = i10;
        this.f40859b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        switch (this.f40858a) {
            case 0:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) this.f40859b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((SecretMediaViewer) this.f40859b).e(true, false);
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((SessionsActivity) this.f40859b).finishFragment();
                    return;
                }
                return;
            case 3:
                o91 o91Var = (o91) this.f40859b;
                if (i10 == -1) {
                    o91Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    o91Var.l0(new org.telegram.ui.ActionBar.m2(null));
                    return;
                } else {
                    return;
                }
            case 4:
                if (i10 == -1) {
                    ((hb1) this.f40859b).finishFragment();
                    return;
                }
                return;
            case 5:
                StickersActivity stickersActivity = (StickersActivity) this.f40859b;
                if (i10 == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                StickersActivity.d0(stickersActivity, i10);
                return;
            case 6:
                he1 he1Var = (he1) this.f40859b;
                if (i10 == -1) {
                    he1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    he1.Y(he1Var);
                    return;
                } else {
                    return;
                }
            case 7:
                if (i10 == -1) {
                    ((ze1) this.f40859b).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((qg1) this.f40859b).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f40859b;
                    if (twoStepVerificationActivity.X >= 0) {
                        twoStepVerificationActivity.x0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 10:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f40859b;
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
            case 11:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f40859b;
                if (i10 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i10 == 1) {
                    usersSelectActivity.X();
                    return;
                } else {
                    return;
                }
            case 12:
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) this.f40859b;
                if (i10 == -1) {
                    j8Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity = j8Var.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.m2) j8Var).currentAccount;
                    org.telegram.ui.Wallet.a5.u0(parentActivity, i11, j8Var.getResourceProvider());
                    return;
                } else if (i10 == 3) {
                    j8Var.o0();
                    return;
                } else {
                    return;
                }
            case 13:
                if (i10 == -1) {
                    ((sg.y0) this.f40859b).dismiss();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((yh.g4) this.f40859b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((zh.g) this.f40859b).finishFragment();
                    return;
                }
                return;
        }
    }
}
