package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
public abstract class xq extends LinearLayout {
    public final Paint f52074a;
    public final Paint f52075b;
    public float f52076c;
    public boolean d;
    public boolean f52077e;
    public zq[] f52078f;

    public xq(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f52074a = paint;
        this.f52075b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xq.b(int, int):void");
    }

    public final void c(String str, boolean z10) {
        if (this.f52078f != null) {
            int i3 = 0;
            if (z10) {
                int i10 = 0;
                while (true) {
                    zq[] zqVarArr = this.f52078f;
                    if (i10 >= zqVarArr.length) {
                        break;
                    } else if (zqVarArr[i10].isFocused()) {
                        i3 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            for (int i11 = i3; i11 < Math.min(this.f52078f.length, str.length() + i3); i11++) {
                this.f52078f[i11].setText(Character.toString(str.charAt(i11 - i3)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof zq) {
                zq zqVar = (zq) childAt;
                if (!this.f52077e) {
                    if (childAt.isFocused()) {
                        zqVar.A(1.0f);
                    } else if (!childAt.isFocused()) {
                        zqVar.A(0.0f);
                    }
                }
                float successProgress = zqVar.getSuccessProgress();
                int f10 = i0.a.f(successProgress, i0.a.f(zqVar.getErrorProgress(), i0.a.f(zqVar.getFocusedProgress(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28007k6, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28026l6, false)), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28122q7, false)), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27973i7, false));
                Paint paint = this.f52074a;
                paint.setColor(f10);
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f11 = this.f52076c;
                rectF.inset(f11, f11);
                if (successProgress != 0.0f) {
                    float f12 = -Math.max(0.0f, (zqVar.getSuccessScaleProgress() - 1.0f) * this.f52076c);
                    rectF.inset(f12, f12);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof zq) {
            zq zqVar = (zq) view;
            canvas.save();
            float f10 = zqVar.Q1;
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f11 = this.f52076c;
            rectF.inset(f11, f11);
            canvas.clipRect(rectF);
            if (zqVar.S1) {
                float f12 = (f10 * 0.5f) + 0.5f;
                view.setAlpha(f10);
                canvas.scale(f12, f12, (zqVar.getMeasuredWidth() / 2.0f) + zqVar.getX(), (zqVar.getMeasuredHeight() / 2.0f) + zqVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f10) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j10);
            canvas.restore();
            float f13 = zqVar.R1;
            if (f13 < 1.0f) {
                canvas.save();
                float f14 = 1.0f - f13;
                float f15 = (f14 * 0.5f) + 0.5f;
                canvas.scale(f15, f15, (zqVar.getMeasuredWidth() / 2.0f) + zqVar.getX(), (zqVar.getMeasuredHeight() / 2.0f) + zqVar.getY());
                Paint paint = this.f52075b;
                paint.setAlpha((int) (f14 * 255.0f));
                canvas.drawBitmap(zqVar.T1, zqVar.getX(), zqVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public String getCode() {
        if (this.f52078f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i3 = 0;
        while (true) {
            zq[] zqVarArr = this.f52078f;
            if (i3 < zqVarArr.length) {
                sb2.append(mf.b.d(zqVarArr[i3].getText().toString(), false));
                i3++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        float L = org.telegram.messenger.g0.L(1.5f);
        this.f52076c = L;
        this.f52074a.setStrokeWidth(L);
    }

    public void setCode(String str) {
        this.f52078f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
