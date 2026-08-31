package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class s50 extends View {
    public int[] f41139a;
    public int f41140b;
    public final Paint f41141c;
    public float d;
    public final d60 f41142e;

    public s50(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f41142e = d60Var;
        Paint paint = new Paint(1);
        this.f41141c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d60 d60Var = this.f41142e;
        if (d60Var.f36105w2 && d60Var.X1.f32142c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f41141c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f41139a;
        Paint paint = this.f41141c;
        boolean z4 = true;
        d60 d60Var = this.f41142e;
        boolean z10 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f41139a = iArr;
            if (d60Var.f36029e1 != null) {
                float f10 = d60Var.f36034f1;
                if (f10 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f10 * 255.0f));
                    int[] iArr3 = this.f41139a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (d60Var.f36034f1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, d60Var.R0.getMeasuredHeight(), this.f41139a, (float[]) null, Shader.TileMode.CLAMP));
            z10 = true;
        }
        if (this.f41140b != d60Var.S1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, d60Var.S1);
            this.f41140b = d60Var.S1;
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
            this.f41141c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.f41142e.S1);
            this.d = f10;
            invalidate();
        }
    }
}
