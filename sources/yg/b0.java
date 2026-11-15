package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public final class b0 extends TableLayout {
    public final e6 f60641a;
    public final c0 f60642b;

    public b0(c0 c0Var, Context context, e6 e6Var) {
        super(context);
        this.f60642b = c0Var;
        this.f60641a = e6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int left;
        c0 c0Var = this.f60642b;
        c0Var.f60658w.set(0.0f, 0.0f, getWidth(), getHeight());
        c0Var.f60657s.rewind();
        c0Var.f60657s.addRoundRect(c0Var.f60658w, g0.L(6.0f), g0.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        c0Var.f60656r.setColor(i0.a.f(0.1f, j6.w0(j6.f28850d7, this.f60641a), -1));
        c0Var.f60656r.setStrokeWidth(g0.L(1.0f));
        float height = getHeight();
        if (c0Var.E.getVisibility() == 0) {
            f10 = 5.0f;
        } else {
            f10 = 4.0f;
        }
        float f11 = height / f10;
        for (int i7 = 1; i7 <= 4; i7++) {
            float f12 = f11 * i7;
            canvas.drawLine(0.0f, f12, getWidth(), f12, c0Var.f60656r);
        }
        if (hd.f24101a0) {
            left = c0Var.f60653e.getRight();
        } else {
            left = c0Var.f60653e.getLeft();
        }
        float f13 = left;
        canvas.drawLine(f13, 0.0f, f13, getHeight(), c0Var.f60656r);
        c0Var.f60656r.setStrokeWidth(g0.L(2.0f));
        canvas.drawPath(c0Var.f60657s, c0Var.f60656r);
    }
}
