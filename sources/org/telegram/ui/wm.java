package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class wm extends org.telegram.ui.ActionBar.o1 {
    public final xm f41323x;

    public wm(xm xmVar, xm xmVar2) {
        super(xmVar2);
        this.f41323x = xmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        fo foVar = this.f41323x.J0;
        org.telegram.ui.ActionBar.b5 parentLayout = foVar.getParentLayout();
        if (!foVar.Pa) {
            z10 = ((org.telegram.ui.ActionBar.m2) foVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.m2) foVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && foVar.f35766pa <= 0 && System.currentTimeMillis() - foVar.E9 >= 250) {
                    if ((foVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).A()) && !((ActionBarLayout) parentLayout).f19217n) {
                        z12 = ((org.telegram.ui.ActionBar.m2) foVar).isPaused;
                        if (!z12 && foVar.N5) {
                            bi.w3 w3Var = foVar.J1;
                            if (w3Var == null || !w3Var.isShowing()) {
                                sk skVar = foVar.Y;
                                if (skVar == null || skVar.getTrendingStickersAlert() == null || !foVar.Y.getTrendingStickersAlert().isShowing()) {
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
        org.telegram.ui.Components.g20 g20Var;
        xm xmVar = this.f41323x;
        fo foVar = xmVar.J0;
        if (foVar.getParentLayout() == null || !((ActionBarLayout) foVar.getParentLayout()).f19217n) {
            foVar.w9 = f7;
            foVar.f35870x9 = f10;
            bi.w3 w3Var = foVar.J1;
            if (w3Var == null || !w3Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.m2) foVar).actionBar;
                kVar.setTranslationY(f7);
                il ilVar = foVar.f35596bb;
                if (ilVar != null) {
                    float f11 = foVar.w9;
                    dl dlVar = foVar.f35748o1;
                    if (dlVar != null) {
                        i10 = dlVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    ilVar.setTranslationY(f11 + i10);
                }
                di.d4 d4Var = foVar.f35849w1;
                if (d4Var != null) {
                    d4Var.setTranslationY(f7);
                }
                di.d4 d4Var2 = foVar.f35835v1;
                if (d4Var2 != null) {
                    d4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = foVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                foVar.P.setTranslationY(f7 / 2.0f);
                int i11 = (int) f7;
                foVar.X0.setBackgroundTranslation(i11);
                org.telegram.ui.Components.u60 u60Var = foVar.f35588b3;
                if (u60Var != null) {
                    u60Var.e(f7);
                }
                di.p6 p6Var = foVar.f35877y2;
                if (p6Var != null) {
                    org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) p6Var.f7590b;
                    haVar.f25243u = f7;
                    haVar.d.invalidate();
                }
                foVar.setFragmentPanTranslationOffset(i11);
                foVar.t9();
                foVar.w9();
            } else {
                xmVar.setNonNoveTranslation(f7);
            }
            foVar.f35861x0.invalidate();
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f28798w;
            if (scVar != null && foVar.Zb != null) {
                scVar.l();
            }
            if (AndroidUtilities.isTablet() && (foVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.m2 lastFragment = ((LaunchActivity) foVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof yy) {
                    yy yyVar = (yy) lastFragment;
                    yyVar.f42091v1 = f7;
                    yyVar.V4();
                }
            }
            org.telegram.ui.Components.v40 v40Var = foVar.f35798s2;
            if (v40Var != null && v40Var.getVisibility() == 0) {
                foVar.f35798s2.f(foVar.Y.getAudioVideoButtonContainer(), false);
            }
            mk mkVar = foVar.X1;
            if (mkVar != null && (g20Var = mkVar.B0) != null) {
                g20Var.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.je jeVar;
        fo foVar = this.f41323x.J0;
        sk skVar = foVar.Y;
        if (skVar != null && (jeVar = skVar.f22666u0) != null) {
            jeVar.run();
            skVar.f22666u0 = null;
        }
        org.telegram.ui.Components.v40 v40Var = foVar.f35798s2;
        if (v40Var != null && v40Var.getVisibility() == 0) {
            foVar.f35798s2.f(foVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.td tdVar;
        fo foVar = this.f41323x.J0;
        foVar.D4 = true;
        sk skVar = foVar.Y;
        if (skVar != null) {
            if (z10 && (tdVar = skVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(tdVar);
                skVar.V.run();
            }
            vp vpVar = skVar.W;
            if (vpVar != null) {
                AndroidUtilities.cancelRunOnUIThread(vpVar);
                skVar.W.run();
            }
        }
        org.telegram.ui.Components.v40 v40Var = foVar.f35639f2;
        if (v40Var != null) {
            v40Var.b(false);
        }
        di.d4 d4Var = foVar.A1;
        if (d4Var != null) {
            d4Var.e(true);
        }
    }

    @Override
    public final int i() {
        xm xmVar = this.f41323x;
        fo foVar = xmVar.J0;
        if (xmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && foVar.Y.r0()) {
            return foVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
