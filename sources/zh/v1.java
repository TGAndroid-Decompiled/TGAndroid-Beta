package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xa0;
public final class v1 extends xa0 {
    public final a3 V;

    public v1(a3 a3Var, Context context, long j3, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, j3, 0L, p2Var, f6Var);
        this.V = a3Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f7) {
        a3 a3Var = this.V;
        com.google.firebase.messaging.n nVar = a3Var.P1;
        nVar.z(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.f6103a);
        canvas.drawRoundRect(rectF, f7, f7, a3Var.f48194n2);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, a3Var.B0.F("paintDivider"));
        }
    }
}
