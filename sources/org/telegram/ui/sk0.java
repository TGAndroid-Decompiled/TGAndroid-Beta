package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

public final class sk0 extends Drawable {

    public final org.telegram.ui.Components.pz0 f42662a;

    public final org.telegram.ui.ActionBar.c6 f42663b;

    public sk0(org.telegram.ui.Components.pz0 pz0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f42662a = pz0Var;
        this.f42663b = c6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f42662a.c(getBounds().centerX() - (this.f42662a.f31697c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.f42663b), canvas);
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
