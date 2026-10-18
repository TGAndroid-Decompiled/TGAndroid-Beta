package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class wr extends Drawable {
    public final Drawable f42895a;
    public final Drawable f42896b;
    public int d;
    public int e;
    public final ArrayList f42897c = new ArrayList();
    public boolean f42898f = false;
    public final org.telegram.ui.Components.f6 f42899g = new org.telegram.ui.Components.f6(new vi(this, 14), 420, org.telegram.ui.Components.bs.h);
    public int h = 255;

    public wr(Drawable drawable, Drawable drawable2) {
        this.f42895a = drawable;
        this.f42896b = drawable2;
    }

    public final void a(int i10, int i11) {
        this.d = i10;
        this.e = i11;
    }

    public final void b(boolean z10) {
        if (this.f42898f == z10) {
            return;
        }
        this.f42898f = z10;
        ArrayList arrayList = this.f42897c;
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
        float e = this.f42899g.e(this.f42898f);
        int i10 = this.h;
        Drawable drawable = this.f42895a;
        drawable.setAlpha(i10);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (e > 0.0f) {
            Drawable drawable2 = this.f42896b;
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
        return this.f42895a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f42895a.getIntrinsicWidth();
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
        this.f42895a.setColorFilter(colorFilter);
        this.f42896b.setColorFilter(colorFilter);
    }
}
