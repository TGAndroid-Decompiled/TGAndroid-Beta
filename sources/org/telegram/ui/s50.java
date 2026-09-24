package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s50 extends View {
    public int[] f37579a;
    public int f37580b;
    public final Paint f37581c;
    public float d;
    public final d60 e;

    public s50(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = d60Var;
        Paint paint = new Paint(1);
        this.f37581c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d60 d60Var = this.e;
        if (d60Var.f33024z2 && d60Var.a2.f29454c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f37581c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f37579a;
        Paint paint = this.f37581c;
        boolean z10 = true;
        d60 d60Var = this.e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f37579a = iArr;
            if (d60Var.f32949h1 != null) {
                float f7 = d60Var.f32953i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f37579a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (d60Var.f32953i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, d60Var.U0.getMeasuredHeight(), this.f37579a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f37580b != d60Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, d60Var.V1);
            this.f37580b = d60Var.V1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        d60Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f37581c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
