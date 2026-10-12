package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r11;
public final class f extends Drawable {
    public final int f43239a;
    public final r11 f43240b;
    public final h f43241c;

    public f(h hVar, String str, int i10) {
        this.f43239a = i10;
        switch (i10) {
            case 1:
                this.f43241c = hVar;
                this.f43240b = new r11(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f43241c = hVar;
                this.f43240b = new r11(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f43239a) {
            case 0:
                this.f43240b.c(getBounds().centerX() - (this.f43240b.f29988c / 2.0f), getBounds().centerY(), 1.0f, this.f43241c.f43272s, canvas);
                return;
            default:
                this.f43240b.c(getBounds().centerX() - (this.f43240b.f29988c / 2.0f), getBounds().centerY(), 1.0f, this.f43241c.f43272s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f43239a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f43239a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f43239a;
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
