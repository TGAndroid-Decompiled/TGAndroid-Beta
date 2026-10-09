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
import org.telegram.ui.Components.l11;
public final class w7 extends View {
    public final LinearGradient f53350a;
    public final Matrix f53351b;
    public final Paint f53352c;
    public final Paint d;
    public final l11 f53353e;
    public final org.telegram.ui.ActionBar.e6 f53354f;

    public w7(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f53354f = e6Var;
        this.f53350a = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f53351b = new Matrix();
        this.f53352c = new Paint(1);
        this.d = new Paint(1);
        this.f53353e = new l11(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Matrix matrix = this.f53351b;
        matrix.reset();
        matrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
        matrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
        LinearGradient linearGradient = this.f53350a;
        linearGradient.setLocalMatrix(matrix);
        Paint paint = this.f53352c;
        paint.setShader(linearGradient);
        l11 l11Var = this.f53353e;
        float dp = l11Var.f28222c + AndroidUtilities.dp(30.0f);
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20798d7, this.f53354f);
        Paint paint2 = this.d;
        paint2.setColor(w02);
        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - dp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + dp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) / 2.0f, 0.0f, (getWidth() + dp) / 2.0f, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
        this.f53353e.c((getWidth() - l11Var.f28222c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
    }
}
