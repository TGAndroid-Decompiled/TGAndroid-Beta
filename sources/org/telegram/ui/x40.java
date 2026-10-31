package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
public final class x40 extends Drawable {
    public long f43440b;
    public int d;
    public final View e;
    public final Paint f43439a = new Paint(1);
    public float f43441c = 1.0f;

    public x40(View view) {
        this.e = view;
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        View view = this.e;
        if (view instanceof org.telegram.ui.ActionBar.u5) {
            L = org.telegram.messenger.i0.L(1.0f) + centerY;
            centerX -= org.telegram.messenger.i0.L(3.0f);
        } else {
            L = org.telegram.messenger.i0.L(2.0f) + centerY;
        }
        Paint paint = this.f43439a;
        paint.setColor(-1147527);
        paint.setAlpha((int) (this.f43441c * 255.0f));
        canvas.drawCircle(centerX, L, org.telegram.messenger.i0.L(4.0f), paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f43440b;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f43440b = elapsedRealtime;
        int i10 = this.d;
        if (i10 == 0) {
            float f7 = (((float) j10) / 2000.0f) + this.f43441c;
            this.f43441c = f7;
            if (f7 >= 1.0f) {
                this.f43441c = 1.0f;
                this.d = 1;
            }
        } else if (i10 == 1) {
            float f10 = this.f43441c - (((float) j10) / 2000.0f);
            this.f43441c = f10;
            if (f10 < 0.5f) {
                this.f43441c = 0.5f;
                this.d = 0;
            }
        }
        view.invalidate();
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
