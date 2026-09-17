package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h01;
public final class f extends Drawable {
    public final int f38782a;
    public final h01 f38783b;
    public final h f38784c;

    public f(h hVar, String str, int i10) {
        this.f38782a = i10;
        switch (i10) {
            case 1:
                this.f38784c = hVar;
                this.f38783b = new h01(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f38784c = hVar;
                this.f38783b = new h01(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f38782a) {
            case 0:
                this.f38783b.c(getBounds().centerX() - (this.f38783b.f24439c / 2.0f), getBounds().centerY(), 1.0f, this.f38784c.f38808s, canvas);
                return;
            default:
                this.f38783b.c(getBounds().centerX() - (this.f38783b.f24439c / 2.0f), getBounds().centerY(), 1.0f, this.f38784c.f38808s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f38782a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f38782a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f38782a;
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
