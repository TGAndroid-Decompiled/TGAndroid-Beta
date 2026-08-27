package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class xr extends Drawable {

    public final Drawable f44597a;

    public final Drawable f44598b;
    public int d;

    public int f44600e;

    public final ArrayList f44599c = new ArrayList();

    public boolean f44601f = false;

    public final org.telegram.ui.Components.y5 f44602g = new org.telegram.ui.Components.y5(new ti(this, 13), 420, org.telegram.ui.Components.er.h);
    public int h = 255;

    public xr(Drawable drawable, Drawable drawable2) {
        this.f44597a = drawable;
        this.f44598b = drawable2;
    }

    public final void a(int i10, int i11) {
        this.d = i10;
        this.f44600e = i11;
    }

    public final void b(boolean z10) {
        if (this.f44601f == z10) {
            return;
        }
        this.f44601f = z10;
        ArrayList arrayList = this.f44599c;
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
        float fE = this.f44602g.e(this.f44601f);
        int i10 = this.h;
        Drawable drawable = this.f44597a;
        drawable.setAlpha(i10);
        drawable.setBounds(getBounds());
        drawable.draw(canvas);
        if (fE > 0.0f) {
            int i11 = (int) (this.h * fE);
            Drawable drawable2 = this.f44598b;
            drawable2.setAlpha(i11);
            drawable2.setBounds(getBounds().left + this.d, getBounds().top + this.f44600e, drawable2.getIntrinsicWidth() + getBounds().left + this.d, drawable2.getIntrinsicHeight() + getBounds().top + this.f44600e);
            float fLerp = AndroidUtilities.lerp(0.5f, 1.0f, fE);
            canvas.save();
            canvas.scale(fLerp, fLerp, drawable2.getBounds().centerX(), drawable2.getBounds().centerY());
            drawable2.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f44597a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f44597a.getIntrinsicWidth();
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
        this.f44597a.setColorFilter(colorFilter);
        this.f44598b.setColorFilter(colorFilter);
    }
}
