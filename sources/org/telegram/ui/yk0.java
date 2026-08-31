package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class yk0 extends Drawable {
    public final org.telegram.ui.Components.l01 f43653a;
    public final org.telegram.ui.ActionBar.g6 f43654b;

    public yk0(org.telegram.ui.Components.l01 l01Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f43653a = l01Var;
        this.f43654b = g6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f43653a.c(getBounds().centerX() - (this.f43653a.f28521c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, this.f43654b), canvas);
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
