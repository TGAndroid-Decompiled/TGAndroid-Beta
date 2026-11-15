package org.telegram.ui;

import android.view.View;
public final class zm0 implements org.telegram.ui.Components.zk0 {
    public final int f53988a;
    public final bn0 f53989b;

    public zm0(bn0 bn0Var, int i7) {
        this.f53988a = i7;
        this.f53989b = bn0Var;
    }

    @Override
    public void D0(float f10) {
        int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        bn0 bn0Var = this.f53989b;
        if (i7 != 0 || bn0Var.f45795n[1].getVisibility() == 0) {
            if (bn0Var.f45798w) {
                org.telegram.ui.ActionBar.v4 v4Var = bn0Var.f45795n[0];
                v4Var.setTranslationX((-f10) * v4Var.getMeasuredWidth());
                org.telegram.ui.ActionBar.v4[] v4VarArr = bn0Var.f45795n;
                v4VarArr[1].setTranslationX(v4VarArr[0].getMeasuredWidth() - (f10 * bn0Var.f45795n[0].getMeasuredWidth()));
            } else {
                org.telegram.ui.ActionBar.v4 v4Var2 = bn0Var.f45795n[0];
                v4Var2.setTranslationX(v4Var2.getMeasuredWidth() * f10);
                org.telegram.ui.ActionBar.v4[] v4VarArr2 = bn0Var.f45795n;
                v4VarArr2[1].setTranslationX((f10 * v4VarArr2[0].getMeasuredWidth()) - bn0Var.f45795n[0].getMeasuredWidth());
            }
            if (i7 == 0) {
                org.telegram.ui.ActionBar.v4[] v4VarArr3 = bn0Var.f45795n;
                org.telegram.ui.ActionBar.v4 v4Var3 = v4VarArr3[0];
                v4VarArr3[0] = v4VarArr3[1];
                v4VarArr3[1] = v4Var3;
                v4Var3.setVisibility(8);
            }
        }
    }

    @Override
    public void b(int i7, boolean z10) {
        boolean z11;
        bn0 bn0Var = this.f53989b;
        if (bn0Var.f45795n[0].f29755b == i7) {
            return;
        }
        if (i7 == bn0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        bn0Var.f45793e = z11;
        org.telegram.ui.ActionBar.v4 v4Var = bn0Var.f45795n[1];
        v4Var.f29755b = i7;
        v4Var.setVisibility(0);
        bn0Var.o0(true);
        bn0Var.f45798w = z10;
        if (i7 == 0) {
            bn0Var.f45792c.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745761, null));
        } else {
            bn0Var.f45792c.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745764, null));
        }
    }

    @Override
    public boolean j1(int i7, View view) {
        return false;
    }

    @Override
    public void D() {
    }
}
