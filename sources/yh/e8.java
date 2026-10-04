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
import org.telegram.ui.Components.e11;
public final class e8 extends View {
    public final LinearGradient f51243a;
    public final Matrix f51244b;
    public final Paint f51245c;
    public final Paint d;
    public final e11 f51246e;
    public final org.telegram.ui.ActionBar.d6 f51247f;

    public e8(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f51247f = d6Var;
        this.f51243a = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f51244b = new Matrix();
        this.f51245c = new Paint(1);
        this.d = new Paint(1);
        this.f51246e = new e11(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Matrix matrix = this.f51244b;
        matrix.reset();
        matrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
        matrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
        LinearGradient linearGradient = this.f51243a;
        linearGradient.setLocalMatrix(matrix);
        Paint paint = this.f51245c;
        paint.setShader(linearGradient);
        e11 e11Var = this.f51246e;
        float dp = e11Var.f25879c + AndroidUtilities.dp(30.0f);
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20819d7, this.f51247f);
        Paint paint2 = this.d;
        paint2.setColor(v02);
        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - dp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + dp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) / 2.0f, 0.0f, (getWidth() + dp) / 2.0f, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
        this.f51246e.c((getWidth() - e11Var.f25879c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
    }
}
