package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class sm extends org.telegram.ui.ActionBar.q1 {
    public final tm f37514x;

    public sm(tm tmVar, tm tmVar2) {
        super(tmVar2);
        this.f37514x = tmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        bo boVar = this.f37514x.J0;
        org.telegram.ui.ActionBar.e5 parentLayout = boVar.getParentLayout();
        if (!boVar.Oa) {
            z10 = ((org.telegram.ui.ActionBar.o2) boVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.o2) boVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && boVar.f32408pa <= 0 && System.currentTimeMillis() - boVar.E9 >= 250) {
                    if ((boVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f18415n) {
                        z12 = ((org.telegram.ui.ActionBar.o2) boVar).isPaused;
                        if (!z12 && boVar.N5) {
                            ai.g4 g4Var = boVar.J1;
                            if (g4Var == null || !g4Var.isShowing()) {
                                nk nkVar = boVar.Y;
                                if (nkVar == null || nkVar.getTrendingStickersAlert() == null || !boVar.Y.getTrendingStickersAlert().isShowing()) {
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
        jj jjVar;
        tm tmVar = this.f37514x;
        bo boVar = tmVar.J0;
        if (boVar.getParentLayout() == null || !((ActionBarLayout) boVar.getParentLayout()).f18415n) {
            boVar.f32498w9 = f7;
            boVar.f32511x9 = f10;
            ai.g4 g4Var = boVar.J1;
            if (g4Var == null || !g4Var.isShowing()) {
                kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                kVar.setTranslationY(f7);
                dl dlVar = boVar.f32238bb;
                if (dlVar != null) {
                    float f11 = boVar.f32498w9;
                    zk zkVar = boVar.f32388o1;
                    if (zkVar != null) {
                        i10 = zkVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    dlVar.setTranslationY(f11 + i10);
                }
                ci.f4 f4Var = boVar.f32490w1;
                if (f4Var != null) {
                    f4Var.setTranslationY(f7);
                }
                ci.f4 f4Var2 = boVar.f32477v1;
                if (f4Var2 != null) {
                    f4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = boVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                float f12 = f7 / 2.0f;
                boVar.P.setTranslationY(f12);
                int i11 = (int) f7;
                boVar.X0.setBackgroundTranslation(i11);
                gl glVar = boVar.f32230b3;
                if (glVar != null) {
                    glVar.f29556t0 = f12;
                    glVar.s();
                }
                ci.s6 s6Var = boVar.f32517y2;
                if (s6Var != null) {
                    org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) s6Var.f5516b;
                    daVar.f23302u = f7;
                    daVar.d.invalidate();
                }
                boVar.setFragmentPanTranslationOffset(i11);
                boVar.o9();
                boVar.r9();
            } else {
                tmVar.setNonNoveTranslation(f7);
            }
            boVar.f32502x0.invalidate();
            org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f26695w;
            if (ocVar != null && boVar.Zb != null) {
                ocVar.l();
            }
            if (AndroidUtilities.isTablet() && (boVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.o2 lastFragment = ((LaunchActivity) boVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof wy) {
                    wy wyVar = (wy) lastFragment;
                    wyVar.f39301v1 = f7;
                    wyVar.X4();
                }
            }
            org.telegram.ui.Components.i40 i40Var = boVar.f32440s2;
            if (i40Var != null && i40Var.getVisibility() == 0) {
                boVar.f32440s2.f(boVar.Y.getAudioVideoButtonContainer(), false);
            }
            ik ikVar = boVar.X1;
            if (ikVar != null && (jjVar = ikVar.A0) != null) {
                jjVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.ge geVar;
        bo boVar = this.f37514x.J0;
        nk nkVar = boVar.Y;
        if (nkVar != null && (geVar = nkVar.f21856u0) != null) {
            geVar.run();
            nkVar.f21856u0 = null;
        }
        org.telegram.ui.Components.i40 i40Var = boVar.f32440s2;
        if (i40Var != null && i40Var.getVisibility() == 0) {
            boVar.f32440s2.f(boVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.qd qdVar;
        bo boVar = this.f37514x.J0;
        boVar.D4 = true;
        nk nkVar = boVar.Y;
        if (nkVar != null) {
            if (z10 && (qdVar = nkVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                nkVar.V.run();
            }
            wh whVar = nkVar.W;
            if (whVar != null) {
                AndroidUtilities.cancelRunOnUIThread(whVar);
                nkVar.W.run();
            }
        }
        org.telegram.ui.Components.i40 i40Var = boVar.f32280f2;
        if (i40Var != null) {
            i40Var.b(false);
        }
        ci.f4 f4Var = boVar.A1;
        if (f4Var != null) {
            f4Var.e(true);
        }
    }

    @Override
    public final int i() {
        tm tmVar = this.f37514x;
        bo boVar = tmVar.J0;
        if (tmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && boVar.Y.t0()) {
            return boVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
