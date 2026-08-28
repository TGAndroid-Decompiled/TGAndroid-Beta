package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class xe1 extends org.telegram.ui.ActionBar.j {
    public final int f44507a;
    public final Object f44508b;

    public xe1(Object obj, int i9) {
        this.f44507a = i9;
        this.f44508b = obj;
    }

    @Override
    public final void b(int i9) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.f44507a) {
            case 0:
                if (i9 == -1) {
                    ((df1) this.f44508b).finishFragment();
                    return;
                }
                return;
            case 1:
                if (i9 == -1) {
                    TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f44508b;
                    if (twoStepVerificationActivity.T >= 0) {
                        twoStepVerificationActivity.w0();
                        return;
                    } else {
                        twoStepVerificationActivity.finishFragment();
                        return;
                    }
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = (UserInfoActivity) this.f44508b;
                if (i9 == -1) {
                    if (userInfoActivity.onBackPressed(true)) {
                        userInfoActivity.finishFragment();
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    userInfoActivity.b0(true);
                    return;
                } else {
                    return;
                }
            case 3:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f44508b;
                if (i9 == -1) {
                    usersSelectActivity.finishFragment();
                    return;
                } else if (i9 == 1) {
                    usersSelectActivity.W();
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f44508b;
                if (i9 == -1) {
                    kVar = ((org.telegram.ui.ActionBar.o2) c1Var).actionBar;
                    if (kVar.s()) {
                        kVar2 = ((org.telegram.ui.ActionBar.o2) c1Var).actionBar;
                        kVar2.r();
                        c1Var.f43823s.clear();
                        AndroidUtilities.forEachViews((RecyclerView) c1Var.f27658a, (d5.d) new ih.e(15));
                        return;
                    }
                    c1Var.finishFragment();
                    return;
                }
                return;
            case 5:
                pf.d dVar = (pf.d) this.f44508b;
                if (i9 == -1) {
                    if (dVar.onBackPressed(true)) {
                        dVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    dVar.W();
                    return;
                } else {
                    return;
                }
            case 6:
                pf.l lVar = (pf.l) this.f44508b;
                if (i9 == -1) {
                    if (lVar.onBackPressed(true)) {
                        lVar.finishFragment();
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    lVar.g0();
                    return;
                } else {
                    return;
                }
            case 7:
                pf.m0 m0Var = (pf.m0) this.f44508b;
                if (i9 == -1) {
                    if (m0Var.onBackPressed(true)) {
                        m0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    m0Var.Z();
                    return;
                } else {
                    return;
                }
            case 8:
                pf.o0 o0Var = (pf.o0) this.f44508b;
                if (i9 == -1) {
                    if (o0Var.onBackPressed(true)) {
                        o0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    o0Var.W();
                    return;
                } else {
                    return;
                }
            case 9:
                pf.w0 w0Var = (pf.w0) this.f44508b;
                if (i9 == -1) {
                    if (w0Var.onBackPressed(true)) {
                        w0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    w0Var.V();
                    return;
                } else {
                    return;
                }
            case 10:
                pf.y0 y0Var = (pf.y0) this.f44508b;
                if (i9 == -1) {
                    if (y0Var.onBackPressed(true)) {
                        y0Var.finishFragment();
                        return;
                    }
                    return;
                } else if (i9 == 1) {
                    y0Var.c0();
                    return;
                } else {
                    return;
                }
            case 11:
                if (i9 == -1) {
                    ((pf.a1) this.f44508b).finishFragment();
                    return;
                }
                return;
            case 12:
                if (i9 == -1) {
                    ((pf.t1) this.f44508b).finishFragment();
                    return;
                }
                return;
            default:
                if (i9 == -1) {
                    ((zf.x0) this.f44508b).dismiss();
                    return;
                }
                return;
        }
    }
}
