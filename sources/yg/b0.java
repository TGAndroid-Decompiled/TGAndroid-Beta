package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public final class b0 extends TableLayout {
    public final i6 f61208a;
    public final c0 f61209b;

    public b0(c0 c0Var, Context context, i6 i6Var) {
        super(context);
        this.f61209b = c0Var;
        this.f61208a = i6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int left;
        c0 c0Var = this.f61209b;
        c0Var.f61225w.set(0.0f, 0.0f, getWidth(), getHeight());
        c0Var.f61224s.rewind();
        c0Var.f61224s.addRoundRect(c0Var.f61225w, g0.L(6.0f), g0.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        c0Var.f61223r.setColor(i0.a.f(0.1f, n6.w0(n6.f29397d7, this.f61208a), -1));
        c0Var.f61223r.setStrokeWidth(g0.L(1.0f));
        float height = getHeight();
        if (c0Var.E.getVisibility() == 0) {
            f10 = 5.0f;
        } else {
            f10 = 4.0f;
        }
        float f11 = height / f10;
        for (int i7 = 1; i7 <= 4; i7++) {
            float f12 = f11 * i7;
            canvas.drawLine(0.0f, f12, getWidth(), f12, c0Var.f61223r);
        }
        if (gd.f24216a0) {
            left = c0Var.f61220e.getRight();
        } else {
            left = c0Var.f61220e.getLeft();
        }
        float f13 = left;
        canvas.drawLine(f13, 0.0f, f13, getHeight(), c0Var.f61223r);
        c0Var.f61223r.setStrokeWidth(g0.L(2.0f));
        canvas.drawPath(c0Var.f61224s, c0Var.f61223r);
    }
}
