package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class y11 extends View {
    public final Paint f52043a;
    public int f52044b;
    public LinearGradient f52045c;
    public final a21 d;

    public y11(a21 a21Var, Context context) {
        super(context);
        this.d = a21Var;
        this.f52043a = new Paint(1);
        this.f52044b = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27925h5, a21Var.I0);
        this.f52045c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(68.0f), new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, this.f52044b), this.f52044b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27925h5, this.d.I0);
        if (w02 != this.f52044b) {
            this.f52044b = w02;
            this.f52045c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(68.0f), new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, w02), w02}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.f52045c;
        Paint paint = this.f52043a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
