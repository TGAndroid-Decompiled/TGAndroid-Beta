package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d11;
public final class f extends Drawable {
    public final int f42607a;
    public final d11 f42608b;
    public final h f42609c;

    public f(h hVar, String str, int i10) {
        this.f42607a = i10;
        switch (i10) {
            case 1:
                this.f42609c = hVar;
                this.f42608b = new d11(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f42609c = hVar;
                this.f42608b = new d11(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f42607a) {
            case 0:
                this.f42608b.c(getBounds().centerX() - (this.f42608b.f25444c / 2.0f), getBounds().centerY(), 1.0f, this.f42609c.f42638s, canvas);
                return;
            default:
                this.f42608b.c(getBounds().centerX() - (this.f42608b.f25444c / 2.0f), getBounds().centerY(), 1.0f, this.f42609c.f42638s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f42607a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f42607a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f42607a;
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
