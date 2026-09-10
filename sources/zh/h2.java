package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import bi.rd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wr;
public final class h2 extends p {
    public final org.telegram.ui.Components.d6 d;
    public final org.telegram.ui.Components.d6 e;
    public final org.telegram.ui.Components.voip.h f48463f;
    public final org.telegram.ui.Components.d6 h;
    public final org.telegram.ui.Components.d6 f48464n;
    public boolean f48465r;
    public boolean f48466s;
    public final y2 v;
    public final u7 f48467w;
    public final a3 f48468x;

    public h2(a3 a3Var, Context context, y2 y2Var, u7 u7Var) {
        super(context);
        this.f48468x = a3Var;
        this.v = y2Var;
        this.f48467w = u7Var;
        wr wrVar = wr.f28819f;
        this.d = new org.telegram.ui.Components.d6(this, 150L, wrVar);
        this.e = new org.telegram.ui.Components.d6(this, 150L, wrVar);
        this.f48463f = new org.telegram.ui.Components.voip.h(32, 102, 240);
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(this);
        this.h = d6Var;
        org.telegram.ui.Components.d6 d6Var2 = new org.telegram.ui.Components.d6(this);
        this.f48464n = d6Var2;
        d6Var.f22297g = 500L;
        d6Var2.f22297g = 100L;
    }

    public final void b(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: zh.h2.b(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: zh.h2.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        t0 t0Var;
        a3 a3Var = this.f48468x;
        k2.v vVar = a3Var.M2;
        if (a3Var.K1 && !a3Var.f48162c3 && ((org.telegram.ui.m4) vVar.e) != null && (t0Var = (t0) vVar.f12225b) != null && t0Var.n() && ((org.telegram.ui.m4) vVar.e).dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.f48468x.f48183j1) {
            if (this.f48465r) {
                pc pcVar = pc.f26074w;
                if (pcVar != null && view == pcVar.e) {
                    if (this.f48466s) {
                        return super.drawChild(canvas, view, j3);
                    }
                    return true;
                }
                return super.drawChild(canvas, view, j3);
            }
            return super.drawChild(canvas, view, j3);
        }
        return true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48468x.f48185k1.j();
        pc.a(this, new rd(this, 9));
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f48468x;
        a3Var.f48185k1.k();
        pc.h(this);
        w2 w2Var = a3Var.Q1;
        if (w2Var != null) {
            u7 u7Var = ((l7) w2Var).d;
            u7Var.Y0 = false;
            u7Var.P();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f48468x.f48228y0.getLayoutParams();
        layoutParams.rightMargin = AndroidUtilities.dp(42.0f);
        layoutParams.topMargin = AndroidUtilities.dp(15.0f);
        super.onMeasure(i10, i11);
    }
}
