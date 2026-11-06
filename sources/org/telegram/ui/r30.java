package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class r30 extends View {
    public int[] f49363a;
    public int f49364b;
    public final Paint f49365c;
    public float d;
    public final c40 f49366e;

    public r30(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f49366e = c40Var;
        Paint paint = new Paint(1);
        this.f49365c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c40 c40Var = this.f49366e;
        if (c40Var.f44615q4 && c40Var.R3.f39260c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f49365c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f49363a;
        Paint paint = this.f49365c;
        boolean z9 = true;
        c40 c40Var = this.f49366e;
        boolean z10 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f49363a = iArr;
            if (c40Var.Y2 != null) {
                float f10 = c40Var.Z2;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.o(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.f49363a;
                    iArr3[1] = i0.a.o(iArr3[1], (int) (c40Var.Z2 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, c40Var.L2.getMeasuredHeight(), this.f49363a, (float[]) null, Shader.TileMode.CLAMP));
            z10 = true;
        }
        if (this.f49364b != c40Var.M3) {
            paint.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, c40Var.M3);
            this.f49364b = c40Var.M3;
        } else {
            z9 = z10;
        }
        if (z9) {
            invalidate();
        }
        c40Var.E1();
    }

    public void setShadowOffset(int i7) {
        float f10 = i7;
        if (this.d != f10) {
            this.f49365c.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, this.f49366e.M3);
            this.d = f10;
            invalidate();
        }
    }
}
