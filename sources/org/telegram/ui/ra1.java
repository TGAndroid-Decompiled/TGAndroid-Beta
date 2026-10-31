package org.telegram.ui;

import android.graphics.BlendMode;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
public final class ra1 implements org.telegram.ui.ActionBar.u1, org.telegram.ui.ActionBar.x6, org.telegram.ui.ActionBar.y6 {
    public final int f41188a;

    public ra1(int i10) {
        this.f41188a = i10;
    }

    public static BlendMode a() {
        return BlendMode.SRC_OVER;
    }

    @Override
    public void d(int i10, View view) {
        org.telegram.ui.Wallet.w3 w3Var = (org.telegram.ui.Wallet.w3) view;
        ShapeDrawable shapeDrawable = w3Var.f35349e0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i10);
            w3Var.f35349e0.invalidateSelf();
        }
    }

    @Override
    public int f(View view) {
        ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.w3) view).f35349e0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f41188a) {
            case 0:
                x1Var.dismiss();
                return;
            case 1:
            case 2:
            case 3:
            default:
                x1Var.dismiss();
                return;
            case 4:
                x1Var.dismiss();
                return;
            case 5:
                x1Var.dismiss();
                return;
            case 6:
                x1Var.dismiss();
                return;
        }
    }
}
