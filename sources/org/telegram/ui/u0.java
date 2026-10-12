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
public final class u0 extends AnimatorListenerAdapter {
    public final int f40511a;
    public final Object f40512b;

    public u0(Object obj, int i10) {
        this.f40511a = i10;
        this.f40512b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f40511a) {
            case 14:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f40512b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 27:
                tq tqVar = (tq) this.f40512b;
                org.telegram.ui.Components.ds dsVar = tqVar.h;
                if (tqVar.H) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                dsVar.b(f7);
                tqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f40511a) {
            case 0:
                k4 k4Var = (k4) this.f40512b;
                Runnable runnable = k4Var.f37537a0;
                if (runnable != null) {
                    runnable.run();
                    k4Var.f37537a0 = null;
                    return;
                }
                return;
            case 1:
                x3 x3Var = (x3) this.f40512b;
                x3Var.f41735w = 1.0f;
                x3Var.n();
                x3Var.i();
                x3Var.h();
                x3Var.f41728a.unlock();
                return;
            case 2:
                v4 v4Var = (v4) this.f40512b;
                v4Var.getClass();
                v4Var.setVisibility(8);
                return;
            case 3:
                y4 y4Var = (y4) this.f40512b;
                y4Var.f42027c = false;
                y4Var.invalidate();
                return;
            case 4:
                ((z5) this.f40512b).f42484f0.setVisibility(8);
                return;
            case 5:
            case 27:
            default:
                super.onAnimationEnd(animator);
                return;
            case 6:
                ((z9) this.f40512b).v = null;
                return;
            case 7:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f40512b;
                ((a11) jVar).f34013c0.e.f32543c.f44829r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f40512b;
                Button button = wVar.f22595n;
                org.telegram.ui.Components.yi0 yi0Var = wVar.f22594f;
                if (button == yi0Var) {
                    wVar.e.setVisibility(4);
                    return;
                } else {
                    yi0Var.setVisibility(4);
                    return;
                }
            case 9:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.f0) this.f40512b).f21148x = null;
                return;
            case 10:
                ((org.telegram.ui.Cells.g4) this.f40512b).G = null;
                return;
            case 11:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f40512b;
                if (animator.equals(t5Var.f22089n)) {
                    t5Var.f22089n = null;
                    return;
                }
                return;
            case 12:
                androidx.activity.i iVar = (androidx.activity.i) this.f40512b;
                if (animator.equals(((org.telegram.ui.Cells.v5) iVar.f1031b).d)) {
                    ((org.telegram.ui.Cells.v5) iVar.f1031b).d = null;
                    return;
                }
                return;
            case 13:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.f40512b).e, 1000L);
                return;
            case 14:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f40512b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f40512b;
                t7Var.f22113n.isMediaSpoilersRevealedInSharedMedia = true;
                t7Var.invalidate();
                return;
            case 16:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.da daVar = (org.telegram.ui.Cells.da) this.f40512b;
                ((org.telegram.ui.Cells.ea) daVar.f21091b).f21127a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ea) daVar.f21091b).f21127a.getTransitionParams().f21989g = false;
                ((org.telegram.ui.Cells.ea) daVar.f21091b).f21127a.getTransitionParams().K1 = 1.0f;
                return;
            case 17:
                k3 k3Var = (k3) this.f40512b;
                if (animator.equals(((ac) k3Var.f37501b).R)) {
                    ((ac) k3Var.f37501b).R = null;
                    return;
                }
                return;
            case 18:
                ac acVar = (ac) this.f40512b;
                if (animator.equals(acVar.R)) {
                    acVar.R = null;
                    return;
                }
                return;
            case 19:
                ((ic) this.f40512b).I.setVisibility(8);
                return;
            case 20:
                hd hdVar = (hd) this.f40512b;
                rc rcVar = hdVar.m0;
                if (rcVar != null) {
                    if (rcVar.getParent() != null) {
                        ((ViewGroup) hdVar.m0.getParent()).removeView(hdVar.m0);
                    }
                    hdVar.m0 = null;
                }
                hdVar.f36742o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 21:
                gi giVar = (gi) this.f40512b;
                if (giVar.f36404a) {
                    giVar.d.setTranslationY(0.0f);
                }
                if (giVar.f36405b) {
                    giVar.e.setTranslationY(0.0f);
                }
                if (giVar.f36407f) {
                    giVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.z9 z9Var = giVar.f36406c;
                if (z9Var != null) {
                    z9Var.setTranslationY(0.0f);
                }
                giVar.f36408n.H2[1] = null;
                return;
            case 22:
                sk skVar = (sk) this.f40512b;
                skVar.setAnimatedTop(0);
                View view = skVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    skVar.G1.setTranslationY(((1.0f - skVar.getTopViewEnterProgress()) * skVar.G1.getLayoutParams().height) + skVar.T1);
                }
                skVar.f40170r5.p9 = null;
                return;
            case 23:
                org.telegram.ui.Components.v40 v40Var = ((bj) this.f40512b).f34586b.f35925e2;
                if (v40Var != null) {
                    v40Var.setVisibility(8);
                    return;
                }
                return;
            case 24:
                bi.t tVar = (bi.t) this.f40512b;
                org.telegram.ui.Components.u60 u60Var = ((rm) ((lm) tVar.f3719c).f38050c).Q.f35887b3;
                if (u60Var != null) {
                    u60Var.setIsMessageTransition(false);
                    ((rm) ((lm) tVar.f3719c).f38050c).Q.f35887b3.c(true);
                    ((rm) ((lm) tVar.f3719c).f38050c).Q.f35887b3.setVisibility(4);
                    return;
                }
                return;
            case 25:
                qm qmVar = (qm) this.f40512b;
                rm rmVar = qmVar.f39495b;
                ArrayList arrayList = rmVar.Q.f36039n6;
                org.telegram.ui.Cells.u1 u1Var = qmVar.f39494a;
                arrayList.remove(u1Var);
                View view2 = rmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    rmVar.Q.f36160x0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f22061x0 = false;
                return;
            case 26:
                dq dqVar = (dq) this.f40512b;
                dqVar.L = 0.0f;
                dqVar.K = 1.0f;
                View view3 = dqVar.f35346a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                dqVar.T.invalidate();
                gj gjVar = dqVar.Y;
                if (gjVar != null) {
                    gjVar.run();
                    dqVar.Y = null;
                    return;
                }
                return;
            case 28:
                fr frVar = (fr) this.f40512b;
                View view4 = frVar.f36216b;
                view4.setAlpha(1.0f);
                s4.n0.x0(view4);
                ((yr) frVar.d).f42218c.removeView(view4);
                return;
            case 29:
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f40512b;
                j6Var.d = null;
                j6Var.f26196b.clear();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40511a) {
            case 2:
                ((v4) this.f40512b).setVisibility(0);
                return;
            case 5:
                l8 l8Var = (l8) this.f40512b;
                for (int i10 = 0; i10 < l8Var.f37868b.getChildCount(); i10++) {
                    i8.a((i8) l8Var.f37868b.getChildAt(i10), l8Var.P, l8Var.Q);
                }
                return;
            case 7:
                ((a11) ((org.telegram.ui.Cells.j) this.f40512b)).f34013c0.e.f32543c.f44829r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public u0(fr frVar, s4.n0 n0Var) {
        this.f40511a = 28;
        this.f40512b = frVar;
    }
}
