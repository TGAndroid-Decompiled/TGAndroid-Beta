package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t01;
public final class g extends Drawable {
    public final int f37938a;
    public final t01 f37939b;
    public final i f37940c;

    public g(i iVar, String str, int i10) {
        this.f37938a = i10;
        switch (i10) {
            case 1:
                this.f37940c = iVar;
                this.f37939b = new t01(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f37940c = iVar;
                this.f37939b = new t01(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f37938a) {
            case 0:
                this.f37939b.c(getBounds().centerX() - (this.f37939b.f27247c / 2.0f), getBounds().centerY(), 1.0f, this.f37940c.f37956s, canvas);
                return;
            default:
                this.f37939b.c(getBounds().centerX() - (this.f37939b.f27247c / 2.0f), getBounds().centerY(), 1.0f, this.f37940c.f37956s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f37938a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f37938a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f37938a;
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
