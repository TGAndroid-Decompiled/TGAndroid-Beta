package org.telegram.ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
public final class xv0 implements Runnable {
    public final int f43463a;
    public final boolean f43464b;
    public final Object f43465c;

    public xv0(int i10, Object obj, boolean z10) {
        this.f43463a = i10;
        this.f43465c = obj;
        this.f43464b = z10;
    }

    @Override
    public final void run() {
        int i10;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i11;
        int i12 = this.f43463a;
        int i13 = 4;
        TLRPC.User user = null;
        int i14 = 8;
        boolean z10 = this.f43464b;
        Object obj = this.f43465c;
        switch (i12) {
            case 0:
                RectF rectF = ProfileActivity.S6;
                ((ProfileActivity) obj).D5(z10, true);
                return;
            case 1:
                FrameLayout frameLayout = (FrameLayout) obj;
                if (!z10) {
                    i13 = 0;
                }
                frameLayout.setVisibility(i13);
                return;
            case 2:
                Activity parentActivity = ((wx0) obj).e.getParentActivity();
                if (z10) {
                    i10 = 2131746719;
                } else {
                    i10 = 2131746721;
                }
                gf.f.r(parentActivity, org.telegram.messenger.dd.L0(i10, null));
                return;
            case 3:
                v91 v91Var = (v91) obj;
                org.telegram.messenger.i0.g3(new o91(v91Var, 1));
                org.telegram.ui.Cells.q1 q1Var = v91Var.K;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.q1 q1Var2 = v91Var.K;
                        int Z1 = q1Var2.Z1(v91Var.O);
                        t91 t91Var = v91Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = q1Var2.f22534d7;
                        if (checkBoxBaseArr2 != null && Z1 >= 0 && Z1 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[Z1]) != null && t91Var != null && (checkBoxBaseArr = t91Var.f22534d7) != null && Z1 >= 0 && Z1 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[Z1]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f23919p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f23919p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f23920q, true);
                        }
                    }
                    org.telegram.ui.Cells.q1 q1Var3 = v91Var.K;
                    q1Var3.f22491a6 = -1;
                    q1Var3.invalidate();
                }
                pm pmVar = v91Var.f42453c0;
                if (pmVar != null) {
                    org.telegram.messenger.i0.g3(pmVar);
                    v91Var.f42453c0 = null;
                    return;
                }
                return;
            case 4:
                View view = (View) obj;
                if (z10) {
                    i14 = 0;
                }
                view.setVisibility(i14);
                return;
            case 5:
                rh.t0 t0Var = (rh.t0) obj;
                if (!z10) {
                    t0Var.f47490i2.setVisibility(8);
                    return;
                } else {
                    t0Var.getClass();
                    return;
                }
            case 6:
                rh.e4 e4Var = (rh.e4) obj;
                e4Var.getClass();
                if (z10) {
                    i11 = 2131750433;
                } else {
                    i11 = 2131750430;
                }
                e4Var.p2(e4Var.f46814b3, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0(null, null, i11, e4Var.z1())), true);
                return;
            case 7:
                rh.e4 e4Var2 = ((rh.l2) obj).V;
                TL_stars.SavedStarGift E1 = e4Var2.E1(z10);
                if (E1 != null) {
                    e4Var2.W2 = true;
                    e4Var2.j2(E1, e4Var2.f46853y2);
                } else {
                    TL_stars.TL_starGiftUnique F1 = e4Var2.F1(z10);
                    if (F1 != null) {
                        e4Var2.W2 = true;
                        e4Var2.h2(F1.slug, F1, e4Var2.f46853y2);
                    }
                }
                e4Var2.M2 = -1;
                org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.f32194w;
                if (wbVar != null) {
                    wbVar.c(0L, false);
                    return;
                }
                return;
            case 8:
                sg.k kVar = (sg.k) obj;
                if (z10) {
                    ((sg.o) kVar.f48375x.f45154c).f48439w.setVisibility(4);
                    return;
                } else {
                    kVar.getClass();
                    return;
                }
            case 9:
                uh.i iVar = (uh.i) obj;
                org.telegram.ui.Components.vq0 vq0Var = iVar.W;
                if (z10) {
                    new uh.l(vq0Var.f50273a, org.telegram.messenger.dd.L0(2131746708, null), new ph.h1(vq0Var, 18)).show();
                    return;
                } else {
                    vq0Var.b(iVar.f50259a.E);
                    return;
                }
            case 10:
                vh.h2 h2Var = (vh.h2) obj;
                if (!z10) {
                    h2Var.I.setVisibility(8);
                    return;
                } else {
                    h2Var.getClass();
                    return;
                }
            case 11:
                kg.x xVar = ((vh.s2) obj).f51928b;
                if (z10) {
                    i14 = 0;
                }
                xVar.setVisibility(i14);
                return;
            case 12:
                vh.b4 b4Var = (vh.b4) obj;
                if (!z10) {
                    b4Var.G0.setVisibility(8);
                    return;
                } else {
                    b4Var.getClass();
                    return;
                }
            case 13:
                vh.g5 g5Var = (vh.g5) obj;
                if (!z10) {
                    g5Var.setVisibility(8);
                    return;
                } else {
                    g5Var.getClass();
                    return;
                }
            case 14:
                vh.s7 s7Var = (vh.s7) obj;
                if (!z10) {
                    s7Var.f51948j2.f51650j1.setVisibility(8);
                    return;
                } else {
                    s7Var.getClass();
                    return;
                }
            case 15:
                xh.m2 m2Var = (xh.m2) obj;
                xh.k2 k2Var = m2Var.E;
                xh.e2 e2Var = m2Var.D;
                if (e2Var.getWebView() != null) {
                    e2Var.getWebView().animate().cancel();
                    e2Var.getWebView().animate().alpha(0.0f).start();
                }
                k2Var.setLoadProgress(0.0f);
                k2Var.setAlpha(1.0f);
                k2Var.setVisibility(0);
                if (!z10) {
                    user = org.telegram.messenger.wp.r1(m2Var.H).Z1(Long.valueOf(m2Var.I));
                }
                e2Var.setBotUser(user);
                if (!z10) {
                    e2Var.s(m2Var.H, m2Var.I);
                }
                org.telegram.messenger.at.f(e2Var.M).d(new org.telegram.ui.web.q(e2Var, 1));
                return;
            default:
                ((yh.d0) obj).f(z10, false);
                return;
        }
    }
}
