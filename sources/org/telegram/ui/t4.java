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
public final class t4 extends AnimatorListenerAdapter {
    public final int f37639a;
    public final Object f37640b;

    public t4(Object obj, int i10) {
        this.f37639a = i10;
        this.f37640b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f37639a) {
            case 11:
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) this.f37640b;
                AnimatorSet animatorSet = r7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    r7Var.h = null;
                    return;
                }
                return;
            case 24:
                nq nqVar = (nq) this.f37640b;
                org.telegram.ui.Components.pr prVar = nqVar.h;
                if (nqVar.H) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                prVar.b(f7);
                nqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f37639a) {
            case 0:
                u4 u4Var = (u4) this.f37640b;
                u4Var.f37954c = false;
                u4Var.invalidate();
                return;
            case 1:
                ((v5) this.f37640b).f38419f0.setVisibility(8);
                return;
            case 2:
            case 24:
            default:
                super.onAnimationEnd(animator);
                return;
            case 3:
                ((v9) this.f37640b).f38469s = null;
                return;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f37640b;
                ((u01) jVar).f37922c0.e.f31558c.f42986r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f37640b;
                Button button = wVar.f21725n;
                org.telegram.ui.Components.ki0 ki0Var = wVar.f21724f;
                if (button == ki0Var) {
                    wVar.e.setVisibility(4);
                    return;
                } else {
                    ki0Var.setVisibility(4);
                    return;
                }
            case 6:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f37640b).f20189x = null;
                return;
            case 7:
                ((org.telegram.ui.Cells.h4) this.f37640b).G = null;
                return;
            case 8:
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) this.f37640b;
                if (animator.equals(u5Var.f21626n)) {
                    u5Var.f21626n = null;
                    return;
                }
                return;
            case 9:
                ai.q4 q4Var = (ai.q4) this.f37640b;
                if (animator.equals(((org.telegram.ui.Cells.w5) q4Var.f1419b).d)) {
                    ((org.telegram.ui.Cells.w5) q4Var.f1419b).d = null;
                    return;
                }
                return;
            case 10:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.w5) this.f37640b).e, 1000L);
                return;
            case 11:
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) this.f37640b;
                AnimatorSet animatorSet = r7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    r7Var.h = null;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) this.f37640b;
                u7Var.f21650n.isMediaSpoilersRevealedInSharedMedia = true;
                u7Var.invalidate();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) this.f37640b;
                ((org.telegram.ui.Cells.ha) gaVar.f20368b).f20430a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ha) gaVar.f20368b).f20430a.getTransitionParams().f21121g = false;
                ((org.telegram.ui.Cells.ha) gaVar.f20368b).f20430a.getTransitionParams().K1 = 1.0f;
                return;
            case 14:
                h3 h3Var = (h3) this.f37640b;
                if (animator.equals(((vb) h3Var.f34079b).R)) {
                    ((vb) h3Var.f34079b).R = null;
                    return;
                }
                return;
            case 15:
                vb vbVar = (vb) this.f37640b;
                if (animator.equals(vbVar.R)) {
                    vbVar.R = null;
                    return;
                }
                return;
            case 16:
                ((dc) this.f37640b).I.setVisibility(8);
                return;
            case 17:
                bd bdVar = (bd) this.f37640b;
                mc mcVar = bdVar.m0;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) bdVar.m0.getParent()).removeView(bdVar.m0);
                    }
                    bdVar.m0 = null;
                }
                bdVar.f32390o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                mk mkVar = (mk) this.f37640b;
                mkVar.setAnimatedTop(0);
                View view = mkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    mkVar.G1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.G1.getLayoutParams().height) + mkVar.T1);
                }
                mkVar.f35785r5.f40456p9 = null;
                return;
            case 19:
                org.telegram.ui.Components.i40 i40Var = ((xi) this.f37640b).f39616b.f40317e2;
                if (i40Var != null) {
                    i40Var.setVisibility(8);
                    return;
                }
                return;
            case 20:
                yl ylVar = (yl) this.f37640b;
                if (ylVar.f39975a) {
                    ylVar.d.setTranslationY(0.0f);
                }
                if (ylVar.f39976b) {
                    ylVar.e.setTranslationY(0.0f);
                }
                if (ylVar.f39978f) {
                    ylVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.v9 v9Var = ylVar.f39977c;
                if (v9Var != null) {
                    v9Var.setTranslationY(0.0f);
                }
                ylVar.f39979n.H2[1] = null;
                return;
            case 21:
                ai.z zVar = (ai.z) this.f37640b;
                org.telegram.ui.Components.h60 h60Var = ((lm) ((fm) zVar.f1772c).f33720c).Q.f40279b3;
                if (h60Var != null) {
                    h60Var.setIsMessageTransition(false);
                    ((lm) ((fm) zVar.f1772c).f33720c).Q.f40279b3.c(true);
                    ((lm) ((fm) zVar.f1772c).f33720c).Q.f40279b3.setVisibility(4);
                    return;
                }
                return;
            case 22:
                km kmVar = (km) this.f37640b;
                lm lmVar = kmVar.f35228b;
                ArrayList arrayList = lmVar.Q.f40431n6;
                org.telegram.ui.Cells.u1 u1Var = kmVar.f35227a;
                arrayList.remove(u1Var);
                View view2 = lmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    lmVar.Q.f40551x0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f21192x0 = false;
                return;
            case 23:
                xp xpVar = (xp) this.f37640b;
                xpVar.L = 0.0f;
                xpVar.K = 1.0f;
                View view3 = xpVar.f39705a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                xpVar.T.invalidate();
                dj djVar = xpVar.Y;
                if (djVar != null) {
                    djVar.run();
                    xpVar.Y = null;
                    return;
                }
                return;
            case 25:
                zq zqVar = (zq) this.f37640b;
                View view4 = zqVar.f40609b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((sr) zqVar.d).f37477c.removeView(view4);
                return;
            case 26:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.f37640b;
                g6Var.d = null;
                g6Var.f24423b.clear();
                return;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f37640b;
                animatedPhoneNumberEditText.f21961n = null;
                animatedPhoneNumberEditText.f21960f.clear();
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.f37640b;
                n6Var.c();
                n6Var.f26649k = null;
                n6Var.h = 0.0f;
                n6Var.f26651m = 0.0f;
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                n6Var.f26653o = null;
                CharSequence charSequence = n6Var.f26654p;
                if (charSequence != null) {
                    n6Var.q(charSequence, true, n6Var.f26655q);
                    n6Var.f26654p = null;
                    n6Var.f26655q = false;
                    return;
                }
                org.telegram.ui.Components.og ogVar = n6Var.C;
                if (ogVar != null) {
                    ogVar.run();
                    return;
                }
                return;
            case 29:
                org.telegram.ui.Components.v9 v9Var2 = (org.telegram.ui.Components.v9) this.f37640b;
                v9Var2.setVisibility(8);
                v9Var2.setImageDrawable(null);
                v9Var2.setAlpha(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37639a) {
            case 2:
                i8 i8Var = (i8) this.f37640b;
                for (int i10 = 0; i10 < i8Var.f34493b.getChildCount(); i10++) {
                    f8.a((f8) i8Var.f34493b.getChildAt(i10), i8Var.P, i8Var.Q);
                }
                return;
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                ((u01) ((org.telegram.ui.Cells.j) this.f37640b)).f37922c0.e.f31558c.f42986r = true;
                return;
        }
    }

    public t4(zq zqVar, s4.o0 o0Var) {
        this.f37639a = 25;
        this.f37640b = zqVar;
    }
}
