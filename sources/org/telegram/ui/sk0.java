package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class sk0 extends Drawable {
    public final org.telegram.ui.Components.nz0 f42712a;
    public final org.telegram.ui.ActionBar.b6 f42713b;

    public sk0(org.telegram.ui.Components.nz0 nz0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f42712a = nz0Var;
        this.f42713b = b6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f42712a.c(getBounds().centerX() - (this.f42712a.f31223c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, this.f42713b), canvas);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
