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
public final class to extends AnimatorListenerAdapter {
    public final int f40828a;
    public boolean f40829b;
    public final Object f40830c;

    public to(int i10, Object obj, boolean z10) {
        this.f40828a = i10;
        this.f40830c = obj;
        this.f40829b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f40828a) {
            case 0:
                ((xo) this.f40830c).h = null;
                return;
            case 1:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f40830c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    daVar.h = null;
                    return;
                }
                return;
            case 3:
                ((org.telegram.ui.Components.vi) this.f40830c).Y0 = null;
                return;
            case 4:
                this.f40829b = true;
                return;
            case 9:
                org.telegram.ui.Components.n00 n00Var = (org.telegram.ui.Components.n00) this.f40830c;
                AnimatorSet animatorSet2 = n00Var.f28613e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    n00Var.f28613e = null;
                    return;
                }
                return;
            case 13:
                org.telegram.ui.Components.r60 r60Var = (org.telegram.ui.Components.r60) this.f40830c;
                AnimatorSet animatorSet3 = r60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    r60Var.X = null;
                    return;
                }
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f40830c;
                if (animator.equals(pipRoundVideoView.f24055r)) {
                    pipRoundVideoView.f24055r = null;
                    return;
                }
                return;
            case 20:
                ((org.telegram.ui.Components.xu0) this.f40830c).N1 = null;
                return;
            case 24:
                org.telegram.ui.Components.j61 j61Var = (org.telegram.ui.Components.j61) this.f40830c;
                AnimatorSet animatorSet4 = j61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    j61Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.o61 o61Var = (org.telegram.ui.Components.o61) this.f40830c;
                AnimatorSet animatorSet5 = o61Var.f29007r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    o61Var.f29007r = null;
                    return;
                }
                return;
            case 27:
                ((ss) this.f40830c).f40545w = null;
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
        switch (this.f40828a) {
            case 0:
                xo xoVar = (xo) this.f40830c;
                if (xoVar.h != null && (radialProgressView = xoVar.f42811n) != null) {
                    if (!this.f40829b) {
                        radialProgressView.setVisibility(4);
                        xoVar.f42803f.setVisibility(4);
                    }
                    xoVar.h = null;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.f40830c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f40829b) {
                        daVar.f25354c.setVisibility(4);
                        return;
                    } else {
                        daVar.f25353b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 2:
                org.telegram.ui.Components.zc zcVar = (org.telegram.ui.Components.zc) this.f40830c;
                if (animator == zcVar.f33150g) {
                    zcVar.f33150g = null;
                    if (this.f40829b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    zcVar.f33151i = f7;
                    zcVar.b();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) this.f40830c;
                if (viVar.Y0 != null) {
                    if (this.f40829b) {
                        if (viVar.S0) {
                            org.telegram.ui.Components.ni niVar = viVar.f31367y0;
                            if (niVar == null || niVar.J()) {
                                viVar.f31364x1.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.ActionBar.v0 v0Var = viVar.f31303e1;
                    if (v0Var != null) {
                        v0Var.setVisibility(4);
                    }
                    if (viVar.Q0 != 0 || !viVar.f31339q1) {
                        viVar.f31289a1.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.io ioVar = (org.telegram.ui.Components.io) this.f40830c;
                if (!this.f40829b) {
                    org.telegram.ui.Components.x9 x9Var = ioVar.h;
                    ioVar.h = ioVar.f27229n;
                    ioVar.f27229n = x9Var;
                    x9Var.setVisibility(8);
                    ioVar.f27229n.setAlpha(0.0f);
                    ioVar.h.setVisibility(0);
                    ioVar.h.setAlpha(1.0f);
                    return;
                }
                return;
            case 5:
                boolean z10 = this.f40829b;
                org.telegram.ui.Components.so soVar = (org.telegram.ui.Components.so) this.f40830c;
                if (animator == soVar.f30407e) {
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    soVar.d = f10;
                    soVar.setShown(f10);
                    if (!z10) {
                        soVar.setVisibility(8);
                    }
                    soVar.a(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) this.f40830c;
                if (this.f40829b) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                lpVar.f28292g0 = f11;
                lpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * lpVar.f28292g0);
                return;
            case 7:
                if (!this.f40829b) {
                    ((org.telegram.ui.Components.lq) this.f40830c).H.setVisibility(8);
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Components.xv xvVar = (org.telegram.ui.Components.xv) this.f40830c;
                org.telegram.ui.Components.bw bwVar = xvVar.J;
                if (bwVar.U && !xvVar.h) {
                    if (!this.f40829b && !xvVar.f32770n) {
                        xvVar.setBackground(null);
                        return;
                    } else if (xvVar.getBackground() == null) {
                        xvVar.setBackground(org.telegram.ui.ActionBar.j6.Y(bwVar.k(), 8, 8));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 9:
                org.telegram.ui.Components.n00 n00Var = (org.telegram.ui.Components.n00) this.f40830c;
                AnimatorSet animatorSet2 = n00Var.f28613e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f40829b) {
                        n00Var.f28614f.setVisibility(4);
                    }
                    n00Var.f28613e = null;
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.y00 y00Var = (org.telegram.ui.Components.y00) this.f40830c;
                if (this.f40829b) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                y00Var.h = f12;
                y00Var.invalidate();
                return;
            case 11:
                org.telegram.ui.Components.z20 z20Var = (org.telegram.ui.Components.z20) this.f40830c;
                org.telegram.ui.Components.x20 x20Var = z20Var.f33083a;
                if (!z20Var.F) {
                    if (this.f40829b) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    z20Var.f33086b0 = f13;
                    z20Var.U.setPinnedProgress(f13);
                    x20Var.setScaleX(1.0f - (z20Var.f33086b0 * 0.6f));
                    x20Var.setScaleY(1.0f - (z20Var.f33086b0 * 0.6f));
                    if (z20Var.W) {
                        z20Var.i();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                super.onAnimationEnd(animator);
                View view = (View) this.f40830c;
                if (this.f40829b) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                view.setVisibility(i10);
                return;
            case 13:
                org.telegram.ui.Components.r60 r60Var = (org.telegram.ui.Components.r60) this.f40830c;
                AnimatorSet animatorSet3 = r60Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.f40829b) {
                        r60Var.Y.setVisibility(4);
                    }
                    r60Var.X = null;
                    return;
                }
                return;
            case 14:
                org.telegram.ui.Components.b70 b70Var = (org.telegram.ui.Components.b70) this.f40830c;
                boolean z11 = this.f40829b;
                if (z11) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                b70Var.f24601h0 = f14;
                org.telegram.ui.Components.b70.W(b70Var).invalidate();
                if (!z11) {
                    b70Var.V.setVisibility(8);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Components.wb0 wb0Var = (org.telegram.ui.Components.wb0) this.f40830c;
                if (wb0Var.getParent() != null) {
                    ((ViewGroup) wb0Var.getParent()).removeView(wb0Var);
                }
                boolean z12 = this.f40829b;
                il ilVar = (il) wb0Var;
                MessagePreviewParams messagePreviewParams = ilVar.H.f35282f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new hl(ilVar, 0), 15L);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.qb0 qb0Var = (org.telegram.ui.Components.qb0) this.f40830c;
                qb0Var.P = null;
                qb0Var.g(this.f40829b, false);
                return;
            case 17:
                org.telegram.ui.Components.sd0 sd0Var = (org.telegram.ui.Components.sd0) this.f40830c;
                TextView textView = sd0Var.f30290w;
                bi.g5 g5Var = sd0Var.f30285e;
                if (this.f40829b) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                g5Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                g5Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f15));
                g5Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f15));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f15));
                sd0Var.f30289s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f15));
                return;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.f40830c;
                if (animator.equals(pipRoundVideoView.f24055r)) {
                    if (!this.f40829b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.f24055r = null;
                    return;
                }
                return;
            case 19:
                boolean z13 = this.f40829b;
                org.telegram.ui.Components.hn0 hn0Var = (org.telegram.ui.Components.hn0) this.f40830c;
                if (animator == hn0Var.G) {
                    if (z13) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    hn0Var.F = f16;
                    hn0Var.setShown(f16);
                    if (!z13) {
                        hn0Var.setVisibility(8);
                    }
                    hn0Var.b(true);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.xu0 xu0Var = (org.telegram.ui.Components.xu0) this.f40830c;
                if (xu0Var.N1 != null) {
                    xu0Var.N1 = null;
                    if (!this.f40829b) {
                        xu0Var.B0.setVisibility(4);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.t11 t11Var = (org.telegram.ui.Components.t11) this.f40830c;
                if (this.f40829b) {
                    f17 = 1.0f;
                } else {
                    f17 = 0.0f;
                }
                t11Var.M = f17;
                t11Var.invalidate();
                return;
            case 22:
                org.telegram.ui.Components.r21 r21Var = (org.telegram.ui.Components.r21) this.f40830c;
                if (this.f40829b) {
                    f18 = 1.0f;
                } else {
                    f18 = 0.0f;
                }
                r21Var.F = f18;
                r21Var.h();
                return;
            case 23:
                org.telegram.ui.Components.v21 v21Var = (org.telegram.ui.Components.v21) this.f40830c;
                if (this.f40829b) {
                    f19 = 1.0f;
                } else {
                    f19 = 0.0f;
                }
                v21Var.Q = f19;
                v21Var.h();
                v21Var.g();
                return;
            case 24:
                org.telegram.ui.Components.j61 j61Var = (org.telegram.ui.Components.j61) this.f40830c;
                AnimatorSet animatorSet4 = j61Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.f40829b) {
                        j61Var.f27390e.setVisibility(4);
                    }
                    j61Var.d = null;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.Components.o61 o61Var = (org.telegram.ui.Components.o61) this.f40830c;
                AnimatorSet animatorSet5 = o61Var.f29007r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.f40829b) {
                        o61Var.f29006n.setVisibility(4);
                    }
                    o61Var.f29007r = null;
                    return;
                }
                return;
            case 26:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.f40830c;
                t2Var.v = null;
                if (this.f40829b) {
                    TextView[] textViewArr = t2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!t2Var.G && (drawable = (drawableArr = t2Var.f31881e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                t2Var.G = false;
                if (!t2Var.O) {
                    t2Var.f31883n = t2Var.f31884r;
                }
                t2Var.f31885s = 0.0f;
                t2Var.invalidate();
                return;
            case 27:
                ss ssVar = (ss) this.f40830c;
                if (ssVar.f40545w != null && (radialProgressView2 = ssVar.f40544s) != null) {
                    if (!this.f40829b) {
                        radialProgressView2.setVisibility(4);
                        ssVar.v.setVisibility(4);
                    }
                    ssVar.f40545w = null;
                    return;
                }
                return;
            case 28:
                lz lzVar = (lz) this.f40830c;
                if (this.f40829b) {
                    f20 = 1.0f;
                } else {
                    f20 = 0.0f;
                }
                lzVar.f38550r = f20;
                org.telegram.ui.Components.x9 x9Var2 = lzVar.f38546c;
                int i11 = org.telegram.ui.ActionBar.j6.C6;
                int v02 = org.telegram.ui.ActionBar.j6.v0(i11, lzVar.f38544a);
                int i12 = org.telegram.ui.ActionBar.j6.Oh;
                int d = i0.a.d(lzVar.f38550r, v02, org.telegram.ui.ActionBar.j6.v0(i12, lzVar.f38544a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                x9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                lzVar.f38546c.invalidate();
                lzVar.f38548f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - lzVar.f38550r, org.telegram.ui.ActionBar.j6.v0(i11, lzVar.f38544a), org.telegram.ui.ActionBar.j6.v0(i12, lzVar.f38544a)), mode));
                lzVar.f38548f.invalidate();
                return;
            default:
                y00 y00Var2 = (y00) this.f40830c;
                if (this.f40829b) {
                    f21 = 1.0f;
                } else {
                    f21 = 0.0f;
                }
                y00Var2.f42960s = f21;
                y00Var2.invalidate();
                return;
        }
    }

    public to(View view) {
        this.f40828a = 12;
        this.f40830c = view;
        this.f40829b = true;
    }

    public to(View view, boolean z10) {
        this.f40828a = 12;
        this.f40830c = view;
        this.f40829b = z10;
    }

    public to(org.telegram.ui.Components.io ioVar) {
        this.f40828a = 4;
        this.f40830c = ioVar;
    }
}
