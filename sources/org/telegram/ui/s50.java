package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s50 extends View {
    public int[] f41020a;
    public int f41021b;
    public final Paint f41022c;
    public float d;
    public final d60 f41023e;

    public s50(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f41023e = d60Var;
        Paint paint = new Paint(1);
        this.f41022c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d60 d60Var = this.f41023e;
        if (d60Var.f36084w2 && d60Var.X1.f32147c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f41022c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f41020a;
        Paint paint = this.f41022c;
        boolean z4 = true;
        d60 d60Var = this.f41023e;
        boolean z10 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f41020a = iArr;
            if (d60Var.f36008e1 != null) {
                float f10 = d60Var.f36013f1;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.f41020a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (d60Var.f36013f1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, d60Var.R0.getMeasuredHeight(), this.f41020a, (float[]) null, Shader.TileMode.CLAMP));
            z10 = true;
        }
        if (this.f41021b != d60Var.S1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, d60Var.S1);
            this.f41021b = d60Var.S1;
        } else {
            z4 = z10;
        }
        if (z4) {
            invalidate();
        }
        d60Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f10 = i10;
        if (this.d != f10) {
            this.f41022c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.f41023e.S1);
            this.d = f10;
            invalidate();
        }
    }
}
