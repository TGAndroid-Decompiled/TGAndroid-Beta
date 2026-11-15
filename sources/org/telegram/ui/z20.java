package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class z20 extends AnimatorListenerAdapter {
    public final int f53816a;
    public final boolean f53817b;
    public final Object f53818c;

    public z20(int i7, Object obj, boolean z10) {
        this.f53816a = i7;
        this.f53818c = obj;
        this.f53817b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f53816a) {
            case 1:
                ((c50) this.f53818c).h = null;
                return;
            case 4:
                ym0 ym0Var = (ym0) this.f53818c;
                if (animator.equals(ym0Var.f53580l0)) {
                    ym0Var.f53580l0 = null;
                    return;
                }
                return;
            case 10:
                ((k31) this.f53818c).f48573n = null;
                return;
            case 12:
                xa1 xa1Var = (xa1) this.f53818c;
                AnimatorSet animatorSet = xa1Var.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xa1Var.J = null;
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
        int i7 = this.f53816a;
        float f10 = 1.0f;
        float f11 = 0.0f;
        boolean z10 = this.f53817b;
        Object obj = this.f53818c;
        switch (i7) {
            case 0:
                c40 c40Var = (c40) obj;
                c40Var.T4 = null;
                org.telegram.ui.ActionBar.j5 subtitleTextView = c40Var.J1.getSubtitleTextView();
                if (!z10) {
                    f11 = org.telegram.messenger.g0.L(20.0f);
                }
                subtitleTextView.setTranslationY(f11);
                return;
            case 1:
                c50 c50Var = (c50) obj;
                if (c50Var.h != null && (xcVar = c50Var.f46021f) != null) {
                    if (z10) {
                        xcVar.setVisibility(4);
                    } else {
                        c50Var.f46022n.setVisibility(4);
                    }
                    c50Var.h = null;
                    return;
                }
                return;
            case 2:
                ce0 ce0Var = (ce0) obj;
                if (!z10) {
                    ce0Var.W.setVisibility(4);
                }
                AnimatorSet animatorSet = ce0Var.M;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ce0Var.M = null;
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    ((PasscodeActivity) obj).f42701w.setVisibility(8);
                    return;
                }
                return;
            case 4:
                ym0 ym0Var = (ym0) obj;
                if (animator.equals(ym0Var.f53580l0)) {
                    if (!z10) {
                        ym0Var.f53565a0.setVisibility(4);
                        ym0Var.f53567b0.setVisibility(4);
                    }
                    ym0Var.f53580l0 = null;
                    return;
                }
                return;
            case 5:
                xr0 xr0Var = (xr0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                xr0Var.F = f10;
                return;
            case 6:
                lw0 lw0Var = (lw0) obj;
                ProfileActivity profileActivity = lw0Var.f49055n;
                if (lw0Var.h) {
                    org.telegram.ui.ActionBar.d5 d5Var = profileActivity.U0;
                    if (d5Var != null) {
                        d5Var.setClickable(false);
                    }
                } else {
                    lw0Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.X6;
                profileActivity.O5(false);
                return;
            case 7:
                mx0 mx0Var = (mx0) obj;
                if (z10) {
                    mx0Var.f49332c.setVisibility(8);
                    return;
                } else {
                    mx0Var.f49334f.setVisibility(8);
                    return;
                }
            case 8:
                pz0 pz0Var = (pz0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                pz0Var.f50413w = f10;
                if (pz0Var.T) {
                    pz0Var.O.invalidate();
                    return;
                }
                return;
            case 9:
                j11 j11Var = (j11) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = j11Var.f48194w;
                if (z10) {
                    f11 = 1.0f;
                }
                j11Var.M = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.er.f34421g.getInterpolation(j11Var.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s5 = org.telegram.messenger.g0.s(j11Var.M, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10).setAlpha(s5);
                }
                j11Var.O = null;
                return;
            case 10:
                k31 k31Var = (k31) obj;
                if (k31Var.f48573n != null && (b4Var = k31Var.f48574r) != null) {
                    if (!z10) {
                        b4Var.setVisibility(4);
                    }
                    k31Var.f48573n = null;
                    return;
                }
                return;
            case 11:
                e81 e81Var = (e81) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                e81Var.E = f10;
                return;
            case 12:
                xa1 xa1Var = (xa1) obj;
                AnimatorSet animatorSet2 = xa1Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z10) {
                        xa1Var.f53146e.setVisibility(4);
                        return;
                    } else {
                        xa1Var.f53141b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 13:
                org.telegram.ui.web.j1 j1Var = (org.telegram.ui.web.j1) obj;
                di.q qVar = j1Var.W;
                if (!j1Var.U) {
                    qVar.setVisibility(8);
                    qVar.setText("");
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                j1Var.V = f10;
                qVar.setAlpha(f10);
                j1Var.invalidate();
                if (j1Var.U) {
                    qVar.requestFocus();
                    org.telegram.messenger.g0.J3(qVar);
                    return;
                }
                qVar.clearFocus();
                org.telegram.messenger.g0.v1(qVar);
                return;
            case 14:
                l0 l0Var = (l0) obj;
                di.q qVar2 = l0Var.f52649c0;
                if (!l0Var.f52645a0) {
                    qVar2.setVisibility(8);
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                l0Var.f52647b0 = f10;
                qVar2.setAlpha(f10);
                l0Var.j(l0Var.f52647b0);
                l0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.f52647b0);
                l0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.f52647b0);
                l0Var.invalidate();
                return;
            case 15:
                tg.o1 o1Var = (tg.o1) obj;
                ((sg.i) o1Var).E.f56749s1.d();
                if (z10) {
                    o1Var.f57494x.accept(Integer.valueOf(o1Var.f57492s));
                }
                if (o1Var.getParent() != null) {
                    ((ViewGroup) o1Var.getParent()).removeView(o1Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z10) {
                    limitPreviewView.f32642k0 = false;
                }
                Runnable runnable = limitPreviewView.f32643l0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    limitPreviewView.f32643l0.run();
                    return;
                }
                return;
            default:
                ug.q0 q0Var = (ug.q0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                q0Var.P = f10;
                q0Var.f58267f.invalidate();
                ug.p0 p0Var = q0Var.h;
                if (p0Var != null) {
                    p0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f53816a) {
            case 2:
                if (this.f53817b) {
                    ((ce0) this.f53818c).W.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f53817b) {
                    ((PasscodeActivity) this.f53818c).f42701w.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                lw0 lw0Var = (lw0) this.f53818c;
                ProfileActivity profileActivity = lw0Var.f49055n;
                org.telegram.ui.ActionBar.d5 d5Var = profileActivity.U0;
                if (d5Var != null && !this.f53817b) {
                    d5Var.setClickable(true);
                }
                profileActivity.E5(true);
                lw0Var.setVisibility(0);
                profileActivity.O5(false);
                return;
            case 7:
                mx0 mx0Var = (mx0) this.f53818c;
                if (this.f53817b) {
                    mx0Var.f49334f.setAlpha(0.0f);
                    mx0Var.f49334f.setVisibility(0);
                    return;
                }
                mx0Var.f49332c.setAlpha(0.0f);
                mx0Var.f49332c.setVisibility(0);
                return;
        }
    }
}
