package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class tk0 extends Drawable {
    public final org.telegram.ui.Components.f11 f41693a;
    public final org.telegram.ui.ActionBar.d6 f41694b;

    public tk0(org.telegram.ui.Components.f11 f11Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f41693a = f11Var;
        this.f41694b = d6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f41693a.c(getBounds().centerX() - (this.f41693a.f26021c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.f41694b), canvas);
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
