package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class vm extends org.telegram.ui.ActionBar.o1 {
    public final wm f42815x;

    public vm(wm wmVar, wm wmVar2) {
        super(wmVar2);
        this.f42815x = wmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        eo eoVar = this.f42815x.J0;
        org.telegram.ui.ActionBar.b5 parentLayout = eoVar.getParentLayout();
        if (!eoVar.Pa) {
            z10 = ((org.telegram.ui.ActionBar.m2) eoVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.m2) eoVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && eoVar.f37388pa <= 0 && System.currentTimeMillis() - eoVar.E9 >= 250) {
                    if ((eoVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f20110n) {
                        z12 = ((org.telegram.ui.ActionBar.m2) eoVar).isPaused;
                        if (!z12 && eoVar.N5) {
                            ai.h4 h4Var = eoVar.J1;
                            if (h4Var == null || !h4Var.isShowing()) {
                                sk skVar = eoVar.Y;
                                if (skVar == null || skVar.getTrendingStickersAlert() == null || !eoVar.Y.getTrendingStickersAlert().isShowing()) {
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
        org.telegram.ui.Components.n20 n20Var;
        wm wmVar = this.f42815x;
        eo eoVar = wmVar.J0;
        if (eoVar.getParentLayout() == null || !((ActionBarLayout) eoVar.getParentLayout()).f20110n) {
            eoVar.f37478w9 = f7;
            eoVar.f37492x9 = f10;
            ai.h4 h4Var = eoVar.J1;
            if (h4Var == null || !h4Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.m2) eoVar).actionBar;
                kVar.setTranslationY(f7);
                il ilVar = eoVar.f37218bb;
                if (ilVar != null) {
                    float f11 = eoVar.f37478w9;
                    dl dlVar = eoVar.f37368o1;
                    if (dlVar != null) {
                        i10 = dlVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    ilVar.setTranslationY(f11 + i10);
                }
                ci.d4 d4Var = eoVar.f37470w1;
                if (d4Var != null) {
                    d4Var.setTranslationY(f7);
                }
                ci.d4 d4Var2 = eoVar.f37457v1;
                if (d4Var2 != null) {
                    d4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = eoVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                eoVar.P.setTranslationY(f7 / 2.0f);
                int i11 = (int) f7;
                eoVar.X0.setBackgroundTranslation(i11);
                org.telegram.ui.Components.b70 b70Var = eoVar.f37210b3;
                if (b70Var != null) {
                    b70Var.e(f7);
                }
                ci.r6 r6Var = eoVar.f37498y2;
                if (r6Var != null) {
                    org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) r6Var.f5905b;
                    haVar.f26728u = f7;
                    haVar.d.invalidate();
                }
                eoVar.setFragmentPanTranslationOffset(i11);
                eoVar.t9();
                eoVar.w9();
            } else {
                wmVar.setNonNoveTranslation(f7);
            }
            eoVar.f37483x0.invalidate();
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30528w;
            if (scVar != null && eoVar.Zb != null) {
                scVar.l();
            }
            if (AndroidUtilities.isTablet() && (eoVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.m2 lastFragment = ((LaunchActivity) eoVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof vy) {
                    vy vyVar = (vy) lastFragment;
                    vyVar.f42991v1 = f7;
                    vyVar.U4();
                }
            }
            org.telegram.ui.Components.c50 c50Var = eoVar.f37420s2;
            if (c50Var != null && c50Var.getVisibility() == 0) {
                eoVar.f37420s2.f(eoVar.Y.getAudioVideoButtonContainer(), false);
            }
            mk mkVar = eoVar.X1;
            if (mkVar != null && (n20Var = mkVar.B0) != null) {
                n20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.vd vdVar;
        eo eoVar = this.f42815x.J0;
        sk skVar = eoVar.Y;
        if (skVar != null && (vdVar = skVar.f23739u0) != null) {
            vdVar.run();
            skVar.f23739u0 = null;
        }
        org.telegram.ui.Components.c50 c50Var = eoVar.f37420s2;
        if (c50Var != null && c50Var.getVisibility() == 0) {
            eoVar.f37420s2.f(eoVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.vd vdVar;
        eo eoVar = this.f42815x.J0;
        eoVar.D4 = true;
        sk skVar = eoVar.Y;
        if (skVar != null) {
            if (z10 && (vdVar = skVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(vdVar);
                skVar.V.run();
            }
            org.telegram.ui.Components.md mdVar = skVar.W;
            if (mdVar != null) {
                AndroidUtilities.cancelRunOnUIThread(mdVar);
                skVar.W.run();
            }
        }
        org.telegram.ui.Components.c50 c50Var = eoVar.f37261f2;
        if (c50Var != null) {
            c50Var.b(false);
        }
        ci.d4 d4Var = eoVar.A1;
        if (d4Var != null) {
            d4Var.e(true);
        }
    }

    @Override
    public final int i() {
        wm wmVar = this.f42815x;
        eo eoVar = wmVar.J0;
        if (wmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && eoVar.Y.u0()) {
            return eoVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
