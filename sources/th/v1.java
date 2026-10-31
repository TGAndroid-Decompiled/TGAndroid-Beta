package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.ui.Components.y90;
public final class v1 extends y90 {
    public final z2 V;

    public v1(z2 z2Var, Context context, long j10, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, j10, 0L, k2Var, p6Var);
        this.V = z2Var;
    }

    @Override
    public final void f(Canvas canvas, Rect rect, float f7) {
        z2 z2Var = this.V;
        j2.f fVar = z2Var.f49780y1;
        fVar.x(getX(), -getY(), getX() + getMeasuredWidth(), (-getY()) + getMeasuredHeight());
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(rect);
        rectF.offset(0.0f, 0.0f);
        canvas.drawRoundRect(rectF, f7, f7, (Paint) fVar.f9347a);
        canvas.drawRoundRect(rectF, f7, f7, z2Var.W1);
        if (rectF.top < getMeasuredHeight() - 1) {
            canvas.drawRect(0.0f, getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight() - 1, z2Var.f49725k0.d("paintDivider"));
        }
    }
}
