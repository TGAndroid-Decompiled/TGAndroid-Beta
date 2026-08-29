package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zz0;
public final class g extends Drawable {
    public final int f44037a;
    public final zz0 f44038b;
    public final i f44039c;

    public g(i iVar, String str, int i10) {
        this.f44037a = i10;
        switch (i10) {
            case 1:
                this.f44039c = iVar;
                this.f44038b = new zz0(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f44039c = iVar;
                this.f44038b = new zz0(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f44037a) {
            case 0:
                this.f44038b.c(getBounds().centerX() - (this.f44038b.f35462c / 2.0f), getBounds().centerY(), 1.0f, this.f44039c.f44061s, canvas);
                return;
            default:
                this.f44038b.c(getBounds().centerX() - (this.f44038b.f35462c / 2.0f), getBounds().centerY(), 1.0f, this.f44039c.f44061s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f44037a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f44037a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f44037a;
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
