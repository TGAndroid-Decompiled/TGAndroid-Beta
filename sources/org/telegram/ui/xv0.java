package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class xv0 extends org.telegram.ui.Components.il0 {
    public final PremiumPreviewFragment f44660c;

    public xv0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f44660c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 == 1 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f44660c.h;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f44660c;
            if (i10 < premiumPreviewFragment.f35922n || i10 >= premiumPreviewFragment.f35927r) {
                if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.f35934w) {
                    return 1;
                }
                if (i10 == 0) {
                    return 4;
                }
                if (i10 != premiumPreviewFragment.f35935x && i10 != premiumPreviewFragment.f35936y && i10 != premiumPreviewFragment.A && i10 != premiumPreviewFragment.D) {
                    if (i10 == premiumPreviewFragment.B) {
                        return 6;
                    }
                    if (i10 != premiumPreviewFragment.f35929s && i10 != premiumPreviewFragment.C) {
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
    public final void v(f2.n1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xv0.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View d2Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                d2Var = new cg.d2(this, context);
                break;
            case 2:
                d2Var = new org.telegram.ui.Cells.x6(context, 0, 0);
                break;
            case 3:
            default:
                d2Var = new op0(this, context, 2);
                d2Var.setTag(-33024);
                break;
            case 4:
                d2Var = new cg.a(context);
                break;
            case 5:
                d2Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 6:
                d2Var = new View(context);
                d2Var.setTag(-33024);
                break;
            case 7:
                d2Var = new org.telegram.ui.Cells.k4(context);
                break;
            case 8:
                c6Var = ((org.telegram.ui.ActionBar.o2) this.f44660c).resourceProvider;
                d2Var = new org.telegram.ui.Cells.m8(23, context, c6Var, false, true);
                break;
        }
        return th.m(d2Var, d2Var, -1, -2);
    }
}
