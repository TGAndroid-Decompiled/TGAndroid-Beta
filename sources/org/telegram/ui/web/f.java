package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.n11;
public final class f extends Drawable {
    public final int f43486a;
    public final n11 f43487b;
    public final h f43488c;

    public f(h hVar, String str, int i10) {
        this.f43486a = i10;
        switch (i10) {
            case 1:
                this.f43488c = hVar;
                this.f43487b = new n11(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f43488c = hVar;
                this.f43487b = new n11(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f43486a) {
            case 0:
                this.f43487b.c(getBounds().centerX() - (this.f43487b.f28902c / 2.0f), getBounds().centerY(), 1.0f, this.f43488c.f43518s, canvas);
                return;
            default:
                this.f43487b.c(getBounds().centerX() - (this.f43487b.f28902c / 2.0f), getBounds().centerY(), 1.0f, this.f43488c.f43518s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f43486a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f43486a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f43486a;
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
