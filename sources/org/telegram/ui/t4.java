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
    public final int f37557a;
    public final Object f37558b;

    public t4(Object obj, int i10) {
        this.f37557a = i10;
        this.f37558b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f37557a) {
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f37558b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 24:
                pq pqVar = (pq) this.f37558b;
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
        switch (this.f37557a) {
            case 0:
                u4 u4Var = (u4) this.f37558b;
                u4Var.f37803c = false;
                u4Var.invalidate();
                return;
            case 1:
                ((v5) this.f37558b).f38365f0.setVisibility(8);
                return;
            case 2:
            case 24:
            default:
                super.onAnimationEnd(animator);
                return;
            case 3:
                ((u9) this.f37558b).f37860s = null;
                return;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f37558b;
                ((v01) jVar).f38338c0.e.f31250c.f42662r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f37558b;
                Button button = wVar.f21481n;
                org.telegram.ui.Components.xh0 xh0Var = wVar.f21480f;
                if (button == xh0Var) {
                    wVar.e.setVisibility(4);
                    return;
                } else {
                    xh0Var.setVisibility(4);
                    return;
                }
            case 6:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f37558b).f19982x = null;
                return;
            case 7:
                ((org.telegram.ui.Cells.g4) this.f37558b).G = null;
                return;
            case 8:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f37558b;
                if (animator.equals(t5Var.f21341n)) {
                    t5Var.f21341n = null;
                    return;
                }
                return;
            case 9:
                ai.q4 q4Var = (ai.q4) this.f37558b;
                if (animator.equals(((org.telegram.ui.Cells.v5) q4Var.f1419b).d)) {
                    ((org.telegram.ui.Cells.v5) q4Var.f1419b).d = null;
                    return;
                }
                return;
            case 10:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.f37558b).e, 1000L);
                return;
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f37558b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f37558b;
                t7Var.f21373n.isMediaSpoilersRevealedInSharedMedia = true;
                t7Var.invalidate();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) this.f37558b;
                ((org.telegram.ui.Cells.ga) faVar.f20094b).f20145a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ga) faVar.f20094b).f20145a.getTransitionParams().f20843g = false;
                ((org.telegram.ui.Cells.ga) faVar.f20094b).f20145a.getTransitionParams().K1 = 1.0f;
                return;
            case 14:
                h3 h3Var = (h3) this.f37558b;
                if (animator.equals(((ub) h3Var.f34039b).R)) {
                    ((ub) h3Var.f34039b).R = null;
                    return;
                }
                return;
            case 15:
                ub ubVar = (ub) this.f37558b;
                if (animator.equals(ubVar.R)) {
                    ubVar.R = null;
                    return;
                }
                return;
            case 16:
                ((cc) this.f37558b).I.setVisibility(8);
                return;
            case 17:
                ad adVar = (ad) this.f37558b;
                lc lcVar = adVar.m0;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) adVar.m0.getParent()).removeView(adVar.m0);
                    }
                    adVar.m0 = null;
                }
                adVar.f31753o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                mk mkVar = (mk) this.f37558b;
                mkVar.setAnimatedTop(0);
                View view = mkVar.F1;
                if (view != null && view.getVisibility() == 0) {
                    mkVar.F1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.F1.getLayoutParams().height) + mkVar.S1);
                }
                mkVar.f35769r5.f32424p9 = null;
                return;
            case 19:
                org.telegram.ui.Components.i40 i40Var = ((xi) this.f37558b).f39636b.f32286e2;
                if (i40Var != null) {
                    i40Var.setVisibility(8);
                    return;
                }
                return;
            case 20:
                am amVar = (am) this.f37558b;
                if (amVar.f31850a) {
                    amVar.d.setTranslationY(0.0f);
                }
                if (amVar.f31851b) {
                    amVar.e.setTranslationY(0.0f);
                }
                if (amVar.f31853f) {
                    amVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.u9 u9Var = amVar.f31852c;
                if (u9Var != null) {
                    u9Var.setTranslationY(0.0f);
                }
                amVar.f31854n.H2[1] = null;
                return;
            case 21:
                hm hmVar = (hm) ((ai.z) this.f37558b).f1772c;
                gl glVar = ((nm) hmVar.f34325c).Q.f32248b3;
                if (glVar != null) {
                    glVar.setIsMessageTransition(false);
                    ((nm) hmVar.f34325c).Q.f32248b3.h(true);
                    ((nm) hmVar.f34325c).Q.f32248b3.setVisibility(4);
                    return;
                }
                return;
            case 22:
                mm mmVar = (mm) this.f37558b;
                nm nmVar = mmVar.f35774b;
                ArrayList arrayList = nmVar.Q.f32399n6;
                org.telegram.ui.Cells.t1 t1Var = mmVar.f35773a;
                arrayList.remove(t1Var);
                View view2 = nmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    nmVar.Q.f32519x0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f20914x0 = false;
                return;
            case 23:
                zp zpVar = (zp) this.f37558b;
                zpVar.L = 0.0f;
                zpVar.K = 1.0f;
                View view3 = zpVar.f40252a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                zpVar.T.invalidate();
                dj djVar = zpVar.Y;
                if (djVar != null) {
                    djVar.run();
                    zpVar.Y = null;
                    return;
                }
                return;
            case 25:
                br brVar = (br) this.f37558b;
                View view4 = brVar.f32569b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((ur) brVar.d).f38113c.removeView(view4);
                return;
            case 26:
                org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) this.f37558b;
                f6Var.d = null;
                f6Var.f23825b.clear();
                return;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f37558b;
                animatedPhoneNumberEditText.f21721n = null;
                animatedPhoneNumberEditText.f21720f.clear();
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.m6 m6Var = (org.telegram.ui.Components.m6) this.f37558b;
                m6Var.c();
                m6Var.f26091k = null;
                m6Var.h = 0.0f;
                m6Var.f26093m = 0.0f;
                m6Var.invalidateSelf();
                Runnable runnable = m6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                m6Var.f26095o = null;
                CharSequence charSequence = m6Var.f26096p;
                if (charSequence != null) {
                    m6Var.q(charSequence, true, m6Var.f26097q);
                    m6Var.f26096p = null;
                    m6Var.f26097q = false;
                    return;
                }
                org.telegram.ui.Components.ng ngVar = m6Var.C;
                if (ngVar != null) {
                    ngVar.run();
                    return;
                }
                return;
            case 29:
                org.telegram.ui.Components.u9 u9Var2 = (org.telegram.ui.Components.u9) this.f37558b;
                u9Var2.setVisibility(8);
                u9Var2.setImageDrawable(null);
                u9Var2.setAlpha(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37557a) {
            case 2:
                h8 h8Var = (h8) this.f37558b;
                for (int i10 = 0; i10 < h8Var.f34176b.getChildCount(); i10++) {
                    e8.a((e8) h8Var.f34176b.getChildAt(i10), h8Var.P, h8Var.Q);
                }
                return;
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                ((v01) ((org.telegram.ui.Cells.j) this.f37558b)).f38338c0.e.f31250c.f42662r = true;
                return;
        }
    }

    public t4(br brVar, s4.o0 o0Var) {
        this.f37557a = 25;
        this.f37558b = brVar;
    }
}
