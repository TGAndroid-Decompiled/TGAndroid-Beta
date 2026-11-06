package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class z40 extends AnimatorListenerAdapter {
    public final int f52470a;
    public final boolean f52471b;
    public final Object f52472c;

    public z40(int i7, Object obj, boolean z9) {
        this.f52470a = i7;
        this.f52472c = obj;
        this.f52471b = z9;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f52470a) {
            case 0:
                ((d50) this.f52472c).h = null;
                return;
            case 3:
                xm0 xm0Var = (xm0) this.f52472c;
                if (animator.equals(xm0Var.f51927k0)) {
                    xm0Var.f51927k0 = null;
                    return;
                }
                return;
            case 9:
                ((m31) this.f52472c).f47653n = null;
                return;
            case 11:
                ya1 ya1Var = (ya1) this.f52472c;
                AnimatorSet animatorSet = ya1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ya1Var.I = null;
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
        yc ycVar;
        org.telegram.ui.Cells.b4 b4Var;
        int i7 = this.f52470a;
        float f10 = 0.0f;
        boolean z9 = this.f52471b;
        Object obj = this.f52472c;
        switch (i7) {
            case 0:
                d50 d50Var = (d50) obj;
                if (d50Var.h != null && (ycVar = d50Var.f44951f) != null) {
                    if (z9) {
                        ycVar.setVisibility(4);
                    } else {
                        d50Var.f44952n.setVisibility(4);
                    }
                    d50Var.h = null;
                    return;
                }
                return;
            case 1:
                ce0 ce0Var = (ce0) obj;
                if (!z9) {
                    ce0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = ce0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ce0Var.L = null;
                    return;
                }
                return;
            case 2:
                if (!z9) {
                    ((PasscodeActivity) obj).f41330w.setVisibility(8);
                    return;
                }
                return;
            case 3:
                xm0 xm0Var = (xm0) obj;
                if (animator.equals(xm0Var.f51927k0)) {
                    if (!z9) {
                        xm0Var.Z.setVisibility(4);
                        xm0Var.f51913a0.setVisibility(4);
                    }
                    xm0Var.f51927k0 = null;
                    return;
                }
                return;
            case 4:
                zr0 zr0Var = (zr0) obj;
                if (z9) {
                    f10 = 1.0f;
                }
                zr0Var.E = f10;
                return;
            case 5:
                mw0 mw0Var = (mw0) obj;
                ProfileActivity profileActivity = mw0Var.f47893n;
                if (mw0Var.h) {
                    org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
                    if (f5Var != null) {
                        f5Var.setClickable(false);
                    }
                } else {
                    mw0Var.setVisibility(8);
                }
                RectF rectF = ProfileActivity.S6;
                profileActivity.L5(false);
                return;
            case 6:
                nx0 nx0Var = (nx0) obj;
                if (z9) {
                    nx0Var.f48161c.setVisibility(8);
                    return;
                } else {
                    nx0Var.f48163f.setVisibility(8);
                    return;
                }
            case 7:
                rz0 rz0Var = (rz0) obj;
                if (z9) {
                    f10 = 1.0f;
                }
                rz0Var.f49605w = f10;
                if (rz0Var.S) {
                    rz0Var.N.invalidate();
                    return;
                }
                return;
            case 8:
                m11 m11Var = (m11) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m11Var.f47630w;
                if (z9) {
                    f10 = 1.0f;
                }
                m11Var.L = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.xq.f40330g.getInterpolation(m11Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float s5 = org.telegram.messenger.g0.s(m11Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - s5) * org.telegram.messenger.g0.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(s5);
                }
                m11Var.N = null;
                return;
            case 9:
                m31 m31Var = (m31) obj;
                if (m31Var.f47653n != null && (b4Var = m31Var.f47654r) != null) {
                    if (!z9) {
                        b4Var.setVisibility(4);
                    }
                    m31Var.f47653n = null;
                    return;
                }
                return;
            case 10:
                f81 f81Var = (f81) obj;
                if (z9) {
                    f10 = 1.0f;
                }
                f81Var.D = f10;
                return;
            case 11:
                ya1 ya1Var = (ya1) obj;
                AnimatorSet animatorSet2 = ya1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z9) {
                        ya1Var.f52189e.setVisibility(4);
                        return;
                    } else {
                        ya1Var.f52184b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 12:
                org.telegram.ui.web.l1 l1Var = (org.telegram.ui.web.l1) obj;
                bi.v vVar = l1Var.V;
                if (!l1Var.T) {
                    vVar.setVisibility(8);
                    vVar.setText("");
                }
                if (z9) {
                    f10 = 1.0f;
                }
                l1Var.U = f10;
                vVar.setAlpha(f10);
                l1Var.invalidate();
                if (l1Var.T) {
                    vVar.requestFocus();
                    org.telegram.messenger.g0.K3(vVar);
                    return;
                }
                vVar.clearFocus();
                org.telegram.messenger.g0.v1(vVar);
                return;
            case 13:
                l0 l0Var = (l0) obj;
                bi.v vVar2 = l0Var.f51203b0;
                if (!l0Var.W) {
                    vVar2.setVisibility(8);
                }
                if (z9) {
                    f10 = 1.0f;
                }
                l0Var.f51201a0 = f10;
                vVar2.setAlpha(f10);
                l0Var.j(l0Var.f51201a0);
                l0Var.R.setTranslationX(org.telegram.messenger.g0.L(56.0f) * l0Var.f51201a0);
                l0Var.O.setTranslationX(org.telegram.messenger.g0.L(112.0f) * l0Var.f51201a0);
                l0Var.invalidate();
                return;
            case 14:
                tg.o1 o1Var = (tg.o1) obj;
                ((sg.i) o1Var).D.f55094o1.c();
                if (z9) {
                    o1Var.f55800x.accept(Integer.valueOf(o1Var.f55798s));
                }
                if (o1Var.getParent() != null) {
                    ((ViewGroup) o1Var.getParent()).removeView(o1Var);
                    return;
                }
                return;
            case 15:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z9) {
                    limitPreviewView.f31458j0 = false;
                }
                Runnable runnable = limitPreviewView.f31459k0;
                if (runnable != null) {
                    org.telegram.messenger.g0.r(runnable);
                    limitPreviewView.f31459k0.run();
                    return;
                }
                return;
            default:
                ug.p0 p0Var = (ug.p0) obj;
                if (z9) {
                    f10 = 1.0f;
                }
                p0Var.O = f10;
                p0Var.f56665f.invalidate();
                ug.o0 o0Var = p0Var.h;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f52470a) {
            case 1:
                if (this.f52471b) {
                    ((ce0) this.f52472c).V.setVisibility(0);
                    return;
                }
                return;
            case 2:
                if (this.f52471b) {
                    ((PasscodeActivity) this.f52472c).f41330w.setVisibility(0);
                    return;
                }
                return;
            case 3:
            case 4:
            default:
                super.onAnimationStart(animator);
                return;
            case 5:
                mw0 mw0Var = (mw0) this.f52472c;
                ProfileActivity profileActivity = mw0Var.f47893n;
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
                if (f5Var != null && !this.f52471b) {
                    f5Var.setClickable(true);
                }
                profileActivity.B5(true);
                mw0Var.setVisibility(0);
                profileActivity.L5(false);
                return;
            case 6:
                nx0 nx0Var = (nx0) this.f52472c;
                if (this.f52471b) {
                    nx0Var.f48163f.setAlpha(0.0f);
                    nx0Var.f48163f.setVisibility(0);
                    return;
                }
                nx0Var.f48161c.setAlpha(0.0f);
                nx0Var.f48161c.setVisibility(0);
                return;
        }
    }
}
