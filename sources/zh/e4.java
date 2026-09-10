package zh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class e4 extends FrameLayout implements r0.m {
    public final b2.q0 f48380a;
    public final g4 f48381b;

    public e4(g4 g4Var, Context context) {
        super(context);
        this.f48381b = g4Var;
        this.f48380a = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        g4 g4Var = this.f48381b;
        u7 u7Var = g4Var.f48445r;
        if (g4Var.f48448x <= 0) {
            float f7 = u7Var.f48929e0;
            float f10 = g4Var.f48442c;
            if (f7 < f10 && i11 > 0) {
                float f11 = f7 + i11;
                iArr[1] = i11;
                if (f11 <= f10) {
                    f10 = f11;
                }
                g4Var.setOffset(f10);
                u7Var.f48929e0 = f10;
                a3 currentPeerView = u7Var.f48947n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                j7 j7Var = u7Var.v;
                if (j7Var != null) {
                    j7Var.invalidate();
                }
            }
        }
    }

    @Override
    public final void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        g4 g4Var = this.f48381b;
        u7 u7Var = g4Var.f48445r;
        if (g4Var.f48448x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = u7Var.f48929e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            g4Var.setOffset(f7);
            u7Var.f48929e0 = f7;
            a3 currentPeerView = u7Var.f48947n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            j7 j7Var = u7Var.v;
            if (j7Var != null) {
                j7Var.invalidate();
            }
        }
    }

    @Override
    public final void n(int i10, View view) {
        this.f48380a.f1896a = 0;
    }

    @Override
    public final boolean o(View view, View view2, int i10, int i11) {
        if (this.f48381b.f48448x <= 0 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void r(View view, View view2, int i10, int i11) {
        this.f48380a.f1896a = i10;
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
