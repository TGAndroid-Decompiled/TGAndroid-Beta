package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.m11;
public final class w7 extends View {
    public final LinearGradient f53396a;
    public final Matrix f53397b;
    public final Paint f53398c;
    public final Paint d;
    public final m11 f53399e;
    public final org.telegram.ui.ActionBar.e6 f53400f;

    public w7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f53400f = e6Var;
        this.f53396a = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f53397b = new Matrix();
        this.f53398c = new Paint(1);
        this.d = new Paint(1);
        this.f53399e = new m11(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Matrix matrix = this.f53397b;
        matrix.reset();
        matrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
        matrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
        LinearGradient linearGradient = this.f53396a;
        linearGradient.setLocalMatrix(matrix);
        Paint paint = this.f53398c;
        paint.setShader(linearGradient);
        m11 m11Var = this.f53399e;
        float dp = m11Var.f28602c + AndroidUtilities.dp(30.0f);
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20802d7, this.f53400f);
        Paint paint2 = this.d;
        paint2.setColor(w02);
        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - dp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + dp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) / 2.0f, 0.0f, (getWidth() + dp) / 2.0f, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
        this.f53399e.c((getWidth() - m11Var.f28602c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
    }
}
