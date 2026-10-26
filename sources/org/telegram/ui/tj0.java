package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
public final class tj0 extends View {
    public final Paint f43852a;
    public int f43853b;
    public int f43854c;
    public final xj0 d;

    public tj0(xj0 xj0Var, Context context) {
        super(context);
        this.d = xj0Var;
        this.f43852a = new Paint();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6);
        Paint paint = this.f43852a;
        if (paint.getShader() == null || this.f43853b != themedColor || this.f43854c != getHeight()) {
            this.f43853b = themedColor;
            this.f43854c = getHeight();
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), themedColor, themedColor & 16777215, Shader.TileMode.CLAMP));
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
