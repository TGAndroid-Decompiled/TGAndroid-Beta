package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class vk0 extends Drawable {
    public final org.telegram.ui.Components.h11 f42757a;
    public final org.telegram.ui.ActionBar.g6 f42758b;

    public vk0(org.telegram.ui.Components.h11 h11Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f42757a = h11Var;
        this.f42758b = g6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f42757a.c(getBounds().centerX() - (this.f42757a.f26843c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f42758b), canvas);
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
