package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class qr extends LinearLayout {
    public final Paint f40956a;
    public final Paint f40957b;
    public float f40958c;
    public boolean d;
    public boolean e;
    public tr[] f40959f;

    public qr(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f40956a = paint;
        this.f40957b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qr.b(int, int):void");
    }

    public final void c(String str, boolean z10) {
        if (this.f40959f != null) {
            int i10 = 0;
            if (z10) {
                int i11 = 0;
                while (true) {
                    tr[] trVarArr = this.f40959f;
                    if (i11 >= trVarArr.length) {
                        break;
                    } else if (trVarArr[i11].isFocused()) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            for (int i12 = i10; i12 < Math.min(this.f40959f.length, str.length() + i10); i12++) {
                this.f40959f[i12].setText(Character.toString(str.charAt(i12 - i10)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof tr) {
                tr trVar = (tr) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        trVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        trVar.j(0.0f);
                    }
                }
                float successProgress = trVar.getSuccessProgress();
                int f7 = i0.a.f(successProgress, i0.a.f(trVar.getErrorProgress(), i0.a.f(trVar.getFocusedProgress(), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21117k6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21134l6, false)), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228q7, false)), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21080i7, false));
                Paint paint = this.f40956a;
                paint.setColor(f7);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f10 = this.f40958c;
                rectF.inset(f10, f10);
                if (successProgress != 0.0f) {
                    float f11 = -Math.max(0.0f, (trVar.getSuccessScaleProgress() - 1.0f) * this.f40958c);
                    rectF.inset(f11, f11);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof tr) {
            tr trVar = (tr) view;
            canvas.save();
            float f7 = trVar.v;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f10 = this.f40958c;
            rectF.inset(f10, f10);
            canvas.clipRect(rectF);
            if (trVar.f41737x) {
                float f11 = (f7 * 0.5f) + 0.5f;
                view.setAlpha(f7);
                canvas.scale(f11, f11, (trVar.getMeasuredWidth() / 2.0f) + trVar.getX(), (trVar.getMeasuredHeight() / 2.0f) + trVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f7) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j10);
            canvas.restore();
            float f12 = trVar.f41736w;
            if (f12 < 1.0f) {
                canvas.save();
                float f13 = 1.0f - f12;
                float f14 = (f13 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (trVar.getMeasuredWidth() / 2.0f) + trVar.getX(), (trVar.getMeasuredHeight() / 2.0f) + trVar.getY());
                Paint paint = this.f40957b;
                paint.setAlpha((int) (f13 * 255.0f));
                canvas.drawBitmap(trVar.f41738y, trVar.getX(), trVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public String getCode() {
        if (this.f40959f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            tr[] trVarArr = this.f40959f;
            if (i10 < trVarArr.length) {
                sb2.append(jf.b.d(trVarArr[i10].getText().toString(), false));
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
        this.f40958c = dp;
        this.f40956a.setStrokeWidth(dp);
    }

    public void setCode(String str) {
        this.f40959f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
