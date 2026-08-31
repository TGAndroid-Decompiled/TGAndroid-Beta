package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class zr extends LinearLayout {
    public final Paint f43978a;
    public final Paint f43979b;
    public float f43980c;
    public boolean d;
    public boolean f43981e;
    public cs[] f43982f;

    public zr(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f43978a = paint;
        this.f43979b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        cs[] csVarArr = this.f43982f;
        int i15 = 0;
        if (csVarArr == null || csVarArr.length != i10) {
            if (csVarArr != null) {
                for (cs csVar : csVarArr) {
                    removeView(csVar);
                }
            }
            this.f43982f = new cs[i10];
            for (int i16 = 0; i16 < i10; i16++) {
                this.f43982f[i16] = new xr(this, getContext(), i16, i10);
                this.f43982f[i16].setImeOptions(268435461);
                this.f43982f[i16].setTextSize(1, 20.0f);
                this.f43982f[i16].setMaxLines(1);
                this.f43982f[i16].setTypeface(AndroidUtilities.bold());
                this.f43982f[i16].setPadding(0, 0, 0, 0);
                this.f43982f[i16].setGravity(17);
                if (i11 == 3) {
                    this.f43982f[i16].setEnabled(false);
                    this.f43982f[i16].setInputType(0);
                    this.f43982f[i16].setVisibility(8);
                } else {
                    this.f43982f[i16].setInputType(3);
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
                cs csVar2 = this.f43982f[i16];
                if (i16 != i10 - 1) {
                    i14 = i17;
                } else {
                    i14 = 0;
                }
                addView(csVar2, k7.c6.t(i12, i13, 1, 0, 0, i14, 0));
                this.f43982f[i16].addTextChangedListener(new yr(this, i16, i10));
                this.f43982f[i16].setOnEditorActionListener(new ha(this, 3));
            }
            return;
        }
        while (true) {
            cs[] csVarArr2 = this.f43982f;
            if (i15 < csVarArr2.length) {
                csVarArr2[i15].setText("");
                i15++;
            } else {
                return;
            }
        }
    }

    public final void c(String str, boolean z4) {
        if (this.f43982f != null) {
            int i10 = 0;
            if (z4) {
                int i11 = 0;
                while (true) {
                    cs[] csVarArr = this.f43982f;
                    if (i11 >= csVarArr.length) {
                        break;
                    } else if (csVarArr[i11].isFocused()) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            for (int i12 = i10; i12 < Math.min(this.f43982f.length, str.length() + i10); i12++) {
                this.f43982f[i12].setText(Character.toString(str.charAt(i12 - i10)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof cs) {
                cs csVar = (cs) childAt;
                if (!this.f43981e) {
                    if (childAt.isFocused()) {
                        csVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        csVar.j(0.0f);
                    }
                }
                float successProgress = csVar.getSuccessProgress();
                int d = i0.a.d(successProgress, i0.a.d(csVar.getErrorProgress(), i0.a.d(csVar.getFocusedProgress(), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21785k6, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21803l6, false)), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false)), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21751i7, false));
                Paint paint = this.f43978a;
                paint.setColor(d);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f10 = this.f43980c;
                rectF.inset(f10, f10);
                if (successProgress != 0.0f) {
                    float f11 = -Math.max(0.0f, (csVar.getSuccessScaleProgress() - 1.0f) * this.f43980c);
                    rectF.inset(f11, f11);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof cs) {
            cs csVar = (cs) view;
            canvas.save();
            float f10 = csVar.v;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f11 = this.f43980c;
            rectF.inset(f11, f11);
            canvas.clipRect(rectF);
            if (csVar.f35903x) {
                float f12 = (f10 * 0.5f) + 0.5f;
                view.setAlpha(f10);
                canvas.scale(f12, f12, (csVar.getMeasuredWidth() / 2.0f) + csVar.getX(), (csVar.getMeasuredHeight() / 2.0f) + csVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f10) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j10);
            canvas.restore();
            float f13 = csVar.f35902w;
            if (f13 < 1.0f) {
                canvas.save();
                float f14 = 1.0f - f13;
                float f15 = (f14 * 0.5f) + 0.5f;
                canvas.scale(f15, f15, (csVar.getMeasuredWidth() / 2.0f) + csVar.getX(), (csVar.getMeasuredHeight() / 2.0f) + csVar.getY());
                Paint paint = this.f43979b;
                paint.setAlpha((int) (f14 * 255.0f));
                canvas.drawBitmap(csVar.f35904y, csVar.getX(), csVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public String getCode() {
        if (this.f43982f == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (true) {
            cs[] csVarArr = this.f43982f;
            if (i10 < csVarArr.length) {
                sb.append(se.b.d(csVarArr[i10].getText().toString(), false));
                i10++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(1.5f);
        this.f43980c = dp;
        this.f43978a.setStrokeWidth(dp);
    }

    public void setCode(String str) {
        this.f43982f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
