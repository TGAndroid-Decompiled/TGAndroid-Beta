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
    public final int f50683a;
    public final Object f50684b;

    public va(Object obj, int i7) {
        this.f50683a = i7;
        this.f50684b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        AnimatorSet animatorSet;
        boolean z9;
        float f11;
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f50683a) {
            case 0:
                g3 g3Var = (g3) this.f50684b;
                if (animator.equals(((mb) g3Var.f45925b).R)) {
                    ((mb) g3Var.f45925b).R = null;
                    return;
                }
                return;
            case 1:
                mb mbVar = (mb) this.f50684b;
                if (animator.equals(mbVar.R)) {
                    mbVar.R = null;
                    return;
                }
                return;
            case 2:
                ((tb) this.f50684b).H.setVisibility(8);
                return;
            case 3:
                rc rcVar = (rc) this.f50684b;
                cc ccVar = rcVar.m0;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) rcVar.m0.getParent()).removeView(rcVar.m0);
                    }
                    rcVar.m0 = null;
                }
                rcVar.f49370o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 4:
                lh lhVar = (lh) this.f50684b;
                if (lhVar.f47609a) {
                    lhVar.d.setTranslationY(0.0f);
                }
                if (lhVar.f47610b) {
                    lhVar.f47612e.setTranslationY(0.0f);
                }
                if (lhVar.f47613f) {
                    lhVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.k9 k9Var = lhVar.f47611c;
                if (k9Var != null) {
                    k9Var.setTranslationY(0.0f);
                }
                lhVar.f47614n.V2[1] = null;
                return;
            case 5:
                sj sjVar = (sj) this.f50684b;
                sjVar.setAnimatedTop(0);
                View view = sjVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    sjVar.G1.setTranslationY(((1.0f - sjVar.getTopViewEnterProgress()) * sjVar.G1.getLayoutParams().height) + sjVar.T1);
                }
                sjVar.f49864w5.K9 = null;
                return;
            case 6:
                ah.l lVar2 = (ah.l) this.f50684b;
                org.telegram.ui.Components.t40 t40Var = ((jl) lVar2.f1086c).f47034c.Q.f44615p3;
                if (t40Var != null) {
                    t40Var.setIsMessageTransition(false);
                    ((jl) lVar2.f1086c).f47034c.Q.f44615p3.d(true);
                    ((jl) lVar2.f1086c).f47034c.Q.f44615p3.setVisibility(4);
                    return;
                }
                return;
            case 7:
                jl jlVar = (jl) this.f50684b;
                ll llVar = jlVar.f47034c;
                ArrayList arrayList = llVar.Q.D6;
                org.telegram.ui.Cells.q1 q1Var = jlVar.f47033b;
                arrayList.remove(q1Var);
                View view2 = llVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    llVar.Q.f44741z0.invalidate();
                }
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().f30882y0 = false;
                return;
            case 8:
                xo xoVar = (xo) this.f50684b;
                xoVar.L = 0.0f;
                xoVar.K = 1.0f;
                View view3 = xoVar.f51754a0;
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
                xp xpVar = (xp) this.f50684b;
                View view4 = xpVar.f51779b;
                view4.setAlpha(1.0f);
                v4.n0.x0(view4);
                ((rq) xpVar.d).f49502c.removeView(view4);
                return;
            case 10:
                org.telegram.ui.Components.voip.y yVar = ((org.telegram.ui.Components.voip.u) this.f50684b).f39569s0;
                if (yVar.f39668x0.getParent() != null) {
                    yVar.f39636a.removeView(yVar.f39668x0);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.f50684b;
                a0Var.f39092s = null;
                a0Var.f39091r = 1.0f;
                a0Var.b();
                a0Var.e();
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.f50684b;
                if (t0Var.getParent() != null) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            case 13:
                dc1 dc1Var = (dc1) this.f50684b;
                if (!dc1Var.f39677a) {
                    dc1Var.V.f46947w.S = true;
                    dc1Var.V.f46947w.invalidate();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.f50684b;
                i1Var.f39270i = false;
                i1Var.f39273l.setAlpha(35);
                i1Var.f39272k.setAlpha(102);
                i1Var.f39271j.setAlpha(35);
                i1Var.c();
                return;
            case 15:
                org.telegram.ui.Components.voip.n1 n1Var = ((org.telegram.ui.Components.voip.l1) this.f50684b).f39361c;
                n1Var.O = false;
                n1Var.requestLayout();
                return;
            case 16:
                org.telegram.ui.Components.voip.k2 k2Var = (org.telegram.ui.Components.voip.k2) this.f50684b;
                k2Var.N = 0.0f;
                k2Var.O = 0.0f;
                org.telegram.ui.Components.voip.j2 j2Var = k2Var.d;
                j2Var.setScaleX(k2Var.T);
                j2Var.setScaleY(k2Var.T);
                TextureView textureView = k2Var.f39346e;
                if (textureView != null) {
                    textureView.setScaleX(k2Var.U);
                    textureView.setScaleY(k2Var.U);
                }
                k2Var.setTranslationY(0.0f);
                k2Var.setTranslationX(0.0f);
                k2Var.W = k2Var.V;
                k2Var.f39342b0 = null;
                return;
            case 17:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) this.f50684b;
                if (n2Var.P) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                n2Var.Q = f10;
                n2Var.a(n2Var.R, n2Var.S);
                return;
            case 18:
                ((org.telegram.ui.Components.voip.o2) this.f50684b).f39450c.e();
                org.telegram.messenger.g0.Q3(((org.telegram.ui.Components.voip.o2) this.f50684b).f39448a);
                if (((org.telegram.ui.Components.voip.o2) this.f50684b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.o2) this.f50684b).f39448a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.o2) this.f50684b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.o2) this.f50684b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f50684b;
                u2Var.J = false;
                u2Var.T.f39267e = false;
                if (u2Var.U && (animatorSet = u2Var.Q) != null) {
                    animatorSet.cancel();
                    u2Var.Q.start();
                }
                u2Var.c();
                return;
            case 20:
                ((org.telegram.ui.Components.voip.b3) this.f50684b).f39126e.setVisibility(8);
                return;
            case 21:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f50684b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 22:
                ys ysVar = (ys) this.f50684b;
                if (animator.equals(ysVar.f52107n[0])) {
                    ysVar.f52107n[0] = null;
                    return;
                }
                return;
            case 23:
                bu buVar = (bu) this.f50684b;
                du duVar = buVar.f44137n;
                cu[] cuVarArr = duVar.f45054f;
                duVar.h = null;
                if (duVar.f45057s) {
                    cuVarArr[1].setVisibility(8);
                } else {
                    cu cuVar = cuVarArr[0];
                    cuVarArr[0] = cuVarArr[1];
                    cuVarArr[1] = cuVar;
                    cuVar.setVisibility(8);
                    if (duVar.f45054f[0].f44811f == duVar.f45053e.getFirstTabId()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    duVar.f45059x = z9;
                    duVar.f45053e.i(1.0f, duVar.f45054f[0].f44811f);
                }
                duVar.f45055n = false;
                buVar.f44134c = false;
                buVar.f44133b = false;
                du.k0(duVar).setEnabled(true);
                duVar.f45053e.setEnabled(true);
                return;
            case 24:
                fv fvVar = (fv) this.f50684b;
                zw.u1(fvVar.M, fvVar.L, 0.0f);
                return;
            case 25:
                zw zwVar = (zw) this.f50684b;
                boolean z10 = zwVar.G0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                zwVar.H0 = f11;
                if (!z10) {
                    zwVar.E0.setVisibility(8);
                }
                View view5 = zwVar.fragmentView;
                if (view5 != null) {
                    view5.invalidate();
                    return;
                }
                return;
            case 26:
                zw zwVar2 = ((sw) this.f50684b).f49970n0;
                zwVar2.f52596h3 = null;
                if (!zwVar2.f52614l3) {
                    yw[] ywVarArr = zwVar2.f52577e0;
                    yw ywVar = ywVarArr[0];
                    yw ywVar2 = ywVarArr[1];
                    ywVarArr[0] = ywVar2;
                    ywVarArr[1] = ywVar;
                    zwVar2.f52683z0.g(1.0f, ywVar2.h);
                    zwVar2.f5(false);
                    zwVar2.f52577e0[0].d.getClass();
                    zwVar2.f52577e0[1].d.getClass();
                }
                zwVar2.f52577e0[1].setVisibility(8);
                zw.j1(zwVar2, true);
                zwVar2.f52601i3 = false;
                zwVar2.f52628o3 = false;
                lVar = ((org.telegram.ui.ActionBar.f2) zwVar2).actionBar;
                lVar.setEnabled(true);
                zwVar2.f52683z0.setEnabled(true);
                zwVar2.C3(zwVar2.f52577e0[0]);
                return;
            case 27:
                super.onAnimationEnd(animator);
                ((vw) this.f50684b).setScrollEnabled(true);
                return;
            case 28:
                px pxVar = (px) this.f50684b;
                if (pxVar.f48859w == animator) {
                    pxVar.f48859w = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.m70 m70Var = (org.telegram.ui.Components.m70) this.f50684b;
                FrameLayout frameLayout = m70Var.f35879b;
                fi.p5 p5Var = (fi.p5) m70Var.f35880c;
                if (p5Var.getParent() != null) {
                    frameLayout.removeView(p5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((e7) m70Var.d);
                return;
        }
    }

    public va(xp xpVar, v4.n0 n0Var) {
        this.f50683a = 9;
        this.f50684b = xpVar;
    }
}
