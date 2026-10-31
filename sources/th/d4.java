package th;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
public final class d4 extends FrameLayout implements r0.l {
    public final ac.g f48874a;
    public final f4 f48875b;

    public d4(f4 f4Var, Context context) {
        super(context);
        this.f48875b = f4Var;
        this.f48874a = new Object();
    }

    @Override
    public final void k(int i10, View view) {
        this.f48874a.f385a = 0;
    }

    @Override
    public final void l(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        f4 f4Var = this.f48875b;
        o7 o7Var = f4Var.f48966r;
        if (f4Var.f48970y <= 0 && i13 != 0 && i11 == 0) {
            float f7 = o7Var.f49301e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            f4Var.setOffset(f7);
            o7Var.f49301e0 = f7;
            z2 currentPeerView = o7Var.f49319n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            d7 d7Var = o7Var.f49339w;
            if (d7Var != null) {
                d7Var.invalidate();
            }
        }
    }

    @Override
    public final boolean n(View view, View view2, int i10, int i11) {
        if (this.f48875b.f48970y <= 0 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void q(View view, View view2, int i10, int i11) {
        this.f48874a.f385a = i10;
    }

    @Override
    public final void s(View view, int i10, int i11, int[] iArr, int i12) {
        f4 f4Var = this.f48875b;
        o7 o7Var = f4Var.f48966r;
        if (f4Var.f48970y <= 0) {
            float f7 = o7Var.f49301e0;
            float f10 = f4Var.f48963c;
            if (f7 < f10 && i11 > 0) {
                float f11 = f7 + i11;
                iArr[1] = i11;
                if (f11 <= f10) {
                    f10 = f11;
                }
                f4Var.setOffset(f10);
                o7Var.f49301e0 = f10;
                z2 currentPeerView = o7Var.f49319n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                d7 d7Var = o7Var.f49339w;
                if (d7Var != null) {
                    d7Var.invalidate();
                }
            }
        }
    }

    @Override
    public final void m(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
