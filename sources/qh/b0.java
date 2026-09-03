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
    public final Paint f45010a;
    public final Path f45011b;
    public final RectF f45012c;
    public final Matrix d;
    public final Matrix f45013e;
    public final Matrix f45014f;
    public final Matrix h;
    public final Matrix f45015n;
    public final Matrix f45016r;
    public final c0 f45017s;

    public b0(c0 c0Var, Context context) {
        super(context);
        this.f45017s = c0Var;
        this.f45010a = new Paint(1);
        this.f45011b = new Path();
        this.f45012c = new RectF();
        this.d = new Matrix();
        this.f45013e = new Matrix();
        this.f45014f = new Matrix();
        this.h = new Matrix();
        this.f45015n = new Matrix();
        this.f45016r = new Matrix();
    }

    private float getContainerHeight() {
        float f10;
        if (!(getContext() instanceof BubbleActivity)) {
            f10 = AndroidUtilities.statusBarHeight;
        } else {
            f10 = 0.0f;
        }
        return ((getHeight() - f10) - this.f45017s.f45132f.f51211y) - AndroidUtilities.dp(32.0f);
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
        if (this.f45017s.f45137x == null) {
            return;
        }
        b(canvas, false);
    }
}
