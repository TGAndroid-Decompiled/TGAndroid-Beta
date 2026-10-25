package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class vr extends LinearLayout {
    public final Paint f44891a;
    public final Paint f44892b;
    public float f44893c;
    public boolean d;
    public boolean e;
    public xr[] f44894f;

    public vr(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f44891a = paint;
        this.f44892b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vr.b(int, int):void");
    }

    public final void c(String str, boolean z10) {
        if (this.f44894f != null) {
            int i10 = 0;
            if (z10) {
                int i11 = 0;
                while (true) {
                    xr[] xrVarArr = this.f44894f;
                    if (i11 >= xrVarArr.length) {
                        break;
                    } else if (xrVarArr[i11].isFocused()) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            for (int i12 = i10; i12 < Math.min(this.f44894f.length, str.length() + i10); i12++) {
                this.f44894f[i12].setText(Character.toString(str.charAt(i12 - i10)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof xr) {
                xr xrVar = (xr) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        xrVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        xrVar.j(0.0f);
                    }
                }
                float successProgress = xrVar.getSuccessProgress();
                int f7 = i0.a.f(successProgress, i0.a.f(xrVar.getErrorProgress(), i0.a.f(xrVar.getFocusedProgress(), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23482k6, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23500l6, false)), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23596q7, false)), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23447i7, false));
                Paint paint = this.f44891a;
                paint.setColor(f7);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f10 = this.f44893c;
                rectF.inset(f10, f10);
                if (successProgress != 0.0f) {
                    float f11 = -Math.max(0.0f, (xrVar.getSuccessScaleProgress() - 1.0f) * this.f44893c);
                    rectF.inset(f11, f11);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof xr) {
            xr xrVar = (xr) view;
            canvas.save();
            float f7 = xrVar.v;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f10 = this.f44893c;
            rectF.inset(f10, f10);
            canvas.clipRect(rectF);
            if (xrVar.f45841x) {
                float f11 = (f7 * 0.5f) + 0.5f;
                view.setAlpha(f7);
                canvas.scale(f11, f11, (xrVar.getMeasuredWidth() / 2.0f) + xrVar.getX(), (xrVar.getMeasuredHeight() / 2.0f) + xrVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f7) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j10);
            canvas.restore();
            float f12 = xrVar.f45840w;
            if (f12 < 1.0f) {
                canvas.save();
                float f13 = 1.0f - f12;
                float f14 = (f13 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (xrVar.getMeasuredWidth() / 2.0f) + xrVar.getX(), (xrVar.getMeasuredHeight() / 2.0f) + xrVar.getY());
                Paint paint = this.f44892b;
                paint.setAlpha((int) (f13 * 255.0f));
                canvas.drawBitmap(xrVar.f45842y, xrVar.getX(), xrVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public String getCode() {
        if (this.f44894f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            xr[] xrVarArr = this.f44894f;
            if (i10 < xrVarArr.length) {
                sb2.append(kf.b.d(xrVarArr[i10].getText().toString(), false));
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(1.5f);
        this.f44893c = dp;
        this.f44891a.setStrokeWidth(dp);
    }

    public void setCode(String str) {
        this.f44894f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
