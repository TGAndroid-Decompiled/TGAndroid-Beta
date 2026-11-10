package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class u30 extends View {
    public int[] f50391a;
    public int f50392b;
    public final Paint f50393c;
    public float d;
    public final f40 f50394e;

    public u30(f40 f40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f50394e = f40Var;
        Paint paint = new Paint(1);
        this.f50393c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        f40 f40Var = this.f50394e;
        if (f40Var.f45585t4 && f40Var.U3.f39304c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f50393c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f50391a;
        Paint paint = this.f50393c;
        boolean z9 = true;
        f40 f40Var = this.f50394e;
        boolean z10 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f50391a = iArr;
            if (f40Var.f45509b3 != null) {
                float f10 = f40Var.f45513c3;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.o(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.f50391a;
                    iArr3[1] = i0.a.o(iArr3[1], (int) (f40Var.f45513c3 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f40Var.O2.getMeasuredHeight(), this.f50391a, (float[]) null, Shader.TileMode.CLAMP));
            z10 = true;
        }
        if (this.f50392b != f40Var.P3) {
            paint.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, f40Var.P3);
            this.f50392b = f40Var.P3;
        } else {
            z9 = z10;
        }
        if (z9) {
            invalidate();
        }
        f40Var.E1();
    }

    public void setShadowOffset(int i7) {
        float f10 = i7;
        if (this.d != f10) {
            this.f50393c.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, this.f50394e.P3);
            this.d = f10;
            invalidate();
        }
    }
}
