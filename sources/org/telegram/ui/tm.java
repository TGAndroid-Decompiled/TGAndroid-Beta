package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class tm extends org.telegram.ui.ActionBar.p1 {
    public final um f40820x;

    public tm(um umVar, um umVar2) {
        super(umVar2);
        this.f40820x = umVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        co coVar = this.f40820x.J0;
        org.telegram.ui.ActionBar.d5 parentLayout = coVar.getParentLayout();
        if (!coVar.Oa) {
            z10 = ((org.telegram.ui.ActionBar.n2) coVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.n2) coVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && coVar.f35406pa <= 0 && System.currentTimeMillis() - coVar.E9 >= 250) {
                    if ((coVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f20193n) {
                        z12 = ((org.telegram.ui.ActionBar.n2) coVar).isPaused;
                        if (!z12 && coVar.N5) {
                            bi.t3 t3Var = coVar.J1;
                            if (t3Var == null || !t3Var.isShowing()) {
                                mk mkVar = coVar.Y;
                                if (mkVar == null || mkVar.getTrendingStickersAlert() == null || !coVar.Y.getTrendingStickersAlert().isShowing()) {
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
        ij ijVar;
        um umVar = this.f40820x;
        co coVar = umVar.J0;
        if (coVar.getParentLayout() == null || !((ActionBarLayout) coVar.getParentLayout()).f20193n) {
            coVar.f35496w9 = f7;
            coVar.f35509x9 = f10;
            bi.t3 t3Var = coVar.J1;
            if (t3Var == null || !t3Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.n2) coVar).actionBar;
                kVar.setTranslationY(f7);
                dl dlVar = coVar.f35236bb;
                if (dlVar != null) {
                    float f11 = coVar.f35496w9;
                    yk ykVar = coVar.f35386o1;
                    if (ykVar != null) {
                        i10 = ykVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    dlVar.setTranslationY(f11 + i10);
                }
                di.f4 f4Var = coVar.f35488w1;
                if (f4Var != null) {
                    f4Var.setTranslationY(f7);
                }
                di.f4 f4Var2 = coVar.f35475v1;
                if (f4Var2 != null) {
                    f4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = coVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                float f12 = f7 / 2.0f;
                coVar.P.setTranslationY(f12);
                int i11 = (int) f7;
                coVar.X0.setBackgroundTranslation(i11);
                gl glVar = coVar.f35228b3;
                if (glVar != null) {
                    glVar.f32179t0 = f12;
                    glVar.s();
                }
                di.r6 r6Var = coVar.f35515y2;
                if (r6Var != null) {
                    org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) r6Var.f8096b;
                    faVar.f26026u = f7;
                    faVar.d.invalidate();
                }
                coVar.setFragmentPanTranslationOffset(i11);
                coVar.o9();
                coVar.r9();
            } else {
                umVar.setNonNoveTranslation(f7);
            }
            coVar.f35500x0.invalidate();
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29698w;
            if (qcVar != null && coVar.Zb != null) {
                qcVar.l();
            }
            if (AndroidUtilities.isTablet() && (coVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.n2 lastFragment = ((LaunchActivity) coVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof uy) {
                    uy uyVar = (uy) lastFragment;
                    uyVar.f41372v1 = f7;
                    uyVar.X4();
                }
            }
            org.telegram.ui.Components.i40 i40Var = coVar.f35438s2;
            if (i40Var != null && i40Var.getVisibility() == 0) {
                coVar.f35438s2.f(coVar.Y.getAudioVideoButtonContainer(), false);
            }
            hk hkVar = coVar.X1;
            if (hkVar != null && (ijVar = hkVar.A0) != null) {
                ijVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        co coVar = this.f40820x.J0;
        mk mkVar = coVar.Y;
        if (mkVar != null && (ieVar = mkVar.f23804u0) != null) {
            ieVar.run();
            mkVar.f23804u0 = null;
        }
        org.telegram.ui.Components.i40 i40Var = coVar.f35438s2;
        if (i40Var != null && i40Var.getVisibility() == 0) {
            coVar.f35438s2.f(coVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.sd sdVar;
        co coVar = this.f40820x.J0;
        coVar.D4 = true;
        mk mkVar = coVar.Y;
        if (mkVar != null) {
            if (z10 && (sdVar = mkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                mkVar.V.run();
            }
            org.telegram.ui.Components.uc ucVar = mkVar.W;
            if (ucVar != null) {
                AndroidUtilities.cancelRunOnUIThread(ucVar);
                mkVar.W.run();
            }
        }
        org.telegram.ui.Components.i40 i40Var = coVar.f35279f2;
        if (i40Var != null) {
            i40Var.b(false);
        }
        di.f4 f4Var = coVar.A1;
        if (f4Var != null) {
            f4Var.e(true);
        }
    }

    @Override
    public final int i() {
        um umVar = this.f40820x;
        co coVar = umVar.J0;
        if (umVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && coVar.Y.t0()) {
            return coVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
