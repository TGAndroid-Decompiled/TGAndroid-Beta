package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class v81 extends org.telegram.ui.ActionBar.j {
    public final int f38365a;
    public final Object f38366b;

    public v81(Object obj, int i10) {
        this.f38365a = i10;
        this.f38366b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f38365a) {
            case 0:
                f91 f91Var = (f91) this.f38366b;
                if (i10 == -1) {
                    f91Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    f91Var.l0(new org.telegram.ui.ActionBar.n2(null));
                    return;
                } else {
                    return;
                }
            case 1:
                if (i10 == -1) {
                    ((za1) this.f38366b).finishFragment();
                    return;
                }
                return;
            case 2:
                StickersActivity stickersActivity = (StickersActivity) this.f38366b;
                if (i10 == -1) {
                    if (stickersActivity.onBackPressed(true)) {
                        stickersActivity.finishFragment();
                        return;
                    }
                    return;
                }
                StickersActivity.d0(stickersActivity, i10);
                return;
            case 3:
                ae1 ae1Var = (ae1) this.f38366b;
                if (i10 == -1) {
                    ae1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    ae1.Y(ae1Var);
                    return;
                } else {
                    return;
                }
            case 4:
                if (i10 == -1) {
                    ((se1) this.f38366b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((jg1) this.f38366b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f38366b;
                    if (twoStepVerificationActivity.X >= 0) {
                        twoStepVerificationActivity.x0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 7:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f38366b;
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
            case 8:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f38366b;
                if (i10 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i10 == 1) {
                    usersSelectActivity.X();
                    return;
                } else {
                    return;
                }
            case 9:
                org.telegram.ui.web.h1 h1Var = (org.telegram.ui.web.h1) this.f38366b;
                if (i10 == -1) {
                    if (org.telegram.ui.web.h1.Y(h1Var).s()) {
                        org.telegram.ui.web.h1.Z(h1Var).r();
                        h1Var.v.clear();
                        AndroidUtilities.forEachViews((RecyclerView) h1Var.f26891a, (e2.h) new org.telegram.ui.web.m(1));
                        return;
                    }
                    h1Var.finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((rg.x0) this.f38366b).dismiss();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((xh.i4) this.f38366b).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((yh.g) this.f38366b).finishFragment();
                    return;
                }
                return;
            default:
                zg.q qVar = (zg.q) this.f38366b;
                if (i10 == -1 && !qVar.X(true)) {
                    qVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
