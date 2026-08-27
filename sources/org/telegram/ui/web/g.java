package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pz0;

public final class g extends Drawable {

    public final int f43836a;

    public final pz0 f43837b;

    public final i f43838c;

    public g(i iVar, String str, int i10) {
        this.f43836a = i10;
        switch (i10) {
            case 1:
                this.f43838c = iVar;
                this.f43837b = new pz0(str, 14.0f, AndroidUtilities.bold());
                break;
            default:
                this.f43838c = iVar;
                this.f43837b = new pz0(str, 14.0f, AndroidUtilities.bold());
                break;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f43836a) {
            case 0:
                this.f43837b.c(getBounds().centerX() - (this.f43837b.f31697c / 2.0f), getBounds().centerY(), 1.0f, this.f43838c.f43859s, canvas);
                break;
            default:
                this.f43837b.c(getBounds().centerX() - (this.f43837b.f31697c / 2.0f), getBounds().centerY(), 1.0f, this.f43838c.f43859s, canvas);
                break;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f43836a) {
        }
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f43836a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f43836a;
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
