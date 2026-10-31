package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class yt0 extends org.telegram.ui.Components.sk0 {
    public final PremiumPreviewFragment f43891c;

    public yt0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f43891c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f43891c.h;
    }

    @Override
    public final int d(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f43891c;
            if (i10 < premiumPreviewFragment.f33705n || i10 >= premiumPreviewFragment.f33710r) {
                if (i10 >= premiumPreviewFragment.f33717w && i10 < premiumPreviewFragment.f33719x) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f33721y && i10 != premiumPreviewFragment.D && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
                    if (i10 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f33712s && i10 != premiumPreviewFragment.G) {
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
    public final void t(s4.c1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yt0.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View u1Var;
        org.telegram.ui.ActionBar.p6 p6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                u1Var = new kg.u1(this, context);
                break;
            case 2:
                u1Var = new org.telegram.ui.Cells.c7(context, 0, 0);
                break;
            case 3:
            default:
                u1Var = new do0(this, context, 2);
                u1Var.setTag(-33024);
                break;
            case 4:
                u1Var = new jg.z2(context);
                break;
            case 5:
                u1Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 6:
                u1Var = new View(context);
                u1Var.setTag(-33024);
                break;
            case 7:
                u1Var = new org.telegram.ui.Cells.p4(context);
                break;
            case 8:
                p6Var = ((org.telegram.ui.ActionBar.k2) this.f43891c).resourceProvider;
                u1Var = new org.telegram.ui.Cells.p8(23, context, p6Var, false, true);
                break;
        }
        return sc.e.o(u1Var, u1Var, -1, -2);
    }
}
