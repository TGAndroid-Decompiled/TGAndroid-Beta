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
    public final Paint f50887a;
    public final Path f50888b;
    public final RectF f50889c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f50890f;
    public final Matrix h;
    public final Matrix f50891n;
    public final Matrix f50892r;
    public final b0 f50893s;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f50893s = b0Var;
        this.f50887a = new Paint(1);
        this.f50888b = new Path();
        this.f50889c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f50890f = new Matrix();
        this.h = new Matrix();
        this.f50891n = new Matrix();
        this.f50892r = new Matrix();
    }

    private float getContainerHeight() {
        float f7;
        if (!(getContext() instanceof BubbleActivity)) {
            f7 = org.telegram.messenger.i0.f16020m;
        } else {
            f7 = 0.0f;
        }
        return ((getHeight() - f7) - this.f50893s.f50930f.D) - org.telegram.messenger.i0.L(32.0f);
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
        if (this.f50893s.f50936y == null) {
            return;
        }
        b(canvas, false);
    }
}
