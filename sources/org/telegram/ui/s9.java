package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.webrtc.OrientationHelper;
public final class s9 extends AnimatorListenerAdapter {
    public final int f41416a;
    public final Object f41417b;

    public s9(Object obj, int i10) {
        this.f41416a = i10;
        this.f41417b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41416a) {
            case 8:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f41417b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f41416a) {
            case 0:
                ((u9) this.f41417b).f42090w = null;
                return;
            case 1:
                org.telegram.ui.Cells.i iVar = (org.telegram.ui.Cells.i) this.f41417b;
                ((sx0) iVar).f41664e0.e.f33787c.f47871r = false;
                FrameLayout frameLayout = iVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(iVar.K);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) this.f41417b;
                Button button = vVar.f23162n;
                org.telegram.ui.Components.ch0 ch0Var = vVar.f23161f;
                if (button == ch0Var) {
                    vVar.e.setVisibility(4);
                    return;
                } else {
                    ch0Var.setVisibility(4);
                    return;
                }
            case 3:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.c0) this.f41417b).f21772x = null;
                return;
            case 4:
                ((org.telegram.ui.Cells.j4) this.f41417b).G = null;
                return;
            case 5:
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) this.f41417b;
                if (animator.equals(v5Var.f23311n)) {
                    v5Var.f23311n = null;
                    return;
                }
                return;
            case 6:
                mg.c2 c2Var = (mg.c2) this.f41417b;
                if (animator.equals(((org.telegram.ui.Cells.x5) c2Var.f13086b).d)) {
                    ((org.telegram.ui.Cells.x5) c2Var.f13086b).d = null;
                    return;
                }
                return;
            case 7:
                org.telegram.messenger.i0.h3(((org.telegram.ui.Cells.x5) this.f41417b).e, 1000L);
                return;
            case 8:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f41417b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) this.f41417b;
                s7Var.f23033n.N0 = true;
                s7Var.invalidate();
                return;
            case 10:
                super.onAnimationEnd(animator);
                org.telegram.ui.ActionBar.l1 l1Var = (org.telegram.ui.ActionBar.l1) this.f41417b;
                ((org.telegram.ui.Cells.y9) ((lg.f) l1Var.f20531b).f11865b).getTransitionParams().e();
                ((org.telegram.ui.Cells.y9) ((lg.f) l1Var.f20531b).f11865b).getTransitionParams().h = false;
                ((org.telegram.ui.Cells.y9) ((lg.f) l1Var.f20531b).f11865b).getTransitionParams().L1 = 1.0f;
                return;
            case 11:
                h3 h3Var = (h3) this.f41417b;
                if (animator.equals(((sb) h3Var.f37700b).R)) {
                    ((sb) h3Var.f37700b).R = null;
                    return;
                }
                return;
            case 12:
                sb sbVar = (sb) this.f41417b;
                if (animator.equals(sbVar.R)) {
                    sbVar.R = null;
                    return;
                }
                return;
            case 13:
                ((zb) this.f41417b).H.setVisibility(8);
                return;
            case 14:
                zc zcVar = (zc) this.f41417b;
                ic icVar = zcVar.m0;
                if (icVar != null) {
                    if (icVar.getParent() != null) {
                        ((ViewGroup) zcVar.m0.getParent()).removeView(zcVar.m0);
                    }
                    zcVar.m0 = null;
                }
                zcVar.f44104o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 15:
                ei eiVar = (ei) this.f41417b;
                if (eiVar.f37059a) {
                    eiVar.d.setTranslationY(0.0f);
                }
                if (eiVar.f37060b) {
                    eiVar.e.setTranslationY(0.0f);
                }
                if (eiVar.f37062f) {
                    eiVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.g9 g9Var = eiVar.f37061c;
                if (g9Var != null) {
                    g9Var.setTranslationY(0.0f);
                }
                eiVar.f37063n.V2[1] = null;
                return;
            case 16:
                mk mkVar = (mk) this.f41417b;
                mkVar.setAnimatedTop(0);
                View view = mkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    mkVar.G1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.G1.getLayoutParams().height) + mkVar.T1);
                }
                mkVar.f39719w5.I9 = null;
                return;
            case 17:
                org.telegram.ui.Components.q30 q30Var = ((bi) this.f41417b).f36263b.f42405s2;
                if (q30Var != null) {
                    q30Var.setVisibility(8);
                    return;
                }
                return;
            case 18:
                bg.f fVar = (bg.f) this.f41417b;
                org.telegram.ui.Components.j50 j50Var = ((dm) fVar.f2682b).f36800c.Q.f42370p3;
                if (j50Var != null) {
                    j50Var.setIsMessageTransition(false);
                    ((dm) fVar.f2682b).f36800c.Q.f42370p3.c(true);
                    ((dm) fVar.f2682b).f36800c.Q.f42370p3.setVisibility(4);
                    return;
                }
                return;
            case 19:
                dm dmVar = (dm) this.f41417b;
                fm fmVar = dmVar.f36800c;
                ArrayList arrayList = fmVar.Q.D6;
                org.telegram.ui.Cells.q1 q1Var = dmVar.f36799b;
                arrayList.remove(q1Var);
                View view2 = fmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    fmVar.Q.f42492z0.invalidate();
                }
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().f23558y0 = false;
                return;
            case 20:
                tp tpVar = (tp) this.f41417b;
                tpVar.L = 0.0f;
                tpVar.K = 1.0f;
                View view3 = tpVar.f41888a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                tpVar.T.invalidate();
                rh rhVar = tpVar.Y;
                if (rhVar != null) {
                    rhVar.run();
                    tpVar.Y = null;
                    return;
                }
                return;
            case 21:
                uq uqVar = (uq) this.f41417b;
                View view4 = uqVar.f42515b;
                view4.setAlpha(1.0f);
                s4.n0.x0(view4);
                ((pr) uqVar.d).f40724c.removeView(view4);
                return;
            case 22:
                org.telegram.ui.Components.voip.r rVar = ((org.telegram.ui.Components.voip.n) this.f41417b).f31552s0;
                if (rVar.f31631x0.getParent() != null) {
                    rVar.f31600a.removeView(rVar.f31631x0);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.e0 e0Var = (org.telegram.ui.Components.voip.e0) this.f41417b;
                if (e0Var.getParent() != null) {
                    ((ViewGroup) e0Var.getParent()).removeView(e0Var);
                    return;
                }
                return;
            case 24:
                ud1 ud1Var = (ud1) this.f41417b;
                if (!ud1Var.f31512a) {
                    ud1Var.V.f36236w.S = true;
                    ud1Var.V.f36236w.invalidate();
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.f41417b;
                x0Var.f31758i = false;
                x0Var.f31761l.setAlpha(35);
                x0Var.f31760k.setAlpha(102);
                x0Var.f31759j.setAlpha(35);
                x0Var.c();
                return;
            case 26:
                org.telegram.ui.Components.voip.b1 b1Var = ((org.telegram.ui.Components.voip.z0) this.f41417b).f31795c;
                b1Var.O = false;
                b1Var.requestLayout();
                return;
            case 27:
                org.telegram.ui.Components.voip.y1 y1Var = (org.telegram.ui.Components.voip.y1) this.f41417b;
                y1Var.N = 0.0f;
                y1Var.O = 0.0f;
                org.telegram.ui.Components.voip.x1 x1Var = y1Var.d;
                x1Var.setScaleX(y1Var.T);
                x1Var.setScaleY(y1Var.T);
                TextureView textureView = y1Var.e;
                if (textureView != null) {
                    textureView.setScaleX(y1Var.U);
                    textureView.setScaleY(y1Var.U);
                }
                y1Var.setTranslationY(0.0f);
                y1Var.setTranslationX(0.0f);
                y1Var.W = y1Var.V;
                y1Var.f31770b0 = null;
                return;
            case 28:
                org.telegram.ui.Components.voip.b2 b2Var = (org.telegram.ui.Components.voip.b2) this.f41417b;
                if (b2Var.P) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                b2Var.Q = f7;
                b2Var.a(b2Var.R, b2Var.S);
                return;
            default:
                ((org.telegram.ui.Components.voip.c2) this.f41417b).f31370c.e();
                org.telegram.messenger.i0.P3(((org.telegram.ui.Components.voip.c2) this.f41417b).f31368a);
                if (((org.telegram.ui.Components.voip.c2) this.f41417b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.c2) this.f41417b).f31368a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.c2) this.f41417b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.c2) this.f41417b);
                    } catch (Exception unused) {
                    }
                    OrientationHelper.cameraRotationDisabled = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41416a) {
            case 1:
                ((sx0) ((org.telegram.ui.Cells.i) this.f41417b)).f41664e0.e.f33787c.f47871r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public s9(uq uqVar, s4.n0 n0Var) {
        this.f41416a = 21;
        this.f41417b = uqVar;
    }
}
