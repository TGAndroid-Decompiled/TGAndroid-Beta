package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;
public final class g extends Drawable {
    public final int f42093a;
    public final f01 f42094b;
    public final i f42095c;

    public g(i iVar, String str, int i10) {
        this.f42093a = i10;
        switch (i10) {
            case 1:
                this.f42095c = iVar;
                this.f42094b = new f01(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f42095c = iVar;
                this.f42094b = new f01(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f42093a) {
            case 0:
                this.f42094b.c(getBounds().centerX() - (this.f42094b.f25848c / 2.0f), getBounds().centerY(), 1.0f, this.f42095c.f42121s, canvas);
                return;
            default:
                this.f42094b.c(getBounds().centerX() - (this.f42094b.f25848c / 2.0f), getBounds().centerY(), 1.0f, this.f42095c.f42121s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f42093a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f42093a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f42093a;
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
