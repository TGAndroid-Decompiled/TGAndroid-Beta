package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t50 extends View {
    public int[] f38385a;
    public int f38386b;
    public final Paint f38387c;
    public float d;
    public final e60 e;

    public t50(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.e = e60Var;
        Paint paint = new Paint(1);
        this.f38387c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e60 e60Var = this.e;
        if (e60Var.f33710w2 && e60Var.X1.f29687c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38387c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f38385a;
        Paint paint = this.f38387c;
        boolean z4 = true;
        e60 e60Var = this.e;
        boolean z10 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f38385a = iArr;
            if (e60Var.f33634e1 != null) {
                float f10 = e60Var.f33639f1;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.f38385a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (e60Var.f33639f1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, e60Var.R0.getMeasuredHeight(), this.f38385a, (float[]) null, Shader.TileMode.CLAMP));
            z10 = true;
        }
        if (this.f38386b != e60Var.S1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, e60Var.S1);
            this.f38386b = e60Var.S1;
        } else {
            z4 = z10;
        }
        if (z4) {
            invalidate();
        }
        e60Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f10 = i10;
        if (this.d != f10) {
            this.f38387c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.e.S1);
            this.d = f10;
            invalidate();
        }
    }
}
