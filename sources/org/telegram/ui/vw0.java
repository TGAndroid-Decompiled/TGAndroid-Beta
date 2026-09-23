package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class vw0 extends org.telegram.ui.Components.ll0 {
    public final PremiumPreviewFragment f38487c;

    public vw0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f38487c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42630f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f38487c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f38487c;
            if (i10 < premiumPreviewFragment.f31142n || i10 >= premiumPreviewFragment.f31147r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f31154w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f31156x && i10 != premiumPreviewFragment.f31158y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
                    if (i10 == premiumPreviewFragment.F) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f31149s && i10 != premiumPreviewFragment.G) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vw0.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View uw0Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                uw0Var = new uw0(this, context);
                break;
            case 2:
                uw0Var = new org.telegram.ui.Cells.a7(context, 0, 0);
                break;
            case 3:
            default:
                uw0Var = new p50(this, context, 5);
                uw0Var.setTag(-33024);
                break;
            case 4:
                uw0Var = new rg.a(context);
                break;
            case 5:
                uw0Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 6:
                uw0Var = new View(context);
                uw0Var.setTag(-33024);
                break;
            case 7:
                uw0Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.n2) this.f38487c).resourceProvider;
                uw0Var = new org.telegram.ui.Cells.s8(23, context, d6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(uw0Var, uw0Var, -1, -2);
    }
}
