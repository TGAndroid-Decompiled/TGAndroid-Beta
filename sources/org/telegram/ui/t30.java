package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class t30 extends View {
    public int[] f50056a;
    public int f50057b;
    public final Paint f50058c;
    public float d;
    public final e40 f50059e;

    public t30(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f50059e = e40Var;
        Paint paint = new Paint(1);
        this.f50058c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e40 e40Var = this.f50059e;
        if (e40Var.f45258q4 && e40Var.R3.f39384c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f50058c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f50056a;
        Paint paint = this.f50058c;
        boolean z9 = true;
        e40 e40Var = this.f50059e;
        boolean z10 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f50056a = iArr;
            if (e40Var.Y2 != null) {
                float f10 = e40Var.Z2;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.o(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.f50056a;
                    iArr3[1] = i0.a.o(iArr3[1], (int) (e40Var.Z2 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, e40Var.L2.getMeasuredHeight(), this.f50056a, (float[]) null, Shader.TileMode.CLAMP));
            z10 = true;
        }
        if (this.f50057b != e40Var.M3) {
            paint.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, e40Var.M3);
            this.f50057b = e40Var.M3;
        } else {
            z9 = z10;
        }
        if (z9) {
            invalidate();
        }
        e40Var.E1();
    }

    public void setShadowOffset(int i7) {
        float f10 = i7;
        if (this.d != f10) {
            this.f50058c.setShadowLayer(org.telegram.messenger.g0.L(36.0f), 0.0f, this.d, this.f50059e.M3);
            this.d = f10;
            invalidate();
        }
    }
}
