package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
public abstract class yq extends LinearLayout {
    public final Paint f52285a;
    public final Paint f52286b;
    public float f52287c;
    public boolean d;
    public boolean f52288e;
    public br[] f52289f;

    public yq(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f52285a = paint;
        this.f52286b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yq.b(int, int):void");
    }

    public final void c(String str, boolean z9) {
        if (this.f52289f != null) {
            int i7 = 0;
            if (z9) {
                int i10 = 0;
                while (true) {
                    br[] brVarArr = this.f52289f;
                    if (i10 >= brVarArr.length) {
                        break;
                    } else if (brVarArr[i10].isFocused()) {
                        i7 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            for (int i11 = i7; i11 < Math.min(this.f52289f.length, str.length() + i7); i11++) {
                this.f52289f[i11].setText(Character.toString(str.charAt(i11 - i7)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt instanceof br) {
                br brVar = (br) childAt;
                if (!this.f52288e) {
                    if (childAt.isFocused()) {
                        brVar.A(1.0f);
                    } else if (!childAt.isFocused()) {
                        brVar.A(0.0f);
                    }
                }
                float successProgress = brVar.getSuccessProgress();
                int f10 = i0.a.f(successProgress, i0.a.f(brVar.getErrorProgress(), i0.a.f(brVar.getFocusedProgress(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27981k6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27999l6, false)), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28093q7, false)), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i7, false));
                Paint paint = this.f52285a;
                paint.setColor(f10);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f11 = this.f52287c;
                rectF.inset(f11, f11);
                if (successProgress != 0.0f) {
                    float f12 = -Math.max(0.0f, (brVar.getSuccessScaleProgress() - 1.0f) * this.f52287c);
                    rectF.inset(f12, f12);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof br) {
            br brVar = (br) view;
            canvas.save();
            float f10 = brVar.P1;
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f11 = this.f52287c;
            rectF.inset(f11, f11);
            canvas.clipRect(rectF);
            if (brVar.R1) {
                float f12 = (f10 * 0.5f) + 0.5f;
                view.setAlpha(f10);
                canvas.scale(f12, f12, (brVar.getMeasuredWidth() / 2.0f) + brVar.getX(), (brVar.getMeasuredHeight() / 2.0f) + brVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f10) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j3);
            canvas.restore();
            float f13 = brVar.Q1;
            if (f13 < 1.0f) {
                canvas.save();
                float f14 = 1.0f - f13;
                float f15 = (f14 * 0.5f) + 0.5f;
                canvas.scale(f15, f15, (brVar.getMeasuredWidth() / 2.0f) + brVar.getX(), (brVar.getMeasuredHeight() / 2.0f) + brVar.getY());
                Paint paint = this.f52286b;
                paint.setAlpha((int) (f14 * 255.0f));
                canvas.drawBitmap(brVar.S1, brVar.getX(), brVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public String getCode() {
        if (this.f52289f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (true) {
            br[] brVarArr = this.f52289f;
            if (i7 < brVarArr.length) {
                sb2.append(pf.b.d(brVarArr[i7].getText().toString(), false));
                i7++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        float L = org.telegram.messenger.g0.L(1.5f);
        this.f52287c = L;
        this.f52285a.setStrokeWidth(L);
    }

    public void setCode(String str) {
        this.f52289f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
