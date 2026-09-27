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
import org.telegram.ui.Components.v01;
public final class c8 extends View {
    public final LinearGradient f47330a;
    public final Matrix f47331b;
    public final Paint f47332c;
    public final Paint d;
    public final v01 e;
    public final org.telegram.ui.ActionBar.e6 f47333f;

    public c8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f47333f = e6Var;
        this.f47330a = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f47331b = new Matrix();
        this.f47332c = new Paint(1);
        this.d = new Paint(1);
        this.e = new v01(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Matrix matrix = this.f47331b;
        matrix.reset();
        matrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
        matrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
        LinearGradient linearGradient = this.f47330a;
        linearGradient.setLocalMatrix(matrix);
        Paint paint = this.f47332c;
        paint.setShader(linearGradient);
        v01 v01Var = this.e;
        float dp = v01Var.f28987c + AndroidUtilities.dp(30.0f);
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19058d7, this.f47333f);
        Paint paint2 = this.d;
        paint2.setColor(v02);
        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - dp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + dp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) / 2.0f, 0.0f, (getWidth() + dp) / 2.0f, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
        this.e.c((getWidth() - v01Var.f28987c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
    }
}
