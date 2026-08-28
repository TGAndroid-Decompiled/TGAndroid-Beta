package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class wr extends Drawable {
    public final Drawable f44248a;
    public final Drawable f44249b;
    public int d;
    public int f44251e;
    public final ArrayList f44250c = new ArrayList();
    public boolean f44252f = false;
    public final org.telegram.ui.Components.y5 f44253g = new org.telegram.ui.Components.y5(new ri(this, 13), 420, org.telegram.ui.Components.gr.h);
    public int h = 255;

    public wr(Drawable drawable, Drawable drawable2) {
        this.f44248a = drawable;
        this.f44249b = drawable2;
    }

    public final void a(int i9, int i10) {
        this.d = i9;
        this.f44251e = i10;
    }

    public final void b(boolean z10) {
        if (this.f44252f == z10) {
            return;
        }
        this.f44252f = z10;
        ArrayList arrayList = this.f44250c;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((View) obj).invalidate();
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float e10 = this.f44253g.e(this.f44252f);
        int i9 = this.h;
        Drawable drawable = this.f44248a;
        drawable.setAlpha(i9);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (e10 > 0.0f) {
            Drawable drawable2 = this.f44249b;
            drawable2.setAlpha((int) (this.h * e10));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.f44251e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.f44251e);
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, e10);
            canvas.save();
            canvas.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f44248a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f44248a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i9) {
        this.h = i9;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f44248a.setColorFilter(colorFilter);
        this.f44249b.setColorFilter(colorFilter);
    }
}
