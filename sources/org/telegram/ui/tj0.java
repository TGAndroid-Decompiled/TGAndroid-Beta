package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class tj0 extends View {
    public final Paint f43849a;
    public int f43850b;
    public int f43851c;
    public final xj0 d;

    public tj0(xj0 xj0Var, Context context) {
        super(context);
        this.d = xj0Var;
        this.f43849a = new Paint();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.y6.f23354d6);
        Paint paint = this.f43849a;
        if (paint.getShader() == null || this.f43850b != themedColor || this.f43851c != getHeight()) {
            this.f43850b = themedColor;
            this.f43851c = getHeight();
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), themedColor, themedColor & 16777215, Shader.TileMode.CLAMP));
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
