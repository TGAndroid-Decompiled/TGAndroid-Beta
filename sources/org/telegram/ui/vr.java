package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class vr extends Drawable {
    public final Drawable f43715a;
    public final Drawable f43716b;
    public int d;
    public int f43718e;
    public final ArrayList f43717c = new ArrayList();
    public boolean f43719f = false;
    public final org.telegram.ui.Components.d6 f43720g = new org.telegram.ui.Components.d6(new ui(this, 13), 420, org.telegram.ui.Components.jr.h);
    public int h = 255;

    public vr(Drawable drawable, Drawable drawable2) {
        this.f43715a = drawable;
        this.f43716b = drawable2;
    }

    public final void a(int i10, int i11) {
        this.d = i10;
        this.f43718e = i11;
    }

    public final void b(boolean z10) {
        if (this.f43719f == z10) {
            return;
        }
        this.f43719f = z10;
        ArrayList arrayList = this.f43717c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        float e10 = this.f43720g.e(this.f43719f);
        int i10 = this.h;
        Drawable drawable = this.f43715a;
        drawable.setAlpha(i10);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (e10 > 0.0f) {
            Drawable drawable2 = this.f43716b;
            drawable2.setAlpha((int) (this.h * e10));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.f43718e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.f43718e);
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, e10);
            canvas.save();
            canvas.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f43715a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f43715a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.h = i10;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f43715a.setColorFilter(colorFilter);
        this.f43716b.setColorFilter(colorFilter);
    }
}
