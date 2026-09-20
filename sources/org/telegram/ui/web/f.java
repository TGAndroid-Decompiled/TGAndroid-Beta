package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u01;
public final class f extends Drawable {
    public final int f38897a;
    public final u01 f38898b;
    public final h f38899c;

    public f(h hVar, String str, int i10) {
        this.f38897a = i10;
        switch (i10) {
            case 1:
                this.f38899c = hVar;
                this.f38898b = new u01(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f38899c = hVar;
                this.f38898b = new u01(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f38897a) {
            case 0:
                this.f38898b.c(getBounds().centerX() - (this.f38898b.f28493c / 2.0f), getBounds().centerY(), 1.0f, this.f38899c.f38915s, canvas);
                return;
            default:
                this.f38898b.c(getBounds().centerX() - (this.f38898b.f28493c / 2.0f), getBounds().centerY(), 1.0f, this.f38899c.f38915s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f38897a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f38897a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f38897a;
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
