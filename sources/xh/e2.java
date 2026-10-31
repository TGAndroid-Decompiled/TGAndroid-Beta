package xh;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.ui.ActionBar.p6;
public final class e2 extends org.telegram.ui.web.z0 {
    public final int T0;
    public final Object U0;

    public e2(Object obj, Context context, p6 p6Var, int i10, int i11) {
        super(i10, context, p6Var, true);
        this.T0 = i11;
        this.U0 = obj;
    }

    @Override
    public void D(boolean z10, String str) {
        String p5;
        boolean z11;
        switch (this.T0) {
            case 0:
                m2 m2Var = (m2) this.U0;
                Paint paint = m2Var.Q;
                if (z10) {
                    m2Var.m();
                    org.telegram.ui.b3 b3Var = m2Var.Y0;
                    if (m2Var.q()) {
                        p5 = m2Var.f53903w0.e;
                    } else {
                        p5 = h20.p(vp.r1(m2Var.H).Z1(Long.valueOf(m2Var.I)));
                    }
                    b3Var.a(p5, str);
                    org.telegram.ui.b3 b3Var2 = m2Var.Y0;
                    if (org.telegram.messenger.i0.B(paint.getColor()) <= 0.721f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b3Var2.b(z11, false);
                    m2Var.Y0.setBackgroundColor(paint.getColor());
                    m2Var.X0 = str;
                }
                org.telegram.ui.b3 b3Var3 = m2Var.Y0;
                m2Var.W0 = z10;
                org.telegram.messenger.i0.Y3(b3Var3, z10, 1.0f, true, false);
                invalidate();
                return;
            default:
                return;
        }
    }

    @Override
    public final void J(org.telegram.ui.web.v0 v0Var) {
        switch (this.T0) {
            case 0:
                m2 m2Var = (m2) this.U0;
                m2Var.f53904x.setWebView(v0Var);
                s0 s0Var = m2Var.C0;
                if (s0Var != null) {
                    s0Var.f54023k = v0Var;
                }
                m2Var.f53891n0.setWebView(v0Var);
                m2Var.K();
                return;
            default:
                ((i3) this.U0).J.setWebView(v0Var);
                return;
        }
    }

    @Override
    public void K(org.telegram.ui.web.v0 v0Var) {
        switch (this.T0) {
            case 0:
                m2 m2Var = (m2) this.U0;
                s0 s0Var = m2Var.C0;
                if (s0Var != null && s0Var.f54023k == v0Var) {
                    s0Var.f54023k = null;
                    s0Var.b();
                }
                m2Var.f53891n0.setWebView(null);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.T0) {
            case 1:
                if (motionEvent.getAction() == 0) {
                    i3 i3Var = (i3) this.U0;
                    if (!i3Var.P) {
                        i3Var.P = true;
                        i3Var.f53809n.Q();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
