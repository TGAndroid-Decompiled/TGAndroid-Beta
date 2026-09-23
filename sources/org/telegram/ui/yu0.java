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
public final class yu0 extends View {
    public final Paint f39895a;
    public final TextPaint f39896b;
    public int f39897c;
    public int d;
    public int e;
    public int f39898f;
    public final String h;
    public final String f39899n;
    public int f39900r;
    public final PhotoViewer f39901s;

    public yu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f39901s = photoViewer;
        this.f39895a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f39896b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-3289651);
        this.h = LocaleController.getString("AccDescrVideoCompressLow", R.string.AccDescrVideoCompressLow);
        this.f39899n = LocaleController.getString("AccDescrVideoCompressHigh", R.string.AccDescrVideoCompressHigh);
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new xu0(this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        if (this.f39901s.Z7 != 1) {
            this.f39898f = (((getMeasuredWidth() - (this.f39897c * this.f39901s.Z7)) - (((this.f39901s.Z7 * 2) - 2) * this.d)) - (this.e * 2)) / (this.f39901s.Z7 - 1);
        } else {
            this.f39898f = ((getMeasuredWidth() - (this.f39897c * this.f39901s.Z7)) - (this.d * 2)) - (this.e * 2);
        }
        int dp = AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2);
        for (int i11 = 0; i11 < this.f39901s.Z7; i11++) {
            int i12 = this.e;
            int i13 = (this.d * 2) + this.f39898f;
            int i14 = this.f39897c;
            int i15 = (i14 / 2) + ((i13 + i14) * i11) + i12;
            if (i11 <= this.f39901s.Y7) {
                this.f39895a.setColor(-11292945);
            } else {
                this.f39895a.setColor(1728053247);
            }
            float f10 = i15;
            float f11 = dp;
            if (i11 == this.f39901s.Y7) {
                i10 = AndroidUtilities.dp(6.0f);
            } else {
                i10 = this.f39897c / 2;
            }
            canvas.drawCircle(f10, f11, i10, this.f39895a);
            if (i11 != 0) {
                int i16 = ((i15 - (this.f39897c / 2)) - this.d) - this.f39898f;
                float f12 = 0.0f;
                if (i11 == this.f39901s.Y7 + 1) {
                    f7 = AndroidUtilities.dpf2(2.0f);
                } else {
                    f7 = 0.0f;
                }
                if (i11 == this.f39901s.Y7) {
                    f12 = AndroidUtilities.dpf2(2.0f);
                }
                canvas.drawRect(f7 + i16, dp - AndroidUtilities.dp(1.0f), (i16 + this.f39898f) - f12, AndroidUtilities.dp(2.0f) + dp, this.f39895a);
            }
        }
        canvas.drawText(this.h, this.e, dp - AndroidUtilities.dp(16.0f), this.f39896b);
        canvas.drawText(this.f39899n, (getMeasuredWidth() - this.e) - this.f39896b.measureText(this.f39899n), dp - AndroidUtilities.dp(16.0f), this.f39896b);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f39897c = AndroidUtilities.dp(8.0f);
        this.d = AndroidUtilities.dp(2.0f);
        this.e = AndroidUtilities.dp(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f39900r = this.f39901s.Y7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i10 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i10 >= this.f39901s.Z7) {
                    break;
                }
                int i11 = this.e;
                int i12 = this.f39898f;
                int i13 = this.d;
                int i14 = this.f39897c;
                int i15 = i14 / 2;
                int i16 = (((i13 * 2) + i12 + i14) * i10) + i11 + i15;
                int i17 = (i12 / 2) + i15 + i13;
                if (x10 > i16 - i17 && x10 < i16 + i17) {
                    if (this.f39901s.Y7 != i10) {
                        this.f39901s.Y7 = i10;
                        this.f39901s.R0();
                        invalidate();
                        return true;
                    }
                } else {
                    i10++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f39901s.Y7 != this.f39900r) {
                this.f39901s.o2(1);
            }
            this.f39901s.L6 = false;
            return true;
        }
        return true;
    }
}
