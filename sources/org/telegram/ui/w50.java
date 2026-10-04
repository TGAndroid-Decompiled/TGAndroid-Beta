package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w50 extends View {
    public int[] f41915a;
    public int f41916b;
    public final Paint f41917c;
    public float d;
    public final h60 f41918e;

    public w50(h60 h60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f41918e = h60Var;
        Paint paint = new Paint(1);
        this.f41917c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        h60 h60Var = this.f41918e;
        if (h60Var.f36980z2 && h60Var.a2.f31978c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f41917c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f41915a;
        Paint paint = this.f41917c;
        boolean z10 = true;
        h60 h60Var = this.f41918e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f41915a = iArr;
            if (h60Var.f36905h1 != null) {
                float f7 = h60Var.f36909i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f41915a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (h60Var.f36909i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, h60Var.U0.getMeasuredHeight(), this.f41915a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f41916b != h60Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, h60Var.V1);
            this.f41916b = h60Var.V1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        h60Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f41917c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.f41918e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
