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
public final class w4 extends AnimatorListenerAdapter {
    public final int f43034a;
    public final Object f43035b;

    public w4(Object obj, int i10) {
        this.f43034a = i10;
        this.f43035b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f43034a) {
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f43035b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 24:
                qq qqVar = (qq) this.f43035b;
                org.telegram.ui.Components.is isVar = qqVar.h;
                if (qqVar.H) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                isVar.b(f7);
                qqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f43034a) {
            case 0:
                x4 x4Var = (x4) this.f43035b;
                x4Var.f43748c = false;
                x4Var.invalidate();
                return;
            case 1:
                ((y5) this.f43035b).f44300f0.setVisibility(8);
                return;
            case 2:
            case 24:
            default:
                super.onAnimationEnd(animator);
                return;
            case 3:
                ((y9) this.f43035b).v = null;
                return;
            case 4:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f43035b;
                ((v01) jVar).f42634c0.f35664e.f34063c.f47880r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f43035b;
                Button button = wVar.f23337n;
                org.telegram.ui.Components.ej0 ej0Var = wVar.f23336f;
                if (button == ej0Var) {
                    wVar.f23335e.setVisibility(4);
                    return;
                } else {
                    ej0Var.setVisibility(4);
                    return;
                }
            case 6:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f43035b).f21779x = null;
                return;
            case 7:
                ((org.telegram.ui.Cells.g4) this.f43035b).G = null;
                return;
            case 8:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.f43035b;
                if (animator.equals(t5Var.f22816n)) {
                    t5Var.f22816n = null;
                    return;
                }
                return;
            case 9:
                ai.r4 r4Var = (ai.r4) this.f43035b;
                if (animator.equals(((org.telegram.ui.Cells.v5) r4Var.f1652b).d)) {
                    ((org.telegram.ui.Cells.v5) r4Var.f1652b).d = null;
                    return;
                }
                return;
            case 10:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.v5) this.f43035b).f23317e, 1000L);
                return;
            case 11:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f43035b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 12:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f43035b;
                t7Var.f22850n.isMediaSpoilersRevealedInSharedMedia = true;
                t7Var.invalidate();
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.da daVar = (org.telegram.ui.Cells.da) this.f43035b;
                ((org.telegram.ui.Cells.ea) daVar.f21757b).f21818a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ea) daVar.f21757b).f21818a.getTransitionParams().f22715g = false;
                ((org.telegram.ui.Cells.ea) daVar.f21757b).f21818a.getTransitionParams().K1 = 1.0f;
                return;
            case 14:
                i3 i3Var = (i3) this.f43035b;
                if (animator.equals(((yb) i3Var.f38609b).R)) {
                    ((yb) i3Var.f38609b).R = null;
                    return;
                }
                return;
            case 15:
                yb ybVar = (yb) this.f43035b;
                if (animator.equals(ybVar.R)) {
                    ybVar.R = null;
                    return;
                }
                return;
            case 16:
                ((fc) this.f43035b).I.setVisibility(8);
                return;
            case 17:
                fd fdVar = (fd) this.f43035b;
                pc pcVar = fdVar.m0;
                if (pcVar != null) {
                    if (pcVar.getParent() != null) {
                        ((ViewGroup) fdVar.m0.getParent()).removeView(fdVar.m0);
                    }
                    fdVar.m0 = null;
                }
                fdVar.f37739o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                gi giVar = (gi) this.f43035b;
                if (giVar.f38057a) {
                    giVar.d.setTranslationY(0.0f);
                }
                if (giVar.f38058b) {
                    giVar.f38060e.setTranslationY(0.0f);
                }
                if (giVar.f38061f) {
                    giVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.y9 y9Var = giVar.f38059c;
                if (y9Var != null) {
                    y9Var.setTranslationY(0.0f);
                }
                giVar.f38062n.H2[1] = null;
                return;
            case 19:
                sk skVar = (sk) this.f43035b;
                skVar.setAnimatedTop(0);
                View view = skVar.G1;
                if (view != null && view.getVisibility() == 0) {
                    skVar.G1.setTranslationY(((1.0f - skVar.getTopViewEnterProgress()) * skVar.G1.getLayoutParams().height) + skVar.T1);
                }
                skVar.U5.f37382p9 = null;
                return;
            case 20:
                org.telegram.ui.Components.c50 c50Var = ((bj) this.f43035b).f36185b.f37244e2;
                if (c50Var != null) {
                    c50Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                ai.z zVar = (ai.z) this.f43035b;
                org.telegram.ui.Components.b70 b70Var = ((qm) ((km) zVar.f1994c).f39555c).Q.f37205b3;
                if (b70Var != null) {
                    b70Var.setIsMessageTransition(false);
                    ((qm) ((km) zVar.f1994c).f39555c).Q.f37205b3.c(true);
                    ((qm) ((km) zVar.f1994c).f39555c).Q.f37205b3.setVisibility(4);
                    return;
                }
                return;
            case 22:
                pm pmVar = (pm) this.f43035b;
                qm qmVar = pmVar.f40994b;
                ArrayList arrayList = qmVar.Q.f37357n6;
                org.telegram.ui.Cells.u1 u1Var = pmVar.f40993a;
                arrayList.remove(u1Var);
                View view2 = qmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    qmVar.Q.f37478x0.invalidate();
                }
                u1Var.setAlpha(1.0f);
                u1Var.getTransitionParams().f22786x0 = false;
                return;
            case 23:
                aq aqVar = (aq) this.f43035b;
                aqVar.L = 0.0f;
                aqVar.K = 1.0f;
                View view3 = aqVar.f35918a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                aqVar.T.invalidate();
                gj gjVar = aqVar.Y;
                if (gjVar != null) {
                    gjVar.run();
                    aqVar.Y = null;
                    return;
                }
                return;
            case 25:
                cr crVar = (cr) this.f43035b;
                View view4 = crVar.f36497b;
                view4.setAlpha(1.0f);
                s4.p0.x0(view4);
                ((wr) crVar.d).f43614c.removeView(view4);
                return;
            case 26:
                org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f43035b;
                j6Var.d = null;
                j6Var.f27378b.clear();
                return;
            case 27:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f43035b;
                animatedPhoneNumberEditText.f23610n = null;
                animatedPhoneNumberEditText.f23609f.clear();
                return;
            case 28:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) this.f43035b;
                q6Var.b();
                q6Var.f29724o = null;
                q6Var.f29719j = 0.0f;
                q6Var.f29722m = 0.0f;
                q6Var.f29721l = 0.0f;
                q6Var.f29720k = 0.0f;
                q6Var.f29727r = 0.0f;
                q6Var.f29726q = 0.0f;
                q6Var.invalidateSelf();
                Runnable runnable = q6Var.f29713b0;
                if (runnable != null) {
                    runnable.run();
                }
                q6Var.f29729t = null;
                CharSequence charSequence = q6Var.f29730u;
                if (charSequence != null) {
                    q6Var.t(charSequence, true, q6Var.v);
                    q6Var.f29730u = null;
                    q6Var.v = false;
                    return;
                }
                org.telegram.ui.Components.tg tgVar = q6Var.I;
                if (tgVar != null) {
                    tgVar.run();
                    return;
                }
                return;
            case 29:
                org.telegram.ui.Components.y9 y9Var2 = (org.telegram.ui.Components.y9) this.f43035b;
                y9Var2.setVisibility(8);
                y9Var2.setImageDrawable(null);
                y9Var2.setAlpha(1.0f);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f43034a) {
            case 2:
                j8 j8Var = (j8) this.f43035b;
                for (int i10 = 0; i10 < j8Var.f39126b.getChildCount(); i10++) {
                    g8.a((g8) j8Var.f39126b.getChildAt(i10), j8Var.P, j8Var.Q);
                }
                return;
            case 3:
            default:
                super.onAnimationStart(animator);
                return;
            case 4:
                ((v01) ((org.telegram.ui.Cells.j) this.f43035b)).f42634c0.f35664e.f34063c.f47880r = true;
                return;
        }
    }

    public w4(cr crVar, s4.p0 p0Var) {
        this.f43034a = 25;
        this.f43035b = crVar;
    }
}
