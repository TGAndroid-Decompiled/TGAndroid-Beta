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
    public final Paint f38311a;
    public final TextPaint f38312b;
    public int f38313c;
    public int d;
    public int e;
    public int f38314f;
    public final String h;
    public final String f38315n;
    public int f38316r;
    public final PhotoViewer f38317s;

    public su0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f38317s = photoViewer;
        this.f38311a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f38312b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-3289651);
        this.h = LocaleController.getString("AccDescrVideoCompressLow", R.string.AccDescrVideoCompressLow);
        this.f38315n = LocaleController.getString("AccDescrVideoCompressHigh", R.string.AccDescrVideoCompressHigh);
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new ru0(this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        if (this.f38317s.V7 != 1) {
            this.f38314f = (((getMeasuredWidth() - (this.f38313c * this.f38317s.V7)) - (((this.f38317s.V7 * 2) - 2) * this.d)) - (this.e * 2)) / (this.f38317s.V7 - 1);
        } else {
            this.f38314f = ((getMeasuredWidth() - (this.f38313c * this.f38317s.V7)) - (this.d * 2)) - (this.e * 2);
        }
        int dp = AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2);
        for (int i11 = 0; i11 < this.f38317s.V7; i11++) {
            int i12 = this.e;
            int i13 = (this.d * 2) + this.f38314f;
            int i14 = this.f38313c;
            int i15 = (i14 / 2) + ((i13 + i14) * i11) + i12;
            if (i11 <= this.f38317s.U7) {
                this.f38311a.setColor(-11292945);
            } else {
                this.f38311a.setColor(1728053247);
            }
            float f11 = i15;
            float f12 = dp;
            if (i11 == this.f38317s.U7) {
                i10 = AndroidUtilities.dp(6.0f);
            } else {
                i10 = this.f38313c / 2;
            }
            canvas.drawCircle(f11, f12, i10, this.f38311a);
            if (i11 != 0) {
                int i16 = ((i15 - (this.f38313c / 2)) - this.d) - this.f38314f;
                float f13 = 0.0f;
                if (i11 == this.f38317s.U7 + 1) {
                    f10 = AndroidUtilities.dpf2(2.0f);
                } else {
                    f10 = 0.0f;
                }
                if (i11 == this.f38317s.U7) {
                    f13 = AndroidUtilities.dpf2(2.0f);
                }
                canvas.drawRect(f10 + i16, dp - AndroidUtilities.dp(1.0f), (i16 + this.f38314f) - f13, AndroidUtilities.dp(2.0f) + dp, this.f38311a);
            }
        }
        canvas.drawText(this.h, this.e, dp - AndroidUtilities.dp(16.0f), this.f38312b);
        canvas.drawText(this.f38315n, (getMeasuredWidth() - this.e) - this.f38312b.measureText(this.f38315n), dp - AndroidUtilities.dp(16.0f), this.f38312b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f38313c = AndroidUtilities.dp(8.0f);
        this.d = AndroidUtilities.dp(2.0f);
        this.e = AndroidUtilities.dp(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f38316r = this.f38317s.U7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i10 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i10 >= this.f38317s.V7) {
                    break;
                }
                int i11 = this.e;
                int i12 = this.f38314f;
                int i13 = this.d;
                int i14 = this.f38313c;
                int i15 = i14 / 2;
                int i16 = (((i13 * 2) + i12 + i14) * i10) + i11 + i15;
                int i17 = (i12 / 2) + i15 + i13;
                if (x10 > i16 - i17 && x10 < i16 + i17) {
                    if (this.f38317s.U7 != i10) {
                        this.f38317s.U7 = i10;
                        this.f38317s.R0();
                        invalidate();
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f38317s.U7 != this.f38316r) {
                this.f38317s.p2(1);
            }
            this.f38317s.I6 = false;
            return true;
        }
        return true;
    }
}
