package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class qw0 extends org.telegram.ui.Components.mm0 {
    public final PremiumPreviewFragment f42803c;

    public qw0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f42803c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f42803c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f42803c;
            if (i10 < premiumPreviewFragment.f35905n || i10 >= premiumPreviewFragment.f35910r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f35917w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f35919x && i10 != premiumPreviewFragment.f35921y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
                    if (i10 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f35912s && i10 != premiumPreviewFragment.G) {
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
    public final void v(s4.e1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qw0.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View pw0Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                pw0Var = new pw0(this, context);
                break;
            case 2:
                pw0Var = new org.telegram.ui.Cells.f7(context, 0, 0);
                break;
            case 3:
            default:
                pw0Var = new b20(this, context, 6);
                pw0Var.setTag(-33024);
                break;
            case 4:
                pw0Var = new tg.a(context);
                break;
            case 5:
                pw0Var = new org.telegram.ui.Cells.i9(context);
                break;
            case 6:
                pw0Var = new View(context);
                pw0Var.setTag(-33024);
                break;
            case 7:
                pw0Var = new org.telegram.ui.Cells.q4(context);
                break;
            case 8:
                u6Var = ((org.telegram.ui.ActionBar.r2) this.f42803c).resourceProvider;
                pw0Var = new org.telegram.ui.Cells.v8(23, context, u6Var, false, true);
                break;
        }
        return ic.a.n(pw0Var, pw0Var, -1, -2);
    }
}
