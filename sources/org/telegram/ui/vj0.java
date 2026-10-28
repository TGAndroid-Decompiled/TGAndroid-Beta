package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class vj0 extends View {
    public final Paint f44364a;
    public int f44365b;
    public int f44366c;
    public final zj0 d;

    public vj0(zj0 zj0Var, Context context) {
        super(context);
        this.d = zj0Var;
        this.f44364a = new Paint();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6);
        Paint paint = this.f44364a;
        if (paint.getShader() == null || this.f44365b != themedColor || this.f44366c != getHeight()) {
            this.f44365b = themedColor;
            this.f44366c = getHeight();
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), themedColor, themedColor & 16777215, Shader.TileMode.CLAMP));
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
