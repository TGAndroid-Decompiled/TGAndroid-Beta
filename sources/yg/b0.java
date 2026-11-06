package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public final class b0 extends TableLayout {
    public final f6 f59332a;
    public final c0 f59333b;

    public b0(c0 c0Var, Context context, f6 f6Var) {
        super(context);
        this.f59333b = c0Var;
        this.f59332a = f6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int left;
        c0 c0Var = this.f59333b;
        c0Var.f59349w.set(0.0f, 0.0f, getWidth(), getHeight());
        c0Var.f59348s.rewind();
        c0Var.f59348s.addRoundRect(c0Var.f59349w, g0.L(6.0f), g0.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        c0Var.f59347r.setColor(i0.a.f(0.1f, k6.w0(k6.f27849d7, this.f59332a), -1));
        c0Var.f59347r.setStrokeWidth(g0.L(1.0f));
        float height = getHeight();
        if (c0Var.D.getVisibility() == 0) {
            f10 = 5.0f;
        } else {
            f10 = 4.0f;
        }
        float f11 = height / f10;
        for (int i7 = 1; i7 <= 4; i7++) {
            float f12 = f11 * i7;
            canvas.drawLine(0.0f, f12, getWidth(), f12, c0Var.f59347r);
        }
        if (hd.f22871a0) {
            left = c0Var.f59344e.getRight();
        } else {
            left = c0Var.f59344e.getLeft();
        }
        float f13 = left;
        canvas.drawLine(f13, 0.0f, f13, getHeight(), c0Var.f59347r);
        c0Var.f59347r.setStrokeWidth(g0.L(2.0f));
        canvas.drawPath(c0Var.f59348s, c0Var.f59347r);
    }
}
