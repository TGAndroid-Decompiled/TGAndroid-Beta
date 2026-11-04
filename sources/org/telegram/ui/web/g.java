package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ly0;
public final class g extends Drawable {
    public final int f50846a;
    public final ly0 f50847b;
    public final i f50848c;

    public g(i iVar, String str, int i3) {
        this.f50846a = i3;
        switch (i3) {
            case 1:
                this.f50848c = iVar;
                this.f50847b = new ly0(str, 14.0f, org.telegram.messenger.g0.o());
                return;
            default:
                this.f50848c = iVar;
                this.f50847b = new ly0(str, 14.0f, org.telegram.messenger.g0.o());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f50846a) {
            case 0:
                this.f50847b.c(getBounds().centerX() - (this.f50847b.f35918c / 2.0f), getBounds().centerY(), 1.0f, this.f50848c.f50865s, canvas);
                return;
            default:
                this.f50847b.c(getBounds().centerX() - (this.f50847b.f35918c / 2.0f), getBounds().centerY(), 1.0f, this.f50848c.f50865s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f50846a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i3) {
        int i10 = this.f50846a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i3 = this.f50846a;
    }

    private final void a(int i3) {
    }

    private final void b(int i3) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
