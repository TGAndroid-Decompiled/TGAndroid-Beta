package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class yk0 extends Drawable {
    public final org.telegram.ui.Components.k01 f40295a;
    public final org.telegram.ui.ActionBar.f6 f40296b;

    public yk0(org.telegram.ui.Components.k01 k01Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f40295a = k01Var;
        this.f40296b = f6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f40295a.c(getBounds().centerX() - (this.f40295a.f26124c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, this.f40296b), canvas);
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
