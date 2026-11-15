package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class r30 extends View {
    public int[] f50838a;
    public int f50839b;
    public final Paint f50840c;
    public float d;
    public final c40 f50841e;

    public r30(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f50841e = c40Var;
        Paint paint = new Paint(1);
        this.f50840c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c40 c40Var = this.f50841e;
        if (c40Var.f45991y4 && c40Var.Z3.f40729c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f50840c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f50838a;
        Paint paint = this.f50840c;
        boolean z10 = true;
        c40 c40Var = this.f50841e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f50838a = iArr;
            if (c40Var.f45894c3 != null) {
                float f10 = c40Var.f45897d3;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.o(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.f50838a;
                    iArr3[1] = i0.a.o(iArr3[1], (int) (c40Var.f45897d3 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, c40Var.P2.getMeasuredHeight(), this.f50838a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f50839b != c40Var.U3) {
            paint.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, c40Var.U3);
            this.f50839b = c40Var.U3;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        c40Var.E1();
    }

    public void setShadowOffset(int i7) {
        float f10 = i7;
        if (this.d != f10) {
            this.f50840c.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, this.f50841e.U3);
            this.d = f10;
            invalidate();
        }
    }
}
