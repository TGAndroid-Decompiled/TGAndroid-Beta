package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class um extends org.telegram.ui.ActionBar.r1 {
    public final vm f37295x;

    public um(vm vmVar, vm vmVar2) {
        super(vmVar2);
        this.f37295x = vmVar;
    }

    @Override
    public final boolean b() {
        boolean z10;
        boolean z11;
        boolean z12;
        eo eoVar = this.f37295x.J0;
        org.telegram.ui.ActionBar.f5 parentLayout = eoVar.getParentLayout();
        if (!eoVar.Oa) {
            z10 = ((org.telegram.ui.ActionBar.p2) eoVar).inPreviewMode;
            if (!z10) {
                z11 = ((org.telegram.ui.ActionBar.p2) eoVar).inBubbleMode;
                if (!z11 && !AndroidUtilities.isInMultiwindow && parentLayout != null && eoVar.f32448pa <= 0 && System.currentTimeMillis() - eoVar.E9 >= 250) {
                    if ((eoVar != parentLayout.getLastFragment() || !((ActionBarLayout) parentLayout).B()) && !((ActionBarLayout) parentLayout).f17497n) {
                        z12 = ((org.telegram.ui.ActionBar.p2) eoVar).isPaused;
                        if (!z12 && eoVar.N5) {
                            gg.m mVar = eoVar.J1;
                            if (mVar == null || !mVar.isShowing()) {
                                ok okVar = eoVar.Y;
                                if (okVar == null || okVar.getTrendingStickersAlert() == null || !eoVar.Y.getTrendingStickersAlert().isShowing()) {
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
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        kj kjVar;
        vm vmVar = this.f37295x;
        eo eoVar = vmVar.J0;
        if (eoVar.getParentLayout() == null || !((ActionBarLayout) eoVar.getParentLayout()).f17497n) {
            eoVar.f32538w9 = f7;
            eoVar.f32551x9 = f10;
            gg.m mVar = eoVar.J1;
            if (mVar == null || !mVar.isShowing()) {
                lVar = ((org.telegram.ui.ActionBar.p2) eoVar).actionBar;
                lVar.setTranslationY(f7);
                fl flVar = eoVar.f32279bb;
                if (flVar != null) {
                    float f11 = eoVar.f32538w9;
                    al alVar = eoVar.f32428o1;
                    if (alVar != null) {
                        i10 = alVar.getCurrentHeight();
                    } else {
                        i10 = 0;
                    }
                    flVar.setTranslationY(f11 + i10);
                }
                bi.x4 x4Var = eoVar.f32530w1;
                if (x4Var != null) {
                    x4Var.setTranslationY(f7);
                }
                bi.x4 x4Var2 = eoVar.f32517v1;
                if (x4Var2 != null) {
                    x4Var2.setTranslationY(f7);
                }
                FrameLayout frameLayout = eoVar.Q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(f7 / 2.0f);
                }
                float f12 = f7 / 2.0f;
                eoVar.P.setTranslationY(f12);
                int i11 = (int) f7;
                eoVar.X0.setBackgroundTranslation(i11);
                il ilVar = eoVar.f32271b3;
                if (ilVar != null) {
                    ilVar.f22900t0 = f12;
                    ilVar.s();
                }
                bi.s7 s7Var = eoVar.f32557y2;
                if (s7Var != null) {
                    org.telegram.ui.Components.ea eaVar = (org.telegram.ui.Components.ea) s7Var.f3651b;
                    eaVar.f22650u = f7;
                    eaVar.d.invalidate();
                }
                eoVar.setFragmentPanTranslationOffset(i11);
                eoVar.o9();
                eoVar.r9();
            } else {
                vmVar.setNonNoveTranslation(f7);
            }
            eoVar.f32542x0.invalidate();
            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f26074w;
            if (pcVar != null && eoVar.Zb != null) {
                pcVar.l();
            }
            if (AndroidUtilities.isTablet() && (eoVar.getParentActivity() instanceof LaunchActivity)) {
                org.telegram.ui.ActionBar.p2 lastFragment = ((LaunchActivity) eoVar.getParentActivity()).O().getLastFragment();
                if (lastFragment instanceof wy) {
                    wy wyVar = (wy) lastFragment;
                    wyVar.f38517v1 = f7;
                    wyVar.X4();
                }
            }
            org.telegram.ui.Components.s40 s40Var = eoVar.f32480s2;
            if (s40Var != null && s40Var.getVisibility() == 0) {
                eoVar.f32480s2.f(eoVar.Y.getAudioVideoButtonContainer(), false);
            }
            jk jkVar = eoVar.X1;
            if (jkVar != null && (kjVar = jkVar.A0) != null) {
                kjVar.setExtraTranslationY(AndroidUtilities.dp(72.0f) + f7);
            }
        }
    }

    @Override
    public final void f() {
        org.telegram.ui.Components.ie ieVar;
        eo eoVar = this.f37295x.J0;
        ok okVar = eoVar.Y;
        if (okVar != null && (ieVar = okVar.f20931u0) != null) {
            ieVar.run();
            okVar.f20931u0 = null;
        }
        org.telegram.ui.Components.s40 s40Var = eoVar.f32480s2;
        if (s40Var != null && s40Var.getVisibility() == 0) {
            eoVar.f32480s2.f(eoVar.Y.getAudioVideoButtonContainer(), false);
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        org.telegram.ui.Components.qd qdVar;
        eo eoVar = this.f37295x.J0;
        eoVar.D4 = true;
        ok okVar = eoVar.Y;
        if (okVar != null) {
            if (z10 && (qdVar = okVar.V) != null) {
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                okVar.V.run();
            }
            org.telegram.ui.Components.ee eeVar = okVar.W;
            if (eeVar != null) {
                AndroidUtilities.cancelRunOnUIThread(eeVar);
                okVar.W.run();
            }
        }
        org.telegram.ui.Components.s40 s40Var = eoVar.f32321f2;
        if (s40Var != null) {
            s40Var.b(false);
        }
        bi.x4 x4Var = eoVar.A1;
        if (x4Var != null) {
            x4Var.e(true);
        }
    }

    @Override
    public final int i() {
        vm vmVar = this.f37295x;
        eo eoVar = vmVar.J0;
        if (vmVar.getKeyboardHeight() <= AndroidUtilities.dp(20.0f) && eoVar.Y.t0()) {
            return eoVar.Y.getEmojiPadding();
        }
        return 0;
    }
}
