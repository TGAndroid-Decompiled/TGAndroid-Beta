package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
public final class y30 extends Drawable {
    public long f52045b;
    public int d;
    public final View f52047e;
    public final Paint f52044a = new Paint(1);
    public float f52046c = 1.0f;

    public y30(View view) {
        this.f52047e = view;
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        View view = this.f52047e;
        if (view instanceof org.telegram.ui.ActionBar.k5) {
            L = org.telegram.messenger.g0.L(1.0f) + centerY;
            centerX -= org.telegram.messenger.g0.L(3.0f);
        } else {
            L = org.telegram.messenger.g0.L(2.0f) + centerY;
        }
        Paint paint = this.f52044a;
        paint.setColor(-1147527);
        paint.setAlpha((int) (this.f52046c * 255.0f));
        canvas.drawCircle(centerX, L, org.telegram.messenger.g0.L(4.0f), paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f52045b;
        if (j3 > 17) {
            j3 = 17;
        }
        this.f52045b = elapsedRealtime;
        int i7 = this.d;
        if (i7 == 0) {
            float f10 = (((float) j3) / 2000.0f) + this.f52046c;
            this.f52046c = f10;
            if (f10 >= 1.0f) {
                this.f52046c = 1.0f;
                this.d = 1;
            }
        } else if (i7 == 1) {
            float f11 = this.f52046c - (((float) j3) / 2000.0f);
            this.f52046c = f11;
            if (f11 < 0.5f) {
                this.f52046c = 0.5f;
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
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
