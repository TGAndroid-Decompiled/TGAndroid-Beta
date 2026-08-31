package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l01;
public final class f extends Drawable {
    public final int f42532a;
    public final l01 f42533b;
    public final h f42534c;

    public f(h hVar, String str, int i10) {
        this.f42532a = i10;
        switch (i10) {
            case 1:
                this.f42534c = hVar;
                this.f42533b = new l01(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f42534c = hVar;
                this.f42533b = new l01(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f42532a) {
            case 0:
                this.f42533b.c(getBounds().centerX() - (this.f42533b.f28521c / 2.0f), getBounds().centerY(), 1.0f, this.f42534c.f42568s, canvas);
                return;
            default:
                this.f42533b.c(getBounds().centerX() - (this.f42533b.f28521c / 2.0f), getBounds().centerY(), 1.0f, this.f42534c.f42568s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f42532a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f42532a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f42532a;
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
