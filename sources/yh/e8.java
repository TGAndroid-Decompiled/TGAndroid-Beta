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
    public final LinearGradient f51249a;
    public final Matrix f51250b;
    public final Paint f51251c;
    public final Paint d;
    public final e11 f51252e;
    public final org.telegram.ui.ActionBar.d6 f51253f;

    public e8(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f51253f = d6Var;
        this.f51249a = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f51250b = new Matrix();
        this.f51251c = new Paint(1);
        this.d = new Paint(1);
        this.f51252e = new e11(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Matrix matrix = this.f51250b;
        matrix.reset();
        matrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
        matrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
        LinearGradient linearGradient = this.f51249a;
        linearGradient.setLocalMatrix(matrix);
        Paint paint = this.f51251c;
        paint.setShader(linearGradient);
        e11 e11Var = this.f51252e;
        float dp = e11Var.f25884c + AndroidUtilities.dp(30.0f);
        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20823d7, this.f51253f);
        Paint paint2 = this.d;
        paint2.setColor(v02);
        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - dp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + dp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) / 2.0f, 0.0f, (getWidth() + dp) / 2.0f, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
        this.f51252e.c((getWidth() - e11Var.f25884c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
    }
}
