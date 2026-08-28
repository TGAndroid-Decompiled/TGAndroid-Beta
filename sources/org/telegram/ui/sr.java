package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class sr extends LinearLayout {
    public final Paint f42751a;
    public final Paint f42752b;
    public float f42753c;
    public boolean d;
    public boolean f42754e;
    public vr[] f42755f;

    public sr(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f42751a = paint;
        this.f42752b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        vr[] vrVarArr = this.f42755f;
        int i14 = 0;
        if (vrVarArr == null || vrVarArr.length != i9) {
            if (vrVarArr != null) {
                for (vr vrVar : vrVarArr) {
                    removeView(vrVar);
                }
            }
            this.f42755f = new vr[i9];
            for (int i15 = 0; i15 < i9; i15++) {
                this.f42755f[i15] = new qr(this, getContext(), i15, i9);
                this.f42755f[i15].setImeOptions(268435461);
                this.f42755f[i15].setTextSize(1, 20.0f);
                this.f42755f[i15].setMaxLines(1);
                this.f42755f[i15].setTypeface(AndroidUtilities.bold());
                this.f42755f[i15].setPadding(0, 0, 0, 0);
                this.f42755f[i15].setGravity(17);
                if (i10 == 3) {
                    this.f42755f[i15].setEnabled(false);
                    this.f42755f[i15].setInputType(0);
                    this.f42755f[i15].setVisibility(8);
                } else {
                    this.f42755f[i15].setInputType(3);
                }
                int i16 = 10;
                if (i10 == 10) {
                    i11 = 42;
                    i12 = 47;
                } else if (i10 == 11) {
                    i16 = 5;
                    i11 = 28;
                    i12 = 34;
                } else {
                    i16 = 7;
                    i11 = 34;
                    i12 = 42;
                }
                vr vrVar2 = this.f42755f[i15];
                if (i15 != i9 - 1) {
                    i13 = i16;
                } else {
                    i13 = 0;
                }
                addView(vrVar2, g7.e6.t(i11, i12, 1, 0, 0, i13, 0));
                this.f42755f[i15].addTextChangedListener(new rr(this, i15, i9));
                this.f42755f[i15].setOnEditorActionListener(new ea(this, 3));
            }
            return;
        }
        while (true) {
            vr[] vrVarArr2 = this.f42755f;
            if (i14 < vrVarArr2.length) {
                vrVarArr2[i14].setText("");
                i14++;
            } else {
                return;
            }
        }
    }

    public final void c(String str, boolean z10) {
        if (this.f42755f != null) {
            int i9 = 0;
            if (z10) {
                int i10 = 0;
                while (true) {
                    vr[] vrVarArr = this.f42755f;
                    if (i10 >= vrVarArr.length) {
                        break;
                    } else if (vrVarArr[i10].isFocused()) {
                        i9 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            for (int i11 = i9; i11 < Math.min(this.f42755f.length, str.length() + i9); i11++) {
                this.f42755f[i11].setText(Character.toString(str.charAt(i11 - i9)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt instanceof vr) {
                vr vrVar = (vr) childAt;
                if (!this.f42754e) {
                    if (childAt.isFocused()) {
                        vrVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        vrVar.j(0.0f);
                    }
                }
                float successProgress = vrVar.getSuccessProgress();
                int d = i0.a.d(successProgress, i0.a.d(vrVar.getErrorProgress(), i0.a.d(vrVar.getFocusedProgress(), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23127k6, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23144l6, false)), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false)), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23093i7, false));
                Paint paint = this.f42751a;
                paint.setColor(d);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f10 = this.f42753c;
                rectF.inset(f10, f10);
                if (successProgress != 0.0f) {
                    float f11 = -Math.max(0.0f, (vrVar.getSuccessScaleProgress() - 1.0f) * this.f42753c);
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
            float f10 = vrVar.v;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f11 = this.f42753c;
            rectF.inset(f11, f11);
            canvas.clipRect(rectF);
            if (vrVar.f43573x) {
                float f12 = (f10 * 0.5f) + 0.5f;
                view.setAlpha(f10);
                canvas.scale(f12, f12, (vrVar.getMeasuredWidth() / 2.0f) + vrVar.getX(), (vrVar.getMeasuredHeight() / 2.0f) + vrVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f10) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j10);
            canvas.restore();
            float f13 = vrVar.f43572w;
            if (f13 < 1.0f) {
                canvas.save();
                float f14 = 1.0f - f13;
                float f15 = (f14 * 0.5f) + 0.5f;
                canvas.scale(f15, f15, (vrVar.getMeasuredWidth() / 2.0f) + vrVar.getX(), (vrVar.getMeasuredHeight() / 2.0f) + vrVar.getY());
                Paint paint = this.f42752b;
                paint.setAlpha((int) (f14 * 255.0f));
                canvas.drawBitmap(vrVar.f43574y, vrVar.getX(), vrVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public String getCode() {
        if (this.f42755f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i9 = 0;
        while (true) {
            vr[] vrVarArr = this.f42755f;
            if (i9 < vrVarArr.length) {
                sb2.append(ne.b.d(vrVarArr[i9].getText().toString(), false));
                i9++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        float dp = AndroidUtilities.dp(1.5f);
        this.f42753c = dp;
        this.f42751a.setStrokeWidth(dp);
    }

    public void setCode(String str) {
        this.f42755f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
