package org.telegram.ui;

import android.app.Activity;
import android.os.Bundle;
public final class r11 extends org.telegram.ui.ActionBar.j {
    public final int f42827a;
    public final Object f42828b;

    public r11(Object obj, int i10) {
        this.f42827a = i10;
        this.f42828b = obj;
    }

    @Override
    public final void b(int i10) {
        int i11;
        switch (this.f42827a) {
            case 0:
                if (i10 == -1) {
                    ((ProxyListActivity) this.f42828b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i10 == -1) {
                    ((i21) this.f42828b).finishFragment();
                    return;
                }
                return;
            case 2:
                if (i10 == -1) {
                    ((a31) this.f42828b).finishFragment();
                    return;
                }
                return;
            case 3:
                if (i10 == -1) {
                    ((i31) this.f42828b).finishFragment();
                    return;
                }
                return;
            case 4:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) this.f42828b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((SecretMediaViewer) this.f42828b).e(true, false);
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    ((SessionsActivity) this.f42828b).finishFragment();
                    return;
                }
                return;
            case 7:
                f81 f81Var = (f81) this.f42828b;
                if (i10 == -1) {
                    if (f81Var.N) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", f81Var.getUserConfig().getClientUserId());
                        bundle.putBoolean("immediate", true);
                        f81Var.presentFragment(new ai.z0(bundle));
                        return;
                    }
                    f81Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    f81Var.j0(new org.telegram.ui.ActionBar.r2(null));
                    return;
                } else {
                    return;
                }
            case 8:
                if (i10 == -1) {
                    ((y91) this.f42828b).finishFragment();
                    return;
                }
                return;
            case 9:
                StickersActivity stickersActivity = (StickersActivity) this.f42828b;
                if (i10 == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                StickersActivity.e0(stickersActivity, i10);
                return;
            case 10:
                ad1 ad1Var = (ad1) this.f42828b;
                if (i10 == -1) {
                    ad1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    ad1.Z(ad1Var);
                    return;
                } else {
                    return;
                }
            case 11:
                if (i10 == -1) {
                    ((rd1) this.f42828b).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((if1) this.f42828b).finishFragment();
                    return;
                }
                return;
            case 13:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f42828b;
                    if (twoStepVerificationActivity.X >= 0) {
                        twoStepVerificationActivity.y0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 14:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f42828b;
                if (i10 == -1) {
                    if (userInfoActivity.onBackPressed(true)) {
                        userInfoActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i10 == 1) {
                    userInfoActivity.d0(true);
                    return;
                } else {
                    return;
                }
            case 15:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f42828b;
                if (i10 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i10 == 1) {
                    usersSelectActivity.Y();
                    return;
                } else {
                    return;
                }
            case 16:
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) this.f42828b;
                if (i10 == -1) {
                    i9Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity = i9Var.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.r2) i9Var).currentAccount;
                    org.telegram.ui.Wallet.m5.F0(parentActivity, i11, i9Var.getResourceProvider());
                    return;
                } else if (i10 == 3) {
                    i9Var.q0();
                    return;
                } else {
                    return;
                }
            case 17:
                if (i10 == -1) {
                    ((tg.y0) this.f42828b).dismiss();
                    return;
                }
                return;
            default:
                if (i10 == -1) {
                    ((zh.h4) this.f42828b).finishFragment();
                    return;
                }
                return;
        }
    }
}
