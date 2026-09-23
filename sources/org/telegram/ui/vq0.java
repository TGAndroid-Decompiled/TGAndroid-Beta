package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vq0 implements org.telegram.ui.Components.mm0 {
    public final ar0 f38470a;

    public vq0(ar0 ar0Var) {
        this.f38470a = ar0Var;
    }

    @Override
    public final void C0(float f7) {
        ar0 ar0Var = this.f38470a;
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i10 != 0 || ar0Var.f31871n[1].getVisibility() == 0) {
            if (ar0Var.v) {
                yq0 yq0Var = ar0Var.f31871n[0];
                yq0Var.setTranslationX((-f7) * yq0Var.getMeasuredWidth());
                yq0[] yq0VarArr = ar0Var.f31871n;
                yq0VarArr[1].setTranslationX(yq0VarArr[0].getMeasuredWidth() - (f7 * ar0Var.f31871n[0].getMeasuredWidth()));
            } else {
                yq0 yq0Var2 = ar0Var.f31871n[0];
                yq0Var2.setTranslationX(yq0Var2.getMeasuredWidth() * f7);
                yq0[] yq0VarArr2 = ar0Var.f31871n;
                yq0VarArr2[1].setTranslationX((f7 * yq0VarArr2[0].getMeasuredWidth()) - ar0Var.f31871n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                yq0[] yq0VarArr3 = ar0Var.f31871n;
                yq0 yq0Var3 = yq0VarArr3[0];
                yq0VarArr3[0] = yq0VarArr3[1];
                yq0VarArr3[1] = yq0Var3;
                yq0Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void d(int i10, boolean z10) {
        boolean z11;
        ar0 ar0Var = this.f38470a;
        if (ar0Var.f31871n[0].e == i10) {
            return;
        }
        if (i10 == ar0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        ar0Var.e = z11;
        yq0 yq0Var = ar0Var.f31871n[1];
        yq0Var.e = i10;
        yq0Var.setVisibility(0);
        ar0Var.j0(true);
        ar0Var.v = z10;
        if (i10 == 0) {
            ar0Var.f31869c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            ar0Var.f31869c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
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
