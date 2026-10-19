package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
public final class tk0 extends Drawable {
    public final org.telegram.ui.Components.e11 f41703a;
    public final org.telegram.ui.ActionBar.d6 f41704b;

    public tk0(org.telegram.ui.Components.e11 e11Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f41703a = e11Var;
        this.f41704b = d6Var;
    }

    @Override
    public final void draw(Canvas canvas) {
        this.f41703a.c(getBounds().centerX() - (this.f41703a.f25730c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, this.f41704b), canvas);
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
