package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.k01;
public final class f extends Drawable {
    public final int f39433a;
    public final k01 f39434b;
    public final h f39435c;

    public f(h hVar, String str, int i10) {
        this.f39433a = i10;
        switch (i10) {
            case 1:
                this.f39435c = hVar;
                this.f39434b = new k01(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f39435c = hVar;
                this.f39434b = new k01(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f39433a) {
            case 0:
                this.f39434b.c(getBounds().centerX() - (this.f39434b.f26124c / 2.0f), getBounds().centerY(), 1.0f, this.f39435c.f39463s, canvas);
                return;
            default:
                this.f39434b.c(getBounds().centerX() - (this.f39434b.f26124c / 2.0f), getBounds().centerY(), 1.0f, this.f39435c.f39463s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f39433a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f39433a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f39433a;
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
