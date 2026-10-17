package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class sr extends LinearLayout {
    public final Paint f41483a;
    public final Paint f41484b;
    public float f41485c;
    public boolean d;
    public boolean e;
    public vr[] f41486f;

    public sr(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f41483a = paint;
        this.f41484b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sr.b(int, int):void");
    }

    public final void c(String str, boolean z10) {
        if (this.f41486f != null) {
            int i10 = 0;
            if (z10) {
                int i11 = 0;
                while (true) {
                    vr[] vrVarArr = this.f41486f;
                    if (i11 >= vrVarArr.length) {
                        break;
                    } else if (vrVarArr[i11].isFocused()) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            for (int i12 = i10; i12 < Math.min(this.f41486f.length, str.length() + i10); i12++) {
                this.f41486f[i12].setText(Character.toString(str.charAt(i12 - i10)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof vr) {
                vr vrVar = (vr) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        vrVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        vrVar.j(0.0f);
                    }
                }
                float successProgress = vrVar.getSuccessProgress();
                int f7 = i0.b.f(successProgress, i0.b.f(vrVar.getErrorProgress(), i0.b.f(vrVar.getFocusedProgress(), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21113k6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21130l6, false)), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21224q7, false)), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21076i7, false));
                Paint paint = this.f41483a;
                paint.setColor(f7);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f10 = this.f41485c;
                rectF.inset(f10, f10);
                if (successProgress != 0.0f) {
                    float f11 = -Math.max(0.0f, (vrVar.getSuccessScaleProgress() - 1.0f) * this.f41485c);
                    rectF.inset(f11, f11);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof vr) {
            vr vrVar = (vr) view;
            canvas.save();
            float f7 = vrVar.v;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f10 = this.f41485c;
            rectF.inset(f10, f10);
            canvas.clipRect(rectF);
            if (vrVar.f42263x) {
                float f11 = (f7 * 0.5f) + 0.5f;
                view.setAlpha(f7);
                canvas.scale(f11, f11, (vrVar.getMeasuredWidth() / 2.0f) + vrVar.getX(), (vrVar.getMeasuredHeight() / 2.0f) + vrVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f7) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j10);
            canvas.restore();
            float f12 = vrVar.f42262w;
            if (f12 < 1.0f) {
                canvas.save();
                float f13 = 1.0f - f12;
                float f14 = (f13 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (vrVar.getMeasuredWidth() / 2.0f) + vrVar.getX(), (vrVar.getMeasuredHeight() / 2.0f) + vrVar.getY());
                Paint paint = this.f41484b;
                paint.setAlpha((int) (f13 * 255.0f));
                canvas.drawBitmap(vrVar.f42264y, vrVar.getX(), vrVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public String getCode() {
        if (this.f41486f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            vr[] vrVarArr = this.f41486f;
            if (i10 < vrVarArr.length) {
                sb2.append(jf.b.d(vrVarArr[i10].getText().toString(), false));
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
        this.f41485c = dp;
        this.f41483a.setStrokeWidth(dp);
    }

    public void setCode(String str) {
        this.f41486f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
