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
    public final int f50678a;
    public final Object f50679b;

    public va(Object obj, int i7) {
        this.f50678a = i7;
        this.f50679b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        AnimatorSet animatorSet;
        boolean z9;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f50678a) {
            case 0:
                g3 g3Var = (g3) this.f50679b;
                if (animator.equals(((mb) g3Var.f45794b).R)) {
                    ((mb) g3Var.f45794b).R = null;
                    return;
                }
                return;
            case 1:
                mb mbVar = (mb) this.f50679b;
                if (animator.equals(mbVar.R)) {
                    mbVar.R = null;
                    return;
                }
                return;
            case 2:
                ((tb) this.f50679b).H.setVisibility(8);
                return;
            case 3:
                rc rcVar = (rc) this.f50679b;
                cc ccVar = rcVar.m0;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) rcVar.m0.getParent()).removeView(rcVar.m0);
                    }
                    rcVar.m0 = null;
                }
                rcVar.f49465o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 4:
                jh jhVar = (jh) this.f50679b;
                if (jhVar.f46976a) {
                    jhVar.d.setTranslationY(0.0f);
                }
                if (jhVar.f46977b) {
                    jhVar.f46979e.setTranslationY(0.0f);
                }
                if (jhVar.f46980f) {
                    jhVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.l9 l9Var = jhVar.f46978c;
                if (l9Var != null) {
                    l9Var.setTranslationY(0.0f);
                }
                jhVar.f46981n.V2[1] = null;
                return;
            case 5:
                qj qjVar = (qj) this.f50679b;
                qjVar.setAnimatedTop(0);
                View view = qjVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    qjVar.G1.setTranslationY(((1.0f - qjVar.getTopViewEnterProgress()) * qjVar.G1.getLayoutParams().height) + qjVar.T1);
                }
                qjVar.f49246w5.I9 = null;
                return;
            case 6:
                ah.l lVar = (ah.l) this.f50679b;
                org.telegram.ui.Components.t40 t40Var = ((hl) lVar.f1086c).f46403c.Q.f43911p3;
                if (t40Var != null) {
                    t40Var.setIsMessageTransition(false);
                    ((hl) lVar.f1086c).f46403c.Q.f43911p3.d(true);
                    ((hl) lVar.f1086c).f46403c.Q.f43911p3.setVisibility(4);
                    return;
                }
                return;
            case 7:
                hl hlVar = (hl) this.f50679b;
                jl jlVar = hlVar.f46403c;
                ArrayList arrayList = jlVar.Q.D6;
                org.telegram.ui.Cells.q1 q1Var = hlVar.f46402b;
                arrayList.remove(q1Var);
                View view2 = jlVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    jlVar.Q.f44037z0.invalidate();
                }
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().f30863y0 = false;
                return;
            case 8:
                vo voVar = (vo) this.f50679b;
                voVar.L = 0.0f;
                voVar.K = 1.0f;
                View view3 = voVar.f50767a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                voVar.T.invalidate();
                bh bhVar = voVar.Y;
                if (bhVar != null) {
                    bhVar.run();
                    voVar.Y = null;
                    return;
                }
                return;
            case 9:
                vp vpVar = (vp) this.f50679b;
                View view4 = vpVar.f50809b;
                view4.setAlpha(1.0f);
                v4.n0.x0(view4);
                ((oq) vpVar.d).f48474c.removeView(view4);
                return;
            case 10:
                org.telegram.ui.Components.voip.y yVar = ((org.telegram.ui.Components.voip.u) this.f50679b).f39525s0;
                if (yVar.f39622x0.getParent() != null) {
                    yVar.f39590a.removeView(yVar.f39622x0);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.f50679b;
                a0Var.f39048s = null;
                a0Var.f39047r = 1.0f;
                a0Var.b();
                a0Var.e();
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.f50679b;
                if (t0Var.getParent() != null) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            case 13:
                yb1 yb1Var = (yb1) this.f50679b;
                if (!yb1Var.f39631a) {
                    yb1Var.V.f45311w.S = true;
                    yb1Var.V.f45311w.invalidate();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.f50679b;
                i1Var.f39226i = false;
                i1Var.f39229l.setAlpha(35);
                i1Var.f39228k.setAlpha(102);
                i1Var.f39227j.setAlpha(35);
                i1Var.c();
                return;
            case 15:
                org.telegram.ui.Components.voip.n1 n1Var = ((org.telegram.ui.Components.voip.l1) this.f50679b).f39317c;
                n1Var.O = false;
                n1Var.requestLayout();
                return;
            case 16:
                org.telegram.ui.Components.voip.k2 k2Var = (org.telegram.ui.Components.voip.k2) this.f50679b;
                k2Var.N = 0.0f;
                k2Var.O = 0.0f;
                org.telegram.ui.Components.voip.j2 j2Var = k2Var.d;
                j2Var.setScaleX(k2Var.T);
                j2Var.setScaleY(k2Var.T);
                TextureView textureView = k2Var.f39302e;
                if (textureView != null) {
                    textureView.setScaleX(k2Var.U);
                    textureView.setScaleY(k2Var.U);
                }
                k2Var.setTranslationY(0.0f);
                k2Var.setTranslationX(0.0f);
                k2Var.W = k2Var.V;
                k2Var.f39298b0 = null;
                return;
            case 17:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) this.f50679b;
                if (n2Var.P) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                n2Var.Q = f10;
                n2Var.a(n2Var.R, n2Var.S);
                return;
            case 18:
                ((org.telegram.ui.Components.voip.o2) this.f50679b).f39406c.e();
                org.telegram.messenger.g0.Q3(((org.telegram.ui.Components.voip.o2) this.f50679b).f39404a);
                if (((org.telegram.ui.Components.voip.o2) this.f50679b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.o2) this.f50679b).f39404a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.o2) this.f50679b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.o2) this.f50679b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f50679b;
                u2Var.J = false;
                u2Var.T.f39223e = false;
                if (u2Var.U && (animatorSet = u2Var.Q) != null) {
                    animatorSet.cancel();
                    u2Var.Q.start();
                }
                u2Var.c();
                return;
            case 20:
                ((org.telegram.ui.Components.voip.b3) this.f50679b).f39082e.setVisibility(8);
                return;
            case 21:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f50679b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 22:
                vs vsVar = (vs) this.f50679b;
                if (animator.equals(vsVar.f50820n[0])) {
                    vsVar.f50820n[0] = null;
                    return;
                }
                return;
            case 23:
                yt ytVar = (yt) this.f50679b;
                au auVar = ytVar.f52328n;
                zt[] ztVarArr = auVar.f44093f;
                auVar.h = null;
                if (auVar.f44096s) {
                    ztVarArr[1].setVisibility(8);
                } else {
                    zt ztVar = ztVarArr[0];
                    ztVarArr[0] = ztVarArr[1];
                    ztVarArr[1] = ztVar;
                    ztVar.setVisibility(8);
                    if (auVar.f44093f[0].f52676f == auVar.f44092e.getFirstTabId()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    auVar.f44098x = z9;
                    auVar.f44092e.i(1.0f, auVar.f44093f[0].f52676f);
                }
                auVar.f44094n = false;
                ytVar.f52325c = false;
                ytVar.f52324b = false;
                au.k0(auVar).setEnabled(true);
                auVar.f44092e.setEnabled(true);
                return;
            case 24:
                cv cvVar = (cv) this.f50679b;
                ww.u1(cvVar.M, cvVar.L, 0.0f);
                return;
            case 25:
                ww wwVar = (ww) this.f50679b;
                boolean z10 = wwVar.G0;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                wwVar.H0 = f11;
                if (!z10) {
                    wwVar.E0.setVisibility(8);
                }
                View view5 = wwVar.fragmentView;
                if (view5 != null) {
                    view5.invalidate();
                    return;
                }
                return;
            case 26:
                ww wwVar2 = ((pw) this.f50679b).f48963n0;
                wwVar2.f51563g3 = null;
                if (!wwVar2.f51582k3) {
                    vw[] vwVarArr = wwVar2.f51549e0;
                    vw vwVar = vwVarArr[0];
                    vw vwVar2 = vwVarArr[1];
                    vwVarArr[0] = vwVar2;
                    vwVarArr[1] = vwVar;
                    wwVar2.f51654z0.g(1.0f, vwVar2.h);
                    wwVar2.f5(false);
                    wwVar2.f51549e0[0].d.getClass();
                    wwVar2.f51549e0[1].d.getClass();
                }
                wwVar2.f51549e0[1].setVisibility(8);
                ww.j1(wwVar2, true);
                wwVar2.f51568h3 = false;
                wwVar2.f51595n3 = false;
                kVar = ((org.telegram.ui.ActionBar.f2) wwVar2).actionBar;
                kVar.setEnabled(true);
                wwVar2.f51654z0.setEnabled(true);
                wwVar2.C3(wwVar2.f51549e0[0]);
                return;
            case 27:
                super.onAnimationEnd(animator);
                ((sw) this.f50679b).setScrollEnabled(true);
                return;
            case 28:
                mx mxVar = (mx) this.f50679b;
                if (mxVar.f47902w == animator) {
                    mxVar.f47902w = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.m70 m70Var = (org.telegram.ui.Components.m70) this.f50679b;
                FrameLayout frameLayout = m70Var.f35901b;
                fi.p5 p5Var = (fi.p5) m70Var.f35902c;
                if (p5Var.getParent() != null) {
                    frameLayout.removeView(p5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((e7) m70Var.d);
                return;
        }
    }

    public va(vp vpVar, v4.n0 n0Var) {
        this.f50678a = 9;
        this.f50679b = vpVar;
    }
}
