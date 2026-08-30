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
public final class s5 extends AnimatorListenerAdapter {
    public final int f38195a;
    public final Object f38196b;

    public s5(Object obj, int i10) {
        this.f38195a = i10;
        this.f38196b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f10;
        switch (this.f38195a) {
            case 10:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.f38196b;
                AnimatorSet animatorSet = o7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o7Var.h = null;
                    return;
                }
                return;
            case 23:
                jq jqVar = (jq) this.f38196b;
                org.telegram.ui.Components.mr mrVar = jqVar.h;
                if (jqVar.E) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                mrVar.b(f10);
                jqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f38195a) {
            case 0:
                ((y5) this.f38196b).f40388c0.setVisibility(8);
                return;
            case 1:
            case 23:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                ((v9) this.f38196b).f39115s = null;
                return;
            case 3:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f38196b;
                ((b01) jVar).W.e.f32043c.f5734r = false;
                FrameLayout frameLayout = jVar.G;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.H);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f38196b;
                Button button = wVar.f22523n;
                org.telegram.ui.Components.ei0 ei0Var = wVar.f22522f;
                if (button == ei0Var) {
                    wVar.e.setVisibility(4);
                    return;
                } else {
                    ei0Var.setVisibility(4);
                    return;
                }
            case 5:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f38196b).f20981x = null;
                return;
            case 6:
                ((org.telegram.ui.Cells.g4) this.f38196b).D = null;
                return;
            case 7:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f38196b;
                if (animator.equals(t5Var.f22351n)) {
                    t5Var.f22351n = null;
                    return;
                }
                return;
            case 8:
                m2.b bVar = (m2.b) this.f38196b;
                if (animator.equals(((org.telegram.ui.Cells.v5) bVar.f13714b).d)) {
                    ((org.telegram.ui.Cells.v5) bVar.f13714b).d = null;
                    return;
                }
                return;
            case 9:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.f38196b).e, 1000L);
                return;
            case 10:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.f38196b;
                AnimatorSet animatorSet = o7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o7Var.h = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) this.f38196b;
                r7Var.f21781n.isMediaSpoilersRevealedInSharedMedia = true;
                r7Var.invalidate();
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.f38196b;
                ((org.telegram.ui.Cells.ca) baVar.f20891b).f20933a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ca) baVar.f20891b).f20933a.getTransitionParams().f21842g = false;
                ((org.telegram.ui.Cells.ca) baVar.f20891b).f20933a.getTransitionParams().K1 = 1.0f;
                return;
            case 13:
                l3 l3Var = (l3) this.f38196b;
                if (animator.equals(((sb) l3Var.f35900b).S)) {
                    ((sb) l3Var.f35900b).S = null;
                    return;
                }
                return;
            case 14:
                sb sbVar = (sb) this.f38196b;
                if (animator.equals(sbVar.S)) {
                    sbVar.S = null;
                    return;
                }
                return;
            case 15:
                ((bc) this.f38196b).F.setVisibility(8);
                return;
            case 16:
                bd bdVar = (bd) this.f38196b;
                kc kcVar = bdVar.f32923j0;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) bdVar.f32923j0.getParent()).removeView(bdVar.f32923j0);
                    }
                    bdVar.f32923j0 = null;
                }
                bdVar.f32925l0 = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                jk jkVar = (jk) this.f38196b;
                jkVar.setAnimatedTop(0);
                View view = jkVar.C1;
                if (view != null && view.getVisibility() == 0) {
                    jkVar.C1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.C1.getLayoutParams().height) + jkVar.P1);
                }
                jkVar.f35367n5.m9 = null;
                return;
            case 18:
                org.telegram.ui.Components.k40 k40Var = ((ti) this.f38196b).f38672b.f39960b2;
                if (k40Var != null) {
                    k40Var.setVisibility(8);
                    return;
                }
                return;
            case 19:
                xl xlVar = (xl) this.f38196b;
                if (xlVar.f39931a) {
                    xlVar.d.setTranslationY(0.0f);
                }
                if (xlVar.f39932b) {
                    xlVar.e.setTranslationY(0.0f);
                }
                if (xlVar.f39934f) {
                    xlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.p9 p9Var = xlVar.f39933c;
                if (p9Var != null) {
                    p9Var.setTranslationY(0.0f);
                }
                xlVar.f39935n.E2[1] = null;
                return;
            case 20:
                hh.f fVar = (hh.f) ((dg.y2) this.f38196b).f4861c;
                dl dlVar = ((jm) fVar.f7134c).N.Y2;
                if (dlVar != null) {
                    dlVar.setIsMessageTransition(false);
                    ((jm) fVar.f7134c).N.Y2.h(true);
                    ((jm) fVar.f7134c).N.Y2.setVisibility(4);
                    return;
                }
                return;
            case 21:
                im imVar = (im) this.f38196b;
                jm jmVar = imVar.f35139b;
                ArrayList arrayList = jmVar.N.f40077k6;
                org.telegram.ui.Cells.t1 t1Var = imVar.f35138a;
                arrayList.remove(t1Var);
                View view2 = jmVar.N.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    jmVar.N.f40193u0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f21914x0 = false;
                return;
            case 22:
                tp tpVar = (tp) this.f38196b;
                tpVar.I = 0.0f;
                tpVar.H = 1.0f;
                View view3 = tpVar.X;
                if (view3 != null) {
                    view3.invalidate();
                }
                tpVar.Q.invalidate();
                zi ziVar = tpVar.V;
                if (ziVar != null) {
                    ziVar.run();
                    tpVar.V = null;
                    return;
                }
                return;
            case 24:
                vq vqVar = (vq) this.f38196b;
                View view4 = vqVar.f39232b;
                view4.setAlpha(1.0f);
                f2.v0.x0(view4);
                ((pr) vqVar.d).f37450c.removeView(view4);
                return;
            case 25:
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.f38196b;
                c6Var.d = null;
                c6Var.f23850b.clear();
                return;
            case 26:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f38196b;
                animatedPhoneNumberEditText.f22723n = null;
                animatedPhoneNumberEditText.f22722f.clear();
                return;
            case 27:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f38196b;
                j6Var.c();
                j6Var.f25890k = null;
                j6Var.h = 0.0f;
                j6Var.f25892m = 0.0f;
                j6Var.invalidateSelf();
                Runnable runnable = j6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                j6Var.f25894o = null;
                CharSequence charSequence = j6Var.f25895p;
                if (charSequence != null) {
                    j6Var.q(charSequence, true, j6Var.f25896q);
                    j6Var.f25895p = null;
                    j6Var.f25896q = false;
                    return;
                }
                org.telegram.ui.Components.fg fgVar = j6Var.C;
                if (fgVar != null) {
                    fgVar.run();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.p9 p9Var2 = (org.telegram.ui.Components.p9) this.f38196b;
                p9Var2.setVisibility(8);
                p9Var2.setImageDrawable(null);
                p9Var2.setAlpha(1.0f);
                return;
            case 29:
                org.telegram.ui.Components.w8 w8Var = ((org.telegram.ui.Components.k8) this.f38196b).f26201b;
                w8Var.f30268f = false;
                w8Var.e.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38195a) {
            case 1:
                j8 j8Var = (j8) this.f38196b;
                for (int i10 = 0; i10 < j8Var.f35257b.getChildCount(); i10++) {
                    g8.a((g8) j8Var.f35257b.getChildAt(i10), j8Var.M, j8Var.N);
                }
                return;
            case 2:
            default:
                super.onAnimationStart(animator);
                return;
            case 3:
                ((b01) ((org.telegram.ui.Cells.j) this.f38196b)).W.e.f32043c.f5734r = true;
                return;
        }
    }

    public s5(vq vqVar, f2.v0 v0Var) {
        this.f38195a = 24;
        this.f38196b = vqVar;
    }
}
