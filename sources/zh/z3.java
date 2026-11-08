package zh;

import android.graphics.Canvas;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import bi.ec;
import org.telegram.ui.Components.pj0;
public final class z3 extends v4.m0 {
    public final PointF f60633a = new PointF();
    public final a4 f60634b;

    public z3(a4 a4Var) {
        this.f60634b = a4Var;
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        float f10;
        ec ecVar;
        float height = recyclerView.getHeight();
        float width = recyclerView.getWidth();
        a4 a4Var = this.f60634b;
        v3 v3Var = a4Var.f60217l2;
        u3 u3Var = a4Var.Z1;
        pj0 pj0Var = a4Var.f36277k1;
        PointF pointF = this.f60633a;
        float f11 = 0.0f;
        if (jh.k.b(u3Var, pj0Var, pointF)) {
            float f12 = pointF.x;
            height = Math.min(height, pointF.y);
            f11 = Math.max(0.0f, pointF.y + u3Var.getMeasuredHeight());
            f10 = f12;
            width = u3Var.getMeasuredWidth() + f12;
        } else {
            f10 = 0.0f;
        }
        if (jh.k.b(v3Var, pj0Var, pointF)) {
            height = Math.min(height, pointF.y);
            f11 = Math.max(f11, pointF.y + v3Var.getMeasuredHeight() + org.telegram.messenger.g0.L(12.0f));
        }
        if (height < f11 && (ecVar = u3Var.L) != null) {
            float height2 = (f11 - height) / ecVar.getHeight();
            canvas.save();
            canvas.clipRect(f10, height, width, f11);
            canvas.translate(f10, height);
            canvas.scale(height2, height2);
            u3Var.L.draw(canvas);
            canvas.restore();
        }
    }
}
