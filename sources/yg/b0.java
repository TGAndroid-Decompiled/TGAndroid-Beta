package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
public final class b0 extends TableLayout {
    public final g6 f59439a;
    public final c0 f59440b;

    public b0(c0 c0Var, Context context, g6 g6Var) {
        super(context);
        this.f59440b = c0Var;
        this.f59439a = g6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int left;
        c0 c0Var = this.f59440b;
        c0Var.f59456w.set(0.0f, 0.0f, getWidth(), getHeight());
        c0Var.f59455s.rewind();
        c0Var.f59455s.addRoundRect(c0Var.f59456w, g0.L(6.0f), g0.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        c0Var.f59454r.setColor(i0.a.f(0.1f, l6.w0(l6.f27866d7, this.f59439a), -1));
        c0Var.f59454r.setStrokeWidth(g0.L(1.0f));
        float height = getHeight();
        if (c0Var.D.getVisibility() == 0) {
            f10 = 5.0f;
        } else {
            f10 = 4.0f;
        }
        float f11 = height / f10;
        for (int i7 = 1; i7 <= 4; i7++) {
            float f12 = f11 * i7;
            canvas.drawLine(0.0f, f12, getWidth(), f12, c0Var.f59454r);
        }
        if (id.f23157a0) {
            left = c0Var.f59451e.getRight();
        } else {
            left = c0Var.f59451e.getLeft();
        }
        float f13 = left;
        canvas.drawLine(f13, 0.0f, f13, getHeight(), c0Var.f59454r);
        c0Var.f59454r.setStrokeWidth(g0.L(2.0f));
        canvas.drawPath(c0Var.f59455s, c0Var.f59454r);
    }
}
