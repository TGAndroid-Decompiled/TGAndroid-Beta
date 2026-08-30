package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.BubbleActivity;
public final class b0 extends View {
    public final Paint f41287a;
    public final Path f41288b;
    public final RectF f41289c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f41290f;
    public final Matrix h;
    public final Matrix f41291n;
    public final Matrix f41292r;
    public final c0 f41293s;

    public b0(c0 c0Var, Context context) {
        super(context);
        this.f41293s = c0Var;
        this.f41287a = new Paint(1);
        this.f41288b = new Path();
        this.f41289c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f41290f = new Matrix();
        this.h = new Matrix();
        this.f41291n = new Matrix();
        this.f41292r = new Matrix();
    }

    private float getContainerHeight() {
        float f10;
        if (!(getContext() instanceof BubbleActivity)) {
            f10 = AndroidUtilities.statusBarHeight;
        } else {
            f10 = 0.0f;
        }
        return ((getHeight() - f10) - this.f41293s.f41308f.f47255y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: ph.b0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: ph.b0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f41293s.f41313x == null) {
            return;
        }
        b(canvas, false);
    }
}
