package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.q11;
public final class g extends Drawable {
    public final int f45246a;
    public final q11 f45247b;
    public final i f45248c;

    public g(i iVar, String str, int i10) {
        this.f45246a = i10;
        switch (i10) {
            case 1:
                this.f45248c = iVar;
                this.f45247b = new q11(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f45248c = iVar;
                this.f45247b = new q11(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f45246a) {
            case 0:
                this.f45247b.c(getBounds().centerX() - (this.f45247b.f31790c / 2.0f), getBounds().centerY(), 1.0f, this.f45248c.f45269s, canvas);
                return;
            default:
                this.f45247b.c(getBounds().centerX() - (this.f45247b.f31790c / 2.0f), getBounds().centerY(), 1.0f, this.f45248c.f45269s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f45246a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f45246a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f45246a;
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
