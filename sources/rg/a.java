package rg;

import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.iv0;
import qg.c;
import rh.k3;
import rh.n3;
import rh.q2;
public final class a implements c, gv0, hv0, GenericProvider {
    public final int f43447a;

    public a(int i10) {
        this.f43447a = i10;
    }

    @Override
    public void b(Object obj, float f10) {
        switch (this.f43447a) {
            case 11:
                q2 q2Var = (q2) obj;
                q2Var.f43680b = f10;
                q2Var.e.invalidate();
                q2Var.T.setAlpha(f10);
                q2Var.E();
                q2Var.C();
                return;
            case 12:
            default:
                ((n3) obj).setSwipeOffsetY(f10);
                return;
            case 13:
                ((k3) obj).setLoadProgress(f10);
                return;
        }
    }

    @Override
    public int g(f6 f6Var, boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        switch (this.f43447a) {
            case 0:
                return 855638016;
            case 1:
                return 1073741824;
            case 2:
                return j6.l1(0.075f, -16777216);
            case 3:
                int w02 = j6.w0(null, j6.G8, false);
                if (z4) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.825f;
                }
                return j6.l1(f10, w02);
            case 4:
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return b.l(f11, j6.v0(j6.f19906d6, f6Var), j6.v0(j6.Yk, f6Var));
            case 5:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return j6.l1(f12, j6.v0(j6.f19906d6, f6Var));
            case 6:
                return j6.l1(0.78f, j6.v0(j6.f19977h5, f6Var));
            case 7:
                return j6.l1(0.7f, j6.v0(j6.f19906d6, f6Var));
            case 8:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                if (LiteMode.isEnabled(262144)) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.76f;
                }
                return j6.l1(f13, j6.v0(j6.f19906d6, f6Var));
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f43447a) {
            case 10:
                return ((q2) obj).f43680b;
            case 11:
            default:
                return ((n3) obj).getSwipeOffsetY();
            case 12:
                return ((k3) obj).f43583c;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r12 = (Void) obj;
        iv0 iv0Var = n3.V;
        return Boolean.FALSE;
    }
}
