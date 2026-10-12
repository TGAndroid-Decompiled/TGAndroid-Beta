package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class b0 extends TableLayout {
    public final c6 f47563a;
    public final c0 f47564b;

    public b0(c0 c0Var, Context context, c6 c6Var) {
        super(context);
        this.f47564b = c0Var;
        this.f47563a = c6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int left;
        c0 c0Var = this.f47564b;
        c0Var.v.set(0.0f, 0.0f, getWidth(), getHeight());
        c0Var.f47577s.rewind();
        c0Var.f47577s.addRoundRect(c0Var.v, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        c0Var.f47576r.setColor(i0.a.d(0.1f, g6.w0(g6.f19902d7, this.f47563a), -1));
        c0Var.f47576r.setStrokeWidth(AndroidUtilities.dp(1.0f));
        float height = getHeight();
        if (c0Var.f47580y.getVisibility() == 0) {
            f7 = 5.0f;
        } else {
            f7 = 4.0f;
        }
        float f10 = height / f7;
        for (int i10 = 1; i10 <= 4; i10++) {
            float f11 = f10 * i10;
            canvas.drawLine(0.0f, f11, getWidth(), f11, c0Var.f47576r);
        }
        if (LocaleController.isRTL) {
            left = c0Var.e.getRight();
        } else {
            left = c0Var.e.getLeft();
        }
        float f12 = left;
        canvas.drawLine(f12, 0.0f, f12, getHeight(), c0Var.f47576r);
        c0Var.f47576r.setStrokeWidth(AndroidUtilities.dp(2.0f));
        canvas.drawPath(c0Var.f47577s, c0Var.f47576r);
    }
}
