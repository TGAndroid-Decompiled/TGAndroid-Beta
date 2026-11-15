package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
public final class vq0 extends View {
    public final Paint f52270a;
    public final TextPaint f52271b;
    public int f52272c;
    public int d;
    public int f52273e;
    public int f52274f;
    public final String h;
    public final String f52275n;
    public int f52276r;
    public final PhotoViewer f52277s;

    public vq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f52277s = photoViewer;
        this.f52270a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f52271b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-3289651);
        this.h = org.telegram.messenger.hd.M0(2131754737, "AccDescrVideoCompressLow");
        this.f52275n = org.telegram.messenger.hd.M0(2131754738, "AccDescrVideoCompressHigh");
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new org.telegram.ui.Components.ut0(2, this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        if (this.f52277s.Z7 != 1) {
            this.f52274f = (((getMeasuredWidth() - (this.f52272c * this.f52277s.Z7)) - (((this.f52277s.Z7 * 2) - 2) * this.d)) - (this.f52273e * 2)) / (this.f52277s.Z7 - 1);
        } else {
            this.f52274f = ((getMeasuredWidth() - (this.f52272c * this.f52277s.Z7)) - (this.d * 2)) - (this.f52273e * 2);
        }
        int L = org.telegram.messenger.g0.L(6.0f) + (getMeasuredHeight() / 2);
        for (int i10 = 0; i10 < this.f52277s.Z7; i10++) {
            int i11 = this.f52273e;
            int i12 = (this.d * 2) + this.f52274f;
            int i13 = this.f52272c;
            int i14 = (i13 / 2) + ((i12 + i13) * i10) + i11;
            if (i10 <= this.f52277s.Y7) {
                this.f52270a.setColor(-11292945);
            } else {
                this.f52270a.setColor(1728053247);
            }
            float f11 = i14;
            float f12 = L;
            if (i10 == this.f52277s.Y7) {
                i7 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i7 = this.f52272c / 2;
            }
            canvas.drawCircle(f11, f12, i7, this.f52270a);
            if (i10 != 0) {
                int i15 = ((i14 - (this.f52272c / 2)) - this.d) - this.f52274f;
                float f13 = 0.0f;
                if (i10 == this.f52277s.Y7 + 1) {
                    f10 = org.telegram.messenger.g0.N(2.0f);
                } else {
                    f10 = 0.0f;
                }
                if (i10 == this.f52277s.Y7) {
                    f13 = org.telegram.messenger.g0.N(2.0f);
                }
                canvas.drawRect(f10 + i15, L - org.telegram.messenger.g0.L(1.0f), (i15 + this.f52274f) - f13, org.telegram.messenger.g0.L(2.0f) + L, this.f52270a);
            }
        }
        canvas.drawText(this.h, this.f52273e, L - org.telegram.messenger.g0.L(16.0f), this.f52271b);
        canvas.drawText(this.f52275n, (getMeasuredWidth() - this.f52273e) - this.f52271b.measureText(this.f52275n), L - org.telegram.messenger.g0.L(16.0f), this.f52271b);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f52272c = org.telegram.messenger.g0.L(8.0f);
        this.d = org.telegram.messenger.g0.L(2.0f);
        this.f52273e = org.telegram.messenger.g0.L(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f52276r = this.f52277s.Y7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i7 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i7 >= this.f52277s.Z7) {
                    break;
                }
                int i10 = this.f52273e;
                int i11 = this.f52274f;
                int i12 = this.d;
                int i13 = this.f52272c;
                int i14 = i13 / 2;
                int i15 = (((i12 * 2) + i11 + i13) * i7) + i10 + i14;
                int i16 = (i11 / 2) + i14 + i12;
                if (x10 > i15 - i16 && x10 < i15 + i16) {
                    if (this.f52277s.Y7 != i7) {
                        this.f52277s.Y7 = i7;
                        this.f52277s.L0();
                        invalidate();
                        return true;
                    }
                } else {
                    i7++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f52277s.Y7 != this.f52276r) {
                this.f52277s.n2(1);
            }
            this.f52277s.L6 = false;
            return true;
        }
        return true;
    }
}
