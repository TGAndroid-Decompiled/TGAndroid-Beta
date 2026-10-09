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
    public final int f41836a;
    public final Object f41837b;

    public t4(Object obj, int i10) {
        this.f41836a = i10;
        this.f41837b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f41836a) {
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f41837b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 24:
                nq nqVar = (nq) this.f41837b;
                org.telegram.ui.Components.gs gsVar = nqVar.h;
                if (nqVar.H) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                gsVar.b(f7);
                nqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f41836a) {
            case 0:
                u4 u4Var = (u4) this.f41837b;
                u4Var.f42322c = false;
                u4Var.invalidate();
                return;
            case 1:
                ((v5) this.f41837b).f42645f0.setVisibility(8);
                return;
            case 2:
            case 24:
            default:
                super.onAnimationEnd(animator);
                return;
            case 3:
                ((v9) this.f41837b).v = null;
                return;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f41837b;
                ((t01) jVar).f41811c0.f44189e.f34226c.f47647r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f41837b;
                Button button = wVar.f23575n;
                org.telegram.ui.Components.cj0 cj0Var = wVar.f23574f;
                if (button == cj0Var) {
                    wVar.f23573e.setVisibility(4);
                    return;
                } else {
                    cj0Var.setVisibility(4);
                    return;
                }
            case 6:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f41837b).f22018x = null;
                return;
            case 7:
                ((org.telegram.ui.Cells.g4) this.f41837b).G = null;
                return;
            case 8:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f41837b;
                if (animator.equals(t5Var.f23053n)) {
                    t5Var.f23053n = null;
                    return;
                }
                return;
            case 9:
                ai.r4 r4Var = (ai.r4) this.f41837b;
                if (animator.equals(((org.telegram.ui.Cells.v5) r4Var.f1654b).d)) {
                    ((org.telegram.ui.Cells.v5) r4Var.f1654b).d = null;
                    return;
                }
                return;
            case 10:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.f41837b).f23545e, 1000L);
                return;
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f41837b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f41837b;
                t7Var.f23078n.isMediaSpoilersRevealedInSharedMedia = true;
                t7Var.invalidate();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.da daVar = (org.telegram.ui.Cells.da) this.f41837b;
                ((org.telegram.ui.Cells.ea) daVar.f21996b).f22054a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ea) daVar.f21996b).f22054a.getTransitionParams().f22952g = false;
                ((org.telegram.ui.Cells.ea) daVar.f21996b).f22054a.getTransitionParams().K1 = 1.0f;
                return;
            case 14:
                i3 i3Var = (i3) this.f41837b;
                if (animator.equals(((vb) i3Var.f38464b).R)) {
                    ((vb) i3Var.f38464b).R = null;
                    return;
                }
                return;
            case 15:
                vb vbVar = (vb) this.f41837b;
                if (animator.equals(vbVar.R)) {
                    vbVar.R = null;
                    return;
                }
                return;
            case 16:
                ((cc) this.f41837b).I.setVisibility(8);
                return;
            case 17:
                bd bdVar = (bd) this.f41837b;
                lc lcVar = bdVar.m0;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) bdVar.m0.getParent()).removeView(bdVar.m0);
                    }
                    bdVar.m0 = null;
                }
                bdVar.f36264o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                ci ciVar = (ci) this.f41837b;
                if (ciVar.f36674a) {
                    ciVar.d.setTranslationY(0.0f);
                }
                if (ciVar.f36675b) {
                    ciVar.f36677e.setTranslationY(0.0f);
                }
                if (ciVar.f36678f) {
                    ciVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.y9 y9Var = ciVar.f36676c;
                if (y9Var != null) {
                    y9Var.setTranslationY(0.0f);
                }
                ciVar.f36679n.H2[1] = null;
                return;
            case 19:
                ok okVar = (ok) this.f41837b;
                okVar.setAnimatedTop(0);
                View view = okVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    okVar.G1.setTranslationY(((1.0f - okVar.getTopViewEnterProgress()) * okVar.G1.getLayoutParams().height) + okVar.T1);
                }
                okVar.f40549r5.f44892p9 = null;
                return;
            case 20:
                org.telegram.ui.Components.z40 z40Var = ((xi) this.f41837b).f44042b.f44754e2;
                if (z40Var != null) {
                    z40Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                ai.z zVar = (ai.z) this.f41837b;
                org.telegram.ui.Components.y60 y60Var = ((mm) ((gm) zVar.f1996c).f38048c).Q.f44715b3;
                if (y60Var != null) {
                    y60Var.setIsMessageTransition(false);
                    ((mm) ((gm) zVar.f1996c).f38048c).Q.f44715b3.c(true);
                    ((mm) ((gm) zVar.f1996c).f38048c).Q.f44715b3.setVisibility(4);
                    return;
                }
                return;
            case 22:
                lm lmVar = (lm) this.f41837b;
                mm mmVar = lmVar.f39630b;
                ArrayList arrayList = mmVar.Q.f44867n6;
                org.telegram.ui.Cells.u1 u1Var = lmVar.f39629a;
                arrayList.remove(u1Var);
                View view2 = mmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    mmVar.Q.f44988x0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f23023x0 = false;
                return;
            case 23:
                xp xpVar = (xp) this.f41837b;
                xpVar.L = 0.0f;
                xpVar.K = 1.0f;
                View view3 = xpVar.f44088a0;
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
                zq zqVar = (zq) this.f41837b;
                View view4 = zqVar.f45043b;
                view4.setAlpha(1.0f);
                s4.p0.x0(view4);
                ((tr) zqVar.d).f42056c.removeView(view4);
                return;
            case 26:
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f41837b;
                j6Var.d = null;
                j6Var.f27609b.clear();
                return;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f41837b;
                animatedPhoneNumberEditText.f23844n = null;
                animatedPhoneNumberEditText.f23843f.clear();
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) this.f41837b;
                q6Var.b();
                q6Var.f30077o = null;
                q6Var.f30072j = 0.0f;
                q6Var.f30075m = 0.0f;
                q6Var.f30074l = 0.0f;
                q6Var.f30073k = 0.0f;
                q6Var.f30080r = 0.0f;
                q6Var.f30079q = 0.0f;
                q6Var.invalidateSelf();
                Runnable runnable = q6Var.f30066b0;
                if (runnable != null) {
                    runnable.run();
                }
                q6Var.f30082t = null;
                CharSequence charSequence = q6Var.f30083u;
                if (charSequence != null) {
                    q6Var.t(charSequence, true, q6Var.v);
                    q6Var.f30083u = null;
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
                org.telegram.ui.Components.y9 y9Var2 = (org.telegram.ui.Components.y9) this.f41837b;
                y9Var2.setVisibility(8);
                y9Var2.setImageDrawable(null);
                y9Var2.setAlpha(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41836a) {
            case 2:
                g8 g8Var = (g8) this.f41837b;
                for (int i10 = 0; i10 < g8Var.f37913b.getChildCount(); i10++) {
                    d8.a((d8) g8Var.f37913b.getChildAt(i10), g8Var.P, g8Var.Q);
                }
                return;
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                ((t01) ((org.telegram.ui.Cells.j) this.f41837b)).f41811c0.f44189e.f34226c.f47647r = true;
                return;
        }
    }

    public t4(zq zqVar, s4.p0 p0Var) {
        this.f41836a = 25;
        this.f41837b = zqVar;
    }
}
