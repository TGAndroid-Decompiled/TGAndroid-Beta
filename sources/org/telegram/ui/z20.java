package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class z20 extends AnimatorListenerAdapter {
    public final int f53781a;
    public final boolean f53782b;
    public final Object f53783c;

    public z20(int i7, Object obj, boolean z10) {
        this.f53781a = i7;
        this.f53783c = obj;
        this.f53782b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f53781a) {
            case 1:
                ((c50) this.f53783c).h = null;
                return;
            case 4:
                zm0 zm0Var = (zm0) this.f53783c;
                if (animator.equals(zm0Var.f53971l0)) {
                    zm0Var.f53971l0 = null;
                    return;
                }
                return;
            case 10:
                ((k31) this.f53783c).f48527n = null;
                return;
            case 12:
                xa1 xa1Var = (xa1) this.f53783c;
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
        int i7 = this.f53781a;
        float f10 = 1.0f;
        float f11 = 0.0f;
        boolean z10 = this.f53782b;
        Object obj = this.f53783c;
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
                if (c50Var.h != null && (xcVar = c50Var.f46010f) != null) {
                    if (z10) {
                        xcVar.setVisibility(4);
                    } else {
                        c50Var.f46011n.setVisibility(4);
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
                zm0 zm0Var = (zm0) obj;
                if (animator.equals(zm0Var.f53971l0)) {
                    if (!z10) {
                        zm0Var.f53956a0.setVisibility(4);
                        zm0Var.f53958b0.setVisibility(4);
                    }
                    zm0Var.f53971l0 = null;
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
                ProfileActivity profileActivity = lw0Var.f49051n;
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
                    mx0Var.f49331c.setVisibility(8);
                    return;
                } else {
                    mx0Var.f49333f.setVisibility(8);
                    return;
                }
            case 8:
                pz0 pz0Var = (pz0) obj;
                if (!z10) {
                    f10 = 0.0f;
                }
                pz0Var.f50404w = f10;
                if (pz0Var.T) {
                    pz0Var.O.invalidate();
                    return;
                }
                return;
            case 9:
                j11 j11Var = (j11) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = j11Var.f48179w;
                if (z10) {
                    f11 = 1.0f;
                }
                j11Var.M = f11;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f11);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.er.f34420g.getInterpolation(j11Var.M));
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
                if (k31Var.f48527n != null && (b4Var = k31Var.f48528r) != null) {
                    if (!z10) {
                        b4Var.setVisibility(4);
                    }
                    k31Var.f48527n = null;
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
                        xa1Var.f53145e.setVisibility(4);
                        return;
                    } else {
                        xa1Var.f53140b.setVisibility(4);
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
                di.q qVar2 = l0Var.f52652c0;
                if (!l0Var.f52648a0) {
                    qVar2.setVisibility(8);
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                l0Var.f52650b0 = f10;
                qVar2.setAlpha(f10);
                l0Var.j(l0Var.f52650b0);
                l0Var.S.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.f52650b0);
                l0Var.P.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.f52650b0);
                l0Var.invalidate();
                return;
            case 15:
                tg.o1 o1Var = (tg.o1) obj;
                ((sg.i) o1Var).E.f56749s1.d();
                if (z10) {
                    o1Var.f57505x.accept(Integer.valueOf(o1Var.f57503s));
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
        switch (this.f53781a) {
            case 2:
                if (this.f53782b) {
                    ((ce0) this.f53783c).W.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f53782b) {
                    ((PasscodeActivity) this.f53783c).f42701w.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                lw0 lw0Var = (lw0) this.f53783c;
                ProfileActivity profileActivity = lw0Var.f49051n;
                org.telegram.ui.ActionBar.d5 d5Var = profileActivity.U0;
                if (d5Var != null && !this.f53782b) {
                    d5Var.setClickable(true);
                }
                profileActivity.E5(true);
                lw0Var.setVisibility(0);
                profileActivity.O5(false);
                return;
            case 7:
                mx0 mx0Var = (mx0) this.f53783c;
                if (this.f53782b) {
                    mx0Var.f49333f.setAlpha(0.0f);
                    mx0Var.f49333f.setVisibility(0);
                    return;
                }
                mx0Var.f49331c.setAlpha(0.0f);
                mx0Var.f49331c.setVisibility(0);
                return;
        }
    }
}
