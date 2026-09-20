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
    public final int f37615a;
    public final Object f37616b;

    public t4(Object obj, int i10) {
        this.f37615a = i10;
        this.f37616b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f37615a) {
            case 11:
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) this.f37616b;
                AnimatorSet animatorSet = r7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    r7Var.h = null;
                    return;
                }
                return;
            case 24:
                nq nqVar = (nq) this.f37616b;
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
        switch (this.f37615a) {
            case 0:
                u4 u4Var = (u4) this.f37616b;
                u4Var.f37953c = false;
                u4Var.invalidate();
                return;
            case 1:
                ((v5) this.f37616b).f38398f0.setVisibility(8);
                return;
            case 2:
            case 24:
            default:
                super.onAnimationEnd(animator);
                return;
            case 3:
                ((v9) this.f37616b).f38448s = null;
                return;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f37616b;
                ((u01) jVar).f37921c0.e.f31537c.f42965r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f37616b;
                Button button = wVar.f21710n;
                org.telegram.ui.Components.hi0 hi0Var = wVar.f21709f;
                if (button == hi0Var) {
                    wVar.e.setVisibility(4);
                    return;
                } else {
                    hi0Var.setVisibility(4);
                    return;
                }
            case 6:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f37616b).f20174x = null;
                return;
            case 7:
                ((org.telegram.ui.Cells.h4) this.f37616b).G = null;
                return;
            case 8:
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) this.f37616b;
                if (animator.equals(u5Var.f21611n)) {
                    u5Var.f21611n = null;
                    return;
                }
                return;
            case 9:
                ai.q4 q4Var = (ai.q4) this.f37616b;
                if (animator.equals(((org.telegram.ui.Cells.w5) q4Var.f1422b).d)) {
                    ((org.telegram.ui.Cells.w5) q4Var.f1422b).d = null;
                    return;
                }
                return;
            case 10:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.w5) this.f37616b).e, 1000L);
                return;
            case 11:
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) this.f37616b;
                AnimatorSet animatorSet = r7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    r7Var.h = null;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) this.f37616b;
                u7Var.f21635n.isMediaSpoilersRevealedInSharedMedia = true;
                u7Var.invalidate();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) this.f37616b;
                ((org.telegram.ui.Cells.ha) gaVar.f20353b).f20415a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ha) gaVar.f20353b).f20415a.getTransitionParams().f21106g = false;
                ((org.telegram.ui.Cells.ha) gaVar.f20353b).f20415a.getTransitionParams().K1 = 1.0f;
                return;
            case 14:
                h3 h3Var = (h3) this.f37616b;
                if (animator.equals(((vb) h3Var.f34063b).R)) {
                    ((vb) h3Var.f34063b).R = null;
                    return;
                }
                return;
            case 15:
                vb vbVar = (vb) this.f37616b;
                if (animator.equals(vbVar.R)) {
                    vbVar.R = null;
                    return;
                }
                return;
            case 16:
                ((dc) this.f37616b).I.setVisibility(8);
                return;
            case 17:
                bd bdVar = (bd) this.f37616b;
                mc mcVar = bdVar.m0;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) bdVar.m0.getParent()).removeView(bdVar.m0);
                    }
                    bdVar.m0 = null;
                }
                bdVar.f32372o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                lk lkVar = (lk) this.f37616b;
                lkVar.setAnimatedTop(0);
                View view = lkVar.F1;
                if (view != null && view.getVisibility() == 0) {
                    lkVar.F1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.F1.getLayoutParams().height) + lkVar.S1);
                }
                lkVar.f35467q5.f40435p9 = null;
                return;
            case 19:
                org.telegram.ui.Components.i40 i40Var = ((wi) this.f37616b).f39159b.f40296e2;
                if (i40Var != null) {
                    i40Var.setVisibility(8);
                    return;
                }
                return;
            case 20:
                xl xlVar = (xl) this.f37616b;
                if (xlVar.f39612a) {
                    xlVar.d.setTranslationY(0.0f);
                }
                if (xlVar.f39613b) {
                    xlVar.e.setTranslationY(0.0f);
                }
                if (xlVar.f39615f) {
                    xlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.v9 v9Var = xlVar.f39614c;
                if (v9Var != null) {
                    v9Var.setTranslationY(0.0f);
                }
                xlVar.f39616n.H2[1] = null;
                return;
            case 21:
                ai.z zVar = (ai.z) this.f37616b;
                org.telegram.ui.Components.e60 e60Var = ((lm) ((fm) zVar.f1775c).f33692c).Q.f40258b3;
                if (e60Var != null) {
                    e60Var.setIsMessageTransition(false);
                    ((lm) ((fm) zVar.f1775c).f33692c).Q.f40258b3.c(true);
                    ((lm) ((fm) zVar.f1775c).f33692c).Q.f40258b3.setVisibility(4);
                    return;
                }
                return;
            case 22:
                km kmVar = (km) this.f37616b;
                lm lmVar = kmVar.f35210b;
                ArrayList arrayList = lmVar.Q.f40410n6;
                org.telegram.ui.Cells.u1 u1Var = kmVar.f35209a;
                arrayList.remove(u1Var);
                View view2 = lmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    lmVar.Q.f40530x0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f21177x0 = false;
                return;
            case 23:
                xp xpVar = (xp) this.f37616b;
                xpVar.L = 0.0f;
                xpVar.K = 1.0f;
                View view3 = xpVar.f39685a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                xpVar.T.invalidate();
                cj cjVar = xpVar.Y;
                if (cjVar != null) {
                    cjVar.run();
                    xpVar.Y = null;
                    return;
                }
                return;
            case 25:
                zq zqVar = (zq) this.f37616b;
                View view4 = zqVar.f40588b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((sr) zqVar.d).f37453c.removeView(view4);
                return;
            case 26:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.f37616b;
                g6Var.d = null;
                g6Var.f24262b.clear();
                return;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f37616b;
                animatedPhoneNumberEditText.f21946n = null;
                animatedPhoneNumberEditText.f21945f.clear();
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.f37616b;
                n6Var.c();
                n6Var.f26581k = null;
                n6Var.h = 0.0f;
                n6Var.f26583m = 0.0f;
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                n6Var.f26585o = null;
                CharSequence charSequence = n6Var.f26586p;
                if (charSequence != null) {
                    n6Var.q(charSequence, true, n6Var.f26587q);
                    n6Var.f26586p = null;
                    n6Var.f26587q = false;
                    return;
                }
                org.telegram.ui.Components.og ogVar = n6Var.C;
                if (ogVar != null) {
                    ogVar.run();
                    return;
                }
                return;
            case 29:
                org.telegram.ui.Components.v9 v9Var2 = (org.telegram.ui.Components.v9) this.f37616b;
                v9Var2.setVisibility(8);
                v9Var2.setImageDrawable(null);
                v9Var2.setAlpha(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37615a) {
            case 2:
                i8 i8Var = (i8) this.f37616b;
                for (int i10 = 0; i10 < i8Var.f34473b.getChildCount(); i10++) {
                    f8.a((f8) i8Var.f34473b.getChildAt(i10), i8Var.P, i8Var.Q);
                }
                return;
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                ((u01) ((org.telegram.ui.Cells.j) this.f37616b)).f37921c0.e.f31537c.f42965r = true;
                return;
        }
    }

    public t4(zq zqVar, s4.o0 o0Var) {
        this.f37615a = 25;
        this.f37616b = zqVar;
    }
}
