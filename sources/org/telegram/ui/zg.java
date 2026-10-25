package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
public final class zg implements View.OnClickListener {
    public final int f46283a;
    public final org.telegram.ui.Components.k80 f46284b;

    public zg(org.telegram.ui.Components.k80 k80Var, int i10) {
        this.f46283a = i10;
        this.f46284b = k80Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f46283a;
        org.telegram.ui.Components.k80 k80Var = this.f46284b;
        switch (i10) {
            case 0:
                k80Var.s();
                return;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                k80Var.s();
                return;
        }
    }
}
