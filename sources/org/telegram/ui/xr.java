package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class xr extends LinearLayout {
    public final Paint f45769a;
    public final Paint f45770b;
    public float f45771c;
    public boolean d;
    public boolean e;
    public zr[] f45772f;

    public xr(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f45769a = paint;
        this.f45770b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xr.b(int, int):void");
    }

    public final void c(String str, boolean z10) {
        if (this.f45772f != null) {
            int i10 = 0;
            if (z10) {
                int i11 = 0;
                while (true) {
                    zr[] zrVarArr = this.f45772f;
                    if (i11 >= zrVarArr.length) {
                        break;
                    } else if (zrVarArr[i11].isFocused()) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            for (int i12 = i10; i12 < Math.min(this.f45772f.length, str.length() + i10); i12++) {
                this.f45772f[i12].setText(Character.toString(str.charAt(i12 - i10)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof zr) {
                zr zrVar = (zr) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        zrVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        zrVar.j(0.0f);
                    }
                }
                float successProgress = zrVar.getSuccessProgress();
                int f7 = i0.a.f(successProgress, i0.a.f(zrVar.getErrorProgress(), i0.a.f(zrVar.getFocusedProgress(), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23485k6, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23503l6, false)), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23599q7, false)), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23450i7, false));
                Paint paint = this.f45769a;
                paint.setColor(f7);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f10 = this.f45771c;
                rectF.inset(f10, f10);
                if (successProgress != 0.0f) {
                    float f11 = -Math.max(0.0f, (zrVar.getSuccessScaleProgress() - 1.0f) * this.f45771c);
                    rectF.inset(f11, f11);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof zr) {
            zr zrVar = (zr) view;
            canvas.save();
            float f7 = zrVar.v;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f10 = this.f45771c;
            rectF.inset(f10, f10);
            canvas.clipRect(rectF);
            if (zrVar.f46348x) {
                float f11 = (f7 * 0.5f) + 0.5f;
                view.setAlpha(f7);
                canvas.scale(f11, f11, (zrVar.getMeasuredWidth() / 2.0f) + zrVar.getX(), (zrVar.getMeasuredHeight() / 2.0f) + zrVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f7) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j10);
            canvas.restore();
            float f12 = zrVar.f46347w;
            if (f12 < 1.0f) {
                canvas.save();
                float f13 = 1.0f - f12;
                float f14 = (f13 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (zrVar.getMeasuredWidth() / 2.0f) + zrVar.getX(), (zrVar.getMeasuredHeight() / 2.0f) + zrVar.getY());
                Paint paint = this.f45770b;
                paint.setAlpha((int) (f13 * 255.0f));
                canvas.drawBitmap(zrVar.f46349y, zrVar.getX(), zrVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public String getCode() {
        if (this.f45772f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            zr[] zrVarArr = this.f45772f;
            if (i10 < zrVarArr.length) {
                sb2.append(kf.b.d(zrVarArr[i10].getText().toString(), false));
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
        this.f45771c = dp;
        this.f45769a.setStrokeWidth(dp);
    }

    public void setCode(String str) {
        this.f45772f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
