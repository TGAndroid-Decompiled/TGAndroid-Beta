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
public final class s0 extends AnimatorListenerAdapter {
    public final int f40294a;
    public final Object f40295b;

    public s0(Object obj, int i10) {
        this.f40294a = i10;
        this.f40295b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f7;
        switch (this.f40294a) {
            case 14:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f40295b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 27:
                qq qqVar = (qq) this.f40295b;
                org.telegram.ui.Components.or orVar = qqVar.h;
                if (qqVar.H) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                orVar.b(f7);
                qqVar.h.invalidateSelf();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f40294a) {
            case 0:
                i4 i4Var = (i4) this.f40295b;
                Runnable runnable = i4Var.f37239a0;
                if (runnable != null) {
                    runnable.run();
                    i4Var.f37239a0 = null;
                    return;
                }
                return;
            case 1:
                v3 v3Var = (v3) this.f40295b;
                v3Var.f41428w = 1.0f;
                v3Var.n();
                v3Var.i();
                v3Var.h();
                v3Var.f41420a.unlock();
                return;
            case 2:
                r4 r4Var = (r4) this.f40295b;
                r4Var.getClass();
                r4Var.setVisibility(8);
                return;
            case 3:
                u4 u4Var = (u4) this.f40295b;
                u4Var.f40949c = false;
                u4Var.invalidate();
                return;
            case 4:
                ((v5) this.f40295b).f41444f0.setVisibility(8);
                return;
            case 5:
            case 27:
            default:
                super.onAnimationEnd(animator);
                return;
            case 6:
                ((u9) this.f40295b).f41016s = null;
                return;
            case 7:
                org.telegram.ui.Cells.j jVar = (org.telegram.ui.Cells.j) this.f40295b;
                ((v01) jVar).f41403c0.f34318e.f33898c.f45757r = false;
                FrameLayout frameLayout = jVar.J;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(jVar.K);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) this.f40295b;
                Button button = wVar.f23421n;
                org.telegram.ui.Components.xh0 xh0Var = wVar.f23420f;
                if (button == xh0Var) {
                    wVar.f23419e.setVisibility(4);
                    return;
                } else {
                    xh0Var.setVisibility(4);
                    return;
                }
            case 9:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Cells.e0) this.f40295b).f21858x = null;
                return;
            case 10:
                ((org.telegram.ui.Cells.f4) this.f40295b).G = null;
                return;
            case 11:
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) this.f40295b;
                if (animator.equals(s5Var.f22863n)) {
                    s5Var.f22863n = null;
                    return;
                }
                return;
            case 12:
                androidx.activity.i iVar = (androidx.activity.i) this.f40295b;
                if (animator.equals(((org.telegram.ui.Cells.u5) iVar.f876b).d)) {
                    ((org.telegram.ui.Cells.u5) iVar.f876b).d = null;
                    return;
                }
                return;
            case 13:
                AndroidUtilities.runOnUIThread(((org.telegram.ui.Cells.u5) this.f40295b).f23352e, 1000L);
                return;
            case 14:
                org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) this.f40295b;
                AnimatorSet animatorSet = q7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    q7Var.h = null;
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.f40295b;
                t7Var.f23302n.isMediaSpoilersRevealedInSharedMedia = true;
                t7Var.invalidate();
                return;
            case 16:
                super.onAnimationEnd(animator);
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) this.f40295b;
                ((org.telegram.ui.Cells.ga) faVar.f21982b).f22025a.getTransitionParams().j();
                ((org.telegram.ui.Cells.ga) faVar.f21982b).f22025a.getTransitionParams().f22762g = false;
                ((org.telegram.ui.Cells.ga) faVar.f21982b).f22025a.getTransitionParams().K1 = 1.0f;
                return;
            case 17:
                i3 i3Var = (i3) this.f40295b;
                if (animator.equals(((ub) i3Var.f37207b).V)) {
                    ((ub) i3Var.f37207b).V = null;
                    return;
                }
                return;
            case 18:
                ub ubVar = (ub) this.f40295b;
                if (animator.equals(ubVar.V)) {
                    ubVar.V = null;
                    return;
                }
                return;
            case 19:
                ((cc) this.f40295b).I.setVisibility(8);
                return;
            case 20:
                bd bdVar = (bd) this.f40295b;
                mc mcVar = bdVar.m0;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) bdVar.m0.getParent()).removeView(bdVar.m0);
                    }
                    bdVar.m0 = null;
                }
                bdVar.f34780o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 21:
                mk mkVar = (mk) this.f40295b;
                mkVar.setAnimatedTop(0);
                View view = mkVar.F1;
                if (view != null && view.getVisibility() == 0) {
                    mkVar.F1.setTranslationY(((1.0f - mkVar.getTopViewEnterProgress()) * mkVar.F1.getLayoutParams().height) + mkVar.S1);
                }
                mkVar.f38756q5.f35405p9 = null;
                return;
            case 22:
                org.telegram.ui.Components.i40 i40Var = ((xi) this.f40295b).f42764b.f35267e2;
                if (i40Var != null) {
                    i40Var.setVisibility(8);
                    return;
                }
                return;
            case 23:
                am amVar = (am) this.f40295b;
                if (amVar.f34499a) {
                    amVar.d.setTranslationY(0.0f);
                }
                if (amVar.f34500b) {
                    amVar.f34502e.setTranslationY(0.0f);
                }
                if (amVar.f34503f) {
                    amVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.x9 x9Var = amVar.f34501c;
                if (x9Var != null) {
                    x9Var.setTranslationY(0.0f);
                }
                amVar.f34504n.H2[1] = null;
                return;
            case 24:
                im imVar = (im) ((bi.t) this.f40295b).f3741c;
                gl glVar = ((om) imVar.f37431c).Q.f35228b3;
                if (glVar != null) {
                    glVar.setIsMessageTransition(false);
                    ((om) imVar.f37431c).Q.f35228b3.h(true);
                    ((om) imVar.f37431c).Q.f35228b3.setVisibility(4);
                    return;
                }
                return;
            case 25:
                nm nmVar = (nm) this.f40295b;
                om omVar = nmVar.f39011b;
                ArrayList arrayList = omVar.Q.f35380n6;
                org.telegram.ui.Cells.t1 t1Var = nmVar.f39010a;
                arrayList.remove(t1Var);
                View view2 = omVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    omVar.Q.f35500x0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().f22833x0 = false;
                return;
            case 26:
                aq aqVar = (aq) this.f40295b;
                aqVar.L = 0.0f;
                aqVar.K = 1.0f;
                View view3 = aqVar.f34532a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                aqVar.T.invalidate();
                dj djVar = aqVar.Y;
                if (djVar != null) {
                    djVar.run();
                    aqVar.Y = null;
                    return;
                }
                return;
            case 28:
                cr crVar = (cr) this.f40295b;
                View view4 = crVar.f35551b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((vr) crVar.d).f41662c.removeView(view4);
                return;
            case 29:
                org.telegram.ui.Components.h6 h6Var = (org.telegram.ui.Components.h6) this.f40295b;
                h6Var.d = null;
                h6Var.f26636b.clear();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f40294a) {
            case 2:
                ((r4) this.f40295b).setVisibility(0);
                return;
            case 5:
                h8 h8Var = (h8) this.f40295b;
                for (int i10 = 0; i10 < h8Var.f36925b.getChildCount(); i10++) {
                    e8.a((e8) h8Var.f36925b.getChildAt(i10), h8Var.P, h8Var.Q);
                }
                return;
            case 7:
                ((v01) ((org.telegram.ui.Cells.j) this.f40295b)).f41403c0.f34318e.f33898c.f45757r = true;
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public s0(cr crVar, s4.o0 o0Var) {
        this.f40294a = 28;
        this.f40295b = crVar;
    }
}
