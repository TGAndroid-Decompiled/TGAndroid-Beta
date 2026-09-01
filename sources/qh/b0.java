package qh;

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
    public final Paint f44934a;
    public final Path f44935b;
    public final RectF f44936c;
    public final Matrix d;
    public final Matrix f44937e;
    public final Matrix f44938f;
    public final Matrix h;
    public final Matrix f44939n;
    public final Matrix f44940r;
    public final c0 f44941s;

    public b0(c0 c0Var, Context context) {
        super(context);
        this.f44941s = c0Var;
        this.f44934a = new Paint(1);
        this.f44935b = new Path();
        this.f44936c = new RectF();
        this.d = new Matrix();
        this.f44937e = new Matrix();
        this.f44938f = new Matrix();
        this.h = new Matrix();
        this.f44939n = new Matrix();
        this.f44940r = new Matrix();
    }

    private float getContainerHeight() {
        float f10;
        if (!(getContext() instanceof BubbleActivity)) {
            f10 = AndroidUtilities.statusBarHeight;
        } else {
            f10 = 0.0f;
        }
        return ((getHeight() - f10) - this.f44941s.f45037f.f51176y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    public final void a(android.graphics.Matrix r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: qh.b0.a(android.graphics.Matrix, boolean):void");
    }

    public final void b(android.graphics.Canvas r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: qh.b0.b(android.graphics.Canvas, boolean):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f44941s.f45042x == null) {
            return;
        }
        b(canvas, false);
    }
}
