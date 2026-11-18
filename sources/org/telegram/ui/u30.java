package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class u30 extends View {
    public int[] f52419a;
    public int f52420b;
    public final Paint f52421c;
    public float d;
    public final f40 f52422e;

    public u30(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f52422e = f40Var;
        Paint paint = new Paint(1);
        this.f52421c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        f40 f40Var = this.f52422e;
        if (f40Var.f47505y4 && f40Var.Z3.f40975c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f52421c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f52419a;
        Paint paint = this.f52421c;
        boolean z10 = true;
        f40 f40Var = this.f52422e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f52419a = iArr;
            if (f40Var.f47408c3 != null) {
                float f10 = f40Var.f47411d3;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.o(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.f52419a;
                    iArr3[1] = i0.a.o(iArr3[1], (int) (f40Var.f47411d3 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f40Var.P2.getMeasuredHeight(), this.f52419a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f52420b != f40Var.U3) {
            paint.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, f40Var.U3);
            this.f52420b = f40Var.U3;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        f40Var.F1();
    }

    public void setShadowOffset(int i7) {
        float f10 = i7;
        if (this.d != f10) {
            this.f52421c.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, this.f52422e.U3);
            this.d = f10;
            invalidate();
        }
    }
}
