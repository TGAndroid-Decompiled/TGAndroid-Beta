package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
public abstract class zr extends LinearLayout {
    public final Paint f44042a;
    public final Paint f44043b;
    public float f44044c;
    public boolean d;
    public boolean e;
    public bs[] f44045f;

    public zr(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f44042a = paint;
        this.f44043b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zr.b(int, int):void");
    }

    public final void c(String str, boolean z10) {
        if (this.f44045f != null) {
            int i10 = 0;
            if (z10) {
                int i11 = 0;
                while (true) {
                    bs[] bsVarArr = this.f44045f;
                    if (i11 >= bsVarArr.length) {
                        break;
                    } else if (bsVarArr[i11].isFocused()) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            for (int i12 = i10; i12 < Math.min(this.f44045f.length, str.length() + i10); i12++) {
                this.f44045f[i12].setText(Character.toString(str.charAt(i12 - i10)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof bs) {
                bs bsVar = (bs) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        bsVar.A(1.0f);
                    } else if (!childAt.isFocused()) {
                        bsVar.A(0.0f);
                    }
                }
                float successProgress = bsVar.getSuccessProgress();
                int f7 = i0.b.f(successProgress, i0.b.f(bsVar.getErrorProgress(), i0.b.f(bsVar.getFocusedProgress(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21059k6, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21077l6, false)), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21171q7, false)), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21022i7, false));
                Paint paint = this.f44042a;
                paint.setColor(f7);
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f10 = this.f44044c;
                rectF.inset(f10, f10);
                if (successProgress != 0.0f) {
                    float f11 = -Math.max(0.0f, (bsVar.getSuccessScaleProgress() - 1.0f) * this.f44044c);
                    rectF.inset(f11, f11);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof bs) {
            bs bsVar = (bs) view;
            canvas.save();
            float f7 = bsVar.P1;
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f10 = this.f44044c;
            rectF.inset(f10, f10);
            canvas.clipRect(rectF);
            if (bsVar.R1) {
                float f11 = (f7 * 0.5f) + 0.5f;
                view.setAlpha(f7);
                canvas.scale(f11, f11, (bsVar.getMeasuredWidth() / 2.0f) + bsVar.getX(), (bsVar.getMeasuredHeight() / 2.0f) + bsVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f7) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j10);
            canvas.restore();
            float f12 = bsVar.Q1;
            if (f12 < 1.0f) {
                canvas.save();
                float f13 = 1.0f - f12;
                float f14 = (f13 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (bsVar.getMeasuredWidth() / 2.0f) + bsVar.getX(), (bsVar.getMeasuredHeight() / 2.0f) + bsVar.getY());
                Paint paint = this.f44043b;
                paint.setAlpha((int) (f13 * 255.0f));
                canvas.drawBitmap(bsVar.S1, bsVar.getX(), bsVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public String getCode() {
        if (this.f44045f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            bs[] bsVarArr = this.f44045f;
            if (i10 < bsVarArr.length) {
                sb2.append(af.b.d(bsVarArr[i10].getText().toString(), false));
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float L = org.telegram.messenger.i0.L(1.5f);
        this.f44044c = L;
        this.f44042a.setStrokeWidth(L);
    }

    public void setCode(String str) {
        this.f44045f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
