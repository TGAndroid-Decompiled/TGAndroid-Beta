package vh;

import android.view.View;
import org.telegram.messenger.rg;
public final class h3 extends k7.x5 {
    public final p3 f45918a;
    public final r3 f45919b;

    public h3(r3 r3Var, p3 p3Var) {
        this.f45919b = r3Var;
        this.f45918a = p3Var;
    }

    @Override
    public final void a(boolean z4) {
        this.f45918a.n();
        r3 r3Var = this.f45919b;
        if (z4) {
            f3 f3Var = r3Var.f46124k3;
            r3Var.f46128m3 = f3Var.G0;
            r3Var.f46130n3 = f3Var.H0;
            r3Var.f46132o3 = f3Var.I0;
            r3Var.setEditTextsLocked(true);
            r3Var.n3();
            r3Var.V2();
            return;
        }
        final int i10 = r3Var.f46128m3;
        final int i11 = r3Var.f46130n3;
        final int i12 = r3Var.f46132o3;
        r3Var.f46128m3 = -1;
        r3Var.f46130n3 = -1;
        r3Var.f46132o3 = 0;
        boolean z10 = r3Var.f46134p3;
        final float f10 = r3Var.f46135q3;
        final float f11 = r3Var.f46136r3;
        r3Var.f46134p3 = false;
        r3Var.setEditTextsLocked(false);
        r3Var.V2();
        if (z10) {
            r3Var.post(new Runnable() {
                @Override
                public final void run() {
                    r3 r3Var2 = h3.this.f45919b;
                    for (int i13 = 0; i13 < r3Var2.getChildCount(); i13++) {
                        View childAt = r3Var2.getChildAt(i13);
                        boolean z11 = childAt instanceof v5;
                        float f12 = f10;
                        float f13 = f11;
                        if (z11) {
                            v5 v5Var = (v5) childAt;
                            if (!r3.h4(v5Var.getEditText(), f12, f13)) {
                                if (v5Var.n() && r3.h4(v5Var.getAuthorEditText(), f12, f13)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof i0) {
                            if (r3.h4(((i0) childAt).getCaptionEditText(), f12, f13)) {
                                return;
                            }
                        } else if ((childAt instanceof q0) && r3.h4(((q0) childAt).getEditText(), f12, f13)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        r3.K1(r3Var2, i14, i12, i11);
                    }
                }
            });
        } else if (i10 >= 0) {
            r3Var.post(new rg(this, i10, i12, i11, 3));
        } else {
            View findFocus = r3Var.findFocus();
            if (findFocus instanceof d1) {
                r3Var.post(new y0((d1) findFocus, 2));
            }
        }
    }
}
