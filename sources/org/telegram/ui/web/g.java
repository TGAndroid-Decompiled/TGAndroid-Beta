package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;
public final class g extends Drawable {
    public final int f42120a;
    public final f01 f42121b;
    public final i f42122c;

    public g(i iVar, String str, int i10) {
        this.f42120a = i10;
        switch (i10) {
            case 1:
                this.f42122c = iVar;
                this.f42121b = new f01(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f42122c = iVar;
                this.f42121b = new f01(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f42120a) {
            case 0:
                this.f42121b.c(getBounds().centerX() - (this.f42121b.f25875c / 2.0f), getBounds().centerY(), 1.0f, this.f42122c.f42148s, canvas);
                return;
            default:
                this.f42121b.c(getBounds().centerX() - (this.f42121b.f25875c / 2.0f), getBounds().centerY(), 1.0f, this.f42122c.f42148s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f42120a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f42120a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f42120a;
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
