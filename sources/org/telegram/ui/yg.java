package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class yg implements View.OnClickListener {
    public final int f43849a;
    public final org.telegram.ui.Components.j80 f43850b;

    public yg(org.telegram.ui.Components.j80 j80Var, int i10) {
        this.f43849a = i10;
        this.f43850b = j80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43849a;
        org.telegram.ui.Components.j80 j80Var = this.f43850b;
        switch (i10) {
            case 0:
                j80Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                j80Var.s();
                return;
        }
    }
}
