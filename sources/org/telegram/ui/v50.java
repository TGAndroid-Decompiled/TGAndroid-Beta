package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v50 extends View {
    public int[] f42654a;
    public int f42655b;
    public final Paint f42656c;
    public float d;
    public final g60 f42657e;

    public v50(g60 g60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f42657e = g60Var;
        Paint paint = new Paint(1);
        this.f42656c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        g60 g60Var = this.f42657e;
        if (g60Var.f37895z2 && g60Var.a2.f32057c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f42656c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f42654a;
        Paint paint = this.f42656c;
        boolean z10 = true;
        g60 g60Var = this.f42657e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f42654a = iArr;
            if (g60Var.f37820h1 != null) {
                float f7 = g60Var.f37824i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f42654a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (g60Var.f37824i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, g60Var.U0.getMeasuredHeight(), this.f42654a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f42655b != g60Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, g60Var.V1);
            this.f42655b = g60Var.V1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        g60Var.A1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f42656c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.f42657e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
