package zh;

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
import org.telegram.ui.Components.f01;
public final class c8 extends View {
    public final LinearGradient f51772a;
    public final Matrix f51773b;
    public final Paint f51774c;
    public final Paint d;
    public final f01 f51775e;
    public final org.telegram.ui.ActionBar.f6 f51776f;

    public c8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f51776f = f6Var;
        this.f51772a = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f51773b = new Matrix();
        this.f51774c = new Paint(1);
        this.d = new Paint(1);
        this.f51775e = new f01(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Matrix matrix = this.f51773b;
        matrix.reset();
        matrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
        matrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
        LinearGradient linearGradient = this.f51772a;
        linearGradient.setLocalMatrix(matrix);
        Paint paint = this.f51774c;
        paint.setShader(linearGradient);
        f01 f01Var = this.f51775e;
        float dp = f01Var.f25847c + AndroidUtilities.dp(30.0f);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d7, this.f51776f);
        Paint paint2 = this.d;
        paint2.setColor(v02);
        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - dp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + dp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) / 2.0f, 0.0f, (getWidth() + dp) / 2.0f, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
        this.f51775e.c((getWidth() - f01Var.f25847c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
    }
}
