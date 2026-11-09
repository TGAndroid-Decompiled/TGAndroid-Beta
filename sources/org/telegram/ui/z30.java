package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
public final class z30 extends Drawable {
    public final Paint f52410a;
    public final Paint f52411b;
    public long f52412c;
    public float d;
    public int f52413e;
    public boolean f52414f;
    public View f52415g;

    public z30() {
        Paint paint = new Paint(1);
        this.f52410a = paint;
        this.f52411b = new Paint(1);
        this.d = 1.0f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
    }

    public final void a(ImageView imageView) {
        this.f52415g = imageView;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        canvas.drawCircle(centerX, centerY, org.telegram.messenger.g0.L(10.0f), this.f52410a);
        if (this.f52414f) {
            i7 = -1147527;
        } else {
            i7 = -1;
        }
        Paint paint = this.f52411b;
        paint.setColor(i7);
        paint.setAlpha((int) (this.d * 255.0f));
        canvas.drawCircle(centerX, centerY, org.telegram.messenger.g0.L(5.0f), paint);
        if (this.f52414f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f52412c;
            if (j3 > 17) {
                j3 = 17;
            }
            this.f52412c = elapsedRealtime;
            int i10 = this.f52413e;
            if (i10 == 0) {
                float f10 = (((float) j3) / 2000.0f) + this.d;
                this.d = f10;
                if (f10 >= 1.0f) {
                    this.d = 1.0f;
                    this.f52413e = 1;
                }
            } else if (i10 == 1) {
                float f11 = this.d - (((float) j3) / 2000.0f);
                this.d = f11;
                if (f11 < 0.5f) {
                    this.d = 0.5f;
                    this.f52413e = 0;
                }
            }
            this.f52415g.invalidate();
        }
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
