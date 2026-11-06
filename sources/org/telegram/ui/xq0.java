package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
public final class xq0 extends View {
    public final Paint f51961a;
    public final TextPaint f51962b;
    public int f51963c;
    public int d;
    public int f51964e;
    public int f51965f;
    public final String h;
    public final String f51966n;
    public int f51967r;
    public final PhotoViewer f51968s;

    public xq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f51968s = photoViewer;
        this.f51961a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f51962b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-3289651);
        this.h = org.telegram.messenger.hd.M0(2131754737, "AccDescrVideoCompressLow");
        this.f51966n = org.telegram.messenger.hd.M0(2131754738, "AccDescrVideoCompressHigh");
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new org.telegram.ui.Components.tt0(2, this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        if (this.f51968s.Y7 != 1) {
            this.f51965f = (((getMeasuredWidth() - (this.f51963c * this.f51968s.Y7)) - (((this.f51968s.Y7 * 2) - 2) * this.d)) - (this.f51964e * 2)) / (this.f51968s.Y7 - 1);
        } else {
            this.f51965f = ((getMeasuredWidth() - (this.f51963c * this.f51968s.Y7)) - (this.d * 2)) - (this.f51964e * 2);
        }
        int L = org.telegram.messenger.g0.L(6.0f) + (getMeasuredHeight() / 2);
        for (int i10 = 0; i10 < this.f51968s.Y7; i10++) {
            int i11 = this.f51964e;
            int i12 = (this.d * 2) + this.f51965f;
            int i13 = this.f51963c;
            int i14 = (i13 / 2) + ((i12 + i13) * i10) + i11;
            if (i10 <= this.f51968s.X7) {
                this.f51961a.setColor(-11292945);
            } else {
                this.f51961a.setColor(1728053247);
            }
            float f11 = i14;
            float f12 = L;
            if (i10 == this.f51968s.X7) {
                i7 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i7 = this.f51963c / 2;
            }
            canvas.drawCircle(f11, f12, i7, this.f51961a);
            if (i10 != 0) {
                int i15 = ((i14 - (this.f51963c / 2)) - this.d) - this.f51965f;
                float f13 = 0.0f;
                if (i10 == this.f51968s.X7 + 1) {
                    f10 = org.telegram.messenger.g0.N(2.0f);
                } else {
                    f10 = 0.0f;
                }
                if (i10 == this.f51968s.X7) {
                    f13 = org.telegram.messenger.g0.N(2.0f);
                }
                canvas.drawRect(f10 + i15, L - org.telegram.messenger.g0.L(1.0f), (i15 + this.f51965f) - f13, org.telegram.messenger.g0.L(2.0f) + L, this.f51961a);
            }
        }
        canvas.drawText(this.h, this.f51964e, L - org.telegram.messenger.g0.L(16.0f), this.f51962b);
        canvas.drawText(this.f51966n, (getMeasuredWidth() - this.f51964e) - this.f51962b.measureText(this.f51966n), L - org.telegram.messenger.g0.L(16.0f), this.f51962b);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f51963c = org.telegram.messenger.g0.L(8.0f);
        this.d = org.telegram.messenger.g0.L(2.0f);
        this.f51964e = org.telegram.messenger.g0.L(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f51967r = this.f51968s.X7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i7 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i7 >= this.f51968s.Y7) {
                    break;
                }
                int i10 = this.f51964e;
                int i11 = this.f51965f;
                int i12 = this.d;
                int i13 = this.f51963c;
                int i14 = i13 / 2;
                int i15 = (((i12 * 2) + i11 + i13) * i7) + i10 + i14;
                int i16 = (i11 / 2) + i14 + i12;
                if (x10 > i15 - i16 && x10 < i15 + i16) {
                    if (this.f51968s.X7 != i7) {
                        this.f51968s.X7 = i7;
                        this.f51968s.L0();
                        invalidate();
                        return true;
                    }
                } else {
                    i7++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f51968s.X7 != this.f51967r) {
                this.f51968s.m2(1);
            }
            this.f51968s.K6 = false;
            return true;
        }
        return true;
    }
}
