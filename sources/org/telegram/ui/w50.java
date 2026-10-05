package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w50 extends View {
    public int[] f41933a;
    public int f41934b;
    public final Paint f41935c;
    public float d;
    public final h60 f41936e;

    public w50(h60 h60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f41936e = h60Var;
        Paint paint = new Paint(1);
        this.f41935c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        h60 h60Var = this.f41936e;
        if (h60Var.f37012z2 && h60Var.a2.f32051c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f41935c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f41933a;
        Paint paint = this.f41935c;
        boolean z10 = true;
        h60 h60Var = this.f41936e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f41933a = iArr;
            if (h60Var.f36937h1 != null) {
                float f7 = h60Var.f36941i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f41933a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (h60Var.f36941i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, h60Var.U0.getMeasuredHeight(), this.f41933a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f41934b != h60Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, h60Var.V1);
            this.f41934b = h60Var.V1;
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
            this.f41935c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.f41936e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
