package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class vk0 extends Drawable {
    public final org.telegram.ui.Components.d11 f42243a;
    public final org.telegram.ui.ActionBar.d6 f42244b;

    public vk0(org.telegram.ui.Components.d11 d11Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f42243a = d11Var;
        this.f42244b = d6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f42243a.c(getBounds().centerX() - (this.f42243a.f25444c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.f42244b), canvas);
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
