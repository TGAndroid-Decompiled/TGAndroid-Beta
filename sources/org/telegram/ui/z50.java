package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z50 extends Drawable {
    public long f43801b;
    public int d;
    public final View f43803e;
    public final Paint f43800a = new Paint(1);
    public float f43802c = 1.0f;

    public z50(View view) {
        this.f43803e = view;
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        View view = this.f43803e;
        if (view instanceof org.telegram.ui.ActionBar.l5) {
            dp = AndroidUtilities.dp(1.0f) + centerY;
            centerX -= AndroidUtilities.dp(3.0f);
        } else {
            dp = AndroidUtilities.dp(2.0f) + centerY;
        }
        Paint paint = this.f43800a;
        paint.setColor(-1147527);
        paint.setAlpha((int) (this.f43802c * 255.0f));
        canvas.drawCircle(centerX, dp, AndroidUtilities.dp(4.0f), paint);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f43801b;
        if (j10 > 17) {
            j10 = 17;
        }
        this.f43801b = elapsedRealtime;
        int i10 = this.d;
        if (i10 == 0) {
            float f10 = (((float) j10) / 2000.0f) + this.f43802c;
            this.f43802c = f10;
            if (f10 >= 1.0f) {
                this.f43802c = 1.0f;
                this.d = 1;
            }
        } else if (i10 == 1) {
            float f11 = this.f43802c - (((float) j10) / 2000.0f);
            this.f43802c = f11;
            if (f11 < 0.5f) {
                this.f43802c = 0.5f;
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
