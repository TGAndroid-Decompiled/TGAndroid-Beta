package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.webrtc.OrientationHelper;
public final class va extends AnimatorListenerAdapter {
    public final int f50623a;
    public final Object f50624b;

    public va(Object obj, int i7) {
        this.f50623a = i7;
        this.f50624b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        AnimatorSet animatorSet;
        boolean z9;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f50623a) {
            case 0:
                g3 g3Var = (g3) this.f50624b;
                if (animator.equals(((mb) g3Var.f45857b).R)) {
                    ((mb) g3Var.f45857b).R = null;
                    return;
                }
                return;
            case 1:
                mb mbVar = (mb) this.f50624b;
                if (animator.equals(mbVar.R)) {
                    mbVar.R = null;
                    return;
                }
                return;
            case 2:
                ((tb) this.f50624b).H.setVisibility(8);
                return;
            case 3:
                rc rcVar = (rc) this.f50624b;
                cc ccVar = rcVar.m0;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) rcVar.m0.getParent()).removeView(rcVar.m0);
                    }
                    rcVar.m0 = null;
                }
                rcVar.f49425o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 4:
                lh lhVar = (lh) this.f50624b;
                if (lhVar.f47617a) {
                    lhVar.d.setTranslationY(0.0f);
                }
                if (lhVar.f47618b) {
                    lhVar.f47620e.setTranslationY(0.0f);
                }
                if (lhVar.f47621f) {
                    lhVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.l9 l9Var = lhVar.f47619c;
                if (l9Var != null) {
                    l9Var.setTranslationY(0.0f);
                }
                lhVar.f47622n.V2[1] = null;
                return;
            case 5:
                sj sjVar = (sj) this.f50624b;
                sjVar.setAnimatedTop(0);
                View view = sjVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    sjVar.G1.setTranslationY(((1.0f - sjVar.getTopViewEnterProgress()) * sjVar.G1.getLayoutParams().height) + sjVar.T1);
                }
                sjVar.f49927w5.K9 = null;
                return;
            case 6:
                ah.l lVar = (ah.l) this.f50624b;
                org.telegram.ui.Components.u40 u40Var = ((jl) lVar.f1086c).f46990c.Q.f44574p3;
                if (u40Var != null) {
                    u40Var.setIsMessageTransition(false);
                    ((jl) lVar.f1086c).f46990c.Q.f44574p3.d(true);
                    ((jl) lVar.f1086c).f46990c.Q.f44574p3.setVisibility(4);
                    return;
                }
                return;
            case 7:
                jl jlVar = (jl) this.f50624b;
                ll llVar = jlVar.f46990c;
                ArrayList arrayList = llVar.Q.D6;
                org.telegram.ui.Cells.q1 q1Var = jlVar.f46989b;
                arrayList.remove(q1Var);
                View view2 = llVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    llVar.Q.f44700z0.invalidate();
                }
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().f30871y0 = false;
                return;
            case 8:
                xo xoVar = (xo) this.f50624b;
                xoVar.L = 0.0f;
                xoVar.K = 1.0f;
                View view3 = xoVar.f51701a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                xoVar.T.invalidate();
                dh dhVar = xoVar.Y;
                if (dhVar != null) {
                    dhVar.run();
                    xoVar.Y = null;
                    return;
                }
                return;
            case 9:
                xp xpVar = (xp) this.f50624b;
                View view4 = xpVar.f51743b;
                view4.setAlpha(1.0f);
                v4.n0.x0(view4);
                ((qq) xpVar.d).f49121c.removeView(view4);
                return;
            case 10:
                org.telegram.ui.Components.voip.y yVar = ((org.telegram.ui.Components.voip.u) this.f50624b).f39649s0;
                if (yVar.f39746x0.getParent() != null) {
                    yVar.f39714a.removeView(yVar.f39746x0);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.f50624b;
                a0Var.f39172s = null;
                a0Var.f39171r = 1.0f;
                a0Var.b();
                a0Var.e();
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.f50624b;
                if (t0Var.getParent() != null) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            case 13:
                cc1 cc1Var = (cc1) this.f50624b;
                if (!cc1Var.f39755a) {
                    cc1Var.V.f46611w.S = true;
                    cc1Var.V.f46611w.invalidate();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.f50624b;
                i1Var.f39350i = false;
                i1Var.f39353l.setAlpha(35);
                i1Var.f39352k.setAlpha(102);
                i1Var.f39351j.setAlpha(35);
                i1Var.c();
                return;
            case 15:
                org.telegram.ui.Components.voip.n1 n1Var = ((org.telegram.ui.Components.voip.l1) this.f50624b).f39441c;
                n1Var.O = false;
                n1Var.requestLayout();
                return;
            case 16:
                org.telegram.ui.Components.voip.k2 k2Var = (org.telegram.ui.Components.voip.k2) this.f50624b;
                k2Var.N = 0.0f;
                k2Var.O = 0.0f;
                org.telegram.ui.Components.voip.j2 j2Var = k2Var.d;
                j2Var.setScaleX(k2Var.T);
                j2Var.setScaleY(k2Var.T);
                TextureView textureView = k2Var.f39426e;
                if (textureView != null) {
                    textureView.setScaleX(k2Var.U);
                    textureView.setScaleY(k2Var.U);
                }
                k2Var.setTranslationY(0.0f);
                k2Var.setTranslationX(0.0f);
                k2Var.W = k2Var.V;
                k2Var.f39422b0 = null;
                return;
            case 17:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) this.f50624b;
                if (n2Var.P) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                n2Var.Q = f10;
                n2Var.a(n2Var.R, n2Var.S);
                return;
            case 18:
                ((org.telegram.ui.Components.voip.o2) this.f50624b).f39530c.e();
                org.telegram.messenger.g0.Q3(((org.telegram.ui.Components.voip.o2) this.f50624b).f39528a);
                if (((org.telegram.ui.Components.voip.o2) this.f50624b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.o2) this.f50624b).f39528a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.o2) this.f50624b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.o2) this.f50624b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f50624b;
                u2Var.J = false;
                u2Var.T.f39347e = false;
                if (u2Var.U && (animatorSet = u2Var.Q) != null) {
                    animatorSet.cancel();
                    u2Var.Q.start();
                }
                u2Var.c();
                return;
            case 20:
                ((org.telegram.ui.Components.voip.b3) this.f50624b).f39206e.setVisibility(8);
                return;
            case 21:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f50624b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 22:
                xs xsVar = (xs) this.f50624b;
                if (animator.equals(xsVar.f51754n[0])) {
                    xsVar.f51754n[0] = null;
                    return;
                }
                return;
            case 23:
                au auVar = (au) this.f50624b;
                cu cuVar = auVar.f43787n;
                bu[] buVarArr = cuVar.f44756f;
                cuVar.h = null;
                if (cuVar.f44759s) {
                    buVarArr[1].setVisibility(8);
                } else {
                    bu buVar = buVarArr[0];
                    buVarArr[0] = buVarArr[1];
                    buVarArr[1] = buVar;
                    buVar.setVisibility(8);
                    if (cuVar.f44756f[0].f44139f == cuVar.f44755e.getFirstTabId()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    cuVar.f44761x = z9;
                    cuVar.f44755e.i(1.0f, cuVar.f44756f[0].f44139f);
                }
                cuVar.f44757n = false;
                auVar.f43784c = false;
                auVar.f43783b = false;
                cu.k0(cuVar).setEnabled(true);
                cuVar.f44755e.setEnabled(true);
                return;
            case 24:
                ev evVar = (ev) this.f50624b;
                yw.u1(evVar.M, evVar.L, 0.0f);
                return;
            case 25:
                yw ywVar = (yw) this.f50624b;
                boolean z10 = ywVar.G0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                ywVar.H0 = f11;
                if (!z10) {
                    ywVar.E0.setVisibility(8);
                }
                View view5 = ywVar.fragmentView;
                if (view5 != null) {
                    view5.invalidate();
                    return;
                }
                return;
            case 26:
                yw ywVar2 = ((rw) this.f50624b).f49616n0;
                ywVar2.f52250h3 = null;
                if (!ywVar2.f52268l3) {
                    xw[] xwVarArr = ywVar2.f52231e0;
                    xw xwVar = xwVarArr[0];
                    xw xwVar2 = xwVarArr[1];
                    xwVarArr[0] = xwVar2;
                    xwVarArr[1] = xwVar;
                    ywVar2.f52337z0.g(1.0f, xwVar2.h);
                    ywVar2.f5(false);
                    ywVar2.f52231e0[0].d.getClass();
                    ywVar2.f52231e0[1].d.getClass();
                }
                ywVar2.f52231e0[1].setVisibility(8);
                yw.j1(ywVar2, true);
                ywVar2.f52255i3 = false;
                ywVar2.f52282o3 = false;
                kVar = ((org.telegram.ui.ActionBar.f2) ywVar2).actionBar;
                kVar.setEnabled(true);
                ywVar2.f52337z0.setEnabled(true);
                ywVar2.C3(ywVar2.f52231e0[0]);
                return;
            case 27:
                super.onAnimationEnd(animator);
                ((uw) this.f50624b).setScrollEnabled(true);
                return;
            case 28:
                ox oxVar = (ox) this.f50624b;
                if (oxVar.f48543w == animator) {
                    oxVar.f48543w = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.n70 n70Var = (org.telegram.ui.Components.n70) this.f50624b;
                FrameLayout frameLayout = n70Var.f36279b;
                fi.p5 p5Var = (fi.p5) n70Var.f36280c;
                if (p5Var.getParent() != null) {
                    frameLayout.removeView(p5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((e7) n70Var.d);
                return;
        }
    }

    public va(xp xpVar, v4.n0 n0Var) {
        this.f50623a = 9;
        this.f50624b = xpVar;
    }
}
