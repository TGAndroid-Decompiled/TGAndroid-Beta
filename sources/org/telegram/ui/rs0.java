package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class rs0 extends org.telegram.ui.Components.pj0 {
    public final PremiumPreviewFragment f49601c;

    public rs0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f49601c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 == 1 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f49601c.h;
    }

    @Override
    public final int d(int i7) {
        if (i7 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f49601c;
            if (i7 < premiumPreviewFragment.f41629n || i7 >= premiumPreviewFragment.f41634r) {
                if (i7 >= premiumPreviewFragment.f41641w && i7 < premiumPreviewFragment.f41643x) {
                    return 1;
                }
                if (i7 == 0) {
                    return 4;
                }
                if (i7 != premiumPreviewFragment.f41645y && i7 != premiumPreviewFragment.D && i7 != premiumPreviewFragment.E && i7 != premiumPreviewFragment.H) {
                    if (i7 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i7 != premiumPreviewFragment.f41636s && i7 != premiumPreviewFragment.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rs0.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View qs0Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = viewGroup.getContext();
        switch (i7) {
            case 1:
                qs0Var = new qs0(this, context);
                break;
            case 2:
                qs0Var = new org.telegram.ui.Cells.y6(context, 0, 0);
                break;
            case 3:
            default:
                qs0Var = new n00(6, context, this);
                qs0Var.setTag(-33024);
                break;
            case 4:
                qs0Var = new bi.t(context);
                break;
            case 5:
                qs0Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 6:
                qs0Var = new View(context);
                qs0Var.setTag(-33024);
                break;
            case 7:
                qs0Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 8:
                g6Var = ((org.telegram.ui.ActionBar.f2) this.f49601c).resourceProvider;
                qs0Var = new org.telegram.ui.Cells.m8(23, context, g6Var, false, true);
                break;
        }
        return jg.g.r(qs0Var, qs0Var, -1, -2);
    }
}
