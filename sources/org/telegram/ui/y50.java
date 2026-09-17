package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y50 extends View {
    public int[] f43015a;
    public int f43016b;
    public final Paint f43017c;
    public float d;
    public final j60 f43018e;

    public y50(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.f43018e = j60Var;
        Paint paint = new Paint(1);
        this.f43017c = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        j60 j60Var = this.f43018e;
        if (j60Var.f37647z2 && j60Var.a2.f31627c < 0.1d) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f43017c);
        }
    }

    public void setNewColors(int[] iArr) {
        int[] iArr2 = this.f43015a;
        Paint paint = this.f43017c;
        boolean z10 = true;
        j60 j60Var = this.f43018e;
        boolean z11 = false;
        if (iArr2 == null || iArr[0] != iArr2[0] || iArr[1] != iArr2[1]) {
            if (iArr2 == null) {
                paint.setAlpha(255);
            }
            this.f43015a = iArr;
            if (j60Var.f37572h1 != null) {
                float f7 = j60Var.f37576i1;
                if (f7 != 1.0f) {
                    iArr[0] = i0.a.k(iArr[0], (int) (f7 * 255.0f));
                    int[] iArr3 = this.f43015a;
                    iArr3[1] = i0.a.k(iArr3[1], (int) (j60Var.f37576i1 * 255.0f));
                }
            }
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, j60Var.U0.getMeasuredHeight(), this.f43015a, (float[]) null, Shader.TileMode.CLAMP));
            z11 = true;
        }
        if (this.f43016b != j60Var.V1) {
            paint.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, j60Var.V1);
            this.f43016b = j60Var.V1;
        } else {
            z10 = z11;
        }
        if (z10) {
            invalidate();
        }
        j60Var.z1();
    }

    public void setShadowOffset(int i10) {
        float f7 = i10;
        if (this.d != f7) {
            this.f43017c.setShadowLayer(AndroidUtilities.dp(36.0f), 0.0f, this.d, this.f43018e.V1);
            this.d = f7;
            invalidate();
        }
    }
}
