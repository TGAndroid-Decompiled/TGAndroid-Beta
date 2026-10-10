package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.m11;
public final class f extends Drawable {
    public final int f43343a;
    public final m11 f43344b;
    public final h f43345c;

    public f(h hVar, String str, int i10) {
        this.f43343a = i10;
        switch (i10) {
            case 1:
                this.f43345c = hVar;
                this.f43344b = new m11(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f43345c = hVar;
                this.f43344b = new m11(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f43343a) {
            case 0:
                this.f43344b.c(getBounds().centerX() - (this.f43344b.f28602c / 2.0f), getBounds().centerY(), 1.0f, this.f43345c.f43374s, canvas);
                return;
            default:
                this.f43344b.c(getBounds().centerX() - (this.f43344b.f28602c / 2.0f), getBounds().centerY(), 1.0f, this.f43345c.f43374s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f43343a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f43343a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f43343a;
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
