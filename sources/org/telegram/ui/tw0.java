package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class tw0 extends org.telegram.ui.Components.vl0 {
    public final PremiumPreviewFragment f38229c;

    public tw0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f38229c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42949f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f38229c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f38229c;
            if (i10 < premiumPreviewFragment.f31443n || i10 >= premiumPreviewFragment.f31448r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f31455w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f31457x && i10 != premiumPreviewFragment.f31459y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
                    if (i10 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f31450s && i10 != premiumPreviewFragment.G) {
                        if (i10 == premiumPreviewFragment.showAdsRow) {
                            return 8;
                        }
                        return 0;
                    }
                    return 7;
                }
                return 5;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tw0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View sw0Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                sw0Var = new sw0(this, context);
                break;
            case 2:
                sw0Var = new org.telegram.ui.Cells.b7(context, 0, 0);
                break;
            case 3:
            default:
                sw0Var = new n50(this, context, 5);
                sw0Var.setTag(-33024);
                break;
            case 4:
                sw0Var = new rg.a(context);
                break;
            case 5:
                sw0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 6:
                sw0Var = new View(context);
                sw0Var.setTag(-33024);
                break;
            case 7:
                sw0Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.m2) this.f38229c).resourceProvider;
                sw0Var = new org.telegram.ui.Cells.r8(23, context, d6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(sw0Var, sw0Var, -1, -2);
    }
}
