package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d11;
public final class f extends Drawable {
    public final int f42582a;
    public final d11 f42583b;
    public final h f42584c;

    public f(h hVar, String str, int i10) {
        this.f42582a = i10;
        switch (i10) {
            case 1:
                this.f42584c = hVar;
                this.f42583b = new d11(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f42584c = hVar;
                this.f42583b = new d11(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f42582a) {
            case 0:
                this.f42583b.c(getBounds().centerX() - (this.f42583b.f25437c / 2.0f), getBounds().centerY(), 1.0f, this.f42584c.f42613s, canvas);
                return;
            default:
                this.f42583b.c(getBounds().centerX() - (this.f42583b.f25437c / 2.0f), getBounds().centerY(), 1.0f, this.f42584c.f42613s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f42582a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f42582a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f42582a;
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
