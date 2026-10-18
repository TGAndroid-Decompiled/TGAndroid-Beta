package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class zg implements View.OnClickListener {
    public final int f43768a;
    public final org.telegram.ui.Components.i80 f43769b;

    public zg(org.telegram.ui.Components.i80 i80Var, int i10) {
        this.f43768a = i10;
        this.f43769b = i80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f43768a;
        org.telegram.ui.Components.i80 i80Var = this.f43769b;
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
