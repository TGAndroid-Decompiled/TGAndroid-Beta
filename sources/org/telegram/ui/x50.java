package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class x50 extends Drawable {
    public final Paint f39861a;
    public final Paint f39862b;
    public long f39863c;
    public float d;
    public int e;
    public boolean f39864f;
    public View f39865g;

    public x50() {
        Paint paint = new Paint(1);
        this.f39861a = paint;
        this.f39862b = new Paint(1);
        this.d = 1.0f;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
    }

    public final void a(ImageView imageView) {
        this.f39865g = imageView;
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float centerX = getBounds().centerX();
        float centerY = getBounds().centerY();
        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f), this.f39861a);
        if (this.f39864f) {
            i10 = -1147527;
        } else {
            i10 = -1;
        }
        Paint paint = this.f39862b;
        paint.setColor(i10);
        paint.setAlpha((int) (this.d * 255.0f));
        canvas.drawCircle(centerX, centerY, AndroidUtilities.dp(5.0f), paint);
        if (this.f39864f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f39863c;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f39863c = elapsedRealtime;
            int i11 = this.e;
            if (i11 == 0) {
                float f10 = (((float) j10) / 2000.0f) + this.d;
                this.d = f10;
                if (f10 >= 1.0f) {
                    this.d = 1.0f;
                    this.e = 1;
                }
            } else if (i11 == 1) {
                float f11 = this.d - (((float) j10) / 2000.0f);
                this.d = f11;
                if (f11 < 0.5f) {
                    this.d = 0.5f;
                    this.e = 0;
                }
            }
            this.f39865g.invalidate();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
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
