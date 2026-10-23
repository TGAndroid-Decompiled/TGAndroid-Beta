package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i11;
public final class g extends Drawable {
    public final int f43113a;
    public final i11 f43114b;
    public final i f43115c;

    public g(i iVar, String str, int i10) {
        this.f43113a = i10;
        switch (i10) {
            case 1:
                this.f43115c = iVar;
                this.f43114b = new i11(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f43115c = iVar;
                this.f43114b = new i11(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f43113a) {
            case 0:
                this.f43114b.c(getBounds().centerX() - (this.f43114b.f27164c / 2.0f), getBounds().centerY(), 1.0f, this.f43115c.f43144s, canvas);
                return;
            default:
                this.f43114b.c(getBounds().centerX() - (this.f43114b.f27164c / 2.0f), getBounds().centerY(), 1.0f, this.f43115c.f43144s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f43113a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f43113a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f43113a;
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
