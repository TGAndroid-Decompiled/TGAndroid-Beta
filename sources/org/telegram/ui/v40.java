package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
public final class v40 extends Drawable {
    public final Paint f42411a;
    public final Paint f42412b;
    public long f42413c;
    public float d;
    public int e;
    public boolean f42414f;
    public View f42415g;

    public v40() {
        Paint paint = new Paint(1);
        this.f42411a = paint;
        this.f42412b = new Paint(1);
        this.d = 1.0f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
    }

    public final void a(ImageView imageView) {
        this.f42415g = imageView;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        canvas.drawCircle(centerX, centerY, org.telegram.messenger.i0.L(10.0f), this.f42411a);
        if (this.f42414f) {
            i10 = -1147527;
        } else {
            i10 = -1;
        }
        Paint paint = this.f42412b;
        paint.setColor(i10);
        paint.setAlpha((int) (this.d * 255.0f));
        canvas.drawCircle(centerX, centerY, org.telegram.messenger.i0.L(5.0f), paint);
        if (this.f42414f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f42413c;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f42413c = elapsedRealtime;
            int i11 = this.e;
            if (i11 == 0) {
                float f7 = (((float) j10) / 2000.0f) + this.d;
                this.d = f7;
                if (f7 >= 1.0f) {
                    this.d = 1.0f;
                    this.e = 1;
                }
            } else if (i11 == 1) {
                float f10 = this.d - (((float) j10) / 2000.0f);
                this.d = f10;
                if (f10 < 0.5f) {
                    this.d = 0.5f;
                    this.e = 0;
                }
            }
            this.f42415g.invalidate();
        }
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
