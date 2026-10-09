package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class rm extends org.telegram.ui.ActionBar.p1 {
    public final sm f41456x;

    public rm(sm smVar, sm smVar2) {
        super(smVar2);
        this.f41456x = smVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        zn znVar = this.f41456x.J0;
        org.telegram.ui.ActionBar.d5 parentLayout = znVar.getParentLayout();
        if (!znVar.Pa) {
            z10 = ((org.telegram.ui.ActionBar.n2) znVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.n2) znVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && znVar.f44895pa <= 0 && System.currentTimeMillis() - znVar.E9 >= 250) {
                    if ((znVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).A()) && !((ActionBarLayout) parentLayout).f20342n) {
                        z12 = ((org.telegram.ui.ActionBar.n2) znVar).isPaused;
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
        org.telegram.ui.Components.k20 k20Var;
        sm smVar = this.f41456x;
        zn znVar = smVar.J0;
        if (znVar.getParentLayout() == null || !((ActionBarLayout) znVar.getParentLayout()).f20342n) {
            znVar.f44985w9 = f7;
            znVar.f44999x9 = f10;
            ai.h4 h4Var = znVar.J1;
            if (h4Var == null || !h4Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) znVar).actionBar;
                kVar.setTranslationY(f7);
                el elVar = znVar.f44725bb;
                if (elVar != null) {
                    float f11 = znVar.f44985w9;
                    zk zkVar = znVar.f44875o1;
                    if (zkVar != null) {
                        i10 = zkVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    elVar.setTranslationY(f11 + i10);
                }
                ci.d4 d4Var = znVar.f44977w1;
                if (d4Var != null) {
                    d4Var.setTranslationY(f7);
                }
                ci.d4 d4Var2 = znVar.f44964v1;
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
                org.telegram.ui.Components.y60 y60Var = znVar.f44717b3;
                if (y60Var != null) {
                    y60Var.e(f7);
                }
                ci.r6 r6Var = znVar.f45005y2;
                if (r6Var != null) {
                    org.telegram.ui.Components.ia iaVar = (org.telegram.ui.Components.ia) r6Var.f5907b;
                    iaVar.f27316u = f7;
                    iaVar.d.invalidate();
                }
                znVar.setFragmentPanTranslationOffset(i11);
                znVar.t9();
                znVar.w9();
            } else {
                smVar.setNonNoveTranslation(f7);
            }
            znVar.f44990x0.invalidate();
            org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.f31122w;
            if (tcVar != null && znVar.Zb != null) {
                tcVar.l();
            }
            if (AndroidUtilities.isTablet() && (znVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) znVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof ty) {
                    ty tyVar = (ty) lastFragment;
                    tyVar.f42260v1 = f7;
                    tyVar.U4();
                }
            }
            org.telegram.ui.Components.z40 z40Var = znVar.f44927s2;
            if (z40Var != null && z40Var.getVisibility() == 0) {
                znVar.f44927s2.f(znVar.Y.getAudioVideoButtonContainer(), false);
            }
            ik ikVar = znVar.X1;
            if (ikVar != null && (k20Var = ikVar.B0) != null) {
                k20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.le leVar;
        zn znVar = this.f41456x.J0;
        ok okVar = znVar.Y;
        if (okVar != null && (leVar = okVar.f23967u0) != null) {
            leVar.run();
            okVar.f23967u0 = null;
        }
        org.telegram.ui.Components.z40 z40Var = znVar.f44927s2;
        if (z40Var != null && z40Var.getVisibility() == 0) {
            znVar.f44927s2.f(znVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.vd vdVar;
        zn znVar = this.f41456x.J0;
        znVar.D4 = true;
        ok okVar = znVar.Y;
        if (okVar != null) {
            if (z10 && (vdVar = okVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(vdVar);
                okVar.V.run();
            }
            org.telegram.ui.Components.ea eaVar = okVar.W;
            if (eaVar != null) {
                AndroidUtilities.cancelRunOnUIThread(eaVar);
                okVar.W.run();
            }
        }
        org.telegram.ui.Components.z40 z40Var = znVar.f44768f2;
        if (z40Var != null) {
            z40Var.b(false);
        }
        ci.d4 d4Var = znVar.A1;
        if (d4Var != null) {
            d4Var.e(true);
        }
    }

    @Override
    public final int i() {
        sm smVar = this.f41456x;
        zn znVar = smVar.J0;
        if (smVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && znVar.Y.r0()) {
            return znVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
