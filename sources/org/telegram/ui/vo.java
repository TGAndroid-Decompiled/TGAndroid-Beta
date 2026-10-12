package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
public final class vo extends AnimatorListenerAdapter {
    public final int f41051a;
    public boolean f41052b;
    public final Object f41053c;

    public vo(int i10, Object obj, boolean z10) {
        this.f41051a = i10;
        this.f41053c = obj;
        this.f41052b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41051a) {
            case 0:
                ((zo) this.f41053c).h = null;
                return;
            case 1:
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f41053c;
                AnimatorSet animatorSet = faVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    faVar.h = null;
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.vi) this.f41053c).f29988b1 = null;
                return;
            case 4:
                this.f41052b = true;
                return;
            case 9:
                org.telegram.ui.Components.z00 z00Var = (org.telegram.ui.Components.z00) this.f41053c;
                AnimatorSet animatorSet2 = z00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z00Var.e = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.p70 p70Var = (org.telegram.ui.Components.p70) this.f41053c;
                AnimatorSet animatorSet3 = p70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    p70Var.X = null;
                    return;
                }
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f41053c;
                if (animator.equals(pipRoundVideoView.f23205r)) {
                    pipRoundVideoView.f23205r = null;
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.xv0) this.f41053c).N1 = null;
                return;
            case 24:
                org.telegram.ui.Components.m71 m71Var = (org.telegram.ui.Components.m71) this.f41053c;
                AnimatorSet animatorSet4 = m71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    m71Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.q71 q71Var = (org.telegram.ui.Components.q71) this.f41053c;
                AnimatorSet animatorSet5 = q71Var.f28540r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    q71Var.f28540r = null;
                    return;
                }
                return;
            case 27:
                ((ws) this.f41053c).f41647w = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        RadialProgressView radialProgressView;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView2;
        float f20;
        float f21;
        switch (this.f41051a) {
            case 0:
                zo zoVar = (zo) this.f41053c;
                if (zoVar.h != null && (radialProgressView = zoVar.f42670n) != null) {
                    if (!this.f41052b) {
                        radialProgressView.setVisibility(4);
                        zoVar.f42662f.setVisibility(4);
                    }
                    zoVar.h = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.f41053c;
                AnimatorSet animatorSet = faVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f41052b) {
                        faVar.f24980c.setVisibility(4);
                        return;
                    } else {
                        faVar.f24979b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 2:
                org.telegram.ui.Components.ad adVar = (org.telegram.ui.Components.ad) this.f41053c;
                if (animator == adVar.f23521g) {
                    adVar.f23521g = null;
                    if (this.f41052b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    adVar.f23523j = f7;
                    adVar.b();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) this.f41053c;
                if (viVar.f29988b1 != null) {
                    if (this.f41052b) {
                        if (viVar.V0) {
                            org.telegram.ui.Components.ni niVar = viVar.B0;
                            if (niVar == null || niVar.L()) {
                                viVar.A1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.u0 u0Var = viVar.f30008h1;
                    if (u0Var != null) {
                        u0Var.setVisibility(4);
                    }
                    if (viVar.T0 != 0 || !viVar.f30045t1) {
                        viVar.f29995d1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.wo woVar = (org.telegram.ui.Components.wo) this.f41053c;
                if (!this.f41052b) {
                    org.telegram.ui.Components.z9 z9Var = woVar.h;
                    woVar.h = woVar.f30923n;
                    woVar.f30923n = z9Var;
                    z9Var.setVisibility(8);
                    woVar.f30923n.setAlpha(0.0f);
                    woVar.h.setVisibility(0);
                    woVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 5:
                boolean z10 = this.f41052b;
                org.telegram.ui.Components.gp gpVar = (org.telegram.ui.Components.gp) this.f41053c;
                if (animator == gpVar.e) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    gpVar.d = f10;
                    gpVar.setShown(f10);
                    if (!z10) {
                        gpVar.setVisibility(8);
                    }
                    gpVar.a(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.zp zpVar = (org.telegram.ui.Components.zp) this.f41053c;
                if (this.f41052b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                zpVar.f31949g0 = f11;
                zpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * zpVar.f31949g0);
                return;
            case 7:
                if (!this.f41052b) {
                    ((org.telegram.ui.Components.zq) this.f41053c).H.setVisibility(8);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.kw kwVar = (org.telegram.ui.Components.kw) this.f41053c;
                org.telegram.ui.Components.ow owVar = kwVar.J;
                if (owVar.U && !kwVar.h) {
                    if (!this.f41052b && !kwVar.f26815n) {
                        kwVar.setBackground(null);
                        return;
                    } else if (kwVar.getBackground() == null) {
                        kwVar.setBackground(org.telegram.ui.ActionBar.g6.Z(owVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                org.telegram.ui.Components.z00 z00Var = (org.telegram.ui.Components.z00) this.f41053c;
                AnimatorSet animatorSet2 = z00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f41052b) {
                        z00Var.f31714f.setVisibility(4);
                    }
                    z00Var.e = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.k10 k10Var = (org.telegram.ui.Components.k10) this.f41053c;
                if (this.f41052b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                k10Var.h = f12;
                k10Var.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.m30 m30Var = (org.telegram.ui.Components.m30) this.f41053c;
                org.telegram.ui.Components.k30 k30Var = m30Var.f27177a;
                if (!m30Var.F) {
                    if (this.f41052b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    m30Var.f27180b0 = f13;
                    m30Var.U.setPinnedProgress(f13);
                    k30Var.setScaleX(1.0f - (m30Var.f27180b0 * 0.6f));
                    k30Var.setScaleY(1.0f - (m30Var.f27180b0 * 0.6f));
                    if (m30Var.W) {
                        m30Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                View view = (View) this.f41053c;
                if (this.f41052b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 13:
                org.telegram.ui.Components.p70 p70Var = (org.telegram.ui.Components.p70) this.f41053c;
                AnimatorSet animatorSet3 = p70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f41052b) {
                        p70Var.Y.setVisibility(4);
                    }
                    p70Var.X = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.a80 a80Var = (org.telegram.ui.Components.a80) this.f41053c;
                boolean z11 = this.f41052b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                a80Var.f23473h0 = f14;
                org.telegram.ui.Components.a80.X(a80Var).invalidate();
                if (!z11) {
                    a80Var.V.setVisibility(8);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.vc0 vc0Var = (org.telegram.ui.Components.vc0) this.f41053c;
                if (vc0Var.getParent() != null) {
                    ((ViewGroup) vc0Var.getParent()).removeView(vc0Var);
                }
                boolean z12 = this.f41052b;
                nl nlVar = (nl) vc0Var;
                MessagePreviewParams messagePreviewParams = nlVar.H.f35941f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new ml(nlVar, 0), 15L);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.pc0 pc0Var = (org.telegram.ui.Components.pc0) this.f41053c;
                pc0Var.P = null;
                pc0Var.g(this.f41052b, false);
                return;
            case 17:
                org.telegram.ui.Components.re0 re0Var = (org.telegram.ui.Components.re0) this.f41053c;
                TextView textView = re0Var.f28822w;
                bi.i5 i5Var = re0Var.e;
                if (this.f41052b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                i5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                i5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                i5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f15));
                re0Var.f28821s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f41053c;
                if (animator.equals(pipRoundVideoView.f23205r)) {
                    if (!this.f41052b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f23205r = null;
                    return;
                }
                return;
            case 19:
                boolean z13 = this.f41052b;
                org.telegram.ui.Components.ko0 ko0Var = (org.telegram.ui.Components.ko0) this.f41053c;
                if (animator == ko0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    ko0Var.F = f16;
                    ko0Var.setShown(f16);
                    if (!z13) {
                        ko0Var.setVisibility(8);
                    }
                    ko0Var.b(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) this.f41053c;
                if (xv0Var.N1 != null) {
                    xv0Var.N1 = null;
                    if (!this.f41052b) {
                        xv0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.v21 v21Var = (org.telegram.ui.Components.v21) this.f41053c;
                if (this.f41052b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                v21Var.M = f17;
                v21Var.invalidate();
                return;
            case 22:
                org.telegram.ui.Components.t31 t31Var = (org.telegram.ui.Components.t31) this.f41053c;
                if (this.f41052b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                t31Var.F = f18;
                t31Var.h();
                return;
            case 23:
                org.telegram.ui.Components.x31 x31Var = (org.telegram.ui.Components.x31) this.f41053c;
                if (this.f41052b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                x31Var.Q = f19;
                x31Var.h();
                x31Var.g();
                return;
            case 24:
                org.telegram.ui.Components.m71 m71Var = (org.telegram.ui.Components.m71) this.f41053c;
                AnimatorSet animatorSet4 = m71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f41052b) {
                        m71Var.e.setVisibility(4);
                    }
                    m71Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.q71 q71Var = (org.telegram.ui.Components.q71) this.f41053c;
                AnimatorSet animatorSet5 = q71Var.f28540r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f41052b) {
                        q71Var.f28539n.setVisibility(4);
                    }
                    q71Var.f28540r = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.f41053c;
                u2Var.v = null;
                if (this.f41052b) {
                    TextView[] textViewArr = u2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!u2Var.G && (drawable = (drawableArr = u2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                u2Var.G = false;
                if (!u2Var.O) {
                    u2Var.f30536n = u2Var.f30537r;
                }
                u2Var.f30538s = 0.0f;
                u2Var.invalidate();
                return;
            case 27:
                ws wsVar = (ws) this.f41053c;
                if (wsVar.f41647w != null && (radialProgressView2 = wsVar.f41646s) != null) {
                    if (!this.f41052b) {
                        radialProgressView2.setVisibility(4);
                        wsVar.v.setVisibility(4);
                    }
                    wsVar.f41647w = null;
                    return;
                }
                return;
            case 28:
                pz pzVar = (pz) this.f41053c;
                if (this.f41052b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                pzVar.f39313r = f20;
                org.telegram.ui.Components.z9 z9Var2 = pzVar.f39310c;
                int i11 = org.telegram.ui.ActionBar.g6.C6;
                int w02 = org.telegram.ui.ActionBar.g6.w0(i11, pzVar.f39308a);
                int i12 = org.telegram.ui.ActionBar.g6.Oh;
                int d = i0.a.d(pzVar.f39313r, w02, org.telegram.ui.ActionBar.g6.w0(i12, pzVar.f39308a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                z9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                pzVar.f39310c.invalidate();
                pzVar.f39311f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - pzVar.f39313r, org.telegram.ui.ActionBar.g6.w0(i11, pzVar.f39308a), org.telegram.ui.ActionBar.g6.w0(i12, pzVar.f39308a)), mode));
                pzVar.f39311f.invalidate();
                return;
            default:
                e10 e10Var = (e10) this.f41053c;
                if (this.f41052b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                e10Var.f35431s = f21;
                e10Var.invalidate();
                return;
        }
    }

    public vo(View view) {
        this.f41051a = 12;
        this.f41053c = view;
        this.f41052b = true;
    }

    public vo(View view, boolean z10) {
        this.f41051a = 12;
        this.f41053c = view;
        this.f41052b = z10;
    }

    public vo(org.telegram.ui.Components.wo woVar) {
        this.f41051a = 4;
        this.f41053c = woVar;
    }
}
