package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class yr extends LinearLayout {
    public final Paint f40234a;
    public final Paint f40235b;
    public float f40236c;
    public boolean d;
    public boolean e;
    public as[] f40237f;

    public yr(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f40234a = paint;
        this.f40235b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        as[] asVarArr = this.f40237f;
        int i15 = 0;
        if (asVarArr == null || asVarArr.length != i10) {
            if (asVarArr != null) {
                for (as asVar : asVarArr) {
                    removeView(asVar);
                }
            }
            this.f40237f = new as[i10];
            for (int i16 = 0; i16 < i10; i16++) {
                this.f40237f[i16] = new wr(this, getContext(), i16, i10);
                this.f40237f[i16].setImeOptions(268435461);
                this.f40237f[i16].setTextSize(1, 20.0f);
                this.f40237f[i16].setMaxLines(1);
                this.f40237f[i16].setTypeface(AndroidUtilities.bold());
                this.f40237f[i16].setPadding(0, 0, 0, 0);
                this.f40237f[i16].setGravity(17);
                if (i11 == 3) {
                    this.f40237f[i16].setEnabled(false);
                    this.f40237f[i16].setInputType(0);
                    this.f40237f[i16].setVisibility(8);
                } else {
                    this.f40237f[i16].setInputType(3);
                }
                int i17 = 10;
                if (i11 == 10) {
                    i12 = 42;
                    i13 = 47;
                } else if (i11 == 11) {
                    i17 = 5;
                    i12 = 28;
                    i13 = 34;
                } else {
                    i17 = 7;
                    i12 = 34;
                    i13 = 42;
                }
                as asVar2 = this.f40237f[i16];
                if (i16 != i10 - 1) {
                    i14 = i17;
                } else {
                    i14 = 0;
                }
                addView(asVar2, w7.y5.t(i12, i13, 1, 0, 0, i14, 0));
                this.f40237f[i16].addTextChangedListener(new xr(this, i16, i10));
                this.f40237f[i16].setOnEditorActionListener(new ia(this, 3));
            }
            return;
        }
        while (true) {
            as[] asVarArr2 = this.f40237f;
            if (i15 < asVarArr2.length) {
                asVarArr2[i15].setText("");
                i15++;
            } else {
                return;
            }
        }
    }

    public final void c(String str, boolean z10) {
        if (this.f40237f != null) {
            int i10 = 0;
            if (z10) {
                int i11 = 0;
                while (true) {
                    as[] asVarArr = this.f40237f;
                    if (i11 >= asVarArr.length) {
                        break;
                    } else if (asVarArr[i11].isFocused()) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            for (int i12 = i10; i12 < Math.min(this.f40237f.length, str.length() + i10); i12++) {
                this.f40237f[i12].setText(Character.toString(str.charAt(i12 - i10)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof as) {
                as asVar = (as) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        asVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        asVar.j(0.0f);
                    }
                }
                float successProgress = asVar.getSuccessProgress();
                int d = i0.a.d(successProgress, i0.a.d(asVar.getErrorProgress(), i0.a.d(asVar.getFocusedProgress(), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19186k6, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19204l6, false)), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19298q7, false)), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19149i7, false));
                Paint paint = this.f40234a;
                paint.setColor(d);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f7 = this.f40236c;
                rectF.inset(f7, f7);
                if (successProgress != 0.0f) {
                    float f10 = -Math.max(0.0f, (asVar.getSuccessScaleProgress() - 1.0f) * this.f40236c);
                    rectF.inset(f10, f10);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof as) {
            as asVar = (as) view;
            canvas.save();
            float f7 = asVar.v;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f10 = this.f40236c;
            rectF.inset(f10, f10);
            canvas.clipRect(rectF);
            if (asVar.f32226x) {
                float f11 = (f7 * 0.5f) + 0.5f;
                view.setAlpha(f7);
                canvas.scale(f11, f11, (asVar.getMeasuredWidth() / 2.0f) + asVar.getX(), (asVar.getMeasuredHeight() / 2.0f) + asVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f7) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j3);
            canvas.restore();
            float f12 = asVar.f32225w;
            if (f12 < 1.0f) {
                canvas.save();
                float f13 = 1.0f - f12;
                float f14 = (f13 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (asVar.getMeasuredWidth() / 2.0f) + asVar.getX(), (asVar.getMeasuredHeight() / 2.0f) + asVar.getY());
                Paint paint = this.f40235b;
                paint.setAlpha((int) (f13 * 255.0f));
                canvas.drawBitmap(asVar.f32227y, asVar.getX(), asVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public String getCode() {
        if (this.f40237f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            as[] asVarArr = this.f40237f;
            if (i10 < asVarArr.length) {
                sb2.append(gf.b.d(asVarArr[i10].getText().toString(), false));
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
        this.f40236c = dp;
        this.f40234a.setStrokeWidth(dp);
    }

    public void setCode(String str) {
        this.f40237f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
