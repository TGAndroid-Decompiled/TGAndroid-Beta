package th;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.wb;
public final class g2 extends p {
    public final org.telegram.ui.Components.t5 d;
    public final org.telegram.ui.Components.t5 e;
    public final org.telegram.ui.Components.voip.g f48989f;
    public final org.telegram.ui.Components.t5 h;
    public final org.telegram.ui.Components.t5 f48990n;
    public boolean f48991r;
    public boolean f48992s;
    public final x2 f48993w;
    public final o7 f48994x;
    public final z2 f48995y;

    public g2(z2 z2Var, Context context, x2 x2Var, o7 o7Var) {
        super(context);
        this.f48995y = z2Var;
        this.f48993w = x2Var;
        this.f48994x = o7Var;
        gr grVar = gr.f26495f;
        this.d = new org.telegram.ui.Components.t5(this, 150L, grVar);
        this.e = new org.telegram.ui.Components.t5(this, 150L, grVar);
        this.f48989f = new org.telegram.ui.Components.voip.g(32, 102, 240);
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(this);
        this.h = t5Var;
        org.telegram.ui.Components.t5 t5Var2 = new org.telegram.ui.Components.t5(this);
        this.f48990n = t5Var2;
        t5Var.f30447g = 500L;
        t5Var2.f30447g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: th.g2.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: th.g2.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        s0 s0Var;
        z2 z2Var = this.f48995y;
        k2.t0 t0Var = z2Var.f49769v2;
        if (z2Var.f49760t1 && !z2Var.L2 && ((org.telegram.ui.k4) t0Var.e) != null && (s0Var = (s0) t0Var.f10766a) != null && s0Var.n() && ((org.telegram.ui.k4) t0Var.e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f48995y.S0) {
            if (this.f48991r) {
                wb wbVar = wb.f32128w;
                if (wbVar != null && view == wbVar.e) {
                    if (this.f48992s) {
                        return super.drawChild(canvas, view, j10);
                    }
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            }
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48995y.T0.i();
        setTag(2131296351, new org.telegram.ui.Components.k7(this, 8));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f48995y;
        z2Var.T0.j();
        setTag(2131296351, null);
        v2 v2Var = z2Var.f49783z1;
        if (v2Var != null) {
            o7 o7Var = ((f7) v2Var).d;
            o7Var.Y0 = false;
            o7Var.d0();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f48995y.f49713h0.getLayoutParams();
        layoutParams.rightMargin = org.telegram.messenger.i0.L(42.0f);
        layoutParams.topMargin = org.telegram.messenger.i0.L(15.0f);
        super.onMeasure(i10, i11);
    }
}
