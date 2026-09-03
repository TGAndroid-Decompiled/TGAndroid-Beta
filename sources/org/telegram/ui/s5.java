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
    public final int f41018a;
    public final Object f41019b;

    public s5(Object obj, int i10) {
        this.f41018a = i10;
        this.f41019b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f10;
        switch (this.f41018a) {
            case 10:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.f41019b;
                AnimatorSet animatorSet = o7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o7Var.h = null;
                    return;
                }
                return;
            case 23:
                kq kqVar = (kq) this.f41019b;
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
        switch (this.f41018a) {
            case 0:
                ((y5) this.f41019b).f43542c0.setVisibility(8);
                return;
            case 1:
            case 23:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                ((v9) this.f41019b).f42064s = null;
                return;
            case 3:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f41019b;
                ((i01) jVar).W.f39152e.f34575c.f5819r = false;
                FrameLayout frameLayout = jVar.G;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.H);
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f41019b;
                Button button = wVar.f24341n;
                org.telegram.ui.Components.gi0 gi0Var = wVar.f24340f;
                if (button == gi0Var) {
                    wVar.f24339e.setVisibility(4);
                    return;
                } else {
                    gi0Var.setVisibility(4);
                    return;
                }
            case 5:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f41019b).f22720x = null;
                return;
            case 6:
                ((org.telegram.ui.Cells.g4) this.f41019b).D = null;
                return;
            case 7:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f41019b;
                if (animator.equals(t5Var.f24156n)) {
                    t5Var.f24156n = null;
                    return;
                }
                return;
            case 8:
                m2.b bVar = (m2.b) this.f41019b;
                if (animator.equals(((org.telegram.ui.Cells.v5) bVar.f13423b).d)) {
                    ((org.telegram.ui.Cells.v5) bVar.f13423b).d = null;
                    return;
                }
                return;
            case 9:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.f41019b).f24318e, 1000L);
                return;
            case 10:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.f41019b;
                AnimatorSet animatorSet = o7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o7Var.h = null;
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) this.f41019b;
                r7Var.f23576n.isMediaSpoilersRevealedInSharedMedia = true;
                r7Var.invalidate();
                return;
            case 12:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) this.f41019b;
                ((org.telegram.ui.Cells.ca) baVar.f22623b).f22669a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ca) baVar.f22623b).f22669a.getTransitionParams().f23640g = false;
                ((org.telegram.ui.Cells.ca) baVar.f22623b).f22669a.getTransitionParams().K1 = 1.0f;
                return;
            case 13:
                l3 l3Var = (l3) this.f41019b;
                if (animator.equals(((sb) l3Var.f38477b).S)) {
                    ((sb) l3Var.f38477b).S = null;
                    return;
                }
                return;
            case 14:
                sb sbVar = (sb) this.f41019b;
                if (animator.equals(sbVar.S)) {
                    sbVar.S = null;
                    return;
                }
                return;
            case 15:
                ((ac) this.f41019b).F.setVisibility(8);
                return;
            case 16:
                bd bdVar = (bd) this.f41019b;
                jc jcVar = bdVar.f35450j0;
                if (jcVar != null) {
                    if (jcVar.getParent() != null) {
                        ((ViewGroup) bdVar.f35450j0.getParent()).removeView(bdVar.f35450j0);
                    }
                    bdVar.f35450j0 = null;
                }
                bdVar.f35452l0 = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                jk jkVar = (jk) this.f41019b;
                jkVar.setAnimatedTop(0);
                View view = jkVar.C1;
                if (view != null && view.getVisibility() == 0) {
                    jkVar.C1.setTranslationY(((1.0f - jkVar.getTopViewEnterProgress()) * jkVar.C1.getLayoutParams().height) + jkVar.P1);
                }
                jkVar.f38072n5.m9 = null;
                return;
            case 18:
                org.telegram.ui.Components.m40 m40Var = ((ti) this.f41019b).f41546b.f43106b2;
                if (m40Var != null) {
                    m40Var.setVisibility(8);
                    return;
                }
                return;
            case 19:
                xl xlVar = (xl) this.f41019b;
                if (xlVar.f43076a) {
                    xlVar.d.setTranslationY(0.0f);
                }
                if (xlVar.f43077b) {
                    xlVar.f43079e.setTranslationY(0.0f);
                }
                if (xlVar.f43080f) {
                    xlVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.p9 p9Var = xlVar.f43078c;
                if (p9Var != null) {
                    p9Var.setTranslationY(0.0f);
                }
                xlVar.f43081n.E2[1] = null;
                return;
            case 20:
                ih.f fVar = (ih.f) ((eg.w2) this.f41019b).f5528c;
                dl dlVar = ((jm) fVar.f8134c).N.Y2;
                if (dlVar != null) {
                    dlVar.setIsMessageTransition(false);
                    ((jm) fVar.f8134c).N.Y2.h(true);
                    ((jm) fVar.f8134c).N.Y2.setVisibility(4);
                    return;
                }
                return;
            case 21:
                im imVar = (im) this.f41019b;
                jm jmVar = imVar.f37743b;
                ArrayList arrayList = jmVar.N.f43224k6;
                org.telegram.ui.Cells.t1 t1Var = imVar.f37742a;
                arrayList.remove(t1Var);
                View view2 = jmVar.N.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    jmVar.N.f43340u0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f23712x0 = false;
                return;
            case 22:
                up upVar = (up) this.f41019b;
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
                wq wqVar = (wq) this.f41019b;
                View view4 = wqVar.f42844b;
                view4.setAlpha(1.0f);
                f2.w0.x0(view4);
                ((qr) wqVar.d).f40573c.removeView(view4);
                return;
            case 25:
                org.telegram.ui.Components.c6 c6Var = (org.telegram.ui.Components.c6) this.f41019b;
                c6Var.d = null;
                c6Var.f25782b.clear();
                return;
            case 26:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f41019b;
                animatedPhoneNumberEditText.f24564n = null;
                animatedPhoneNumberEditText.f24563f.clear();
                return;
            case 27:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f41019b;
                j6Var.c();
                j6Var.f28006k = null;
                j6Var.h = 0.0f;
                j6Var.f28008m = 0.0f;
                j6Var.invalidateSelf();
                Runnable runnable = j6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                j6Var.f28010o = null;
                CharSequence charSequence = j6Var.f28011p;
                if (charSequence != null) {
                    j6Var.q(charSequence, true, j6Var.f28012q);
                    j6Var.f28011p = null;
                    j6Var.f28012q = false;
                    return;
                }
                org.telegram.ui.Components.fg fgVar = j6Var.C;
                if (fgVar != null) {
                    fgVar.run();
                    return;
                }
                return;
            case 28:
                org.telegram.ui.Components.p9 p9Var2 = (org.telegram.ui.Components.p9) this.f41019b;
                p9Var2.setVisibility(8);
                p9Var2.setImageDrawable(null);
                p9Var2.setAlpha(1.0f);
                return;
            case 29:
                org.telegram.ui.Components.w8 w8Var = ((org.telegram.ui.Components.k8) this.f41019b).f28318b;
                w8Var.f32679f = false;
                w8Var.f32678e.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41018a) {
            case 1:
                j8 j8Var = (j8) this.f41019b;
                for (int i10 = 0; i10 < j8Var.f37859b.getChildCount(); i10++) {
                    g8.a((g8) j8Var.f37859b.getChildAt(i10), j8Var.M, j8Var.N);
                }
                return;
            case 2:
            default:
                super.onAnimationStart(animator);
                return;
            case 3:
                ((i01) ((org.telegram.ui.Cells.j) this.f41019b)).W.f39152e.f34575c.f5819r = true;
                return;
        }
    }

    public s5(wq wqVar, f2.w0 w0Var) {
        this.f41018a = 24;
        this.f41019b = wqVar;
    }
}
