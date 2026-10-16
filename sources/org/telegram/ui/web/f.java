package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i11;
public final class f extends Drawable {
    public final int f41034a;
    public final i11 f41035b;
    public final h f41036c;

    public f(h hVar, String str, int i10) {
        this.f41034a = i10;
        switch (i10) {
            case 1:
                this.f41036c = hVar;
                this.f41035b = new i11(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f41036c = hVar;
                this.f41035b = new i11(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f41034a) {
            case 0:
                this.f41035b.c(getBounds().centerX() - (this.f41035b.f25455c / 2.0f), getBounds().centerY(), 1.0f, this.f41036c.f41058s, canvas);
                return;
            default:
                this.f41035b.c(getBounds().centerX() - (this.f41035b.f25455c / 2.0f), getBounds().centerY(), 1.0f, this.f41036c.f41058s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f41034a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f41034a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f41034a;
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
