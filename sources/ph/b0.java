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
    public final Paint f41316a;
    public final Path f41317b;
    public final RectF f41318c;
    public final Matrix d;
    public final Matrix e;
    public final Matrix f41319f;
    public final Matrix h;
    public final Matrix f41320n;
    public final Matrix f41321r;
    public final c0 f41322s;

    public b0(c0 c0Var, Context context) {
        super(context);
        this.f41322s = c0Var;
        this.f41316a = new Paint(1);
        this.f41317b = new Path();
        this.f41318c = new RectF();
        this.d = new Matrix();
        this.e = new Matrix();
        this.f41319f = new Matrix();
        this.h = new Matrix();
        this.f41320n = new Matrix();
        this.f41321r = new Matrix();
    }

    private float getContainerHeight() {
        float f10;
        if (!(getContext() instanceof BubbleActivity)) {
            f10 = AndroidUtilities.statusBarHeight;
        } else {
            f10 = 0.0f;
        }
        return ((getHeight() - f10) - this.f41322s.f41348f.f47319y) - AndroidUtilities.dp(32.0f);
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
        if (this.f41322s.f41353x == null) {
            return;
        }
        b(canvas, false);
    }
}
