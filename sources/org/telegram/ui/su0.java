package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class su0 extends View {
    public final Paint f43599a;
    public final TextPaint f43600b;
    public int f43601c;
    public int d;
    public int e;
    public int f43602f;
    public final String h;
    public final String f43603n;
    public int f43604r;
    public final PhotoViewer f43605s;

    public su0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f43605s = photoViewer;
        this.f43599a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f43600b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-3289651);
        this.h = LocaleController.getString("AccDescrVideoCompressLow", R.string.AccDescrVideoCompressLow);
        this.f43603n = LocaleController.getString("AccDescrVideoCompressHigh", R.string.AccDescrVideoCompressHigh);
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new ru0(this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        if (this.f43605s.Z7 != 1) {
            this.f43602f = (((getMeasuredWidth() - (this.f43601c * this.f43605s.Z7)) - (((this.f43605s.Z7 * 2) - 2) * this.d)) - (this.e * 2)) / (this.f43605s.Z7 - 1);
        } else {
            this.f43602f = ((getMeasuredWidth() - (this.f43601c * this.f43605s.Z7)) - (this.d * 2)) - (this.e * 2);
        }
        int dp = AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2);
        for (int i11 = 0; i11 < this.f43605s.Z7; i11++) {
            int i12 = this.e;
            int i13 = (this.d * 2) + this.f43602f;
            int i14 = this.f43601c;
            int i15 = (i14 / 2) + ((i13 + i14) * i11) + i12;
            if (i11 <= this.f43605s.Y7) {
                this.f43599a.setColor(-11292945);
            } else {
                this.f43599a.setColor(1728053247);
            }
            float f10 = i15;
            float f11 = dp;
            if (i11 == this.f43605s.Y7) {
                i10 = AndroidUtilities.dp(6.0f);
            } else {
                i10 = this.f43601c / 2;
            }
            canvas.drawCircle(f10, f11, i10, this.f43599a);
            if (i11 != 0) {
                int i16 = ((i15 - (this.f43601c / 2)) - this.d) - this.f43602f;
                float f12 = 0.0f;
                if (i11 == this.f43605s.Y7 + 1) {
                    f7 = AndroidUtilities.dpf2(2.0f);
                } else {
                    f7 = 0.0f;
                }
                if (i11 == this.f43605s.Y7) {
                    f12 = AndroidUtilities.dpf2(2.0f);
                }
                canvas.drawRect(f7 + i16, dp - AndroidUtilities.dp(1.0f), (i16 + this.f43602f) - f12, AndroidUtilities.dp(2.0f) + dp, this.f43599a);
            }
        }
        canvas.drawText(this.h, this.e, dp - AndroidUtilities.dp(16.0f), this.f43600b);
        canvas.drawText(this.f43603n, (getMeasuredWidth() - this.e) - this.f43600b.measureText(this.f43603n), dp - AndroidUtilities.dp(16.0f), this.f43600b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f43601c = AndroidUtilities.dp(8.0f);
        this.d = AndroidUtilities.dp(2.0f);
        this.e = AndroidUtilities.dp(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x9 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f43604r = this.f43605s.Y7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i10 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i10 >= this.f43605s.Z7) {
                    break;
                }
                int i11 = this.e;
                int i12 = this.f43602f;
                int i13 = this.d;
                int i14 = this.f43601c;
                int i15 = i14 / 2;
                int i16 = (((i13 * 2) + i12 + i14) * i10) + i11 + i15;
                int i17 = (i12 / 2) + i15 + i13;
                if (x9 > i16 - i17 && x9 < i16 + i17) {
                    if (this.f43605s.Y7 != i10) {
                        this.f43605s.Y7 = i10;
                        this.f43605s.S0();
                        invalidate();
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f43605s.Y7 != this.f43604r) {
                this.f43605s.r2(1);
            }
            this.f43605s.L6 = false;
            return true;
        }
        return true;
    }
}
