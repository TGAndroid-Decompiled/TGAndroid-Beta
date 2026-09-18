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
    public final int f37561a;
    public final Object f37562b;

    public t4(Object obj, int i10) {
        this.f37561a = i10;
        this.f37562b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f37561a) {
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f37562b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 24:
                nq nqVar = (nq) this.f37562b;
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
        switch (this.f37561a) {
            case 0:
                u4 u4Var = (u4) this.f37562b;
                u4Var.f37876c = false;
                u4Var.invalidate();
                return;
            case 1:
                ((v5) this.f37562b).f38293f0.setVisibility(8);
                return;
            case 2:
            case 24:
            default:
                super.onAnimationEnd(animator);
                return;
            case 3:
                ((v9) this.f37562b).f38378s = null;
                return;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f37562b;
                ((u01) jVar).f37843c0.e.f31497c.f42920r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f37562b;
                Button button = wVar.f21678n;
                org.telegram.ui.Components.ii0 ii0Var = wVar.f21677f;
                if (button == ii0Var) {
                    wVar.e.setVisibility(4);
                    return;
                } else {
                    ii0Var.setVisibility(4);
                    return;
                }
            case 6:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f37562b).f20185x = null;
                return;
            case 7:
                ((org.telegram.ui.Cells.g4) this.f37562b).G = null;
                return;
            case 8:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f37562b;
                if (animator.equals(t5Var.f21166n)) {
                    t5Var.f21166n = null;
                    return;
                }
                return;
            case 9:
                ai.q4 q4Var = (ai.q4) this.f37562b;
                if (animator.equals(((org.telegram.ui.Cells.v5) q4Var.f1422b).d)) {
                    ((org.telegram.ui.Cells.v5) q4Var.f1422b).d = null;
                    return;
                }
                return;
            case 10:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.f37562b).e, 1000L);
                return;
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f37562b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f37562b;
                t7Var.f21190n.isMediaSpoilersRevealedInSharedMedia = true;
                t7Var.invalidate();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) this.f37562b;
                ((org.telegram.ui.Cells.ga) faVar.f20280b).f20336a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ga) faVar.f20280b).f20336a.getTransitionParams().f21067g = false;
                ((org.telegram.ui.Cells.ga) faVar.f20280b).f20336a.getTransitionParams().K1 = 1.0f;
                return;
            case 14:
                h3 h3Var = (h3) this.f37562b;
                if (animator.equals(((vb) h3Var.f34027b).R)) {
                    ((vb) h3Var.f34027b).R = null;
                    return;
                }
                return;
            case 15:
                vb vbVar = (vb) this.f37562b;
                if (animator.equals(vbVar.R)) {
                    vbVar.R = null;
                    return;
                }
                return;
            case 16:
                ((dc) this.f37562b).I.setVisibility(8);
                return;
            case 17:
                bd bdVar = (bd) this.f37562b;
                mc mcVar = bdVar.m0;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) bdVar.m0.getParent()).removeView(bdVar.m0);
                    }
                    bdVar.m0 = null;
                }
                bdVar.f32328o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                lk lkVar = (lk) this.f37562b;
                lkVar.setAnimatedTop(0);
                View view = lkVar.F1;
                if (view != null && view.getVisibility() == 0) {
                    lkVar.F1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.F1.getLayoutParams().height) + lkVar.S1);
                }
                lkVar.f35395q5.f40393p9 = null;
                return;
            case 19:
                org.telegram.ui.Components.i40 i40Var = ((wi) this.f37562b).f39176b.f40254e2;
                if (i40Var != null) {
                    i40Var.setVisibility(8);
                    return;
                }
                return;
            case 20:
                xl xlVar = (xl) this.f37562b;
                if (xlVar.f39507a) {
                    xlVar.d.setTranslationY(0.0f);
                }
                if (xlVar.f39508b) {
                    xlVar.e.setTranslationY(0.0f);
                }
                if (xlVar.f39510f) {
                    xlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.w9 w9Var = xlVar.f39509c;
                if (w9Var != null) {
                    w9Var.setTranslationY(0.0f);
                }
                xlVar.f39511n.H2[1] = null;
                return;
            case 21:
                ai.z zVar = (ai.z) this.f37562b;
                org.telegram.ui.Components.f60 f60Var = ((lm) ((fm) zVar.f1775c).f33581c).Q.f40216b3;
                if (f60Var != null) {
                    f60Var.setIsMessageTransition(false);
                    ((lm) ((fm) zVar.f1775c).f33581c).Q.f40216b3.d(true);
                    ((lm) ((fm) zVar.f1775c).f33581c).Q.f40216b3.setVisibility(4);
                    return;
                }
                return;
            case 22:
                km kmVar = (km) this.f37562b;
                lm lmVar = kmVar.f35147b;
                ArrayList arrayList = lmVar.Q.f40368n6;
                org.telegram.ui.Cells.u1 u1Var = kmVar.f35146a;
                arrayList.remove(u1Var);
                View view2 = lmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    lmVar.Q.f40488x0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f21138x0 = false;
                return;
            case 23:
                xp xpVar = (xp) this.f37562b;
                xpVar.L = 0.0f;
                xpVar.K = 1.0f;
                View view3 = xpVar.f39580a0;
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
                zq zqVar = (zq) this.f37562b;
                View view4 = zqVar.f40546b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((sr) zqVar.d).f37398c.removeView(view4);
                return;
            case 26:
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f37562b;
                h6Var.d = null;
                h6Var.f24561b.clear();
                return;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f37562b;
                animatedPhoneNumberEditText.f21911n = null;
                animatedPhoneNumberEditText.f21910f.clear();
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f37562b;
                o6Var.c();
                o6Var.f26874k = null;
                o6Var.h = 0.0f;
                o6Var.f26876m = 0.0f;
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                o6Var.f26878o = null;
                CharSequence charSequence = o6Var.f26879p;
                if (charSequence != null) {
                    o6Var.q(charSequence, true, o6Var.f26880q);
                    o6Var.f26879p = null;
                    o6Var.f26880q = false;
                    return;
                }
                org.telegram.ui.Components.og ogVar = o6Var.C;
                if (ogVar != null) {
                    ogVar.run();
                    return;
                }
                return;
            case 29:
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) this.f37562b;
                w9Var2.setVisibility(8);
                w9Var2.setImageDrawable(null);
                w9Var2.setAlpha(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37561a) {
            case 2:
                i8 i8Var = (i8) this.f37562b;
                for (int i10 = 0; i10 < i8Var.f34446b.getChildCount(); i10++) {
                    f8.a((f8) i8Var.f34446b.getChildAt(i10), i8Var.P, i8Var.Q);
                }
                return;
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                ((u01) ((org.telegram.ui.Cells.j) this.f37562b)).f37843c0.e.f31497c.f42920r = true;
                return;
        }
    }

    public t4(zq zqVar, s4.o0 o0Var) {
        this.f37561a = 25;
        this.f37562b = zqVar;
    }
}
