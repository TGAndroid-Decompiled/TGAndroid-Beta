package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class u40 extends AnimatorListenerAdapter {
    public final int f49973a;
    public final boolean f49974b;
    public final Object f49975c;

    public u40(int i3, Object obj, boolean z10) {
        this.f49973a = i3;
        this.f49975c = obj;
        this.f49974b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f49973a) {
            case 0:
                ((y40) this.f49975c).h = null;
                return;
            case 3:
                sm0 sm0Var = (sm0) this.f49975c;
                if (animator.equals(sm0Var.f49554l0)) {
                    sm0Var.f49554l0 = null;
                    return;
                }
                return;
            case 9:
                ((c31) this.f49975c).f44226n = null;
                return;
            case 11:
                ra1 ra1Var = (ra1) this.f49975c;
                AnimatorSet animatorSet = ra1Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ra1Var.J = null;
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        xc xcVar;
        org.telegram.ui.Cells.b4 b4Var;
        int i3 = this.f49973a;
        float f10 = 0.0f;
        boolean z10 = this.f49974b;
        Object obj = this.f49975c;
        switch (i3) {
            case 0:
                y40 y40Var = (y40) obj;
                if (y40Var.h != null && (xcVar = y40Var.f52184f) != null) {
                    if (z10) {
                        xcVar.setVisibility(4);
                    } else {
                        y40Var.f52185n.setVisibility(4);
                    }
                    y40Var.h = null;
                    return;
                }
                return;
            case 1:
                xd0 xd0Var = (xd0) obj;
                if (!z10) {
                    xd0Var.W.setVisibility(4);
                }
                AnimatorSet animatorSet = xd0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xd0Var.M = null;
                    return;
                }
                return;
            case 2:
                if (!z10) {
                    ((PasscodeActivity) obj).f41362w.setVisibility(8);
                    return;
                }
                return;
            case 3:
                sm0 sm0Var = (sm0) obj;
                if (animator.equals(sm0Var.f49554l0)) {
                    if (!z10) {
                        sm0Var.f49539a0.setVisibility(4);
                        sm0Var.f49541b0.setVisibility(4);
                    }
                    sm0Var.f49554l0 = null;
                    return;
                }
                return;
            case 4:
                pr0 pr0Var = (pr0) obj;
                if (z10) {
                    f10 = 1.0f;
                }
                pr0Var.F = f10;
                return;
            case 5:
                ew0 ew0Var = (ew0) obj;
                ProfileActivity profileActivity = ew0Var.f45062n;
                if (ew0Var.h) {
                    org.telegram.ui.ActionBar.f5 f5Var = profileActivity.U0;
                    if (f5Var != null) {
                        f5Var.setClickable(false);
                    }
                } else {
                    ew0Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.T6;
                profileActivity.L5(false);
                return;
            case 6:
                fx0 fx0Var = (fx0) obj;
                if (z10) {
                    fx0Var.f45398c.setVisibility(8);
                    return;
                } else {
                    fx0Var.f45400f.setVisibility(8);
                    return;
                }
            case 7:
                iz0 iz0Var = (iz0) obj;
                if (z10) {
                    f10 = 1.0f;
                }
                iz0Var.f46470w = f10;
                if (iz0Var.T) {
                    iz0Var.O.invalidate();
                    return;
                }
                return;
            case 8:
                c11 c11Var = (c11) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c11Var.f44198w;
                if (z10) {
                    f10 = 1.0f;
                }
                c11Var.M = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.xq.f40453g.getInterpolation(c11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s6 = org.telegram.messenger.g0.s(c11Var.M, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setTranslationY((1.0f - s6) * org.telegram.messenger.g0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setAlpha(s6);
                }
                c11Var.O = null;
                return;
            case 9:
                c31 c31Var = (c31) obj;
                if (c31Var.f44226n != null && (b4Var = c31Var.f44227r) != null) {
                    if (!z10) {
                        b4Var.setVisibility(4);
                    }
                    c31Var.f44226n = null;
                    return;
                }
                return;
            case 10:
                w71 w71Var = (w71) obj;
                if (z10) {
                    f10 = 1.0f;
                }
                w71Var.E = f10;
                return;
            case 11:
                ra1 ra1Var = (ra1) obj;
                AnimatorSet animatorSet2 = ra1Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z10) {
                        ra1Var.f49160e.setVisibility(4);
                        return;
                    } else {
                        ra1Var.f49155b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.i1 i1Var = (org.telegram.ui.web.i1) obj;
                ci.s sVar = i1Var.W;
                if (!i1Var.U) {
                    sVar.setVisibility(8);
                    sVar.setText("");
                }
                if (z10) {
                    f10 = 1.0f;
                }
                i1Var.V = f10;
                sVar.setAlpha(f10);
                i1Var.invalidate();
                if (i1Var.U) {
                    sVar.requestFocus();
                    org.telegram.messenger.g0.K3(sVar);
                    return;
                }
                sVar.clearFocus();
                org.telegram.messenger.g0.v1(sVar);
                return;
            case 13:
                m0 m0Var = (m0) obj;
                ci.s sVar2 = m0Var.f50875c0;
                if (!m0Var.f50871a0) {
                    sVar2.setVisibility(8);
                }
                if (z10) {
                    f10 = 1.0f;
                }
                m0Var.f50873b0 = f10;
                sVar2.setAlpha(f10);
                m0Var.j(m0Var.f50873b0);
                m0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * m0Var.f50873b0);
                m0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * m0Var.f50873b0);
                m0Var.invalidate();
                return;
            case 14:
                if (z10) {
                    ((pg.m) obj).e(false, false, true, false);
                    return;
                }
                return;
            case 15:
                ug.o1 o1Var = (ug.o1) obj;
                ((tg.i) o1Var).E.f55290p1.c();
                if (z10) {
                    o1Var.f56203x.accept(Integer.valueOf(o1Var.f56201s));
                }
                if (o1Var.getParent() != null) {
                    ((ViewGroup) o1Var.getParent()).removeView(o1Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z10) {
                    limitPreviewView.f31535k0 = false;
                }
                Runnable runnable = limitPreviewView.f31536l0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    limitPreviewView.f31536l0.run();
                    return;
                }
                return;
            default:
                vg.o0 o0Var = (vg.o0) obj;
                if (z10) {
                    f10 = 1.0f;
                }
                o0Var.P = f10;
                o0Var.f56763f.invalidate();
                vg.n0 n0Var = o0Var.h;
                if (n0Var != null) {
                    n0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f49973a) {
            case 1:
                if (this.f49974b) {
                    ((xd0) this.f49975c).W.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f49974b) {
                    ((PasscodeActivity) this.f49975c).f41362w.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                ew0 ew0Var = (ew0) this.f49975c;
                ProfileActivity profileActivity = ew0Var.f45062n;
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity.U0;
                if (f5Var != null && !this.f49974b) {
                    f5Var.setClickable(true);
                }
                profileActivity.B5(true);
                ew0Var.setVisibility(0);
                profileActivity.L5(false);
                return;
            case 6:
                fx0 fx0Var = (fx0) this.f49975c;
                if (this.f49974b) {
                    fx0Var.f45400f.setAlpha(0.0f);
                    fx0Var.f45400f.setVisibility(0);
                    return;
                }
                fx0Var.f45398c.setAlpha(0.0f);
                fx0Var.f45398c.setVisibility(0);
                return;
        }
    }
}
