package org.telegram.ui;

import android.app.Activity;
public final class w41 extends org.telegram.ui.ActionBar.j {
    public final int f41151a;
    public final Object f41152b;

    public w41(Object obj, int i10) {
        this.f41151a = i10;
        this.f41152b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        switch (this.f41151a) {
            case 0:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) this.f41152b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((SecretMediaViewer) this.f41152b).e(true, false);
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((SessionsActivity) this.f41152b).finishFragment();
                    return;
                }
                return;
            case 3:
                o91 o91Var = (o91) this.f41152b;
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
                    ((hb1) this.f41152b).finishFragment();
                    return;
                }
                return;
            case 5:
                StickersActivity stickersActivity = (StickersActivity) this.f41152b;
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
                he1 he1Var = (he1) this.f41152b;
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
                    ((af1) this.f41152b).finishFragment();
                    return;
                }
                return;
            case 8:
                if (i10 == -1) {
                    ((rg1) this.f41152b).finishFragment();
                    return;
                }
                return;
            case 9:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f41152b;
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
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f41152b;
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
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f41152b;
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
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.f41152b;
                if (i10 == -1) {
                    i8Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity = i8Var.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.m2) i8Var).currentAccount;
                    org.telegram.ui.Wallet.z4.u0(parentActivity, i11, i8Var.getResourceProvider());
                    return;
                } else if (i10 == 3) {
                    i8Var.o0();
                    return;
                } else {
                    return;
                }
            case 13:
                if (i10 == -1) {
                    ((sg.y0) this.f41152b).dismiss();
                    return;
                }
                return;
            case 14:
                if (i10 == -1) {
                    ((yh.g4) this.f41152b).finishFragment();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((zh.g) this.f41152b).finishFragment();
                    return;
                }
                return;
        }
    }
}
