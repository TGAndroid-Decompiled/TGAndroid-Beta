package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class yg implements View.OnClickListener {
    public final int f43844a;
    public final org.telegram.ui.Components.h80 f43845b;

    public yg(org.telegram.ui.Components.h80 h80Var, int i10) {
        this.f43844a = i10;
        this.f43845b = h80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43844a;
        org.telegram.ui.Components.h80 h80Var = this.f43845b;
        switch (i10) {
            case 0:
                h80Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                h80Var.s();
                return;
        }
    }
}
