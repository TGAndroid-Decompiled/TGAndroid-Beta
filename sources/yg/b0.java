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
    public final i6 f61338a;
    public final c0 f61339b;

    public b0(c0 c0Var, Context context, i6 i6Var) {
        super(context);
        this.f61339b = c0Var;
        this.f61338a = i6Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int left;
        c0 c0Var = this.f61339b;
        c0Var.f61355w.set(0.0f, 0.0f, getWidth(), getHeight());
        c0Var.f61354s.rewind();
        c0Var.f61354s.addRoundRect(c0Var.f61355w, g0.L(6.0f), g0.L(6.0f), Path.Direction.CW);
        super.dispatchDraw(canvas);
        c0Var.f61353r.setColor(i0.a.f(0.1f, n6.w0(n6.f29452d7, this.f61338a), -1));
        c0Var.f61353r.setStrokeWidth(g0.L(1.0f));
        float height = getHeight();
        if (c0Var.E.getVisibility() == 0) {
            f10 = 5.0f;
        } else {
            f10 = 4.0f;
        }
        float f11 = height / f10;
        for (int i7 = 1; i7 <= 4; i7++) {
            float f12 = f11 * i7;
            canvas.drawLine(0.0f, f12, getWidth(), f12, c0Var.f61353r);
        }
        if (gd.f24314a0) {
            left = c0Var.f61350e.getRight();
        } else {
            left = c0Var.f61350e.getLeft();
        }
        float f13 = left;
        canvas.drawLine(f13, 0.0f, f13, getHeight(), c0Var.f61353r);
        c0Var.f61353r.setStrokeWidth(g0.L(2.0f));
        canvas.drawPath(c0Var.f61354s, c0Var.f61353r);
    }
}
