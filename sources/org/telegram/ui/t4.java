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
    public final int f37650a;
    public final Object f37651b;

    public t4(Object obj, int i10) {
        this.f37650a = i10;
        this.f37651b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f37650a) {
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f37651b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 24:
                pq pqVar = (pq) this.f37651b;
                org.telegram.ui.Components.pr prVar = pqVar.h;
                if (pqVar.H) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                prVar.b(f7);
                pqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f37650a) {
            case 0:
                u4 u4Var = (u4) this.f37651b;
                u4Var.f37940c = false;
                u4Var.invalidate();
                return;
            case 1:
                ((v5) this.f37651b).f38286f0.setVisibility(8);
                return;
            case 2:
            case 24:
            default:
                super.onAnimationEnd(animator);
                return;
            case 3:
                ((w9) this.f37651b).f38616s = null;
                return;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f37651b;
                ((w01) jVar).f38545c0.e.f31270c.f42693r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f37651b;
                Button button = wVar.f21505n;
                org.telegram.ui.Components.yh0 yh0Var = wVar.f21504f;
                if (button == yh0Var) {
                    wVar.e.setVisibility(4);
                    return;
                } else {
                    yh0Var.setVisibility(4);
                    return;
                }
            case 6:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f37651b).f20014x = null;
                return;
            case 7:
                ((org.telegram.ui.Cells.f4) this.f37651b).G = null;
                return;
            case 8:
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) this.f37651b;
                if (animator.equals(s5Var.f20964n)) {
                    s5Var.f20964n = null;
                    return;
                }
                return;
            case 9:
                ai.q4 q4Var = (ai.q4) this.f37651b;
                if (animator.equals(((org.telegram.ui.Cells.u5) q4Var.f1422b).d)) {
                    ((org.telegram.ui.Cells.u5) q4Var.f1422b).d = null;
                    return;
                }
                return;
            case 10:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.u5) this.f37651b).e, 1000L);
                return;
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f37651b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f37651b;
                t7Var.f21398n.isMediaSpoilersRevealedInSharedMedia = true;
                t7Var.invalidate();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) this.f37651b;
                ((org.telegram.ui.Cells.ga) faVar.f20124b).f20168a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ga) faVar.f20124b).f20168a.getTransitionParams().f20865g = false;
                ((org.telegram.ui.Cells.ga) faVar.f20124b).f20168a.getTransitionParams().K1 = 1.0f;
                return;
            case 14:
                h3 h3Var = (h3) this.f37651b;
                if (animator.equals(((wb) h3Var.f34123b).R)) {
                    ((wb) h3Var.f34123b).R = null;
                    return;
                }
                return;
            case 15:
                wb wbVar = (wb) this.f37651b;
                if (animator.equals(wbVar.R)) {
                    wbVar.R = null;
                    return;
                }
                return;
            case 16:
                ((ec) this.f37651b).I.setVisibility(8);
                return;
            case 17:
                cd cdVar = (cd) this.f37651b;
                nc ncVar = cdVar.m0;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) cdVar.m0.getParent()).removeView(cdVar.m0);
                    }
                    cdVar.m0 = null;
                }
                cdVar.f32746o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                nk nkVar = (nk) this.f37651b;
                nkVar.setAnimatedTop(0);
                View view = nkVar.F1;
                if (view != null && view.getVisibility() == 0) {
                    nkVar.F1.setTranslationY(((1.0f - nkVar.getTopViewEnterProgress()) * nkVar.F1.getLayoutParams().height) + nkVar.S1);
                }
                nkVar.f36127r5.f32411p9 = null;
                return;
            case 19:
                org.telegram.ui.Components.i40 i40Var = ((yi) this.f37651b).f39928b.f32272e2;
                if (i40Var != null) {
                    i40Var.setVisibility(8);
                    return;
                }
                return;
            case 20:
                am amVar = (am) this.f37651b;
                if (amVar.f31927a) {
                    amVar.d.setTranslationY(0.0f);
                }
                if (amVar.f31928b) {
                    amVar.e.setTranslationY(0.0f);
                }
                if (amVar.f31930f) {
                    amVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.u9 u9Var = amVar.f31929c;
                if (u9Var != null) {
                    u9Var.setTranslationY(0.0f);
                }
                amVar.f31931n.H2[1] = null;
                return;
            case 21:
                hm hmVar = (hm) ((ai.z) this.f37651b).f1775c;
                gl glVar = ((nm) hmVar.f34309c).Q.f32234b3;
                if (glVar != null) {
                    glVar.setIsMessageTransition(false);
                    ((nm) hmVar.f34309c).Q.f32234b3.h(true);
                    ((nm) hmVar.f34309c).Q.f32234b3.setVisibility(4);
                    return;
                }
                return;
            case 22:
                mm mmVar = (mm) this.f37651b;
                nm nmVar = mmVar.f35845b;
                ArrayList arrayList = nmVar.Q.f32386n6;
                org.telegram.ui.Cells.t1 t1Var = mmVar.f35844a;
                arrayList.remove(t1Var);
                View view2 = nmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    nmVar.Q.f32506x0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f20936x0 = false;
                return;
            case 23:
                zp zpVar = (zp) this.f37651b;
                zpVar.L = 0.0f;
                zpVar.K = 1.0f;
                View view3 = zpVar.f40299a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                zpVar.T.invalidate();
                ej ejVar = zpVar.Y;
                if (ejVar != null) {
                    ejVar.run();
                    zpVar.Y = null;
                    return;
                }
                return;
            case 25:
                br brVar = (br) this.f37651b;
                View view4 = brVar.f32564b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((ur) brVar.d).f38128c.removeView(view4);
                return;
            case 26:
                org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) this.f37651b;
                f6Var.d = null;
                f6Var.f23792b.clear();
                return;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f37651b;
                animatedPhoneNumberEditText.f21737n = null;
                animatedPhoneNumberEditText.f21736f.clear();
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.m6 m6Var = (org.telegram.ui.Components.m6) this.f37651b;
                m6Var.c();
                m6Var.f26076k = null;
                m6Var.h = 0.0f;
                m6Var.f26078m = 0.0f;
                m6Var.invalidateSelf();
                Runnable runnable = m6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                m6Var.f26080o = null;
                CharSequence charSequence = m6Var.f26081p;
                if (charSequence != null) {
                    m6Var.q(charSequence, true, m6Var.f26082q);
                    m6Var.f26081p = null;
                    m6Var.f26082q = false;
                    return;
                }
                org.telegram.ui.Components.ng ngVar = m6Var.C;
                if (ngVar != null) {
                    ngVar.run();
                    return;
                }
                return;
            case 29:
                org.telegram.ui.Components.u9 u9Var2 = (org.telegram.ui.Components.u9) this.f37651b;
                u9Var2.setVisibility(8);
                u9Var2.setImageDrawable(null);
                u9Var2.setAlpha(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37650a) {
            case 2:
                j8 j8Var = (j8) this.f37651b;
                for (int i10 = 0; i10 < j8Var.f34798b.getChildCount(); i10++) {
                    g8.a((g8) j8Var.f34798b.getChildAt(i10), j8Var.P, j8Var.Q);
                }
                return;
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                ((w01) ((org.telegram.ui.Cells.j) this.f37651b)).f38545c0.e.f31270c.f42693r = true;
                return;
        }
    }

    public t4(br brVar, s4.o0 o0Var) {
        this.f37650a = 25;
        this.f37651b = brVar;
    }
}
