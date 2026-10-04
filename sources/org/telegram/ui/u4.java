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
    public final int f41045a;
    public final Object f41046b;

    public u4(Object obj, int i10) {
        this.f41045a = i10;
        this.f41046b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f41045a) {
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f41046b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 24:
                mq mqVar = (mq) this.f41046b;
                org.telegram.ui.Components.sr srVar = mqVar.h;
                if (mqVar.H) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                srVar.b(f7);
                mqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f41045a) {
            case 0:
                v4 v4Var = (v4) this.f41046b;
                v4Var.f41551c = false;
                v4Var.invalidate();
                return;
            case 1:
                ((w5) this.f41046b).f41908f0.setVisibility(8);
                return;
            case 2:
            case 24:
            default:
                super.onAnimationEnd(animator);
                return;
            case 3:
                ((w9) this.f41046b).f41973s = null;
                return;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f41046b;
                ((n01) jVar).f38795c0.f40318e.f34217c.f46515r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f41046b;
                Button button = wVar.f23587n;
                org.telegram.ui.Components.ki0 ki0Var = wVar.f23586f;
                if (button == ki0Var) {
                    wVar.f23585e.setVisibility(4);
                    return;
                } else {
                    ki0Var.setVisibility(4);
                    return;
                }
            case 6:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f41046b).f22012x = null;
                return;
            case 7:
                ((org.telegram.ui.Cells.g4) this.f41046b).G = null;
                return;
            case 8:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f41046b;
                if (animator.equals(t5Var.f23060n)) {
                    t5Var.f23060n = null;
                    return;
                }
                return;
            case 9:
                ai.q4 q4Var = (ai.q4) this.f41046b;
                if (animator.equals(((org.telegram.ui.Cells.v5) q4Var.f1543b).d)) {
                    ((org.telegram.ui.Cells.v5) q4Var.f1543b).d = null;
                    return;
                }
                return;
            case 10:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.f41046b).f23556e, 1000L);
                return;
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f41046b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f41046b;
                t7Var.f23085n.isMediaSpoilersRevealedInSharedMedia = true;
                t7Var.invalidate();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) this.f41046b;
                ((org.telegram.ui.Cells.ga) faVar.f22114b).f22178a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ga) faVar.f22114b).f22178a.getTransitionParams().f22958g = false;
                ((org.telegram.ui.Cells.ga) faVar.f22114b).f22178a.getTransitionParams().K1 = 1.0f;
                return;
            case 14:
                i3 i3Var = (i3) this.f41046b;
                if (animator.equals(((wb) i3Var.f37227b).R)) {
                    ((wb) i3Var.f37227b).R = null;
                    return;
                }
                return;
            case 15:
                wb wbVar = (wb) this.f41046b;
                if (animator.equals(wbVar.R)) {
                    wbVar.R = null;
                    return;
                }
                return;
            case 16:
                ((dc) this.f41046b).H.setVisibility(8);
                return;
            case 17:
                cd cdVar = (cd) this.f41046b;
                mc mcVar = cdVar.m0;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) cdVar.m0.getParent()).removeView(cdVar.m0);
                    }
                    cdVar.m0 = null;
                }
                cdVar.f35428o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                jk jkVar = (jk) this.f41046b;
                jkVar.setAnimatedTop(0);
                View view = jkVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    jkVar.G1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.G1.getLayoutParams().height) + jkVar.T1);
                }
                jkVar.f37714r5.f43435n9 = null;
                return;
            case 19:
                org.telegram.ui.Components.m40 m40Var = ((vi) this.f41046b).f41757b.f43292c2;
                if (m40Var != null) {
                    m40Var.setVisibility(8);
                    return;
                }
                return;
            case 20:
                wl wlVar = (wl) this.f41046b;
                if (wlVar.f42520a) {
                    wlVar.d.setTranslationY(0.0f);
                }
                if (wlVar.f42521b) {
                    wlVar.f42523e.setTranslationY(0.0f);
                }
                if (wlVar.f42524f) {
                    wlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.w9 w9Var = wlVar.f42522c;
                if (w9Var != null) {
                    w9Var.setTranslationY(0.0f);
                }
                wlVar.f42525n.F2[1] = null;
                return;
            case 21:
                ai.z zVar = (ai.z) this.f41046b;
                org.telegram.ui.Components.k60 k60Var = ((jm) ((dm) zVar.f1924c).f35808c).Q.Z2;
                if (k60Var != null) {
                    k60Var.setIsMessageTransition(false);
                    ((jm) ((dm) zVar.f1924c).f35808c).Q.Z2.c(true);
                    ((jm) ((dm) zVar.f1924c).f35808c).Q.Z2.setVisibility(4);
                    return;
                }
                return;
            case 22:
                im imVar = (im) this.f41046b;
                jm jmVar = imVar.f37460b;
                ArrayList arrayList = jmVar.Q.f43406l6;
                org.telegram.ui.Cells.u1 u1Var = imVar.f37459a;
                arrayList.remove(u1Var);
                View view2 = jmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    jmVar.Q.f43526v0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f23030x0 = false;
                return;
            case 23:
                wp wpVar = (wp) this.f41046b;
                wpVar.L = 0.0f;
                wpVar.K = 1.0f;
                View view3 = wpVar.f42551a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                wpVar.T.invalidate();
                bj bjVar = wpVar.Y;
                if (bjVar != null) {
                    bjVar.run();
                    wpVar.Y = null;
                    return;
                }
                return;
            case 25:
                yq yqVar = (yq) this.f41046b;
                View view4 = yqVar.f43599b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((rr) yqVar.d).f40190c.removeView(view4);
                return;
            case 26:
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f41046b;
                h6Var.d = null;
                h6Var.f27024b.clear();
                return;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f41046b;
                animatedPhoneNumberEditText.f23841n = null;
                animatedPhoneNumberEditText.f23840f.clear();
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f41046b;
                o6Var.c();
                o6Var.f29247k = null;
                o6Var.h = 0.0f;
                o6Var.f29249m = 0.0f;
                o6Var.invalidateSelf();
                Runnable runnable = o6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                o6Var.f29251o = null;
                CharSequence charSequence = o6Var.f29252p;
                if (charSequence != null) {
                    o6Var.q(charSequence, true, o6Var.f29253q);
                    o6Var.f29252p = null;
                    o6Var.f29253q = false;
                    return;
                }
                org.telegram.ui.Components.qg qgVar = o6Var.C;
                if (qgVar != null) {
                    qgVar.run();
                    return;
                }
                return;
            case 29:
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) this.f41046b;
                w9Var2.setVisibility(8);
                w9Var2.setImageDrawable(null);
                w9Var2.setAlpha(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41045a) {
            case 2:
                k8 k8Var = (k8) this.f41046b;
                for (int i10 = 0; i10 < k8Var.f37855b.getChildCount(); i10++) {
                    h8.a((h8) k8Var.f37855b.getChildAt(i10), k8Var.P, k8Var.Q);
                }
                return;
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                ((n01) ((org.telegram.ui.Cells.j) this.f41046b)).f38795c0.f40318e.f34217c.f46515r = true;
                return;
        }
    }

    public u4(yq yqVar, s4.o0 o0Var) {
        this.f41045a = 25;
        this.f41046b = yqVar;
    }
}
