package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class wr extends Drawable {
    public final Drawable f43386a;
    public final Drawable f43387b;
    public int d;
    public int e;
    public final ArrayList f43388c = new ArrayList();
    public boolean f43389f = false;
    public final org.telegram.ui.Components.d6 f43390g = new org.telegram.ui.Components.d6(new ti(this, 14), 420, org.telegram.ui.Components.zr.h);
    public int h = 255;

    public wr(Drawable drawable, Drawable drawable2) {
        this.f43386a = drawable;
        this.f43387b = drawable2;
    }

    public final void a(int i10, int i11) {
        this.d = i10;
        this.e = i11;
    }

    public final void b(boolean z10) {
        if (this.f43389f == z10) {
            return;
        }
        this.f43389f = z10;
        ArrayList arrayList = this.f43388c;
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
        float e = this.f43390g.e(this.f43389f);
        int i10 = this.h;
        Drawable drawable = this.f43386a;
        drawable.setAlpha(i10);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (e > 0.0f) {
            Drawable drawable2 = this.f43387b;
            drawable2.setAlpha((int) (this.h * e));
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.e);
            float lerp = AndroidUtilities.lerp(0.5f, 1.0f, e);
            canvas.save();
            canvas.scale(lerp, lerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f43386a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f43386a.getIntrinsicWidth();
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
        this.f43386a.setColorFilter(colorFilter);
        this.f43387b.setColorFilter(colorFilter);
    }
}
