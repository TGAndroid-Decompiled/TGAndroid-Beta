package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class rm extends org.telegram.ui.ActionBar.o1 {
    public final sm f41509x;

    public rm(sm smVar, sm smVar2) {
        super(smVar2);
        this.f41509x = smVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        zn znVar = this.f41509x.J0;
        org.telegram.ui.ActionBar.b5 parentLayout = znVar.getParentLayout();
        if (!znVar.Pa) {
            z10 = ((org.telegram.ui.ActionBar.m2) znVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.m2) znVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && znVar.f44928pa <= 0 && System.currentTimeMillis() - znVar.E9 >= 250) {
                    if ((znVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).A()) && !((ActionBarLayout) parentLayout).f20372n) {
                        z12 = ((org.telegram.ui.ActionBar.m2) znVar).isPaused;
                        if (!z12 && znVar.N5) {
                            ai.h4 h4Var = znVar.J1;
                            if (h4Var == null || !h4Var.isShowing()) {
                                ok okVar = znVar.Y;
                                if (okVar == null || okVar.getTrendingStickersAlert() == null || !znVar.Y.getTrendingStickersAlert().isShowing()) {
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        int i10;
        org.telegram.ui.Components.l20 l20Var;
        sm smVar = this.f41509x;
        zn znVar = smVar.J0;
        if (znVar.getParentLayout() == null || !((ActionBarLayout) znVar.getParentLayout()).f20372n) {
            znVar.f45018w9 = f7;
            znVar.f45032x9 = f10;
            ai.h4 h4Var = znVar.J1;
            if (h4Var == null || !h4Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.m2) znVar).actionBar;
                kVar.setTranslationY(f7);
                el elVar = znVar.f44758bb;
                if (elVar != null) {
                    float f11 = znVar.f45018w9;
                    zk zkVar = znVar.f44908o1;
                    if (zkVar != null) {
                        i10 = zkVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    elVar.setTranslationY(f11 + i10);
                }
                ci.d4 d4Var = znVar.f45010w1;
                if (d4Var != null) {
                    d4Var.setTranslationY(f7);
                }
                ci.d4 d4Var2 = znVar.f44997v1;
                if (d4Var2 != null) {
                    d4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = znVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                znVar.P.setTranslationY(f7 / 2.0f);
                int i11 = (int) f7;
                znVar.X0.setBackgroundTranslation(i11);
                org.telegram.ui.Components.y60 y60Var = znVar.f44750b3;
                if (y60Var != null) {
                    y60Var.e(f7);
                }
                ci.r6 r6Var = znVar.f45038y2;
                if (r6Var != null) {
                    org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) r6Var.f5906b;
                    haVar.f27020u = f7;
                    haVar.d.invalidate();
                }
                znVar.setFragmentPanTranslationOffset(i11);
                znVar.t9();
                znVar.w9();
            } else {
                smVar.setNonNoveTranslation(f7);
            }
            znVar.f45023x0.invalidate();
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30825w;
            if (scVar != null && znVar.Zb != null) {
                scVar.l();
            }
            if (AndroidUtilities.isTablet() && (znVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.m2 lastFragment = ((LaunchActivity) znVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof sy) {
                    sy syVar = (sy) lastFragment;
                    syVar.f42027v1 = f7;
                    syVar.U4();
                }
            }
            org.telegram.ui.Components.a50 a50Var = znVar.f44960s2;
            if (a50Var != null && a50Var.getVisibility() == 0) {
                znVar.f44960s2.f(znVar.Y.getAudioVideoButtonContainer(), false);
            }
            ik ikVar = znVar.X1;
            if (ikVar != null && (l20Var = ikVar.B0) != null) {
                l20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.le leVar;
        zn znVar = this.f41509x.J0;
        ok okVar = znVar.Y;
        if (okVar != null && (leVar = okVar.f23995u0) != null) {
            leVar.run();
            okVar.f23995u0 = null;
        }
        org.telegram.ui.Components.a50 a50Var = znVar.f44960s2;
        if (a50Var != null && a50Var.getVisibility() == 0) {
            znVar.f44960s2.f(znVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.vd vdVar;
        zn znVar = this.f41509x.J0;
        znVar.D4 = true;
        ok okVar = znVar.Y;
        if (okVar != null) {
            if (z10 && (vdVar = okVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(vdVar);
                okVar.V.run();
            }
            org.telegram.ui.Components.wc wcVar = okVar.W;
            if (wcVar != null) {
                AndroidUtilities.cancelRunOnUIThread(wcVar);
                okVar.W.run();
            }
        }
        org.telegram.ui.Components.a50 a50Var = znVar.f44801f2;
        if (a50Var != null) {
            a50Var.b(false);
        }
        ci.d4 d4Var = znVar.A1;
        if (d4Var != null) {
            d4Var.e(true);
        }
    }

    @Override
    public final int i() {
        sm smVar = this.f41509x;
        zn znVar = smVar.J0;
        if (smVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && znVar.Y.r0()) {
            return znVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
