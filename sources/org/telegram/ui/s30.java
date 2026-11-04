package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
public final class s30 extends Drawable {
    public final Paint f49341a;
    public final Paint f49342b;
    public long f49343c;
    public float d;
    public int f49344e;
    public boolean f49345f;
    public View f49346g;

    public s30() {
        Paint paint = new Paint(1);
        this.f49341a = paint;
        this.f49342b = new Paint(1);
        this.d = 1.0f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
    }

    public final void a(ImageView imageView) {
        this.f49346g = imageView;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i3;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        canvas.drawCircle(centerX, centerY, org.telegram.messenger.g0.L(10.0f), this.f49341a);
        if (this.f49345f) {
            i3 = -1147527;
        } else {
            i3 = -1;
        }
        Paint paint = this.f49342b;
        paint.setColor(i3);
        paint.setAlpha((int) (this.d * 255.0f));
        canvas.drawCircle(centerX, centerY, org.telegram.messenger.g0.L(5.0f), paint);
        if (this.f49345f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f49343c;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f49343c = elapsedRealtime;
            int i10 = this.f49344e;
            if (i10 == 0) {
                float f10 = (((float) j10) / 2000.0f) + this.d;
                this.d = f10;
                if (f10 >= 1.0f) {
                    this.d = 1.0f;
                    this.f49344e = 1;
                }
            } else if (i10 == 1) {
                float f11 = this.d - (((float) j10) / 2000.0f);
                this.d = f11;
                if (f11 < 0.5f) {
                    this.d = 0.5f;
                    this.f49344e = 0;
                }
            }
            this.f49346g.invalidate();
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
    public final void setAlpha(int i3) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
