package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class ss0 extends org.telegram.ui.Components.oj0 {
    public final PremiumPreviewFragment f49955c;

    public ss0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f49955c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 == 1 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f49955c.h;
    }

    @Override
    public final int d(int i7) {
        if (i7 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f49955c;
            if (i7 < premiumPreviewFragment.f41620n || i7 >= premiumPreviewFragment.f41625r) {
                if (i7 >= premiumPreviewFragment.f41632w && i7 < premiumPreviewFragment.f41634x) {
                    return 1;
                }
                if (i7 == 0) {
                    return 4;
                }
                if (i7 != premiumPreviewFragment.f41636y && i7 != premiumPreviewFragment.D && i7 != premiumPreviewFragment.E && i7 != premiumPreviewFragment.H) {
                    if (i7 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i7 != premiumPreviewFragment.f41627s && i7 != premiumPreviewFragment.G) {
                        if (i7 == premiumPreviewFragment.showAdsRow) {
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
    public final void t(v4.d1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ss0.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View rs0Var;
        org.telegram.ui.ActionBar.h6 h6Var;
        Context context = viewGroup.getContext();
        switch (i7) {
            case 1:
                rs0Var = new rs0(this, context);
                break;
            case 2:
                rs0Var = new org.telegram.ui.Cells.y6(context, 0, 0);
                break;
            case 3:
            default:
                rs0Var = new o00(6, context, this);
                rs0Var.setTag(-33024);
                break;
            case 4:
                rs0Var = new bi.t(context);
                break;
            case 5:
                rs0Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 6:
                rs0Var = new View(context);
                rs0Var.setTag(-33024);
                break;
            case 7:
                rs0Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 8:
                h6Var = ((org.telegram.ui.ActionBar.f2) this.f49955c).resourceProvider;
                rs0Var = new org.telegram.ui.Cells.m8(23, context, h6Var, false, true);
                break;
        }
        return jg.g.r(rs0Var, rs0Var, -1, -2);
    }
}
