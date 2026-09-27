package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class v4 extends AnimatorListenerAdapter {
    public final int f38442a;
    public final Object f38443b;

    public v4(Object obj, int i10) {
        this.f38442a = i10;
        this.f38443b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f38442a) {
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f38443b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 24:
                lq lqVar = (lq) this.f38443b;
                org.telegram.ui.Components.rr rrVar = lqVar.h;
                if (lqVar.H) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                rrVar.b(f7);
                lqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f38442a) {
            case 0:
                w4 w4Var = (w4) this.f38443b;
                w4Var.f38808c = false;
                w4Var.invalidate();
                return;
            case 1:
                ((x5) this.f38443b).f39530f0.setVisibility(8);
                return;
            case 2:
            case 24:
            default:
                super.onAnimationEnd(animator);
                return;
            case 3:
                ((x9) this.f38443b).f39579s = null;
                return;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f38443b;
                ((n01) jVar).f35785c0.e.f31541c.f42996r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f38443b;
                Button button = wVar.f21716n;
                org.telegram.ui.Components.ki0 ki0Var = wVar.f21715f;
                if (button == ki0Var) {
                    wVar.e.setVisibility(4);
                    return;
                } else {
                    ki0Var.setVisibility(4);
                    return;
                }
            case 6:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f38443b).f20223x = null;
                return;
            case 7:
                ((org.telegram.ui.Cells.g4) this.f38443b).G = null;
                return;
            case 8:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f38443b;
                if (animator.equals(t5Var.f21204n)) {
                    t5Var.f21204n = null;
                    return;
                }
                return;
            case 9:
                ai.q4 q4Var = (ai.q4) this.f38443b;
                if (animator.equals(((org.telegram.ui.Cells.v5) q4Var.f1422b).d)) {
                    ((org.telegram.ui.Cells.v5) q4Var.f1422b).d = null;
                    return;
                }
                return;
            case 10:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.f38443b).e, 1000L);
                return;
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f38443b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f38443b;
                t7Var.f21228n.isMediaSpoilersRevealedInSharedMedia = true;
                t7Var.invalidate();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) this.f38443b;
                ((org.telegram.ui.Cells.ga) faVar.f20318b).f20374a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ga) faVar.f20318b).f20374a.getTransitionParams().f21105g = false;
                ((org.telegram.ui.Cells.ga) faVar.f20318b).f20374a.getTransitionParams().K1 = 1.0f;
                return;
            case 14:
                j3 j3Var = (j3) this.f38443b;
                if (animator.equals(((wb) j3Var.f34579b).R)) {
                    ((wb) j3Var.f34579b).R = null;
                    return;
                }
                return;
            case 15:
                wb wbVar = (wb) this.f38443b;
                if (animator.equals(wbVar.R)) {
                    wbVar.R = null;
                    return;
                }
                return;
            case 16:
                ((dc) this.f38443b).H.setVisibility(8);
                return;
            case 17:
                cd cdVar = (cd) this.f38443b;
                mc mcVar = cdVar.m0;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) cdVar.m0.getParent()).removeView(cdVar.m0);
                    }
                    cdVar.m0 = null;
                }
                cdVar.f32679o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                lk lkVar = (lk) this.f38443b;
                lkVar.setAnimatedTop(0);
                View view = lkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    lkVar.G1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.G1.getLayoutParams().height) + lkVar.T1);
                }
                lkVar.f35367r5.f39882p9 = null;
                return;
            case 19:
                org.telegram.ui.Components.l40 l40Var = ((wi) this.f38443b).f39351b.f39743e2;
                if (l40Var != null) {
                    l40Var.setVisibility(8);
                    return;
                }
                return;
            case 20:
                xl xlVar = (xl) this.f38443b;
                if (xlVar.f39678a) {
                    xlVar.d.setTranslationY(0.0f);
                }
                if (xlVar.f39679b) {
                    xlVar.e.setTranslationY(0.0f);
                }
                if (xlVar.f39681f) {
                    xlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.w9 w9Var = xlVar.f39680c;
                if (w9Var != null) {
                    w9Var.setTranslationY(0.0f);
                }
                xlVar.f39682n.H2[1] = null;
                return;
            case 21:
                ai.z zVar = (ai.z) this.f38443b;
                org.telegram.ui.Components.j60 j60Var = ((km) ((em) zVar.f1771c).f33287c).Q.f39705b3;
                if (j60Var != null) {
                    j60Var.setIsMessageTransition(false);
                    ((km) ((em) zVar.f1771c).f33287c).Q.f39705b3.c(true);
                    ((km) ((em) zVar.f1771c).f33287c).Q.f39705b3.setVisibility(4);
                    return;
                }
                return;
            case 22:
                jm jmVar = (jm) this.f38443b;
                km kmVar = jmVar.f34762b;
                ArrayList arrayList = kmVar.Q.f39857n6;
                org.telegram.ui.Cells.u1 u1Var = jmVar.f34761a;
                arrayList.remove(u1Var);
                View view2 = kmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    kmVar.Q.f39977x0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f21176x0 = false;
                return;
            case 23:
                vp vpVar = (vp) this.f38443b;
                vpVar.L = 0.0f;
                vpVar.K = 1.0f;
                View view3 = vpVar.f38658a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                vpVar.T.invalidate();
                cj cjVar = vpVar.Y;
                if (cjVar != null) {
                    cjVar.run();
                    vpVar.Y = null;
                    return;
                }
                return;
            case 25:
                xq xqVar = (xq) this.f38443b;
                View view4 = xqVar.f40027b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((qr) xqVar.d).f36823c.removeView(view4);
                return;
            case 26:
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f38443b;
                h6Var.d = null;
                h6Var.f24735b.clear();
                return;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f38443b;
                animatedPhoneNumberEditText.f21949n = null;
                animatedPhoneNumberEditText.f21948f.clear();
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f38443b;
                o6Var.c();
                o6Var.f26989k = null;
                o6Var.h = 0.0f;
                o6Var.f26991m = 0.0f;
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                o6Var.f26993o = null;
                CharSequence charSequence = o6Var.f26994p;
                if (charSequence != null) {
                    o6Var.q(charSequence, true, o6Var.f26995q);
                    o6Var.f26994p = null;
                    o6Var.f26995q = false;
                    return;
                }
                org.telegram.ui.Components.pg pgVar = o6Var.C;
                if (pgVar != null) {
                    pgVar.run();
                    return;
                }
                return;
            case 29:
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) this.f38443b;
                w9Var2.setVisibility(8);
                w9Var2.setImageDrawable(null);
                w9Var2.setAlpha(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38442a) {
            case 2:
                k8 k8Var = (k8) this.f38443b;
                for (int i10 = 0; i10 < k8Var.f34925b.getChildCount(); i10++) {
                    h8.a((h8) k8Var.f34925b.getChildAt(i10), k8Var.P, k8Var.Q);
                }
                return;
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                ((n01) ((org.telegram.ui.Cells.j) this.f38443b)).f35785c0.e.f31541c.f42996r = true;
                return;
        }
    }

    public v4(xq xqVar, s4.o0 o0Var) {
        this.f38442a = 25;
        this.f38443b = xqVar;
    }
}
