package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class z11 extends View {
    public final Paint f54322a;
    public int f54323b;
    public LinearGradient f54324c;
    public final b21 d;

    public z11(b21 b21Var, Context context) {
        super(context);
        this.d = b21Var;
        this.f54322a = new Paint(1);
        this.f54323b = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, b21Var.J0);
        this.f54324c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(68.0f), new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, this.f54323b), this.f54323b}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, this.d.J0);
        if (w02 != this.f54323b) {
            this.f54323b = w02;
            this.f54324c = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(68.0f), new int[]{org.telegram.ui.ActionBar.n6.r1(0.0f, w02), w02}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
        }
        LinearGradient linearGradient = this.f54324c;
        Paint paint = this.f54322a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
