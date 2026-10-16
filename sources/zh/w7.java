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
import org.telegram.ui.Components.i11;
public final class w7 extends View {
    public final LinearGradient f51280a;
    public final Matrix f51281b;
    public final Paint f51282c;
    public final Paint d;
    public final i11 e;
    public final org.telegram.ui.ActionBar.c6 f51283f;

    public w7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f51283f = c6Var;
        this.f51280a = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f51281b = new Matrix();
        this.f51282c = new Paint(1);
        this.d = new Paint(1);
        this.e = new i11(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Matrix matrix = this.f51281b;
        matrix.reset();
        matrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
        matrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
        LinearGradient linearGradient = this.f51280a;
        linearGradient.setLocalMatrix(matrix);
        Paint paint = this.f51282c;
        paint.setShader(linearGradient);
        i11 i11Var = this.e;
        float dp = i11Var.f25455c + AndroidUtilities.dp(30.0f);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19602d7, this.f51283f);
        Paint paint2 = this.d;
        paint2.setColor(w02);
        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - dp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + dp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((getWidth() - dp) / 2.0f, 0.0f, (getWidth() + dp) / 2.0f, getHeight());
        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
        this.e.c((getWidth() - i11Var.f25455c) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
    }
}
