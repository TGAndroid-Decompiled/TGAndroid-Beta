package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
public final class xq0 extends View {
    public final Paint f53883a;
    public final TextPaint f53884b;
    public int f53885c;
    public int d;
    public int f53886e;
    public int f53887f;
    public final String h;
    public final String f53888n;
    public int f53889r;
    public final PhotoViewer f53890s;

    public xq0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.f53890s = photoViewer;
        this.f53883a = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f53884b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setColor(-3289651);
        this.h = org.telegram.messenger.gd.M0(2131754737, "AccDescrVideoCompressLow");
        this.f53888n = org.telegram.messenger.gd.M0(2131754738, "AccDescrVideoCompressHigh");
        setImportantForAccessibility(1);
        setFocusable(true);
        setAccessibilityDelegate(new org.telegram.ui.Components.cu0(2, this));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        if (this.f53890s.Z7 != 1) {
            this.f53887f = (((getMeasuredWidth() - (this.f53885c * this.f53890s.Z7)) - (((this.f53890s.Z7 * 2) - 2) * this.d)) - (this.f53886e * 2)) / (this.f53890s.Z7 - 1);
        } else {
            this.f53887f = ((getMeasuredWidth() - (this.f53885c * this.f53890s.Z7)) - (this.d * 2)) - (this.f53886e * 2);
        }
        int L = org.telegram.messenger.g0.L(6.0f) + (getMeasuredHeight() / 2);
        for (int i10 = 0; i10 < this.f53890s.Z7; i10++) {
            int i11 = this.f53886e;
            int i12 = (this.d * 2) + this.f53887f;
            int i13 = this.f53885c;
            int i14 = (i13 / 2) + ((i12 + i13) * i10) + i11;
            if (i10 <= this.f53890s.Y7) {
                this.f53883a.setColor(-11292945);
            } else {
                this.f53883a.setColor(1728053247);
            }
            float f11 = i14;
            float f12 = L;
            if (i10 == this.f53890s.Y7) {
                i7 = org.telegram.messenger.g0.L(6.0f);
            } else {
                i7 = this.f53885c / 2;
            }
            canvas.drawCircle(f11, f12, i7, this.f53883a);
            if (i10 != 0) {
                int i15 = ((i14 - (this.f53885c / 2)) - this.d) - this.f53887f;
                float f13 = 0.0f;
                if (i10 == this.f53890s.Y7 + 1) {
                    f10 = org.telegram.messenger.g0.N(2.0f);
                } else {
                    f10 = 0.0f;
                }
                if (i10 == this.f53890s.Y7) {
                    f13 = org.telegram.messenger.g0.N(2.0f);
                }
                canvas.drawRect(f10 + i15, L - org.telegram.messenger.g0.L(1.0f), (i15 + this.f53887f) - f13, org.telegram.messenger.g0.L(2.0f) + L, this.f53883a);
            }
        }
        canvas.drawText(this.h, this.f53886e, L - org.telegram.messenger.g0.L(16.0f), this.f53884b);
        canvas.drawText(this.f53888n, (getMeasuredWidth() - this.f53886e) - this.f53884b.measureText(this.f53888n), L - org.telegram.messenger.g0.L(16.0f), this.f53884b);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.f53885c = org.telegram.messenger.g0.L(8.0f);
        this.d = org.telegram.messenger.g0.L(2.0f);
        this.f53886e = org.telegram.messenger.g0.L(18.0f);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        if (motionEvent.getAction() == 0) {
            this.f53889r = this.f53890s.Y7;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int i7 = 0;
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            while (true) {
                if (i7 >= this.f53890s.Z7) {
                    break;
                }
                int i10 = this.f53886e;
                int i11 = this.f53887f;
                int i12 = this.d;
                int i13 = this.f53885c;
                int i14 = i13 / 2;
                int i15 = (((i12 * 2) + i11 + i13) * i7) + i10 + i14;
                int i16 = (i11 / 2) + i14 + i12;
                if (x10 > i15 - i16 && x10 < i15 + i16) {
                    if (this.f53890s.Y7 != i7) {
                        this.f53890s.Y7 = i7;
                        this.f53890s.L0();
                        invalidate();
                        return true;
                    }
                } else {
                    i7++;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.f53890s.Y7 != this.f53889r) {
                this.f53890s.n2(1);
            }
            this.f53890s.L6 = false;
            return true;
        }
        return true;
    }
}
