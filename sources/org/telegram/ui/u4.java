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
public final class u4 extends AnimatorListenerAdapter {
    public final int f37898a;
    public final Object f37899b;

    public u4(Object obj, int i10) {
        this.f37898a = i10;
        this.f37899b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f37898a) {
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f37899b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 24:
                lq lqVar = (lq) this.f37899b;
                org.telegram.ui.Components.qr qrVar = lqVar.h;
                if (lqVar.H) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                qrVar.b(f7);
                lqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f37898a) {
            case 0:
                v4 v4Var = (v4) this.f37899b;
                v4Var.f38291c = false;
                v4Var.invalidate();
                return;
            case 1:
                ((w5) this.f37899b).f38537f0.setVisibility(8);
                return;
            case 2:
            case 24:
            default:
                super.onAnimationEnd(animator);
                return;
            case 3:
                ((u9) this.f37899b).f37966s = null;
                return;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f37899b;
                ((n01) jVar).f35417c0.e.f31224c.f42618r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f37899b;
                Button button = wVar.f21464n;
                org.telegram.ui.Components.yh0 yh0Var = wVar.f21463f;
                if (button == yh0Var) {
                    wVar.e.setVisibility(4);
                    return;
                } else {
                    yh0Var.setVisibility(4);
                    return;
                }
            case 6:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f37899b).f19921x = null;
                return;
            case 7:
                ((org.telegram.ui.Cells.g4) this.f37899b).G = null;
                return;
            case 8:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f37899b;
                if (animator.equals(t5Var.f21328n)) {
                    t5Var.f21328n = null;
                    return;
                }
                return;
            case 9:
                ai.q4 q4Var = (ai.q4) this.f37899b;
                if (animator.equals(((org.telegram.ui.Cells.v5) q4Var.f1420b).d)) {
                    ((org.telegram.ui.Cells.v5) q4Var.f1420b).d = null;
                    return;
                }
                return;
            case 10:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.f37899b).e, 1000L);
                return;
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f37899b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f37899b;
                t7Var.f21360n.isMediaSpoilersRevealedInSharedMedia = true;
                t7Var.invalidate();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) this.f37899b;
                ((org.telegram.ui.Cells.ha) gaVar.f20122b).f20169a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ha) gaVar.f20122b).f20169a.getTransitionParams().f20819g = false;
                ((org.telegram.ui.Cells.ha) gaVar.f20122b).f20169a.getTransitionParams().K1 = 1.0f;
                return;
            case 14:
                i3 i3Var = (i3) this.f37899b;
                if (animator.equals(((ub) i3Var.f33973b).R)) {
                    ((ub) i3Var.f33973b).R = null;
                    return;
                }
                return;
            case 15:
                ub ubVar = (ub) this.f37899b;
                if (animator.equals(ubVar.R)) {
                    ubVar.R = null;
                    return;
                }
                return;
            case 16:
                ((bc) this.f37899b).I.setVisibility(8);
                return;
            case 17:
                ad adVar = (ad) this.f37899b;
                kc kcVar = adVar.m0;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) adVar.m0.getParent()).removeView(adVar.m0);
                    }
                    adVar.m0 = null;
                }
                adVar.f31756o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                jk jkVar = (jk) this.f37899b;
                jkVar.setAnimatedTop(0);
                View view = jkVar.F1;
                if (view != null && view.getVisibility() == 0) {
                    jkVar.F1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.F1.getLayoutParams().height) + jkVar.S1);
                }
                jkVar.f34469r5.f39501p9 = null;
                return;
            case 19:
                org.telegram.ui.Components.j40 j40Var = ((ui) this.f37899b).f38116b.f39363e2;
                if (j40Var != null) {
                    j40Var.setVisibility(8);
                    return;
                }
                return;
            case 20:
                xl xlVar = (xl) this.f37899b;
                if (xlVar.f39296a) {
                    xlVar.d.setTranslationY(0.0f);
                }
                if (xlVar.f39297b) {
                    xlVar.e.setTranslationY(0.0f);
                }
                if (xlVar.f39299f) {
                    xlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.w9 w9Var = xlVar.f39298c;
                if (w9Var != null) {
                    w9Var.setTranslationY(0.0f);
                }
                xlVar.f39300n.H2[1] = null;
                return;
            case 21:
                em emVar = (em) ((ai.z) this.f37899b).f1769c;
                dl dlVar = ((km) emVar.f32973c).Q.f39325b3;
                if (dlVar != null) {
                    dlVar.setIsMessageTransition(false);
                    ((km) emVar.f32973c).Q.f39325b3.h(true);
                    ((km) emVar.f32973c).Q.f39325b3.setVisibility(4);
                    return;
                }
                return;
            case 22:
                jm jmVar = (jm) this.f37899b;
                km kmVar = jmVar.f34476b;
                ArrayList arrayList = kmVar.Q.f39476n6;
                org.telegram.ui.Cells.t1 t1Var = jmVar.f34475a;
                arrayList.remove(t1Var);
                View view2 = kmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    kmVar.Q.f39596x0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f20890x0 = false;
                return;
            case 23:
                vp vpVar = (vp) this.f37899b;
                vpVar.L = 0.0f;
                vpVar.K = 1.0f;
                View view3 = vpVar.f38443a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                vpVar.T.invalidate();
                aj ajVar = vpVar.Y;
                if (ajVar != null) {
                    ajVar.run();
                    vpVar.Y = null;
                    return;
                }
                return;
            case 25:
                xq xqVar = (xq) this.f37899b;
                View view4 = xqVar.f39641b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((qr) xqVar.d).f36551c.removeView(view4);
                return;
            case 26:
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f37899b;
                h6Var.d = null;
                h6Var.f24522b.clear();
                return;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f37899b;
                animatedPhoneNumberEditText.f21695n = null;
                animatedPhoneNumberEditText.f21694f.clear();
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f37899b;
                o6Var.c();
                o6Var.f26620k = null;
                o6Var.h = 0.0f;
                o6Var.f26622m = 0.0f;
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                o6Var.f26624o = null;
                CharSequence charSequence = o6Var.f26625p;
                if (charSequence != null) {
                    o6Var.q(charSequence, true, o6Var.f26626q);
                    o6Var.f26625p = null;
                    o6Var.f26626q = false;
                    return;
                }
                org.telegram.ui.Components.og ogVar = o6Var.C;
                if (ogVar != null) {
                    ogVar.run();
                    return;
                }
                return;
            case 29:
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) this.f37899b;
                w9Var2.setVisibility(8);
                w9Var2.setImageDrawable(null);
                w9Var2.setAlpha(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37898a) {
            case 2:
                h8 h8Var = (h8) this.f37899b;
                for (int i10 = 0; i10 < h8Var.f33752b.getChildCount(); i10++) {
                    e8.a((e8) h8Var.f33752b.getChildAt(i10), h8Var.P, h8Var.Q);
                }
                return;
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                ((n01) ((org.telegram.ui.Cells.j) this.f37899b)).f35417c0.e.f31224c.f42618r = true;
                return;
        }
    }

    public u4(xq xqVar, s4.o0 o0Var) {
        this.f37898a = 25;
        this.f37899b = xqVar;
    }
}
