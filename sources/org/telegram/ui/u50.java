package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u50 extends View {
    public int[] f37910a;
    public int f37911b;
    public final Paint f37912c;
    public float d;
    public final f60 e;

    public u50(f60 f60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = f60Var;
        Paint paint = new Paint(1);
        this.f37912c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        f60 f60Var = this.e;
        if (f60Var.f33204z2 && f60Var.a2.f29031c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f37912c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f37910a;
        Paint paint = this.f37912c;
        boolean z10 = true;
        f60 f60Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f37910a = iArr;
            if (f60Var.f33129h1 != null) {
                float f7 = f60Var.f33133i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f37910a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (f60Var.f33133i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f60Var.U0.getMeasuredHeight(), this.f37910a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f37911b != f60Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, f60Var.V1);
            this.f37911b = f60Var.V1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        f60Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f37912c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
