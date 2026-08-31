package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z50 extends Drawable {
    public long f43820b;
    public int d;
    public final View f43822e;
    public final Paint f43819a = new Paint(1);
    public float f43821c = 1.0f;

    public z50(View view) {
        this.f43822e = view;
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        View view = this.f43822e;
        if (view instanceof org.telegram.ui.ActionBar.l5) {
            dp = AndroidUtilities.dp(1.0f) + centerY;
            centerX -= AndroidUtilities.dp(3.0f);
        } else {
            dp = AndroidUtilities.dp(2.0f) + centerY;
        }
        Paint paint = this.f43819a;
        paint.setColor(-1147527);
        paint.setAlpha((int) (this.f43821c * 255.0f));
        canvas.drawCircle(centerX, dp, AndroidUtilities.dp(4.0f), paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f43820b;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f43820b = elapsedRealtime;
        int i10 = this.d;
        if (i10 == 0) {
            float f10 = (((float) j10) / 2000.0f) + this.f43821c;
            this.f43821c = f10;
            if (f10 >= 1.0f) {
                this.f43821c = 1.0f;
                this.d = 1;
            }
        } else if (i10 == 1) {
            float f11 = this.f43821c - (((float) j10) / 2000.0f);
            this.f43821c = f11;
            if (f11 < 0.5f) {
                this.f43821c = 0.5f;
                this.d = 0;
            }
        }
        view.invalidate();
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
