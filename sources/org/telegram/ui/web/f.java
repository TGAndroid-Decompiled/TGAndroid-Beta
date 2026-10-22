package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f11;
public final class f extends Drawable {
    public final int f42633a;
    public final f11 f42634b;
    public final h f42635c;

    public f(h hVar, String str, int i10) {
        this.f42633a = i10;
        switch (i10) {
            case 1:
                this.f42635c = hVar;
                this.f42634b = new f11(str, 14.0f, AndroidUtilities.bold());
                return;
            default:
                this.f42635c = hVar;
                this.f42634b = new f11(str, 14.0f, AndroidUtilities.bold());
                return;
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        switch (this.f42633a) {
            case 0:
                this.f42634b.c(getBounds().centerX() - (this.f42634b.f26024c / 2.0f), getBounds().centerY(), 1.0f, this.f42635c.f42664s, canvas);
                return;
            default:
                this.f42634b.c(getBounds().centerX() - (this.f42634b.f26024c / 2.0f), getBounds().centerY(), 1.0f, this.f42635c.f42664s, canvas);
                return;
        }
    }

    @Override
    public final int getOpacity() {
        switch (this.f42633a) {
            case 0:
                return -2;
            default:
                return -2;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        int i11 = this.f42633a;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.f42633a;
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
