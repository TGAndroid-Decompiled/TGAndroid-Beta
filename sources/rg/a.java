package rg;

import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.iv0;
import qg.c;
import rh.j3;
import rh.m3;
import rh.p2;
public final class a implements c, gv0, hv0, GenericProvider {
    public final int f43515a;

    public a(int i10) {
        this.f43515a = i10;
    }

    @Override
    public void b(Object obj, float f10) {
        switch (this.f43515a) {
            case 12:
                p2 p2Var = (p2) obj;
                p2Var.f43732b = f10;
                p2Var.e.invalidate();
                p2Var.T.setAlpha(f10);
                p2Var.E();
                p2Var.C();
                return;
            case 13:
            default:
                ((m3) obj).setSwipeOffsetY(f10);
                return;
            case 14:
                ((j3) obj).setLoadProgress(f10);
                return;
        }
    }

    @Override
    public int f(f6 f6Var, boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        switch (this.f43515a) {
            case 0:
                return 855638016;
            case 1:
                return 1073741824;
            case 2:
                return j6.l1(0.075f, -16777216);
            case 3:
                return j6.l1(0.88f, j6.v0(j6.f19881d6, f6Var));
            case 4:
                int w02 = j6.w0(null, j6.G8, false);
                if (z4) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.825f;
                }
                return j6.l1(f10, w02);
            case 5:
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return b.m(f11, j6.v0(j6.f19881d6, f6Var), j6.v0(j6.Yk, f6Var));
            case 6:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return j6.l1(f12, j6.v0(j6.f19881d6, f6Var));
            case 7:
                return j6.l1(0.78f, j6.v0(j6.f19952h5, f6Var));
            case 8:
                return j6.l1(0.7f, j6.v0(j6.f19881d6, f6Var));
            case 9:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                if (LiteMode.isEnabled(262144)) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.76f;
                }
                return j6.l1(f13, j6.v0(j6.f19881d6, f6Var));
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f43515a) {
            case 11:
                return ((p2) obj).f43732b;
            case 12:
            default:
                return ((m3) obj).getSwipeOffsetY();
            case 13:
                return ((j3) obj).f43635c;
        }
    }

    @Override
    public Object provide(Object obj) {
        Void r12 = (Void) obj;
        iv0 iv0Var = m3.V;
        return Boolean.FALSE;
    }
}
