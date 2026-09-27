package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.v01;
public final class f extends Drawable {
    public final int f39009a;
    public final v01 f39010b;
    public final h f39011c;

    public f(h hVar, String str, int i10) {
        this.f39009a = i10;
        switch (i10) {
            case 1:
                this.f39011c = hVar;
                this.f39010b = new v01(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f39011c = hVar;
                this.f39010b = new v01(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f39009a) {
            case 0:
                this.f39010b.c(getBounds().centerX() - (this.f39010b.f28987c / 2.0f), getBounds().centerY(), 1.0f, this.f39011c.f39027s, canvas);
                return;
            default:
                this.f39010b.c(getBounds().centerX() - (this.f39010b.f28987c / 2.0f), getBounds().centerY(), 1.0f, this.f39011c.f39027s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f39009a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f39009a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f39009a;
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
