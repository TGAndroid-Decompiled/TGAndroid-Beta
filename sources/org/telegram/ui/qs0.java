package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class qs0 extends org.telegram.ui.Components.bk0 {
    public final PremiumPreviewFragment f51293c;

    public qs0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f51293c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59127f;
        if (i7 == 1 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f51293c.h;
    }

    @Override
    public final int d(int i7) {
        if (i7 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f51293c;
            if (i7 < premiumPreviewFragment.f43437n || i7 >= premiumPreviewFragment.f43442r) {
                if (i7 >= premiumPreviewFragment.f43449w && i7 < premiumPreviewFragment.f43451x) {
                    return 1;
                }
                if (i7 == 0) {
                    return 4;
                }
                if (i7 != premiumPreviewFragment.f43453y && i7 != premiumPreviewFragment.E && i7 != premiumPreviewFragment.F && i7 != premiumPreviewFragment.I) {
                    if (i7 == premiumPreviewFragment.G) {
                        return 6;
                    }
                    if (i7 != premiumPreviewFragment.f43444s && i7 != premiumPreviewFragment.H) {
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
    public final void t(v4.f1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qs0.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View ps0Var;
        org.telegram.ui.ActionBar.i6 i6Var;
        Context context = viewGroup.getContext();
        switch (i7) {
            case 1:
                ps0Var = new ps0(this, context);
                break;
            case 2:
                ps0Var = new org.telegram.ui.Cells.z6(context, 0, 0);
                break;
            case 3:
            default:
                ps0Var = new uv(7, context, this);
                ps0Var.setTag(-33024);
                break;
            case 4:
                ps0Var = new ai.r2(context);
                break;
            case 5:
                ps0Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 6:
                ps0Var = new View(context);
                ps0Var.setTag(-33024);
                break;
            case 7:
                ps0Var = new org.telegram.ui.Cells.o4(context);
                break;
            case 8:
                i6Var = ((org.telegram.ui.ActionBar.h2) this.f51293c).resourceProvider;
                ps0Var = new org.telegram.ui.Cells.n8(23, context, i6Var, false, true);
                break;
        }
        return i5.c.q(ps0Var, ps0Var, -1, -2);
    }
}
