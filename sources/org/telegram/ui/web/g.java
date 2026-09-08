package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;
public final class g extends Drawable {
    public final int f42119a;
    public final f01 f42120b;
    public final i f42121c;

    public g(i iVar, String str, int i10) {
        this.f42119a = i10;
        switch (i10) {
            case 1:
                this.f42121c = iVar;
                this.f42120b = new f01(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f42121c = iVar;
                this.f42120b = new f01(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f42119a) {
            case 0:
                this.f42120b.c(getBounds().centerX() - (this.f42120b.f25874c / 2.0f), getBounds().centerY(), 1.0f, this.f42121c.f42147s, canvas);
                return;
            default:
                this.f42120b.c(getBounds().centerX() - (this.f42120b.f25874c / 2.0f), getBounds().centerY(), 1.0f, this.f42121c.f42147s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f42119a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f42119a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f42119a;
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
