package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class t30 extends View {
    public int[] f52231a;
    public int f52232b;
    public final Paint f52233c;
    public float d;
    public final e40 f52234e;

    public t30(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f52234e = e40Var;
        Paint paint = new Paint(1);
        this.f52233c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e40 e40Var = this.f52234e;
        if (e40Var.f47427y4 && e40Var.Z3.f41005c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f52233c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f52231a;
        Paint paint = this.f52233c;
        boolean z10 = true;
        e40 e40Var = this.f52234e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f52231a = iArr;
            if (e40Var.f47330c3 != null) {
                float f10 = e40Var.f47333d3;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.o(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.f52231a;
                    iArr3[1] = i0.a.o(iArr3[1], (int) (e40Var.f47333d3 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, e40Var.P2.getMeasuredHeight(), this.f52231a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f52232b != e40Var.U3) {
            paint.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, e40Var.U3);
            this.f52232b = e40Var.U3;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        e40Var.F1();
    }

    public void setShadowOffset(int i7) {
        float f10 = i7;
        if (this.d != f10) {
            this.f52233c.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, this.f52234e.U3);
            this.d = f10;
            invalidate();
        }
    }
}
