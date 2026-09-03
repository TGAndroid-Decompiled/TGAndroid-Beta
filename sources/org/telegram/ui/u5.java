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
public final class u5 extends AnimatorListenerAdapter {
    public final int f38695a;
    public final Object f38696b;

    public u5(Object obj, int i10) {
        this.f38695a = i10;
        this.f38696b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f10;
        switch (this.f38695a) {
            case 10:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.f38696b;
                AnimatorSet animatorSet = n7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    n7Var.h = null;
                    return;
                }
                return;
            case 23:
                lq lqVar = (lq) this.f38696b;
                org.telegram.ui.Components.lr lrVar = lqVar.h;
                if (lqVar.E) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                lrVar.b(f10);
                lqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f38695a) {
            case 0:
                ((a6) this.f38696b).f32469c0.setVisibility(8);
                return;
            case 1:
            case 23:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                ((x9) this.f38696b).f39934s = null;
                return;
            case 3:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f38696b;
                ((i01) jVar).W.e.f32017c.f5723r = false;
                FrameLayout frameLayout = jVar.G;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.H);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f38696b;
                Button button = wVar.f22487n;
                org.telegram.ui.Components.fi0 fi0Var = wVar.f22486f;
                if (button == fi0Var) {
                    wVar.e.setVisibility(4);
                    return;
                } else {
                    fi0Var.setVisibility(4);
                    return;
                }
            case 5:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f38696b).f20980x = null;
                return;
            case 6:
                ((org.telegram.ui.Cells.f4) this.f38696b).D = null;
                return;
            case 7:
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) this.f38696b;
                if (animator.equals(s5Var.f22288n)) {
                    s5Var.f22288n = null;
                    return;
                }
                return;
            case 8:
                m2.b bVar = (m2.b) this.f38696b;
                if (animator.equals(((org.telegram.ui.Cells.u5) bVar.f13698b).d)) {
                    ((org.telegram.ui.Cells.u5) bVar.f13698b).d = null;
                    return;
                }
                return;
            case 9:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.u5) this.f38696b).e, 1000L);
                return;
            case 10:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.f38696b;
                AnimatorSet animatorSet = n7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    n7Var.h = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f38696b;
                q7Var.f21714n.isMediaSpoilersRevealedInSharedMedia = true;
                q7Var.invalidate();
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) this.f38696b;
                ((org.telegram.ui.Cells.ba) aaVar.f20822b).f20862a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ba) aaVar.f20822b).f20862a.getTransitionParams().f21773g = false;
                ((org.telegram.ui.Cells.ba) aaVar.f20822b).f20862a.getTransitionParams().K1 = 1.0f;
                return;
            case 13:
                n3 n3Var = (n3) this.f38696b;
                if (animator.equals(((ub) n3Var.f36330b).S)) {
                    ((ub) n3Var.f36330b).S = null;
                    return;
                }
                return;
            case 14:
                ub ubVar = (ub) this.f38696b;
                if (animator.equals(ubVar.S)) {
                    ubVar.S = null;
                    return;
                }
                return;
            case 15:
                ((cc) this.f38696b).F.setVisibility(8);
                return;
            case 16:
                dd ddVar = (dd) this.f38696b;
                mc mcVar = ddVar.f33429j0;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) ddVar.f33429j0.getParent()).removeView(ddVar.f33429j0);
                    }
                    ddVar.f33429j0 = null;
                }
                ddVar.f33431l0 = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                lk lkVar = (lk) this.f38696b;
                lkVar.setAnimatedTop(0);
                View view = lkVar.C1;
                if (view != null && view.getVisibility() == 0) {
                    lkVar.C1.setTranslationY(((1.0f - lkVar.getTopViewEnterProgress()) * lkVar.C1.getLayoutParams().height) + lkVar.P1);
                }
                lkVar.f35794n5.m9 = null;
                return;
            case 18:
                org.telegram.ui.Components.l40 l40Var = ((vi) this.f38696b).f39116b.f40526b2;
                if (l40Var != null) {
                    l40Var.setVisibility(8);
                    return;
                }
                return;
            case 19:
                zl zlVar = (zl) this.f38696b;
                if (zlVar.f40497a) {
                    zlVar.d.setTranslationY(0.0f);
                }
                if (zlVar.f40498b) {
                    zlVar.e.setTranslationY(0.0f);
                }
                if (zlVar.f40500f) {
                    zlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.p9 p9Var = zlVar.f40499c;
                if (p9Var != null) {
                    p9Var.setTranslationY(0.0f);
                }
                zlVar.f40501n.E2[1] = null;
                return;
            case 20:
                hh.f fVar = (hh.f) ((dg.y2) this.f38696b).f4867c;
                fl flVar = ((lm) fVar.f7117c).N.Y2;
                if (flVar != null) {
                    flVar.setIsMessageTransition(false);
                    ((lm) fVar.f7117c).N.Y2.h(true);
                    ((lm) fVar.f7117c).N.Y2.setVisibility(4);
                    return;
                }
                return;
            case 21:
                km kmVar = (km) this.f38696b;
                lm lmVar = kmVar.f35557b;
                ArrayList arrayList = lmVar.N.f40643k6;
                org.telegram.ui.Cells.s1 s1Var = kmVar.f35556a;
                arrayList.remove(s1Var);
                View view2 = lmVar.N.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    lmVar.N.f40759u0.invalidate();
                }
                s1Var.setAlpha(1.0f);
                s1Var.getTransitionParams().f21845x0 = false;
                return;
            case 22:
                vp vpVar = (vp) this.f38696b;
                vpVar.I = 0.0f;
                vpVar.H = 1.0f;
                View view3 = vpVar.X;
                if (view3 != null) {
                    view3.invalidate();
                }
                vpVar.Q.invalidate();
                bj bjVar = vpVar.V;
                if (bjVar != null) {
                    bjVar.run();
                    vpVar.V = null;
                    return;
                }
                return;
            case 24:
                xq xqVar = (xq) this.f38696b;
                View view4 = xqVar.f40052b;
                view4.setAlpha(1.0f);
                f2.v0.x0(view4);
                ((rr) xqVar.d).f37961c.removeView(view4);
                return;
            case 25:
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.f38696b;
                c6Var.d = null;
                c6Var.f23824b.clear();
                return;
            case 26:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f38696b;
                animatedPhoneNumberEditText.f22696n = null;
                animatedPhoneNumberEditText.f22695f.clear();
                return;
            case 27:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f38696b;
                j6Var.c();
                j6Var.f25853k = null;
                j6Var.h = 0.0f;
                j6Var.f25855m = 0.0f;
                j6Var.invalidateSelf();
                Runnable runnable = j6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                j6Var.f25857o = null;
                CharSequence charSequence = j6Var.f25858p;
                if (charSequence != null) {
                    j6Var.q(charSequence, true, j6Var.f25859q);
                    j6Var.f25858p = null;
                    j6Var.f25859q = false;
                    return;
                }
                org.telegram.ui.Components.fg fgVar = j6Var.C;
                if (fgVar != null) {
                    fgVar.run();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.p9 p9Var2 = (org.telegram.ui.Components.p9) this.f38696b;
                p9Var2.setVisibility(8);
                p9Var2.setImageDrawable(null);
                p9Var2.setAlpha(1.0f);
                return;
            case 29:
                org.telegram.ui.Components.w8 w8Var = ((org.telegram.ui.Components.k8) this.f38696b).f26203b;
                w8Var.f30176f = false;
                w8Var.e.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38695a) {
            case 1:
                l8 l8Var = (l8) this.f38696b;
                for (int i10 = 0; i10 < l8Var.f35674b.getChildCount(); i10++) {
                    i8.a((i8) l8Var.f35674b.getChildAt(i10), l8Var.M, l8Var.N);
                }
                return;
            case 2:
            default:
                super.onAnimationStart(animator);
                return;
            case 3:
                ((i01) ((org.telegram.ui.Cells.j) this.f38696b)).W.e.f32017c.f5723r = true;
                return;
        }
    }

    public u5(xq xqVar, f2.v0 v0Var) {
        this.f38695a = 24;
        this.f38696b = xqVar;
    }
}
