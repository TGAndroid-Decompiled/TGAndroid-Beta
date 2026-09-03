package s0;

import com.google.firebase.datatransport.TransportRegistrar;
import org.telegram.messenger.LiteMode;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class b implements c9.e, rg.c {
    public final int f46873a;

    public b(int i10) {
        this.f46873a = i10;
    }

    @Override
    public Object e0(c5.j jVar) {
        return TransportRegistrar.a(jVar);
    }

    @Override
    public int g(g6 g6Var, boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f46873a) {
            case 18:
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return sg.b.m(f10, k6.v0(k6.f21661d6, g6Var), k6.v0(k6.Sd, g6Var));
            case 19:
                if (!LiteMode.isEnabled(256)) {
                    return k6.w0(null, k6.G8, false);
                }
                int w02 = k6.w0(null, k6.G8, false);
                if (z4) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.825f;
                }
                return k6.l1(f11, w02);
            case 20:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return sg.b.m(f12, k6.v0(k6.f21661d6, g6Var), k6.v0(k6.Zk, g6Var));
            case 21:
                if (LiteMode.isEnabled(262144)) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.76f;
                }
                return k6.l1(f13, k6.v0(k6.Fi, g6Var));
            case 22:
                return 855638016;
            case 23:
                return 1073741824;
            case 24:
                return k6.l1(0.075f, -16777216);
            case 25:
                return k6.l1(0.88f, k6.v0(k6.f21661d6, g6Var));
            case 26:
                int w03 = k6.w0(null, k6.G8, false);
                if (z4) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.825f;
                }
                return k6.l1(f14, w03);
            case 27:
                if (LiteMode.isEnabled(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.76f;
                }
                return sg.b.m(f15, k6.v0(k6.f21661d6, g6Var), k6.v0(k6.Yk, g6Var));
            case 28:
                if (LiteMode.isEnabled(262144)) {
                    f16 = 0.85f;
                } else {
                    f16 = 0.76f;
                }
                return k6.l1(f16, k6.v0(k6.f21661d6, g6Var));
            default:
                return k6.l1(0.78f, k6.v0(k6.f21733h5, g6Var));
        }
    }
}
