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
public final class s4 extends AnimatorListenerAdapter {
    public final int f41613a;
    public final Object f41614b;

    public s4(Object obj, int i10) {
        this.f41613a = i10;
        this.f41614b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f41613a) {
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f41614b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 24:
                nq nqVar = (nq) this.f41614b;
                org.telegram.ui.Components.hs hsVar = nqVar.h;
                if (nqVar.H) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                hsVar.b(f7);
                nqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f41613a) {
            case 0:
                t4 t4Var = (t4) this.f41614b;
                t4Var.f42092c = false;
                t4Var.invalidate();
                return;
            case 1:
                ((u5) this.f41614b).f42392f0.setVisibility(8);
                return;
            case 2:
            case 24:
            default:
                super.onAnimationEnd(animator);
                return;
            case 3:
                ((u9) this.f41614b).v = null;
                return;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f41614b;
                ((s01) jVar).f41587c0.f43950e.f34288c.f47773r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f41614b;
                Button button = wVar.f23603n;
                org.telegram.ui.Components.dj0 dj0Var = wVar.f23602f;
                if (button == dj0Var) {
                    wVar.f23601e.setVisibility(4);
                    return;
                } else {
                    dj0Var.setVisibility(4);
                    return;
                }
            case 6:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f41614b).f22046x = null;
                return;
            case 7:
                ((org.telegram.ui.Cells.g4) this.f41614b).G = null;
                return;
            case 8:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f41614b;
                if (animator.equals(t5Var.f23081n)) {
                    t5Var.f23081n = null;
                    return;
                }
                return;
            case 9:
                ai.r4 r4Var = (ai.r4) this.f41614b;
                if (animator.equals(((org.telegram.ui.Cells.v5) r4Var.f1654b).d)) {
                    ((org.telegram.ui.Cells.v5) r4Var.f1654b).d = null;
                    return;
                }
                return;
            case 10:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.f41614b).f23573e, 1000L);
                return;
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f41614b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f41614b;
                t7Var.f23106n.isMediaSpoilersRevealedInSharedMedia = true;
                t7Var.invalidate();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.da daVar = (org.telegram.ui.Cells.da) this.f41614b;
                ((org.telegram.ui.Cells.ea) daVar.f22024b).f22082a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ea) daVar.f22024b).f22082a.getTransitionParams().f22980g = false;
                ((org.telegram.ui.Cells.ea) daVar.f22024b).f22082a.getTransitionParams().K1 = 1.0f;
                return;
            case 14:
                h3 h3Var = (h3) this.f41614b;
                if (animator.equals(((ub) h3Var.f38270b).R)) {
                    ((ub) h3Var.f38270b).R = null;
                    return;
                }
                return;
            case 15:
                ub ubVar = (ub) this.f41614b;
                if (animator.equals(ubVar.R)) {
                    ubVar.R = null;
                    return;
                }
                return;
            case 16:
                ((bc) this.f41614b).I.setVisibility(8);
                return;
            case 17:
                ad adVar = (ad) this.f41614b;
                kc kcVar = adVar.m0;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) adVar.m0.getParent()).removeView(adVar.m0);
                    }
                    adVar.m0 = null;
                }
                adVar.f36057o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                ci ciVar = (ci) this.f41614b;
                if (ciVar.f36747a) {
                    ciVar.d.setTranslationY(0.0f);
                }
                if (ciVar.f36748b) {
                    ciVar.f36750e.setTranslationY(0.0f);
                }
                if (ciVar.f36751f) {
                    ciVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.y9 y9Var = ciVar.f36749c;
                if (y9Var != null) {
                    y9Var.setTranslationY(0.0f);
                }
                ciVar.f36752n.H2[1] = null;
                return;
            case 19:
                ok okVar = (ok) this.f41614b;
                okVar.setAnimatedTop(0);
                View view = okVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    okVar.G1.setTranslationY(((1.0f - okVar.getTopViewEnterProgress()) * okVar.G1.getLayoutParams().height) + okVar.T1);
                }
                okVar.f40594r5.f44927p9 = null;
                return;
            case 20:
                org.telegram.ui.Components.a50 a50Var = ((xi) this.f41614b).f44115b.f44789e2;
                if (a50Var != null) {
                    a50Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                ai.z zVar = (ai.z) this.f41614b;
                org.telegram.ui.Components.y60 y60Var = ((mm) ((gm) zVar.f1996c).f38168c).Q.f44750b3;
                if (y60Var != null) {
                    y60Var.setIsMessageTransition(false);
                    ((mm) ((gm) zVar.f1996c).f38168c).Q.f44750b3.c(true);
                    ((mm) ((gm) zVar.f1996c).f38168c).Q.f44750b3.setVisibility(4);
                    return;
                }
                return;
            case 22:
                lm lmVar = (lm) this.f41614b;
                mm mmVar = lmVar.f39733b;
                ArrayList arrayList = mmVar.Q.f44902n6;
                org.telegram.ui.Cells.u1 u1Var = lmVar.f39732a;
                arrayList.remove(u1Var);
                View view2 = mmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    mmVar.Q.f45023x0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f23051x0 = false;
                return;
            case 23:
                xp xpVar = (xp) this.f41614b;
                xpVar.L = 0.0f;
                xpVar.K = 1.0f;
                View view3 = xpVar.f44164a0;
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
                zq zqVar = (zq) this.f41614b;
                View view4 = zqVar.f45093b;
                view4.setAlpha(1.0f);
                s4.p0.x0(view4);
                ((sr) zqVar.d).f41824c.removeView(view4);
                return;
            case 26:
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f41614b;
                j6Var.d = null;
                j6Var.f27617b.clear();
                return;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f41614b;
                animatedPhoneNumberEditText.f23872n = null;
                animatedPhoneNumberEditText.f23871f.clear();
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) this.f41614b;
                q6Var.b();
                q6Var.f30146o = null;
                q6Var.f30141j = 0.0f;
                q6Var.f30144m = 0.0f;
                q6Var.f30143l = 0.0f;
                q6Var.f30142k = 0.0f;
                q6Var.f30149r = 0.0f;
                q6Var.f30148q = 0.0f;
                q6Var.invalidateSelf();
                Runnable runnable = q6Var.f30135b0;
                if (runnable != null) {
                    runnable.run();
                }
                q6Var.f30151t = null;
                CharSequence charSequence = q6Var.f30152u;
                if (charSequence != null) {
                    q6Var.t(charSequence, true, q6Var.v);
                    q6Var.f30152u = null;
                    q6Var.v = false;
                    return;
                }
                org.telegram.ui.Components.rg rgVar = q6Var.I;
                if (rgVar != null) {
                    rgVar.run();
                    return;
                }
                return;
            case 29:
                org.telegram.ui.Components.y9 y9Var2 = (org.telegram.ui.Components.y9) this.f41614b;
                y9Var2.setVisibility(8);
                y9Var2.setImageDrawable(null);
                y9Var2.setAlpha(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41613a) {
            case 2:
                f8 f8Var = (f8) this.f41614b;
                for (int i10 = 0; i10 < f8Var.f37611b.getChildCount(); i10++) {
                    c8.a((c8) f8Var.f37611b.getChildAt(i10), f8Var.P, f8Var.Q);
                }
                return;
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                ((s01) ((org.telegram.ui.Cells.j) this.f41614b)).f41587c0.f43950e.f34288c.f47773r = true;
                return;
        }
    }

    public s4(zq zqVar, s4.p0 p0Var) {
        this.f41613a = 25;
        this.f41614b = zqVar;
    }
}
