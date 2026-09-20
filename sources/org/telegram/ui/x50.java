package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x50 extends View {
    public int[] f39352a;
    public int f39353b;
    public final Paint f39354c;
    public float d;
    public final i60 e;

    public x50(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = i60Var;
        Paint paint = new Paint(1);
        this.f39354c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        i60 i60Var = this.e;
        if (i60Var.f34465z2 && i60Var.a2.f29463c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f39354c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f39352a;
        Paint paint = this.f39354c;
        boolean z10 = true;
        i60 i60Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f39352a = iArr;
            if (i60Var.f34390h1 != null) {
                float f7 = i60Var.f34394i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f39352a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (i60Var.f34394i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i60Var.U0.getMeasuredHeight(), this.f39352a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f39353b != i60Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, i60Var.V1);
            this.f39353b = i60Var.V1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        i60Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f39354c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
