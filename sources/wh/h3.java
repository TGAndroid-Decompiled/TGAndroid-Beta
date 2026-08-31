package wh;

import android.view.View;
import org.telegram.messenger.rg;
public final class h3 extends k7.y5 {
    public final p3 f49770a;
    public final r3 f49771b;

    public h3(r3 r3Var, p3 p3Var) {
        this.f49771b = r3Var;
        this.f49770a = p3Var;
    }

    @Override
    public final void a(boolean z4) {
        this.f49770a.q();
        r3 r3Var = this.f49771b;
        if (z4) {
            f3 f3Var = r3Var.f49991k3;
            r3Var.f49995m3 = f3Var.G0;
            r3Var.f49997n3 = f3Var.H0;
            r3Var.f49999o3 = f3Var.I0;
            r3Var.setEditTextsLocked(true);
            r3Var.n3();
            r3Var.V2();
            return;
        }
        final int i10 = r3Var.f49995m3;
        final int i11 = r3Var.f49997n3;
        final int i12 = r3Var.f49999o3;
        r3Var.f49995m3 = -1;
        r3Var.f49997n3 = -1;
        r3Var.f49999o3 = 0;
        boolean z10 = r3Var.f50001p3;
        final float f10 = r3Var.f50002q3;
        final float f11 = r3Var.f50003r3;
        r3Var.f50001p3 = false;
        r3Var.setEditTextsLocked(false);
        r3Var.V2();
        if (z10) {
            r3Var.post(new Runnable() {
                @Override
                public final void run() {
                    r3 r3Var2 = h3.this.f49771b;
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
                        } else if (childAt instanceof j0) {
                            if (r3.h4(((j0) childAt).getCaptionEditText(), f12, f13)) {
                                return;
                            }
                        } else if ((childAt instanceof r0) && r3.h4(((r0) childAt).getEditText(), f12, f13)) {
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
            if (findFocus instanceof e1) {
                r3Var.post(new z0((e1) findFocus, 2));
            }
        }
    }
}
