package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z50 extends View {
    public int[] f40122a;
    public int f40123b;
    public final Paint f40124c;
    public float d;
    public final k60 e;

    public z50(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = k60Var;
        Paint paint = new Paint(1);
        this.f40124c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        k60 k60Var = this.e;
        if (k60Var.f35117z2 && k60Var.a2.f29037c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f40124c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f40122a;
        Paint paint = this.f40124c;
        boolean z10 = true;
        k60 k60Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f40122a = iArr;
            if (k60Var.f35042h1 != null) {
                float f7 = k60Var.f35046i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f40122a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (k60Var.f35046i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, k60Var.U0.getMeasuredHeight(), this.f40122a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f40123b != k60Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, k60Var.V1);
            this.f40123b = k60Var.V1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        k60Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f40124c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
