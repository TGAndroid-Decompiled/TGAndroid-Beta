package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class rs0 extends org.telegram.ui.Components.dk0 {
    public final PremiumPreviewFragment f51797c;

    public rs0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f51797c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f59115f;
        if (i7 == 1 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f51797c.h;
    }

    @Override
    public final int d(int i7) {
        if (i7 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f51797c;
            if (i7 < premiumPreviewFragment.f43447n || i7 >= premiumPreviewFragment.f43452r) {
                if (i7 >= premiumPreviewFragment.f43459w && i7 < premiumPreviewFragment.f43461x) {
                    return 1;
                }
                if (i7 == 0) {
                    return 4;
                }
                if (i7 != premiumPreviewFragment.f43463y && i7 != premiumPreviewFragment.E && i7 != premiumPreviewFragment.F && i7 != premiumPreviewFragment.I) {
                    if (i7 == premiumPreviewFragment.G) {
                        return 6;
                    }
                    if (i7 != premiumPreviewFragment.f43454s && i7 != premiumPreviewFragment.H) {
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
    public final void t(v4.e1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rs0.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View qs0Var;
        org.telegram.ui.ActionBar.h6 h6Var;
        Context context = viewGroup.getContext();
        switch (i7) {
            case 1:
                qs0Var = new qs0(this, context);
                break;
            case 2:
                qs0Var = new org.telegram.ui.Cells.z6(context, 0, 0);
                break;
            case 3:
            default:
                qs0Var = new uv(7, context, this);
                qs0Var.setTag(-33024);
                break;
            case 4:
                qs0Var = new ai.k2(context);
                break;
            case 5:
                qs0Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 6:
                qs0Var = new View(context);
                qs0Var.setTag(-33024);
                break;
            case 7:
                qs0Var = new org.telegram.ui.Cells.o4(context);
                break;
            case 8:
                h6Var = ((org.telegram.ui.ActionBar.g2) this.f51797c).resourceProvider;
                qs0Var = new org.telegram.ui.Cells.n8(23, context, h6Var, false, true);
                break;
        }
        return i5.c.q(qs0Var, qs0Var, -1, -2);
    }
}
