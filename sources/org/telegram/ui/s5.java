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
    public final int f41137a;
    public final Object f41138b;

    public s5(Object obj, int i10) {
        this.f41137a = i10;
        this.f41138b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f10;
        switch (this.f41137a) {
            case 10:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.f41138b;
                AnimatorSet animatorSet = o7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o7Var.h = null;
                    return;
                }
                return;
            case 23:
                kq kqVar = (kq) this.f41138b;
                org.telegram.ui.Components.or orVar = kqVar.h;
                if (kqVar.E) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                orVar.b(f10);
                kqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f41137a) {
            case 0:
                ((y5) this.f41138b).f43550c0.setVisibility(8);
                return;
            case 1:
            case 23:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                ((v9) this.f41138b).f42176s = null;
                return;
            case 3:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f41138b;
                ((d01) jVar).W.f37715e.f34575c.f5819r = false;
                FrameLayout frameLayout = jVar.G;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.H);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f41138b;
                Button button = wVar.f24339n;
                org.telegram.ui.Components.gi0 gi0Var = wVar.f24338f;
                if (button == gi0Var) {
                    wVar.f24337e.setVisibility(4);
                    return;
                } else {
                    gi0Var.setVisibility(4);
                    return;
                }
            case 5:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f41138b).f22718x = null;
                return;
            case 6:
                ((org.telegram.ui.Cells.g4) this.f41138b).D = null;
                return;
            case 7:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f41138b;
                if (animator.equals(t5Var.f24154n)) {
                    t5Var.f24154n = null;
                    return;
                }
                return;
            case 8:
                m2.b bVar = (m2.b) this.f41138b;
                if (animator.equals(((org.telegram.ui.Cells.v5) bVar.f13421b).d)) {
                    ((org.telegram.ui.Cells.v5) bVar.f13421b).d = null;
                    return;
                }
                return;
            case 9:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.f41138b).f24316e, 1000L);
                return;
            case 10:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.f41138b;
                AnimatorSet animatorSet = o7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o7Var.h = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) this.f41138b;
                r7Var.f23574n.isMediaSpoilersRevealedInSharedMedia = true;
                r7Var.invalidate();
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.f41138b;
                ((org.telegram.ui.Cells.ca) baVar.f22621b).f22667a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ca) baVar.f22621b).f22667a.getTransitionParams().f23638g = false;
                ((org.telegram.ui.Cells.ca) baVar.f22621b).f22667a.getTransitionParams().K1 = 1.0f;
                return;
            case 13:
                l3 l3Var = (l3) this.f41138b;
                if (animator.equals(((sb) l3Var.f38568b).S)) {
                    ((sb) l3Var.f38568b).S = null;
                    return;
                }
                return;
            case 14:
                sb sbVar = (sb) this.f41138b;
                if (animator.equals(sbVar.S)) {
                    sbVar.S = null;
                    return;
                }
                return;
            case 15:
                ((ac) this.f41138b).F.setVisibility(8);
                return;
            case 16:
                bd bdVar = (bd) this.f41138b;
                kc kcVar = bdVar.f35434j0;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) bdVar.f35434j0.getParent()).removeView(bdVar.f35434j0);
                    }
                    bdVar.f35434j0 = null;
                }
                bdVar.f35436l0 = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                jk jkVar = (jk) this.f41138b;
                jkVar.setAnimatedTop(0);
                View view = jkVar.C1;
                if (view != null && view.getVisibility() == 0) {
                    jkVar.C1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.C1.getLayoutParams().height) + jkVar.P1);
                }
                jkVar.f38175n5.m9 = null;
                return;
            case 18:
                org.telegram.ui.Components.m40 m40Var = ((ti) this.f41138b).f41623b.f43128b2;
                if (m40Var != null) {
                    m40Var.setVisibility(8);
                    return;
                }
                return;
            case 19:
                xl xlVar = (xl) this.f41138b;
                if (xlVar.f43098a) {
                    xlVar.d.setTranslationY(0.0f);
                }
                if (xlVar.f43099b) {
                    xlVar.f43101e.setTranslationY(0.0f);
                }
                if (xlVar.f43102f) {
                    xlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.p9 p9Var = xlVar.f43100c;
                if (p9Var != null) {
                    p9Var.setTranslationY(0.0f);
                }
                xlVar.f43103n.E2[1] = null;
                return;
            case 20:
                ih.f fVar = (ih.f) ((eg.w2) this.f41138b).f5528c;
                dl dlVar = ((jm) fVar.f8134c).N.Y2;
                if (dlVar != null) {
                    dlVar.setIsMessageTransition(false);
                    ((jm) fVar.f8134c).N.Y2.h(true);
                    ((jm) fVar.f8134c).N.Y2.setVisibility(4);
                    return;
                }
                return;
            case 21:
                im imVar = (im) this.f41138b;
                jm jmVar = imVar.f37894b;
                ArrayList arrayList = jmVar.N.f43246k6;
                org.telegram.ui.Cells.t1 t1Var = imVar.f37893a;
                arrayList.remove(t1Var);
                View view2 = jmVar.N.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    jmVar.N.f43362u0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f23710x0 = false;
                return;
            case 22:
                up upVar = (up) this.f41138b;
                upVar.I = 0.0f;
                upVar.H = 1.0f;
                View view3 = upVar.X;
                if (view3 != null) {
                    view3.invalidate();
                }
                upVar.Q.invalidate();
                zi ziVar = upVar.V;
                if (ziVar != null) {
                    ziVar.run();
                    upVar.V = null;
                    return;
                }
                return;
            case 24:
                wq wqVar = (wq) this.f41138b;
                View view4 = wqVar.f42872b;
                view4.setAlpha(1.0f);
                f2.w0.x0(view4);
                ((qr) wqVar.d).f40605c.removeView(view4);
                return;
            case 25:
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.f41138b;
                c6Var.d = null;
                c6Var.f25804b.clear();
                return;
            case 26:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f41138b;
                animatedPhoneNumberEditText.f24562n = null;
                animatedPhoneNumberEditText.f24561f.clear();
                return;
            case 27:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f41138b;
                j6Var.c();
                j6Var.f28036k = null;
                j6Var.h = 0.0f;
                j6Var.f28038m = 0.0f;
                j6Var.invalidateSelf();
                Runnable runnable = j6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                j6Var.f28040o = null;
                CharSequence charSequence = j6Var.f28041p;
                if (charSequence != null) {
                    j6Var.q(charSequence, true, j6Var.f28042q);
                    j6Var.f28041p = null;
                    j6Var.f28042q = false;
                    return;
                }
                org.telegram.ui.Components.fg fgVar = j6Var.C;
                if (fgVar != null) {
                    fgVar.run();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.p9 p9Var2 = (org.telegram.ui.Components.p9) this.f41138b;
                p9Var2.setVisibility(8);
                p9Var2.setImageDrawable(null);
                p9Var2.setAlpha(1.0f);
                return;
            case 29:
                org.telegram.ui.Components.w8 w8Var = ((org.telegram.ui.Components.k8) this.f41138b).f28322b;
                w8Var.f32674f = false;
                w8Var.f32673e.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41137a) {
            case 1:
                j8 j8Var = (j8) this.f41138b;
                for (int i10 = 0; i10 < j8Var.f38035b.getChildCount(); i10++) {
                    g8.a((g8) j8Var.f38035b.getChildAt(i10), j8Var.M, j8Var.N);
                }
                return;
            case 2:
            default:
                super.onAnimationStart(animator);
                return;
            case 3:
                ((d01) ((org.telegram.ui.Cells.j) this.f41138b)).W.f37715e.f34575c.f5819r = true;
                return;
        }
    }

    public s5(wq wqVar, f2.w0 w0Var) {
        this.f41137a = 24;
        this.f41138b = wqVar;
    }
}
