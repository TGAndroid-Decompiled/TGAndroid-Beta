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
    public final int f37963a;
    public final Object f37964b;

    public t4(Object obj, int i10) {
        this.f37963a = i10;
        this.f37964b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f37963a) {
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f37964b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 24:
                kq kqVar = (kq) this.f37964b;
                org.telegram.ui.Components.qr qrVar = kqVar.h;
                if (kqVar.H) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                qrVar.b(f7);
                kqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f37963a) {
            case 0:
                u4 u4Var = (u4) this.f37964b;
                u4Var.f38310c = false;
                u4Var.invalidate();
                return;
            case 1:
                ((v5) this.f37964b).f38642f0.setVisibility(8);
                return;
            case 2:
            case 24:
            default:
                super.onAnimationEnd(animator);
                return;
            case 3:
                ((u9) this.f37964b).f38367s = null;
                return;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f37964b;
                ((l01) jVar).f35205c0.e.f31540c.f42952r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f37964b;
                Button button = wVar.f21714n;
                org.telegram.ui.Components.ii0 ii0Var = wVar.f21713f;
                if (button == ii0Var) {
                    wVar.e.setVisibility(4);
                    return;
                } else {
                    ii0Var.setVisibility(4);
                    return;
                }
            case 6:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f37964b).f20222x = null;
                return;
            case 7:
                ((org.telegram.ui.Cells.g4) this.f37964b).G = null;
                return;
            case 8:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f37964b;
                if (animator.equals(t5Var.f21203n)) {
                    t5Var.f21203n = null;
                    return;
                }
                return;
            case 9:
                ai.q4 q4Var = (ai.q4) this.f37964b;
                if (animator.equals(((org.telegram.ui.Cells.v5) q4Var.f1420b).d)) {
                    ((org.telegram.ui.Cells.v5) q4Var.f1420b).d = null;
                    return;
                }
                return;
            case 10:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.f37964b).e, 1000L);
                return;
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f37964b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f37964b;
                t7Var.f21227n.isMediaSpoilersRevealedInSharedMedia = true;
                t7Var.invalidate();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) this.f37964b;
                ((org.telegram.ui.Cells.ga) faVar.f20317b).f20373a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ga) faVar.f20317b).f20373a.getTransitionParams().f21104g = false;
                ((org.telegram.ui.Cells.ga) faVar.f20317b).f20373a.getTransitionParams().K1 = 1.0f;
                return;
            case 14:
                i3 i3Var = (i3) this.f37964b;
                if (animator.equals(((ub) i3Var.f34359b).R)) {
                    ((ub) i3Var.f34359b).R = null;
                    return;
                }
                return;
            case 15:
                ub ubVar = (ub) this.f37964b;
                if (animator.equals(ubVar.R)) {
                    ubVar.R = null;
                    return;
                }
                return;
            case 16:
                ((bc) this.f37964b).I.setVisibility(8);
                return;
            case 17:
                ad adVar = (ad) this.f37964b;
                kc kcVar = adVar.m0;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) adVar.m0.getParent()).removeView(adVar.m0);
                    }
                    adVar.m0 = null;
                }
                adVar.f32118o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                jk jkVar = (jk) this.f37964b;
                jkVar.setAnimatedTop(0);
                View view = jkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    jkVar.G1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.G1.getLayoutParams().height) + jkVar.T1);
                }
                jkVar.f34820r5.f39601p9 = null;
                return;
            case 19:
                org.telegram.ui.Components.j40 j40Var = ((ui) this.f37964b).f38487b.f39463e2;
                if (j40Var != null) {
                    j40Var.setVisibility(8);
                    return;
                }
                return;
            case 20:
                wl wlVar = (wl) this.f37964b;
                if (wlVar.f39397a) {
                    wlVar.d.setTranslationY(0.0f);
                }
                if (wlVar.f39398b) {
                    wlVar.e.setTranslationY(0.0f);
                }
                if (wlVar.f39400f) {
                    wlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.w9 w9Var = wlVar.f39399c;
                if (w9Var != null) {
                    w9Var.setTranslationY(0.0f);
                }
                wlVar.f39401n.H2[1] = null;
                return;
            case 21:
                ai.z zVar = (ai.z) this.f37964b;
                org.telegram.ui.Components.h60 h60Var = ((jm) ((dm) zVar.f1769c).f33159c).Q.f39425b3;
                if (h60Var != null) {
                    h60Var.setIsMessageTransition(false);
                    ((jm) ((dm) zVar.f1769c).f33159c).Q.f39425b3.c(true);
                    ((jm) ((dm) zVar.f1769c).f33159c).Q.f39425b3.setVisibility(4);
                    return;
                }
                return;
            case 22:
                im imVar = (im) this.f37964b;
                jm jmVar = imVar.f34544b;
                ArrayList arrayList = jmVar.Q.f39576n6;
                org.telegram.ui.Cells.u1 u1Var = imVar.f34543a;
                arrayList.remove(u1Var);
                View view2 = jmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    jmVar.Q.f39696x0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f21175x0 = false;
                return;
            case 23:
                up upVar = (up) this.f37964b;
                upVar.L = 0.0f;
                upVar.K = 1.0f;
                View view3 = upVar.f38522a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                upVar.T.invalidate();
                aj ajVar = upVar.Y;
                if (ajVar != null) {
                    ajVar.run();
                    upVar.Y = null;
                    return;
                }
                return;
            case 25:
                wq wqVar = (wq) this.f37964b;
                View view4 = wqVar.f39742b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((pr) wqVar.d).f36616c.removeView(view4);
                return;
            case 26:
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f37964b;
                h6Var.d = null;
                h6Var.f24643b.clear();
                return;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f37964b;
                animatedPhoneNumberEditText.f21947n = null;
                animatedPhoneNumberEditText.f21946f.clear();
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f37964b;
                o6Var.c();
                o6Var.f26936k = null;
                o6Var.h = 0.0f;
                o6Var.f26938m = 0.0f;
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                o6Var.f26940o = null;
                CharSequence charSequence = o6Var.f26941p;
                if (charSequence != null) {
                    o6Var.q(charSequence, true, o6Var.f26942q);
                    o6Var.f26941p = null;
                    o6Var.f26942q = false;
                    return;
                }
                org.telegram.ui.Components.pg pgVar = o6Var.C;
                if (pgVar != null) {
                    pgVar.run();
                    return;
                }
                return;
            case 29:
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) this.f37964b;
                w9Var2.setVisibility(8);
                w9Var2.setImageDrawable(null);
                w9Var2.setAlpha(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37963a) {
            case 2:
                h8 h8Var = (h8) this.f37964b;
                for (int i10 = 0; i10 < h8Var.f34140b.getChildCount(); i10++) {
                    e8.a((e8) h8Var.f34140b.getChildAt(i10), h8Var.P, h8Var.Q);
                }
                return;
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                ((l01) ((org.telegram.ui.Cells.j) this.f37964b)).f35205c0.e.f31540c.f42952r = true;
                return;
        }
    }

    public t4(wq wqVar, s4.o0 o0Var) {
        this.f37963a = 25;
        this.f37964b = wqVar;
    }
}
