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
    public final org.telegram.ui.Components.voip.g f49003f;
    public final org.telegram.ui.Components.t5 h;
    public final org.telegram.ui.Components.t5 f49004n;
    public boolean f49005r;
    public boolean f49006s;
    public final x2 f49007w;
    public final o7 f49008x;
    public final z2 f49009y;

    public g2(z2 z2Var, Context context, x2 x2Var, o7 o7Var) {
        super(context);
        this.f49009y = z2Var;
        this.f49007w = x2Var;
        this.f49008x = o7Var;
        gr grVar = gr.f26523f;
        this.d = new org.telegram.ui.Components.t5(this, 150L, grVar);
        this.e = new org.telegram.ui.Components.t5(this, 150L, grVar);
        this.f49003f = new org.telegram.ui.Components.voip.g(32, 102, 240);
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(this);
        this.h = t5Var;
        org.telegram.ui.Components.t5 t5Var2 = new org.telegram.ui.Components.t5(this);
        this.f49004n = t5Var2;
        t5Var.f30532g = 500L;
        t5Var2.f30532g = 100L;
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
        z2 z2Var = this.f49009y;
        k2.t0 t0Var = z2Var.f49783v2;
        if (z2Var.f49774t1 && !z2Var.L2 && ((org.telegram.ui.k4) t0Var.e) != null && (s0Var = (s0) t0Var.f10767a) != null && s0Var.n() && ((org.telegram.ui.k4) t0Var.e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f49009y.S0) {
            if (this.f49005r) {
                wb wbVar = wb.f32194w;
                if (wbVar != null && view == wbVar.e) {
                    if (this.f49006s) {
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
        this.f49009y.T0.i();
        setTag(2131296351, new org.telegram.ui.Components.k7(this, 8));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f49009y;
        z2Var.T0.j();
        setTag(2131296351, null);
        v2 v2Var = z2Var.f49797z1;
        if (v2Var != null) {
            o7 o7Var = ((f7) v2Var).d;
            o7Var.Y0 = false;
            o7Var.d0();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f49009y.f49727h0.getLayoutParams();
        layoutParams.rightMargin = org.telegram.messenger.i0.L(42.0f);
        layoutParams.topMargin = org.telegram.messenger.i0.L(15.0f);
        super.onMeasure(i10, i11);
    }
}
