package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xq0 implements org.telegram.ui.Components.zm0 {
    public final br0 f40029a;

    public xq0(br0 br0Var) {
        this.f40029a = br0Var;
    }

    @Override
    public final void C0(float f7) {
        br0 br0Var = this.f40029a;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 != 0 || br0Var.f32423n[1].getVisibility() == 0) {
            if (br0Var.v) {
                zq0 zq0Var = br0Var.f32423n[0];
                zq0Var.setTranslationX((-f7) * zq0Var.getMeasuredWidth());
                zq0[] zq0VarArr = br0Var.f32423n;
                zq0VarArr[1].setTranslationX(zq0VarArr[0].getMeasuredWidth() - (f7 * br0Var.f32423n[0].getMeasuredWidth()));
            } else {
                zq0 zq0Var2 = br0Var.f32423n[0];
                zq0Var2.setTranslationX(zq0Var2.getMeasuredWidth() * f7);
                zq0[] zq0VarArr2 = br0Var.f32423n;
                zq0VarArr2[1].setTranslationX((f7 * zq0VarArr2[0].getMeasuredWidth()) - br0Var.f32423n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                zq0[] zq0VarArr3 = br0Var.f32423n;
                zq0 zq0Var3 = zq0VarArr3[0];
                zq0VarArr3[0] = zq0VarArr3[1];
                zq0VarArr3[1] = zq0Var3;
                zq0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void d(int i10, boolean z10) {
        boolean z11;
        br0 br0Var = this.f40029a;
        if (br0Var.f32423n[0].e == i10) {
            return;
        }
        if (i10 == br0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        br0Var.e = z11;
        zq0 zq0Var = br0Var.f32423n[1];
        zq0Var.e = i10;
        zq0Var.setVisibility(0);
        br0Var.j0(true);
        br0Var.v = z10;
        if (i10 == 0) {
            br0Var.f32421c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            br0Var.f32421c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final boolean n1(int i10, View view) {
        return false;
    }

    @Override
    public final void C() {
    }
}
