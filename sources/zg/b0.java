package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.TableLayout;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
public final class b0 extends TableLayout {
    public final e6 f60470a;
    public final c0 f60471b;

    public b0(c0 c0Var, Context context, e6 e6Var) {
        super(context);
        this.f60471b = c0Var;
        this.f60470a = e6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int left;
        c0 c0Var = this.f60471b;
        c0Var.f60487w.set(0.0f, 0.0f, getWidth(), getHeight());
        c0Var.f60486s.rewind();
        c0Var.f60486s.addRoundRect(c0Var.f60487w, g0.L(6.0f), g0.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        c0Var.f60485r.setColor(i0.a.f(0.1f, k6.w0(k6.f27879d7, this.f60470a), -1));
        c0Var.f60485r.setStrokeWidth(g0.L(1.0f));
        float height = getHeight();
        if (c0Var.E.getVisibility() == 0) {
            f10 = 5.0f;
        } else {
            f10 = 4.0f;
        }
        float f11 = height / f10;
        for (int i3 = 1; i3 <= 4; i3++) {
            float f12 = f11 * i3;
            canvas.drawLine(0.0f, f12, getWidth(), f12, c0Var.f60485r);
        }
        if (bd.f21784a0) {
            left = c0Var.f60482e.getRight();
        } else {
            left = c0Var.f60482e.getLeft();
        }
        float f13 = left;
        canvas.drawLine(f13, 0.0f, f13, getHeight(), c0Var.f60485r);
        c0Var.f60485r.setStrokeWidth(g0.L(2.0f));
        canvas.drawPath(c0Var.f60486s, c0Var.f60485r);
    }
}
