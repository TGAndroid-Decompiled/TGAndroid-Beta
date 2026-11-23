package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
public final class xq0 extends View {
    public final Paint f54052a;
    public final TextPaint f54053b;
    public int f54054c;
    public int d;
    public int f54055e;
    public int f54056f;
    public final String h;
    public final String f54057n;
    public int f54058r;
    public final PhotoViewer f54059s;

    public xq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f54059s = photoViewer;
        this.f54052a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f54053b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-3289651);
        this.h = org.telegram.messenger.gd.N0(2131754736, "AccDescrVideoCompressLow");
        this.f54057n = org.telegram.messenger.gd.N0(2131754737, "AccDescrVideoCompressHigh");
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new org.telegram.ui.Components.eu0(2, this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        if (this.f54059s.f43342f8 != 1) {
            this.f54056f = (((getMeasuredWidth() - (this.f54054c * this.f54059s.f43342f8)) - (((this.f54059s.f43342f8 * 2) - 2) * this.d)) - (this.f54055e * 2)) / (this.f54059s.f43342f8 - 1);
        } else {
            this.f54056f = ((getMeasuredWidth() - (this.f54054c * this.f54059s.f43342f8)) - (this.d * 2)) - (this.f54055e * 2);
        }
        int L = org.telegram.messenger.g0.L(6.0f) + (getMeasuredHeight() / 2);
        for (int i10 = 0; i10 < this.f54059s.f43342f8; i10++) {
            int i11 = this.f54055e;
            int i12 = (this.d * 2) + this.f54056f;
            int i13 = this.f54054c;
            int i14 = (i13 / 2) + ((i12 + i13) * i10) + i11;
            if (i10 <= this.f54059s.f43331e8) {
                this.f54052a.setColor(-11292945);
            } else {
                this.f54052a.setColor(1728053247);
            }
            float f11 = i14;
            float f12 = L;
            if (i10 == this.f54059s.f43331e8) {
                i7 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i7 = this.f54054c / 2;
            }
            canvas.drawCircle(f11, f12, i7, this.f54052a);
            if (i10 != 0) {
                int i15 = ((i14 - (this.f54054c / 2)) - this.d) - this.f54056f;
                float f13 = 0.0f;
                if (i10 == this.f54059s.f43331e8 + 1) {
                    f10 = org.telegram.messenger.g0.N(2.0f);
                } else {
                    f10 = 0.0f;
                }
                if (i10 == this.f54059s.f43331e8) {
                    f13 = org.telegram.messenger.g0.N(2.0f);
                }
                canvas.drawRect(f10 + i15, L - org.telegram.messenger.g0.L(1.0f), (i15 + this.f54056f) - f13, org.telegram.messenger.g0.L(2.0f) + L, this.f54052a);
            }
        }
        canvas.drawText(this.h, this.f54055e, L - org.telegram.messenger.g0.L(16.0f), this.f54053b);
        canvas.drawText(this.f54057n, (getMeasuredWidth() - this.f54055e) - this.f54053b.measureText(this.f54057n), L - org.telegram.messenger.g0.L(16.0f), this.f54053b);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f54054c = org.telegram.messenger.g0.L(8.0f);
        this.d = org.telegram.messenger.g0.L(2.0f);
        this.f54055e = org.telegram.messenger.g0.L(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f54058r = this.f54059s.f43331e8;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i7 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i7 >= this.f54059s.f43342f8) {
                    break;
                }
                int i10 = this.f54055e;
                int i11 = this.f54056f;
                int i12 = this.d;
                int i13 = this.f54054c;
                int i14 = i13 / 2;
                int i15 = (((i12 * 2) + i11 + i13) * i7) + i10 + i14;
                int i16 = (i11 / 2) + i14 + i12;
                if (x10 > i15 - i16 && x10 < i15 + i16) {
                    if (this.f54059s.f43331e8 != i7) {
                        this.f54059s.f43331e8 = i7;
                        this.f54059s.L0();
                        invalidate();
                        return true;
                    }
                } else {
                    i7++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f54059s.f43331e8 != this.f54058r) {
                this.f54059s.o2(1);
            }
            this.f54059s.L6 = false;
            return true;
        }
        return true;
    }
}
