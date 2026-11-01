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
    public final int f41291a;
    public final Object f41292b;

    public s9(Object obj, int i10) {
        this.f41291a = i10;
        this.f41292b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41291a) {
            case 8:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f41292b;
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
        switch (this.f41291a) {
            case 0:
                ((u9) this.f41292b).f41892w = null;
                return;
            case 1:
                org.telegram.ui.Cells.i iVar = (org.telegram.ui.Cells.i) this.f41292b;
                ((rx0) iVar).f41169e0.e.f33794c.f47882r = false;
                FrameLayout frameLayout = iVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(iVar.K);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) this.f41292b;
                Button button = vVar.f23163n;
                org.telegram.ui.Components.dh0 dh0Var = vVar.f23162f;
                if (button == dh0Var) {
                    vVar.e.setVisibility(4);
                    return;
                } else {
                    dh0Var.setVisibility(4);
                    return;
                }
            case 3:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.c0) this.f41292b).f21773x = null;
                return;
            case 4:
                ((org.telegram.ui.Cells.j4) this.f41292b).G = null;
                return;
            case 5:
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) this.f41292b;
                if (animator.equals(v5Var.f23312n)) {
                    v5Var.f23312n = null;
                    return;
                }
                return;
            case 6:
                mg.c2 c2Var = (mg.c2) this.f41292b;
                if (animator.equals(((org.telegram.ui.Cells.x5) c2Var.f13087b).d)) {
                    ((org.telegram.ui.Cells.x5) c2Var.f13087b).d = null;
                    return;
                }
                return;
            case 7:
                org.telegram.messenger.i0.h3(((org.telegram.ui.Cells.x5) this.f41292b).e, 1000L);
                return;
            case 8:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f41292b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) this.f41292b;
                s7Var.f23034n.N0 = true;
                s7Var.invalidate();
                return;
            case 10:
                super.onAnimationEnd(animator);
                org.telegram.ui.ActionBar.l1 l1Var = (org.telegram.ui.ActionBar.l1) this.f41292b;
                ((org.telegram.ui.Cells.y9) ((lg.f) l1Var.f20532b).f11866b).getTransitionParams().e();
                ((org.telegram.ui.Cells.y9) ((lg.f) l1Var.f20532b).f11866b).getTransitionParams().h = false;
                ((org.telegram.ui.Cells.y9) ((lg.f) l1Var.f20532b).f11866b).getTransitionParams().L1 = 1.0f;
                return;
            case 11:
                h3 h3Var = (h3) this.f41292b;
                if (animator.equals(((sb) h3Var.f37641b).R)) {
                    ((sb) h3Var.f37641b).R = null;
                    return;
                }
                return;
            case 12:
                sb sbVar = (sb) this.f41292b;
                if (animator.equals(sbVar.R)) {
                    sbVar.R = null;
                    return;
                }
                return;
            case 13:
                ((zb) this.f41292b).H.setVisibility(8);
                return;
            case 14:
                zc zcVar = (zc) this.f41292b;
                ic icVar = zcVar.m0;
                if (icVar != null) {
                    if (icVar.getParent() != null) {
                        ((ViewGroup) zcVar.m0.getParent()).removeView(zcVar.m0);
                    }
                    zcVar.m0 = null;
                }
                zcVar.f43907o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 15:
                ei eiVar = (ei) this.f41292b;
                if (eiVar.f36831a) {
                    eiVar.d.setTranslationY(0.0f);
                }
                if (eiVar.f36832b) {
                    eiVar.e.setTranslationY(0.0f);
                }
                if (eiVar.f36834f) {
                    eiVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.g9 g9Var = eiVar.f36833c;
                if (g9Var != null) {
                    g9Var.setTranslationY(0.0f);
                }
                eiVar.f36835n.V2[1] = null;
                return;
            case 16:
                mk mkVar = (mk) this.f41292b;
                mkVar.setAnimatedTop(0);
                View view = mkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    mkVar.G1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.G1.getLayoutParams().height) + mkVar.T1);
                }
                mkVar.f39550w5.I9 = null;
                return;
            case 17:
                org.telegram.ui.Components.q30 q30Var = ((bi) this.f41292b).f36060b.f42216s2;
                if (q30Var != null) {
                    q30Var.setVisibility(8);
                    return;
                }
                return;
            case 18:
                bg.f fVar = (bg.f) this.f41292b;
                org.telegram.ui.Components.j50 j50Var = ((dm) fVar.f2682b).f36634c.Q.f42181p3;
                if (j50Var != null) {
                    j50Var.setIsMessageTransition(false);
                    ((dm) fVar.f2682b).f36634c.Q.f42181p3.c(true);
                    ((dm) fVar.f2682b).f36634c.Q.f42181p3.setVisibility(4);
                    return;
                }
                return;
            case 19:
                dm dmVar = (dm) this.f41292b;
                fm fmVar = dmVar.f36634c;
                ArrayList arrayList = fmVar.Q.D6;
                org.telegram.ui.Cells.q1 q1Var = dmVar.f36633b;
                arrayList.remove(q1Var);
                View view2 = fmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    fmVar.Q.f42303z0.invalidate();
                }
                q1Var.setAlpha(1.0f);
                q1Var.getTransitionParams().f23559y0 = false;
                return;
            case 20:
                tp tpVar = (tp) this.f41292b;
                tpVar.L = 0.0f;
                tpVar.K = 1.0f;
                View view3 = tpVar.f41686a0;
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
                uq uqVar = (uq) this.f41292b;
                View view4 = uqVar.f42325b;
                view4.setAlpha(1.0f);
                s4.n0.x0(view4);
                ((pr) uqVar.d).f40531c.removeView(view4);
                return;
            case 22:
                org.telegram.ui.Components.voip.r rVar = ((org.telegram.ui.Components.voip.n) this.f41292b).f31624s0;
                if (rVar.f31694x0.getParent() != null) {
                    rVar.f31663a.removeView(rVar.f31694x0);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.voip.f0 f0Var = (org.telegram.ui.Components.voip.f0) this.f41292b;
                if (f0Var.getParent() != null) {
                    ((ViewGroup) f0Var.getParent()).removeView(f0Var);
                    return;
                }
                return;
            case 24:
                sd1 sd1Var = (sd1) this.f41292b;
                if (!sd1Var.f31591a) {
                    sd1Var.V.f43975w.S = true;
                    sd1Var.V.f43975w.invalidate();
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.voip.y0 y0Var = (org.telegram.ui.Components.voip.y0) this.f41292b;
                y0Var.f31838i = false;
                y0Var.f31841l.setAlpha(35);
                y0Var.f31840k.setAlpha(102);
                y0Var.f31839j.setAlpha(35);
                y0Var.c();
                return;
            case 26:
                org.telegram.ui.Components.voip.c1 c1Var = ((org.telegram.ui.Components.voip.a1) this.f41292b).f31375c;
                c1Var.O = false;
                c1Var.requestLayout();
                return;
            case 27:
                org.telegram.ui.Components.voip.z1 z1Var = (org.telegram.ui.Components.voip.z1) this.f41292b;
                z1Var.N = 0.0f;
                z1Var.O = 0.0f;
                org.telegram.ui.Components.voip.y1 y1Var = z1Var.d;
                y1Var.setScaleX(z1Var.T);
                y1Var.setScaleY(z1Var.T);
                TextureView textureView = z1Var.e;
                if (textureView != null) {
                    textureView.setScaleX(z1Var.U);
                    textureView.setScaleY(z1Var.U);
                }
                z1Var.setTranslationY(0.0f);
                z1Var.setTranslationX(0.0f);
                z1Var.W = z1Var.V;
                z1Var.f31850b0 = null;
                return;
            case 28:
                org.telegram.ui.Components.voip.c2 c2Var2 = (org.telegram.ui.Components.voip.c2) this.f41292b;
                if (c2Var2.P) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                c2Var2.Q = f7;
                c2Var2.a(c2Var2.R, c2Var2.S);
                return;
            default:
                ((org.telegram.ui.Components.voip.d2) this.f41292b).f31447c.e();
                org.telegram.messenger.i0.P3(((org.telegram.ui.Components.voip.d2) this.f41292b).f31445a);
                if (((org.telegram.ui.Components.voip.d2) this.f41292b).getParent() != null) {
                    WindowManager windowManager = (WindowManager) ((org.telegram.ui.Components.voip.d2) this.f41292b).f31445a.getSystemService("window");
                    ((org.telegram.ui.Components.voip.d2) this.f41292b).setVisibility(8);
                    try {
                        windowManager.removeView((org.telegram.ui.Components.voip.d2) this.f41292b);
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
        switch (this.f41291a) {
            case 1:
                ((rx0) ((org.telegram.ui.Cells.i) this.f41292b)).f41169e0.e.f33794c.f47882r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public s9(uq uqVar, s4.n0 n0Var) {
        this.f41291a = 21;
        this.f41292b = uqVar;
    }
}
