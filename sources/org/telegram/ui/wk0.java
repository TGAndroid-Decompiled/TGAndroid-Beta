package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class wk0 extends Drawable {
    public final org.telegram.ui.Components.i11 f43388a;
    public final org.telegram.ui.ActionBar.g6 f43389b;

    public wk0(org.telegram.ui.Components.i11 i11Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f43388a = i11Var;
        this.f43389b = g6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f43388a.c(getBounds().centerX() - (this.f43388a.f27164c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f43389b), canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
