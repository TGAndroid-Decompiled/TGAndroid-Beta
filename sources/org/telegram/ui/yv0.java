package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class yv0 extends org.telegram.ui.Components.vk0 {
    public final PremiumPreviewFragment f44958c;

    public yv0(PremiumPreviewFragment premiumPreviewFragment) {
        this.f44958c = premiumPreviewFragment;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 == 1 || i9 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f44958c.h;
    }

    @Override
    public final int j(int i9) {
        if (i9 != 0) {
            PremiumPreviewFragment premiumPreviewFragment = this.f44958c;
            if (i9 < premiumPreviewFragment.f35856n || i9 >= premiumPreviewFragment.f35861r) {
                if (i9 >= premiumPreviewFragment.v && i9 < premiumPreviewFragment.f35868w) {
                    return 1;
                }
                if (i9 == 0) {
                    return 4;
                }
                if (i9 != premiumPreviewFragment.f35869x && i9 != premiumPreviewFragment.f35870y && i9 != premiumPreviewFragment.A && i9 != premiumPreviewFragment.D) {
                    if (i9 == premiumPreviewFragment.B) {
                        return 6;
                    }
                    if (i9 != premiumPreviewFragment.f35863s && i9 != premiumPreviewFragment.C) {
                        if (i9 == premiumPreviewFragment.showAdsRow) {
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
    public final void v(f2.q1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yv0.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View xv0Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        Context context = viewGroup.getContext();
        switch (i9) {
            case 1:
                xv0Var = new xv0(this, context);
                break;
            case 2:
                xv0Var = new org.telegram.ui.Cells.z6(context, 0, 0);
                break;
            case 3:
            default:
                xv0Var = new yi0(this, context, 4);
                xv0Var.setTag(-33024);
                break;
            case 4:
                xv0Var = new zf.a(context);
                break;
            case 5:
                xv0Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 6:
                xv0Var = new View(context);
                xv0Var.setTag(-33024);
                break;
            case 7:
                xv0Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 8:
                b6Var = ((org.telegram.ui.ActionBar.o2) this.f44958c).resourceProvider;
                xv0Var = new org.telegram.ui.Cells.p8(23, context, b6Var, false, true);
                break;
        }
        return j3.r0.s(xv0Var, xv0Var, -1, -2);
    }
}
