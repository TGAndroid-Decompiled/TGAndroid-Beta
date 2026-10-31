package org.telegram.ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
public final class yv0 implements Runnable {
    public final int f43897a;
    public final boolean f43898b;
    public final Object f43899c;

    public yv0(int i10, Object obj, boolean z10) {
        this.f43897a = i10;
        this.f43899c = obj;
        this.f43898b = z10;
    }

    @Override
    public final void run() {
        int i10;
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        int i11;
        int i12 = this.f43897a;
        int i13 = 4;
        TLRPC.User user = null;
        int i14 = 8;
        boolean z10 = this.f43898b;
        Object obj = this.f43899c;
        switch (i12) {
            case 0:
                RectF rectF = ProfileActivity.R6;
                ((ProfileActivity) obj).C5(z10, true);
                return;
            case 1:
                FrameLayout frameLayout = (FrameLayout) obj;
                if (!z10) {
                    i13 = 0;
                }
                frameLayout.setVisibility(i13);
                return;
            case 2:
                Activity parentActivity = ((xx0) obj).e.getParentActivity();
                if (z10) {
                    i10 = 2131746719;
                } else {
                    i10 = 2131746721;
                }
                gf.f.r(parentActivity, org.telegram.messenger.cd.L0(i10, null));
                return;
            case 3:
                x91 x91Var = (x91) obj;
                org.telegram.messenger.i0.g3(new q91(x91Var, 1));
                org.telegram.ui.Cells.q1 q1Var = x91Var.K;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    if (!z10) {
                        org.telegram.ui.Cells.q1 q1Var2 = x91Var.K;
                        int Z1 = q1Var2.Z1(x91Var.O);
                        v91 v91Var = x91Var.I;
                        CheckBoxBase[] checkBoxBaseArr2 = q1Var2.f22533d7;
                        if (checkBoxBaseArr2 != null && Z1 >= 0 && Z1 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[Z1]) != null && v91Var != null && (checkBoxBaseArr = v91Var.f22533d7) != null && Z1 >= 0 && Z1 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[Z1]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.f23918p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.f23918p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.f23919q, true);
                        }
                    }
                    org.telegram.ui.Cells.q1 q1Var3 = x91Var.K;
                    q1Var3.f22490a6 = -1;
                    q1Var3.invalidate();
                }
                pm pmVar = x91Var.f43513c0;
                if (pmVar != null) {
                    org.telegram.messenger.i0.g3(pmVar);
                    x91Var.f43513c0 = null;
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
                    t0Var.f47478i2.setVisibility(8);
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
                e4Var.p2(e4Var.f46800b3, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, i11, e4Var.z1())), true);
                return;
            case 7:
                rh.e4 e4Var2 = ((rh.l2) obj).V;
                TL_stars.SavedStarGift E1 = e4Var2.E1(z10);
                if (E1 != null) {
                    e4Var2.W2 = true;
                    e4Var2.j2(E1, e4Var2.f46839y2);
                } else {
                    TL_stars.TL_starGiftUnique F1 = e4Var2.F1(z10);
                    if (F1 != null) {
                        e4Var2.W2 = true;
                        e4Var2.h2(F1.slug, F1, e4Var2.f46839y2);
                    }
                }
                e4Var2.M2 = -1;
                org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.f32128w;
                if (wbVar != null) {
                    wbVar.c(0L, false);
                    return;
                }
                return;
            case 8:
                sg.k kVar = (sg.k) obj;
                if (z10) {
                    ((sg.o) kVar.f48364x.f45143c).f48428w.setVisibility(4);
                    return;
                } else {
                    kVar.getClass();
                    return;
                }
            case 9:
                uh.i iVar = (uh.i) obj;
                org.telegram.ui.Components.uq0 uq0Var = iVar.W;
                if (z10) {
                    new uh.l(uq0Var.f50259a, org.telegram.messenger.cd.L0(2131746708, null), new ph.h1(uq0Var, 18)).show();
                    return;
                } else {
                    uq0Var.b(iVar.f50245a.E);
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
                kg.x xVar = ((vh.s2) obj).f51915b;
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
                    s7Var.f51935j2.f51635j1.setVisibility(8);
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
                    user = org.telegram.messenger.vp.r1(m2Var.H).Z1(Long.valueOf(m2Var.I));
                }
                e2Var.setBotUser(user);
                if (!z10) {
                    e2Var.s(m2Var.H, m2Var.I);
                }
                org.telegram.messenger.zs.f(e2Var.M).d(new org.telegram.ui.web.q(e2Var, 1));
                return;
            default:
                ((yh.e0) obj).f(z10, false);
                return;
        }
    }
}
