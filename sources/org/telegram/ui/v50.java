package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v50 extends View {
    public int[] f38450a;
    public int f38451b;
    public final Paint f38452c;
    public float d;
    public final g60 e;

    public v50(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = g60Var;
        Paint paint = new Paint(1);
        this.f38452c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        g60 g60Var = this.e;
        if (g60Var.f33831z2 && g60Var.a2.f29406c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38452c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f38450a;
        Paint paint = this.f38452c;
        boolean z10 = true;
        g60 g60Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f38450a = iArr;
            if (g60Var.f33756h1 != null) {
                float f7 = g60Var.f33760i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f38450a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (g60Var.f33760i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, g60Var.U0.getMeasuredHeight(), this.f38450a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f38451b != g60Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, g60Var.V1);
            this.f38451b = g60Var.V1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        g60Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f38452c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
