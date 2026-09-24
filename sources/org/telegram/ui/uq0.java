package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uq0 implements org.telegram.ui.Components.xm0 {
    public final yq0 f38529a;

    public uq0(yq0 yq0Var) {
        this.f38529a = yq0Var;
    }

    @Override
    public final void C0(float f7) {
        yq0 yq0Var = this.f38529a;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 != 0 || yq0Var.f40213n[1].getVisibility() == 0) {
            if (yq0Var.v) {
                wq0 wq0Var = yq0Var.f40213n[0];
                wq0Var.setTranslationX((-f7) * wq0Var.getMeasuredWidth());
                wq0[] wq0VarArr = yq0Var.f40213n;
                wq0VarArr[1].setTranslationX(wq0VarArr[0].getMeasuredWidth() - (f7 * yq0Var.f40213n[0].getMeasuredWidth()));
            } else {
                wq0 wq0Var2 = yq0Var.f40213n[0];
                wq0Var2.setTranslationX(wq0Var2.getMeasuredWidth() * f7);
                wq0[] wq0VarArr2 = yq0Var.f40213n;
                wq0VarArr2[1].setTranslationX((f7 * wq0VarArr2[0].getMeasuredWidth()) - yq0Var.f40213n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                wq0[] wq0VarArr3 = yq0Var.f40213n;
                wq0 wq0Var3 = wq0VarArr3[0];
                wq0VarArr3[0] = wq0VarArr3[1];
                wq0VarArr3[1] = wq0Var3;
                wq0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void d(int i10, boolean z10) {
        boolean z11;
        yq0 yq0Var = this.f38529a;
        if (yq0Var.f40213n[0].e == i10) {
            return;
        }
        if (i10 == yq0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        yq0Var.e = z11;
        wq0 wq0Var = yq0Var.f40213n[1];
        wq0Var.e = i10;
        wq0Var.setVisibility(0);
        yq0Var.j0(true);
        yq0Var.v = z10;
        if (i10 == 0) {
            yq0Var.f40211c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            yq0Var.f40211c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
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
