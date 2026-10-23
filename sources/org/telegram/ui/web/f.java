package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f11;
public final class f extends Drawable {
    public final int f42634a;
    public final f11 f42635b;
    public final h f42636c;

    public f(h hVar, String str, int i10) {
        this.f42634a = i10;
        switch (i10) {
            case 1:
                this.f42636c = hVar;
                this.f42635b = new f11(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f42636c = hVar;
                this.f42635b = new f11(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f42634a) {
            case 0:
                this.f42635b.c(getBounds().centerX() - (this.f42635b.f26025c / 2.0f), getBounds().centerY(), 1.0f, this.f42636c.f42665s, canvas);
                return;
            default:
                this.f42635b.c(getBounds().centerX() - (this.f42635b.f26025c / 2.0f), getBounds().centerY(), 1.0f, this.f42636c.f42665s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f42634a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f42634a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f42634a;
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
