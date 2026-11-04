package org.telegram.ui;

import android.view.View;
public final class tm0 implements org.telegram.ui.Components.yk0 {
    public final int f49829a;
    public final vm0 f49830b;

    public tm0(vm0 vm0Var, int i3) {
        this.f49829a = i3;
        this.f49830b = vm0Var;
    }

    @Override
    public void F0(float f10) {
        int i3 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        vm0 vm0Var = this.f49830b;
        if (i3 != 0 || vm0Var.f50558n[1].getVisibility() == 0) {
            if (vm0Var.f50561w) {
                org.telegram.ui.ActionBar.x4 x4Var = vm0Var.f50558n[0];
                x4Var.setTranslationX((-f10) * x4Var.getMeasuredWidth());
                org.telegram.ui.ActionBar.x4[] x4VarArr = vm0Var.f50558n;
                x4VarArr[1].setTranslationX(x4VarArr[0].getMeasuredWidth() - (f10 * vm0Var.f50558n[0].getMeasuredWidth()));
            } else {
                org.telegram.ui.ActionBar.x4 x4Var2 = vm0Var.f50558n[0];
                x4Var2.setTranslationX(x4Var2.getMeasuredWidth() * f10);
                org.telegram.ui.ActionBar.x4[] x4VarArr2 = vm0Var.f50558n;
                x4VarArr2[1].setTranslationX((f10 * x4VarArr2[0].getMeasuredWidth()) - vm0Var.f50558n[0].getMeasuredWidth());
            }
            if (i3 == 0) {
                org.telegram.ui.ActionBar.x4[] x4VarArr3 = vm0Var.f50558n;
                org.telegram.ui.ActionBar.x4 x4Var3 = x4VarArr3[0];
                x4VarArr3[0] = x4VarArr3[1];
                x4VarArr3[1] = x4Var3;
                x4Var3.setVisibility(8);
            }
        }
    }

    @Override
    public void f(int i3, boolean z10) {
        boolean z11;
        vm0 vm0Var = this.f49830b;
        if (vm0Var.f50558n[0].f28803b == i3) {
            return;
        }
        if (i3 == vm0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        vm0Var.f50556e = z11;
        org.telegram.ui.ActionBar.x4 x4Var = vm0Var.f50558n[1];
        x4Var.f28803b = i3;
        x4Var.setVisibility(0);
        vm0Var.o0(true);
        vm0Var.f50561w = z10;
        if (i3 == 0) {
            vm0Var.f50555c.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745771, null));
        } else {
            vm0Var.f50555c.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745774, null));
        }
    }

    @Override
    public boolean k1(int i3, View view) {
        return false;
    }

    @Override
    public void A() {
    }
}
