package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.BubbleActivity;
public final class a0 extends View {
    public final Paint f50905a;
    public final Path f50906b;
    public final RectF f50907c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f50908f;
    public final Matrix h;
    public final Matrix f50909n;
    public final Matrix f50910r;
    public final b0 f50911s;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f50911s = b0Var;
        this.f50905a = new Paint(1);
        this.f50906b = new Path();
        this.f50907c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f50908f = new Matrix();
        this.h = new Matrix();
        this.f50909n = new Matrix();
        this.f50910r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = org.telegram.messenger.i0.f16166m;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f50911s.f50940f.D) - org.telegram.messenger.i0.L(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - org.telegram.messenger.i0.L(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: vh.a0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: vh.a0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f50911s.f50946y == null) {
            return;
        }
        b(canvas, false);
    }
}
