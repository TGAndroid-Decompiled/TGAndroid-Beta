package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z71 extends View {
    public final Paint f42184a;
    public final LinearGradient f42185b;

    public z71(b81 b81Var, Context context) {
        super(context);
        this.f42184a = new Paint(1);
        float dp = AndroidUtilities.dp(68.0f);
        int i10 = org.telegram.ui.ActionBar.g6.f19672h5;
        this.f42185b = new LinearGradient(0.0f, 0.0f, 0.0f, dp, new int[]{org.telegram.ui.ActionBar.g6.m1(0.0f, b81Var.getThemedColor(i10)), b81Var.getThemedColor(i10)}, new float[]{0.0f, 0.2f}, Shader.TileMode.CLAMP);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        LinearGradient linearGradient = this.f42185b;
        Paint paint = this.f42184a;
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }
}
