package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r11;
public final class g extends Drawable {
    public final int f44757a;
    public final r11 f44758b;
    public final i f44759c;

    public g(i iVar, String str, int i10) {
        this.f44757a = i10;
        switch (i10) {
            case 1:
                this.f44759c = iVar;
                this.f44758b = new r11(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f44759c = iVar;
                this.f44758b = new r11(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f44757a) {
            case 0:
                this.f44758b.c(getBounds().centerX() - (this.f44758b.f32090c / 2.0f), getBounds().centerY(), 1.0f, this.f44759c.f44780s, canvas);
                return;
            default:
                this.f44758b.c(getBounds().centerX() - (this.f44758b.f32090c / 2.0f), getBounds().centerY(), 1.0f, this.f44759c.f44780s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f44757a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f44757a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f44757a;
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
