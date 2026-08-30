package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class wk0 extends Drawable {
    public final org.telegram.ui.Components.k01 f39758a;
    public final org.telegram.ui.ActionBar.f6 f39759b;

    public wk0(org.telegram.ui.Components.k01 k01Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f39758a = k01Var;
        this.f39759b = f6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f39758a.c(getBounds().centerX() - (this.f39758a.f26084c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f39759b), canvas);
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
