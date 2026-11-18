package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
public final class xq0 extends View {
    public final Paint f53915a;
    public final TextPaint f53916b;
    public int f53917c;
    public int d;
    public int f53918e;
    public int f53919f;
    public final String h;
    public final String f53920n;
    public int f53921r;
    public final PhotoViewer f53922s;

    public xq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f53922s = photoViewer;
        this.f53915a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f53916b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-3289651);
        this.h = org.telegram.messenger.gd.M0(2131754737, "AccDescrVideoCompressLow");
        this.f53920n = org.telegram.messenger.gd.M0(2131754738, "AccDescrVideoCompressHigh");
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new org.telegram.ui.Components.cu0(2, this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        if (this.f53922s.Z7 != 1) {
            this.f53919f = (((getMeasuredWidth() - (this.f53917c * this.f53922s.Z7)) - (((this.f53922s.Z7 * 2) - 2) * this.d)) - (this.f53918e * 2)) / (this.f53922s.Z7 - 1);
        } else {
            this.f53919f = ((getMeasuredWidth() - (this.f53917c * this.f53922s.Z7)) - (this.d * 2)) - (this.f53918e * 2);
        }
        int L = org.telegram.messenger.g0.L(6.0f) + (getMeasuredHeight() / 2);
        for (int i10 = 0; i10 < this.f53922s.Z7; i10++) {
            int i11 = this.f53918e;
            int i12 = (this.d * 2) + this.f53919f;
            int i13 = this.f53917c;
            int i14 = (i13 / 2) + ((i12 + i13) * i10) + i11;
            if (i10 <= this.f53922s.Y7) {
                this.f53915a.setColor(-11292945);
            } else {
                this.f53915a.setColor(1728053247);
            }
            float f11 = i14;
            float f12 = L;
            if (i10 == this.f53922s.Y7) {
                i7 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i7 = this.f53917c / 2;
            }
            canvas.drawCircle(f11, f12, i7, this.f53915a);
            if (i10 != 0) {
                int i15 = ((i14 - (this.f53917c / 2)) - this.d) - this.f53919f;
                float f13 = 0.0f;
                if (i10 == this.f53922s.Y7 + 1) {
                    f10 = org.telegram.messenger.g0.N(2.0f);
                } else {
                    f10 = 0.0f;
                }
                if (i10 == this.f53922s.Y7) {
                    f13 = org.telegram.messenger.g0.N(2.0f);
                }
                canvas.drawRect(f10 + i15, L - org.telegram.messenger.g0.L(1.0f), (i15 + this.f53919f) - f13, org.telegram.messenger.g0.L(2.0f) + L, this.f53915a);
            }
        }
        canvas.drawText(this.h, this.f53918e, L - org.telegram.messenger.g0.L(16.0f), this.f53916b);
        canvas.drawText(this.f53920n, (getMeasuredWidth() - this.f53918e) - this.f53916b.measureText(this.f53920n), L - org.telegram.messenger.g0.L(16.0f), this.f53916b);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f53917c = org.telegram.messenger.g0.L(8.0f);
        this.d = org.telegram.messenger.g0.L(2.0f);
        this.f53918e = org.telegram.messenger.g0.L(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f53921r = this.f53922s.Y7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i7 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i7 >= this.f53922s.Z7) {
                    break;
                }
                int i10 = this.f53918e;
                int i11 = this.f53919f;
                int i12 = this.d;
                int i13 = this.f53917c;
                int i14 = i13 / 2;
                int i15 = (((i12 * 2) + i11 + i13) * i7) + i10 + i14;
                int i16 = (i11 / 2) + i14 + i12;
                if (x10 > i15 - i16 && x10 < i15 + i16) {
                    if (this.f53922s.Y7 != i7) {
                        this.f53922s.Y7 = i7;
                        this.f53922s.L0();
                        invalidate();
                        return true;
                    }
                } else {
                    i7++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f53922s.Y7 != this.f53921r) {
                this.f53922s.n2(1);
            }
            this.f53922s.L6 = false;
            return true;
        }
        return true;
    }
}
