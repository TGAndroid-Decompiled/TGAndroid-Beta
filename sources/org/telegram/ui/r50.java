package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r50 extends View {
    public int[] f37920a;
    public int f37921b;
    public final Paint f37922c;
    public float d;
    public final c60 e;

    public r50(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = c60Var;
        Paint paint = new Paint(1);
        this.f37922c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c60 c60Var = this.e;
        if (c60Var.f33191w2 && c60Var.X1.f29715c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f37922c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f37920a;
        Paint paint = this.f37922c;
        boolean z4 = true;
        c60 c60Var = this.e;
        boolean z10 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f37920a = iArr;
            if (c60Var.f33115e1 != null) {
                float f10 = c60Var.f33120f1;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.f37920a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (c60Var.f33120f1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, c60Var.R0.getMeasuredHeight(), this.f37920a, (float[]) null, Shader.TileMode.CLAMP));
            z10 = true;
        }
        if (this.f37921b != c60Var.S1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, c60Var.S1);
            this.f37921b = c60Var.S1;
        } else {
            z4 = z10;
        }
        if (z4) {
            invalidate();
        }
        c60Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f10 = i10;
        if (this.d != f10) {
            this.f37922c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.S1);
            this.d = f10;
            invalidate();
        }
    }
}
