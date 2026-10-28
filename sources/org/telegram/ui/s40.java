package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class s40 extends AnimatorListenerAdapter {
    public final int f43232a;
    public final boolean f43233b;
    public final Object f43234c;

    public s40(int i10, Object obj, boolean z10) {
        this.f43232a = i10;
        this.f43234c = obj;
        this.f43233b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f43232a) {
            case 1:
                ((z60) this.f43234c).h = null;
                return;
            case 4:
                tq0 tq0Var = (tq0) this.f43234c;
                if (animator.equals(tq0Var.f43742k0)) {
                    tq0Var.f43742k0 = null;
                    return;
                }
                return;
            case 10:
                ((f81) this.f43234c).f39266n = null;
                return;
            case 12:
                fg1 fg1Var = (fg1) this.f43234c;
                AnimatorSet animatorSet = fg1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fg1Var.I = null;
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
        kd kdVar;
        org.telegram.ui.Cells.d4 d4Var;
        int i10 = this.f43232a;
        float f7 = 1.0f;
        float f10 = 0.0f;
        boolean z10 = this.f43233b;
        Object obj = this.f43234c;
        switch (i10) {
            case 0:
                x50 x50Var = (x50) obj;
                x50Var.U2 = null;
                org.telegram.ui.ActionBar.b6 subtitleTextView = x50Var.O.getSubtitleTextView();
                if (!z10) {
                    f10 = AndroidUtilities.dp(20.0f);
                }
                subtitleTextView.setTranslationY(f10);
                return;
            case 1:
                z60 z60Var = (z60) obj;
                if (z60Var.h != null && (kdVar = z60Var.f46175f) != null) {
                    if (z10) {
                        kdVar.setVisibility(4);
                    } else {
                        z60Var.f46176n.setVisibility(4);
                    }
                    z60Var.h = null;
                    return;
                }
                return;
            case 2:
                ig0 ig0Var = (ig0) obj;
                if (!z10) {
                    ig0Var.V.setVisibility(4);
                }
                AnimatorSet animatorSet = ig0Var.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ig0Var.L = null;
                    return;
                }
                return;
            case 3:
                if (!z10) {
                    ((PasscodeActivity) obj).v.setVisibility(8);
                    return;
                }
                return;
            case 4:
                tq0 tq0Var = (tq0) obj;
                if (animator.equals(tq0Var.f43742k0)) {
                    if (!z10) {
                        tq0Var.Z.setVisibility(4);
                        tq0Var.f43729a0.setVisibility(4);
                    }
                    tq0Var.f43742k0 = null;
                    return;
                }
                return;
            case 5:
                zv0 zv0Var = (zv0) obj;
                if (!z10) {
                    f7 = 0.0f;
                }
                zv0Var.E = f7;
                return;
            case 6:
                o01 o01Var = (o01) obj;
                if (o01Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = o01Var.f41950n.U0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = o01Var.f41950n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = o01Var.f41950n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = o01Var.f41950n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    o01Var.setVisibility(8);
                }
                ProfileActivity profileActivity4 = o01Var.f41950n;
                int i11 = ProfileActivity.R6;
                profileActivity4.x5(false);
                return;
            case 7:
                u11 u11Var = (u11) obj;
                if (z10) {
                    u11Var.f43831c.setVisibility(8);
                    return;
                } else {
                    u11Var.f43832f.setVisibility(8);
                    return;
                }
            case 8:
                f41 f41Var = (f41) obj;
                if (!z10) {
                    f7 = 0.0f;
                }
                f41Var.v = f7;
                if (f41Var.S) {
                    f41Var.N.invalidate();
                    return;
                }
                return;
            case 9:
                b61 b61Var = (b61) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b61Var.v;
                if (z10) {
                    f10 = 1.0f;
                }
                b61Var.L = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.ds.f27531g.getInterpolation(b61Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i12 = 0; i12 < itemsCount; i12++) {
                    float cascade = AndroidUtilities.cascade(b61Var.L, i12, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12).setAlpha(cascade);
                }
                b61Var.N = null;
                return;
            case 10:
                f81 f81Var = (f81) obj;
                if (f81Var.f39266n != null && (d4Var = f81Var.f39267r) != null) {
                    if (!z10) {
                        d4Var.setVisibility(4);
                    }
                    f81Var.f39266n = null;
                    return;
                }
                return;
            case 11:
                kd1 kd1Var = (kd1) obj;
                if (!z10) {
                    f7 = 0.0f;
                }
                kd1Var.f40752y = f7;
                return;
            case 12:
                fg1 fg1Var = (fg1) obj;
                AnimatorSet animatorSet2 = fg1Var.I;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (z10) {
                        fg1Var.e.setVisibility(4);
                        return;
                    } else {
                        fg1Var.f39361b.setVisibility(4);
                        return;
                    }
                }
                return;
            case 13:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) obj;
                bi.t tVar = u1Var.V;
                if (!u1Var.T) {
                    tVar.setVisibility(8);
                    tVar.setText("");
                }
                if (!z10) {
                    f7 = 0.0f;
                }
                u1Var.U = f7;
                tVar.setAlpha(f7);
                u1Var.invalidate();
                if (u1Var.T) {
                    tVar.requestFocus();
                    AndroidUtilities.showKeyboard(tVar);
                    return;
                }
                tVar.clearFocus();
                AndroidUtilities.hideKeyboard(tVar);
                return;
            case 14:
                l0 l0Var = (l0) obj;
                bi.t tVar2 = l0Var.f44906b0;
                if (!l0Var.W) {
                    tVar2.setVisibility(8);
                }
                if (!z10) {
                    f7 = 0.0f;
                }
                l0Var.f44904a0 = f7;
                tVar2.setAlpha(f7);
                l0Var.j(l0Var.f44904a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.f44904a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.f44904a0);
                l0Var.invalidate();
                return;
            case 15:
                sg.z1 z1Var = (sg.z1) obj;
                ((rg.n) z1Var).f47506y.f47632n.d();
                if (z10) {
                    z1Var.f48643w.accept(Integer.valueOf(z1Var.f48642s));
                }
                if (z1Var.getParent() != null) {
                    ((ViewGroup) z1Var.getParent()).removeView(z1Var);
                    return;
                }
                return;
            case 16:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                if (z10) {
                    limitPreviewView.f26232j0 = false;
                }
                Runnable runnable = limitPreviewView.f26233k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.f26233k0.run();
                    return;
                }
                return;
            default:
                tg.p0 p0Var = (tg.p0) obj;
                if (!z10) {
                    f7 = 0.0f;
                }
                p0Var.O = f7;
                p0Var.f49016f.invalidate();
                tg.o0 o0Var = p0Var.h;
                if (o0Var != null) {
                    o0Var.invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f43232a) {
            case 2:
                if (this.f43233b) {
                    ((ig0) this.f43234c).V.setVisibility(0);
                    return;
                }
                return;
            case 3:
                if (this.f43233b) {
                    ((PasscodeActivity) this.f43234c).v.setVisibility(0);
                    return;
                }
                return;
            case 4:
            case 5:
            default:
                super.onAnimationStart(animator);
                return;
            case 6:
                o01 o01Var = (o01) this.f43234c;
                org.telegram.ui.ActionBar.w0 w0Var = o01Var.f41950n.U0;
                if (w0Var != null && !this.f43233b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = o01Var.f41950n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = o01Var.f41950n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = o01Var.f41950n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                o01Var.setVisibility(0);
                o01Var.f41950n.x5(false);
                return;
            case 7:
                u11 u11Var = (u11) this.f43234c;
                if (this.f43233b) {
                    u11Var.f43832f.setAlpha(0.0f);
                    u11Var.f43832f.setVisibility(0);
                    return;
                }
                u11Var.f43831c.setAlpha(0.0f);
                u11Var.f43831c.setVisibility(0);
                return;
        }
    }
}
