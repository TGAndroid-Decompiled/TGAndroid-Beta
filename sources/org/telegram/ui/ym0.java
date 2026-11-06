package org.telegram.ui;

import android.view.View;
public final class ym0 implements org.telegram.ui.Components.uk0 {
    public final int f52270a;
    public final an0 f52271b;

    public ym0(an0 an0Var, int i7) {
        this.f52270a = i7;
        this.f52271b = an0Var;
    }

    @Override
    public void F0(float f10) {
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        an0 an0Var = this.f52271b;
        if (i7 != 0 || an0Var.f44030n[1].getVisibility() == 0) {
            if (an0Var.f44033w) {
                org.telegram.ui.ActionBar.x4 x4Var = an0Var.f44030n[0];
                x4Var.setTranslationX((-f10) * x4Var.getMeasuredWidth());
                org.telegram.ui.ActionBar.x4[] x4VarArr = an0Var.f44030n;
                x4VarArr[1].setTranslationX(x4VarArr[0].getMeasuredWidth() - (f10 * an0Var.f44030n[0].getMeasuredWidth()));
            } else {
                org.telegram.ui.ActionBar.x4 x4Var2 = an0Var.f44030n[0];
                x4Var2.setTranslationX(x4Var2.getMeasuredWidth() * f10);
                org.telegram.ui.ActionBar.x4[] x4VarArr2 = an0Var.f44030n;
                x4VarArr2[1].setTranslationX((f10 * x4VarArr2[0].getMeasuredWidth()) - an0Var.f44030n[0].getMeasuredWidth());
            }
            if (i7 == 0) {
                org.telegram.ui.ActionBar.x4[] x4VarArr3 = an0Var.f44030n;
                org.telegram.ui.ActionBar.x4 x4Var3 = x4VarArr3[0];
                x4VarArr3[0] = x4VarArr3[1];
                x4VarArr3[1] = x4Var3;
                x4Var3.setVisibility(8);
            }
        }
    }

    @Override
    public void b(int i7, boolean z9) {
        boolean z10;
        an0 an0Var = this.f52271b;
        if (an0Var.f44030n[0].f28745b == i7) {
            return;
        }
        if (i7 == an0Var.h.getFirstTabId()) {
            z10 = true;
        } else {
            z10 = false;
        }
        an0Var.f44028e = z10;
        org.telegram.ui.ActionBar.x4 x4Var = an0Var.f44030n[1];
        x4Var.f28745b = i7;
        x4Var.setVisibility(0);
        an0Var.o0(true);
        an0Var.f44033w = z9;
        if (i7 == 0) {
            an0Var.f44027c.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745762, null));
        } else {
            an0Var.f44027c.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745765, null));
        }
    }

    @Override
    public boolean m1(int i7, View view) {
        return false;
    }

    @Override
    public void c() {
    }
}
