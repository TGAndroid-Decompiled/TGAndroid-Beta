package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class sr extends LinearLayout {
    public final Paint f42451a;
    public final Paint f42452b;
    public float f42453c;
    public boolean d;
    public boolean f42454e;
    public ur[] f42455f;

    public sr(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f42451a = paint;
        this.f42452b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        ur[] urVarArr = this.f42455f;
        int i15 = 0;
        if (urVarArr == null || urVarArr.length != i10) {
            if (urVarArr != null) {
                for (ur urVar : urVarArr) {
                    removeView(urVar);
                }
            }
            this.f42455f = new ur[i10];
            for (int i16 = 0; i16 < i10; i16++) {
                this.f42455f[i16] = new qr(this, getContext(), i16, i10);
                this.f42455f[i16].setImeOptions(268435461);
                this.f42455f[i16].setTextSize(1, 20.0f);
                this.f42455f[i16].setMaxLines(1);
                this.f42455f[i16].setTypeface(AndroidUtilities.bold());
                this.f42455f[i16].setPadding(0, 0, 0, 0);
                this.f42455f[i16].setGravity(17);
                if (i11 == 3) {
                    this.f42455f[i16].setEnabled(false);
                    this.f42455f[i16].setInputType(0);
                    this.f42455f[i16].setVisibility(8);
                } else {
                    this.f42455f[i16].setInputType(3);
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
                ur urVar2 = this.f42455f[i16];
                if (i16 != i10 - 1) {
                    i14 = i17;
                } else {
                    i14 = 0;
                }
                addView(urVar2, i7.f6.t(i12, i13, 1, 0, 0, i14, 0));
                this.f42455f[i16].addTextChangedListener(new rr(this, i16, i10));
                this.f42455f[i16].setOnEditorActionListener(new da(this, 3));
            }
            return;
        }
        while (true) {
            ur[] urVarArr2 = this.f42455f;
            if (i15 < urVarArr2.length) {
                urVarArr2[i15].setText("");
                i15++;
            } else {
                return;
            }
        }
    }

    public final void c(String str, boolean z10) {
        if (this.f42455f != null) {
            int i10 = 0;
            if (z10) {
                int i11 = 0;
                while (true) {
                    ur[] urVarArr = this.f42455f;
                    if (i11 >= urVarArr.length) {
                        break;
                    } else if (urVarArr[i11].isFocused()) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            for (int i12 = i10; i12 < Math.min(this.f42455f.length, str.length() + i10); i12++) {
                this.f42455f[i12].setText(Character.toString(str.charAt(i12 - i10)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ur) {
                ur urVar = (ur) childAt;
                if (!this.f42454e) {
                    if (childAt.isFocused()) {
                        urVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        urVar.j(0.0f);
                    }
                }
                float successProgress = urVar.getSuccessProgress();
                int d = i0.a.d(successProgress, i0.a.d(urVar.getErrorProgress(), i0.a.d(urVar.getFocusedProgress(), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23189k6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23206l6, false)), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false)), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23153i7, false));
                Paint paint = this.f42451a;
                paint.setColor(d);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f9 = this.f42453c;
                rectF.inset(f9, f9);
                if (successProgress != 0.0f) {
                    float f10 = -Math.max(0.0f, (urVar.getSuccessScaleProgress() - 1.0f) * this.f42453c);
                    rectF.inset(f10, f10);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof ur) {
            ur urVar = (ur) view;
            canvas.save();
            float f9 = urVar.v;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f10 = this.f42453c;
            rectF.inset(f10, f10);
            canvas.clipRect(rectF);
            if (urVar.f43325x) {
                float f11 = (f9 * 0.5f) + 0.5f;
                view.setAlpha(f9);
                canvas.scale(f11, f11, (urVar.getMeasuredWidth() / 2.0f) + urVar.getX(), (urVar.getMeasuredHeight() / 2.0f) + urVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f9) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j10);
            canvas.restore();
            float f12 = urVar.f43324w;
            if (f12 < 1.0f) {
                canvas.save();
                float f13 = 1.0f - f12;
                float f14 = (f13 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (urVar.getMeasuredWidth() / 2.0f) + urVar.getX(), (urVar.getMeasuredHeight() / 2.0f) + urVar.getY());
                Paint paint = this.f42452b;
                paint.setAlpha((int) (f13 * 255.0f));
                canvas.drawBitmap(urVar.f43326y, urVar.getX(), urVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public String getCode() {
        if (this.f42455f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            ur[] urVarArr = this.f42455f;
            if (i10 < urVarArr.length) {
                sb2.append(qe.b.d(urVarArr[i10].getText().toString(), false));
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
        this.f42453c = dp;
        this.f42451a.setStrokeWidth(dp);
    }

    public void setCode(String str) {
        this.f42455f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
