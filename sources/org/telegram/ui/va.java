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
    public final int f50620a;
    public final Object f50621b;

    public va(Object obj, int i7) {
        this.f50620a = i7;
        this.f50621b = obj;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        AnimatorSet animatorSet;
        boolean z9;
        float f11;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f50620a) {
            case 0:
                g3 g3Var = (g3) this.f50621b;
                if (animator.equals(((mb) g3Var.f45771b).R)) {
                    ((mb) g3Var.f45771b).R = null;
                    return;
                }
                return;
            case 1:
                mb mbVar = (mb) this.f50621b;
                if (animator.equals(mbVar.R)) {
                    mbVar.R = null;
                    return;
                }
                return;
            case 2:
                ((tb) this.f50621b).H.setVisibility(8);
                return;
            case 3:
                rc rcVar = (rc) this.f50621b;
                cc ccVar = rcVar.m0;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) rcVar.m0.getParent()).removeView(rcVar.m0);
                    }
                    rcVar.m0 = null;
                }
                rcVar.f49452o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 4:
                jh jhVar = (jh) this.f50621b;
                if (jhVar.f46974a) {
                    jhVar.d.setTranslationY(0.0f);
                }
                if (jhVar.f46975b) {
                    jhVar.f46977e.setTranslationY(0.0f);
                }
                if (jhVar.f46978f) {
                    jhVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.l9 l9Var = jhVar.f46976c;
                if (l9Var != null) {
                    l9Var.setTranslationY(0.0f);
                }
                jhVar.f46979n.V2[1] = null;
                return;
            case 5:
                qj qjVar = (qj) this.f50621b;
                qjVar.setAnimatedTop(0);
                View view = qjVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    qjVar.G1.setTranslationY(((1.0f - qjVar.getTopViewEnterProgress()) * qjVar.G1.getLayoutParams().height) + qjVar.T1);
                }
                qjVar.f49249w5.I9 = null;
                return;
            case 6:
                ah.l lVar = (ah.l) this.f50621b;
                org.telegram.ui.Components.t40 t40Var = ((hl) lVar.f1086c).f46402c.Q.f43917p3;
                if (t40Var != null) {
                    t40Var.setIsMessageTransition(false);
                    ((hl) lVar.f1086c).f46402c.Q.f43917p3.d(true);
                    ((hl) lVar.f1086c).f46402c.Q.f43917p3.setVisibility(4);
                    return;
                }
                return;
            case 7:
                hl hlVar = (hl) this.f50621b;
                jl jlVar = hlVar.f46402c;
                ArrayList arrayList = jlVar.Q.D6;
                org.telegram.ui.Cells.q1 q1Var = hlVar.f46401b;
                arrayList.remove(q1Var);
                View view2 = jlVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    jlVar.Q.f44043z0.invalidate();
                }
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().f30867y0 = false;
                return;
            case 8:
                vo voVar = (vo) this.f50621b;
                voVar.L = 0.0f;
                voVar.K = 1.0f;
                View view3 = voVar.f50711a0;
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
                vp vpVar = (vp) this.f50621b;
                View view4 = vpVar.f50753b;
                view4.setAlpha(1.0f);
                v4.n0.x0(view4);
                ((oq) vpVar.d).f48468c.removeView(view4);
                return;
            case 10:
                org.telegram.ui.Components.voip.y yVar = ((org.telegram.ui.Components.voip.u) this.f50621b).f39560s0;
                if (yVar.f39657x0.getParent() != null) {
                    yVar.f39625a.removeView(yVar.f39657x0);
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.a0 a0Var = (org.telegram.ui.Components.voip.a0) this.f50621b;
                a0Var.f39083s = null;
                a0Var.f39082r = 1.0f;
                a0Var.b();
                a0Var.e();
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.f50621b;
                if (t0Var.getParent() != null) {
                    ((ViewGroup) t0Var.getParent()).removeView(t0Var);
                    return;
                }
                return;
            case 13:
                zb1 zb1Var = (zb1) this.f50621b;
                if (!zb1Var.f39666a) {
                    zb1Var.V.f45579w.S = true;
                    zb1Var.V.f45579w.invalidate();
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.f50621b;
                i1Var.f39261i = false;
                i1Var.f39264l.setAlpha(35);
                i1Var.f39263k.setAlpha(102);
                i1Var.f39262j.setAlpha(35);
                i1Var.c();
                return;
            case 15:
                org.telegram.ui.Components.voip.n1 n1Var = ((org.telegram.ui.Components.voip.l1) this.f50621b).f39352c;
                n1Var.O = false;
                n1Var.requestLayout();
                return;
            case 16:
                org.telegram.ui.Components.voip.k2 k2Var = (org.telegram.ui.Components.voip.k2) this.f50621b;
                k2Var.N = 0.0f;
                k2Var.O = 0.0f;
                org.telegram.ui.Components.voip.j2 j2Var = k2Var.d;
                j2Var.setScaleX(k2Var.T);
                j2Var.setScaleY(k2Var.T);
                TextureView textureView = k2Var.f39337e;
                if (textureView != null) {
                    textureView.setScaleX(k2Var.U);
                    textureView.setScaleY(k2Var.U);
                }
                k2Var.setTranslationY(0.0f);
                k2Var.setTranslationX(0.0f);
                k2Var.W = k2Var.V;
                k2Var.f39333b0 = null;
                return;
            case 17:
                org.telegram.ui.Components.voip.n2 n2Var = (org.telegram.ui.Components.voip.n2) this.f50621b;
                if (n2Var.P) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                n2Var.Q = f10;
                n2Var.a(n2Var.R, n2Var.S);
                return;
            case 18:
                ((org.telegram.ui.Components.voip.o2) this.f50621b).f39441c.e();
                org.telegram.messenger.g0.Q3(((org.telegram.ui.Components.voip.o2) this.f50621b).f39439a);
                if (((org.telegram.ui.Components.voip.o2) this.f50621b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.o2) this.f50621b).f39439a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.o2) this.f50621b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.o2) this.f50621b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
            case 19:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f50621b;
                u2Var.J = false;
                u2Var.T.f39258e = false;
                if (u2Var.U && (animatorSet = u2Var.Q) != null) {
                    animatorSet.cancel();
                    u2Var.Q.start();
                }
                u2Var.c();
                return;
            case 20:
                ((org.telegram.ui.Components.voip.b3) this.f50621b).f39117e.setVisibility(8);
                return;
            case 21:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) this.f50621b;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    return;
                }
                return;
            case 22:
                vs vsVar = (vs) this.f50621b;
                if (animator.equals(vsVar.f50764n[0])) {
                    vsVar.f50764n[0] = null;
                    return;
                }
                return;
            case 23:
                yt ytVar = (yt) this.f50621b;
                au auVar = ytVar.f52308n;
                zt[] ztVarArr = auVar.f44099f;
                auVar.h = null;
                if (auVar.f44102s) {
                    ztVarArr[1].setVisibility(8);
                } else {
                    zt ztVar = ztVarArr[0];
                    ztVarArr[0] = ztVarArr[1];
                    ztVarArr[1] = ztVar;
                    ztVar.setVisibility(8);
                    if (auVar.f44099f[0].f52680f == auVar.f44098e.getFirstTabId()) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    auVar.f44104x = z9;
                    auVar.f44098e.i(1.0f, auVar.f44099f[0].f52680f);
                }
                auVar.f44100n = false;
                ytVar.f52305c = false;
                ytVar.f52304b = false;
                au.k0(auVar).setEnabled(true);
                auVar.f44098e.setEnabled(true);
                return;
            case 24:
                cv cvVar = (cv) this.f50621b;
                ww.u1(cvVar.M, cvVar.L, 0.0f);
                return;
            case 25:
                ww wwVar = (ww) this.f50621b;
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
                ww wwVar2 = ((pw) this.f50621b).f48966n0;
                wwVar2.f51570g3 = null;
                if (!wwVar2.f51589k3) {
                    vw[] vwVarArr = wwVar2.f51556e0;
                    vw vwVar = vwVarArr[0];
                    vw vwVar2 = vwVarArr[1];
                    vwVarArr[0] = vwVar2;
                    vwVarArr[1] = vwVar;
                    wwVar2.f51661z0.g(1.0f, vwVar2.h);
                    wwVar2.f5(false);
                    wwVar2.f51556e0[0].d.getClass();
                    wwVar2.f51556e0[1].d.getClass();
                }
                wwVar2.f51556e0[1].setVisibility(8);
                ww.j1(wwVar2, true);
                wwVar2.f51575h3 = false;
                wwVar2.f51602n3 = false;
                kVar = ((org.telegram.ui.ActionBar.f2) wwVar2).actionBar;
                kVar.setEnabled(true);
                wwVar2.f51661z0.setEnabled(true);
                wwVar2.C3(wwVar2.f51556e0[0]);
                return;
            case 27:
                super.onAnimationEnd(animator);
                ((sw) this.f50621b).setScrollEnabled(true);
                return;
            case 28:
                mx mxVar = (mx) this.f50621b;
                if (mxVar.f47902w == animator) {
                    mxVar.f47902w = null;
                    return;
                }
                return;
            default:
                org.telegram.ui.Components.m70 m70Var = (org.telegram.ui.Components.m70) this.f50621b;
                FrameLayout frameLayout = m70Var.f35929b;
                fi.p5 p5Var = (fi.p5) m70Var.f35930c;
                if (p5Var.getParent() != null) {
                    frameLayout.removeView(p5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((e7) m70Var.d);
                return;
        }
    }

    public va(vp vpVar, v4.n0 n0Var) {
        this.f50620a = 9;
        this.f50621b = vpVar;
    }
}
