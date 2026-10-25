package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sq0 implements org.telegram.ui.Components.sn0 {
    public final vq0 f43573a;

    public sq0(vq0 vq0Var) {
        this.f43573a = vq0Var;
    }

    @Override
    public final void f(int i10, boolean z10) {
        boolean z11;
        vq0 vq0Var = this.f43573a;
        if (vq0Var.f44886n[0].f22987b == i10) {
            return;
        }
        if (i10 == vq0Var.h.getFirstTabId()) {
            z11 = true;
        } else {
            z11 = false;
        }
        vq0Var.e = z11;
        org.telegram.ui.ActionBar.q5 q5Var = vq0Var.f44886n[1];
        q5Var.f22987b = i10;
        q5Var.setVisibility(0);
        vq0Var.k0(true);
        vq0Var.v = z10;
        if (i10 == 0) {
            vq0Var.f44884c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            vq0Var.f44884c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override
    public final boolean h1(int i10, View view) {
        return false;
    }

    @Override
    public final void z0(float f7) {
        int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        vq0 vq0Var = this.f43573a;
        if (i10 != 0 || vq0Var.f44886n[1].getVisibility() == 0) {
            if (vq0Var.v) {
                org.telegram.ui.ActionBar.q5 q5Var = vq0Var.f44886n[0];
                q5Var.setTranslationX((-f7) * q5Var.getMeasuredWidth());
                org.telegram.ui.ActionBar.q5[] q5VarArr = vq0Var.f44886n;
                q5VarArr[1].setTranslationX(q5VarArr[0].getMeasuredWidth() - (f7 * vq0Var.f44886n[0].getMeasuredWidth()));
            } else {
                org.telegram.ui.ActionBar.q5 q5Var2 = vq0Var.f44886n[0];
                q5Var2.setTranslationX(q5Var2.getMeasuredWidth() * f7);
                org.telegram.ui.ActionBar.q5[] q5VarArr2 = vq0Var.f44886n;
                q5VarArr2[1].setTranslationX((f7 * q5VarArr2[0].getMeasuredWidth()) - vq0Var.f44886n[0].getMeasuredWidth());
            }
            if (i10 == 0) {
                org.telegram.ui.ActionBar.q5[] q5VarArr3 = vq0Var.f44886n;
                org.telegram.ui.ActionBar.q5 q5Var3 = q5VarArr3[0];
                q5VarArr3[0] = q5VarArr3[1];
                q5VarArr3[1] = q5Var3;
                q5Var3.setVisibility(8);
            }
        }
    }

    @Override
    public final void z() {
    }
}
