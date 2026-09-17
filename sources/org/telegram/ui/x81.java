package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class x81 extends org.telegram.ui.ActionBar.j {
    public final int f39437a;
    public final Object f39438b;

    public x81(Object obj, int i10) {
        this.f39437a = i10;
        this.f39438b = obj;
    }

    @Override
    public final void b(int i10) {
        switch (this.f39437a) {
            case 0:
                g91 g91Var = (g91) this.f39438b;
                if (i10 == -1) {
                    g91Var.finishFragment();
                    return;
                } else if (i10 == 2) {
                    g91Var.l0(new org.telegram.ui.ActionBar.o2(null));
                    return;
                } else {
                    return;
                }
            case 1:
                if (i10 == -1) {
                    ((ab1) this.f39438b).finishFragment();
                    return;
                }
                return;
            case 2:
                StickersActivity stickersActivity = (StickersActivity) this.f39438b;
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
                ce1 ce1Var = (ce1) this.f39438b;
                if (i10 == -1) {
                    ce1Var.finishFragment();
                    return;
                } else if (i10 == 1) {
                    ce1.Y(ce1Var);
                    return;
                } else {
                    return;
                }
            case 4:
                if (i10 == -1) {
                    ((ue1) this.f39438b).finishFragment();
                    return;
                }
                return;
            case 5:
                if (i10 == -1) {
                    ((lg1) this.f39438b).finishFragment();
                    return;
                }
                return;
            case 6:
                if (i10 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f39438b;
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
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f39438b;
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
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f39438b;
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
                org.telegram.ui.web.h1 h1Var = (org.telegram.ui.web.h1) this.f39438b;
                if (i10 == -1) {
                    if (org.telegram.ui.web.h1.Y(h1Var).s()) {
                        org.telegram.ui.web.h1.Z(h1Var).r();
                        h1Var.v.clear();
                        AndroidUtilities.forEachViews((RecyclerView) h1Var.f22333a, (e2.h) new org.telegram.ui.web.m(1));
                        return;
                    }
                    h1Var.finishFragment();
                    return;
                }
                return;
            case 10:
                if (i10 == -1) {
                    ((rg.x0) this.f39438b).dismiss();
                    return;
                }
                return;
            case 11:
                if (i10 == -1) {
                    ((xh.h4) this.f39438b).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i10 == -1) {
                    ((yh.g) this.f39438b).finishFragment();
                    return;
                }
                return;
            default:
                zg.q qVar = (zg.q) this.f39438b;
                if (i10 == -1 && !qVar.X(true)) {
                    qVar.finishFragment();
                    return;
                }
                return;
        }
    }
}
