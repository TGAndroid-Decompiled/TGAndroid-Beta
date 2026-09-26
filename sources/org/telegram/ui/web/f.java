package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u01;
public final class f extends Drawable {
    public final int f39054a;
    public final u01 f39055b;
    public final h f39056c;

    public f(h hVar, String str, int i10) {
        this.f39054a = i10;
        switch (i10) {
            case 1:
                this.f39056c = hVar;
                this.f39055b = new u01(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f39056c = hVar;
                this.f39055b = new u01(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f39054a) {
            case 0:
                this.f39055b.c(getBounds().centerX() - (this.f39055b.f28649c / 2.0f), getBounds().centerY(), 1.0f, this.f39056c.f39082s, canvas);
                return;
            default:
                this.f39055b.c(getBounds().centerX() - (this.f39055b.f28649c / 2.0f), getBounds().centerY(), 1.0f, this.f39056c.f39082s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f39054a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f39054a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f39054a;
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
