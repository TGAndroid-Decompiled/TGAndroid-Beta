package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

public abstract class ur extends LinearLayout {

    public final Paint f43275a;

    public final Paint f43276b;

    public float f43277c;
    public boolean d;

    public boolean f43278e;

    public wr[] f43279f;

    public ur(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f43275a = paint;
        this.f43276b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int i10, int i11) {
        int i12;
        int i13;
        wr[] wrVarArr = this.f43279f;
        int i14 = 0;
        if (wrVarArr == null || wrVarArr.length != i10) {
            if (wrVarArr != null) {
                for (wr wrVar : wrVarArr) {
                    removeView(wrVar);
                }
            }
            this.f43279f = new wr[i10];
            int i15 = 0;
            while (i15 < i10) {
                this.f43279f[i15] = new sr(this, getContext(), i15, i10);
                this.f43279f[i15].setImeOptions(268435461);
                this.f43279f[i15].setTextSize(1, 20.0f);
                this.f43279f[i15].setMaxLines(1);
                this.f43279f[i15].setTypeface(AndroidUtilities.bold());
                this.f43279f[i15].setPadding(0, 0, 0, 0);
                this.f43279f[i15].setGravity(17);
                if (i11 == 3) {
                    this.f43279f[i15].setEnabled(false);
                    this.f43279f[i15].setInputType(0);
                    this.f43279f[i15].setVisibility(8);
                } else {
                    this.f43279f[i15].setInputType(3);
                }
                int i16 = 10;
                if (i11 == 10) {
                    i12 = 42;
                    i13 = 47;
                } else if (i11 == 11) {
                    i16 = 5;
                    i12 = 28;
                    i13 = 34;
                } else {
                    i16 = 7;
                    i12 = 34;
                    i13 = 42;
                }
                addView(this.f43279f[i15], h7.z5.t(i12, i13, 1, 0, 0, i15 != i10 + (-1) ? i16 : 0, 0));
                this.f43279f[i15].addTextChangedListener(new tr(this, i15, i10));
                this.f43279f[i15].setOnEditorActionListener(new fa(this, 3));
                i15++;
            }
            return;
        }
        while (true) {
            wr[] wrVarArr2 = this.f43279f;
            if (i14 >= wrVarArr2.length) {
                return;
            }
            wrVarArr2[i14].setText("");
            i14++;
        }
    }

    public final void c(String str, boolean z10) {
        if (this.f43279f == null) {
            return;
        }
        int i10 = 0;
        if (z10) {
            int i11 = 0;
            while (true) {
                wr[] wrVarArr = this.f43279f;
                if (i11 >= wrVarArr.length) {
                    break;
                }
                if (wrVarArr[i11].isFocused()) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
        }
        for (int i12 = i10; i12 < Math.min(this.f43279f.length, str.length() + i10); i12++) {
            this.f43279f[i12].setText(Character.toString(str.charAt(i12 - i10)));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof wr) {
                wr wrVar = (wr) childAt;
                if (!this.f43278e) {
                    if (childAt.isFocused()) {
                        wrVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        wrVar.j(0.0f);
                    }
                }
                float successProgress = wrVar.getSuccessProgress();
                int iD = i0.b.d(successProgress, i0.b.d(wrVar.getErrorProgress(), i0.b.d(wrVar.getFocusedProgress(), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23181k6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23198l6, false)), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false)), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23145i7, false));
                Paint paint = this.f43275a;
                paint.setColor(iD);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f10 = this.f43277c;
                rectF.inset(f10, f10);
                if (successProgress != 0.0f) {
                    float f11 = -Math.max(0.0f, (wrVar.getSuccessScaleProgress() - 1.0f) * this.f43277c);
                    rectF.inset(f11, f11);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!(view instanceof wr)) {
            return super.drawChild(canvas, view, j10);
        }
        wr wrVar = (wr) view;
        canvas.save();
        float f10 = wrVar.v;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
        float f11 = this.f43277c;
        rectF.inset(f11, f11);
        canvas.clipRect(rectF);
        if (wrVar.f44180x) {
            float f12 = (f10 * 0.5f) + 0.5f;
            view.setAlpha(f10);
            canvas.scale(f12, f12, (wrVar.getMeasuredWidth() / 2.0f) + wrVar.getX(), (wrVar.getMeasuredHeight() / 2.0f) + wrVar.getY());
        } else {
            view.setAlpha(1.0f);
            canvas.translate(0.0f, (1.0f - f10) * view.getMeasuredHeight());
        }
        super.drawChild(canvas, view, j10);
        canvas.restore();
        float f13 = wrVar.f44179w;
        if (f13 >= 1.0f) {
            return true;
        }
        canvas.save();
        float f14 = 1.0f - f13;
        float f15 = (f14 * 0.5f) + 0.5f;
        canvas.scale(f15, f15, (wrVar.getMeasuredWidth() / 2.0f) + wrVar.getX(), (wrVar.getMeasuredHeight() / 2.0f) + wrVar.getY());
        Paint paint = this.f43276b;
        paint.setAlpha((int) (f14 * 255.0f));
        canvas.drawBitmap(wrVar.f44181y, wrVar.getX(), wrVar.getY(), paint);
        canvas.restore();
        return true;
    }

    public String getCode() {
        if (this.f43279f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            wr[] wrVarArr = this.f43279f;
            if (i10 >= wrVarArr.length) {
                return sb2.toString();
            }
            sb2.append(oe.b.d(wrVarArr[i10].getText().toString(), false));
            i10++;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float fDp = AndroidUtilities.dp(1.5f);
        this.f43277c = fDp;
        this.f43275a.setStrokeWidth(fDp);
    }

    public void setCode(String str) {
        this.f43279f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
