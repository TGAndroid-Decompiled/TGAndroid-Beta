package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class xg implements View.OnClickListener {
    public final int f43213a;
    public final org.telegram.ui.Components.i80 f43214b;

    public xg(org.telegram.ui.Components.i80 i80Var, int i10) {
        this.f43213a = i10;
        this.f43214b = i80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43213a;
        org.telegram.ui.Components.i80 i80Var = this.f43214b;
        switch (i10) {
            case 0:
                i80Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                i80Var.s();
                return;
        }
    }
}
