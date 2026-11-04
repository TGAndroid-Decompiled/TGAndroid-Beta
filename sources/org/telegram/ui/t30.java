package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
public final class t30 extends Drawable {
    public long f49693b;
    public int d;
    public final View f49695e;
    public final Paint f49692a = new Paint(1);
    public float f49694c = 1.0f;

    public t30(View view) {
        this.f49695e = view;
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        View view = this.f49695e;
        if (view instanceof org.telegram.ui.ActionBar.k5) {
            L = org.telegram.messenger.g0.L(1.0f) + centerY;
            centerX -= org.telegram.messenger.g0.L(3.0f);
        } else {
            L = org.telegram.messenger.g0.L(2.0f) + centerY;
        }
        Paint paint = this.f49692a;
        paint.setColor(-1147527);
        paint.setAlpha((int) (this.f49694c * 255.0f));
        canvas.drawCircle(centerX, L, org.telegram.messenger.g0.L(4.0f), paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f49693b;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f49693b = elapsedRealtime;
        int i3 = this.d;
        if (i3 == 0) {
            float f10 = (((float) j10) / 2000.0f) + this.f49694c;
            this.f49694c = f10;
            if (f10 >= 1.0f) {
                this.f49694c = 1.0f;
                this.d = 1;
            }
        } else if (i3 == 1) {
            float f11 = this.f49694c - (((float) j10) / 2000.0f);
            this.f49694c = f11;
            if (f11 < 0.5f) {
                this.f49694c = 0.5f;
                this.d = 0;
            }
        }
        view.invalidate();
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
