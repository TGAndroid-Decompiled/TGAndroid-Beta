package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class b0 extends TableLayout {
    public final h6 f61250a;
    public final c0 f61251b;

    public b0(c0 c0Var, Context context, h6 h6Var) {
        super(context);
        this.f61251b = c0Var;
        this.f61250a = h6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int left;
        c0 c0Var = this.f61251b;
        c0Var.f61267w.set(0.0f, 0.0f, getWidth(), getHeight());
        c0Var.f61266s.rewind();
        c0Var.f61266s.addRoundRect(c0Var.f61267w, g0.L(6.0f), g0.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        c0Var.f61265r.setColor(i0.a.f(0.1f, m6.w0(m6.f29379d7, this.f61250a), -1));
        c0Var.f61265r.setStrokeWidth(g0.L(1.0f));
        float height = getHeight();
        if (c0Var.E.getVisibility() == 0) {
            f10 = 5.0f;
        } else {
            f10 = 4.0f;
        }
        float f11 = height / f10;
        for (int i7 = 1; i7 <= 4; i7++) {
            float f12 = f11 * i7;
            canvas.drawLine(0.0f, f12, getWidth(), f12, c0Var.f61265r);
        }
        if (gd.f24241a0) {
            left = c0Var.f61262e.getRight();
        } else {
            left = c0Var.f61262e.getLeft();
        }
        float f13 = left;
        canvas.drawLine(f13, 0.0f, f13, getHeight(), c0Var.f61265r);
        c0Var.f61265r.setStrokeWidth(g0.L(2.0f));
        canvas.drawPath(c0Var.f61266s, c0Var.f61265r);
    }
}
