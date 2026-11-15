package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class v11 extends View {
    public final Paint f52093a;
    public int f52094b;
    public LinearGradient f52095c;
    public final x11 d;

    public v11(x11 x11Var, Context context) {
        super(context);
        this.d = x11Var;
        this.f52093a = new Paint(1);
        this.f52094b = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, x11Var.J0);
        this.f52095c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(68.0f), new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, this.f52094b), this.f52094b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.d.J0);
        if (w02 != this.f52094b) {
            this.f52094b = w02;
            this.f52095c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(68.0f), new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, w02), w02}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.f52095c;
        Paint paint = this.f52093a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
