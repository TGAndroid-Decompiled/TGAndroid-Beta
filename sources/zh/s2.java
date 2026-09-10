package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kj0;
public final class s2 implements Utilities.Callback4 {
    public final int f48860a;
    public final v2 f48861b;
    public final y2 f48862c;

    public s2(v2 v2Var, y2 y2Var, int i10) {
        this.f48860a = i10;
        this.f48861b = v2Var;
        this.f48862c = y2Var;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f48860a) {
            case 0:
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                long currentTimeMillis = System.currentTimeMillis();
                a3 a3Var = this.f48861b.f48986l;
                k2.v vVar = a3Var.M2;
                t7 t7Var = (t7) vVar.f12226c;
                if (t7Var == null) {
                    ((l7) a3Var.Q1).g(false);
                    a3Var.setActive(true);
                    a3Var.U3 = false;
                    a3Var.f48180i1 = new org.telegram.tgnet.f(2, runnable);
                    if (bool.booleanValue()) {
                        a3Var.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable, 400L);
                    return;
                }
                t7Var.firstFrameRendered = false;
                vVar.f12224a = false;
                t7Var.setOnReadyListener(new n1(1, currentTimeMillis, runnable));
                ((l7) a3Var.Q1).g(false);
                kj0 kj0Var = a3Var.f48231z0;
                if (kj0Var != null) {
                    kj0Var.setAnimation(this.f48862c.f49090u);
                }
                if (a3Var.R2 > 0 && l4.longValue() > a3Var.R2 - 1400) {
                    l4 = 0L;
                }
                a3Var.T0(l4.longValue(), true);
                a3Var.U3 = false;
                AndroidUtilities.runOnUIThread(runnable, 400L);
                if (bool.booleanValue()) {
                    a3Var.f1(false);
                    return;
                }
                return;
            default:
                Long l11 = (Long) obj;
                Runnable runnable2 = (Runnable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Long l12 = (Long) obj4;
                long currentTimeMillis2 = System.currentTimeMillis();
                a3 a3Var2 = this.f48861b.f48986l;
                k2.v vVar2 = a3Var2.M2;
                t7 t7Var2 = (t7) vVar2.f12226c;
                if (t7Var2 == null) {
                    ((l7) a3Var2.Q1).g(false);
                    a3Var2.setActive(true);
                    a3Var2.U3 = false;
                    a3Var2.f48180i1 = new org.telegram.tgnet.f(3, runnable2);
                    if (bool2.booleanValue()) {
                        a3Var2.f1(false);
                    }
                    AndroidUtilities.runOnUIThread(runnable2, 400L);
                    return;
                }
                t7Var2.firstFrameRendered = false;
                vVar2.f12224a = false;
                t7Var2.setOnReadyListener(new n1(2, currentTimeMillis2, runnable2));
                ((l7) a3Var2.Q1).g(false);
                kj0 kj0Var2 = a3Var2.f48231z0;
                if (kj0Var2 != null) {
                    kj0Var2.setAnimation(this.f48862c.f49090u);
                }
                if (a3Var2.R2 > 0 && l11.longValue() > a3Var2.R2 - 1400) {
                    l11 = 0L;
                }
                a3Var2.T0(l11.longValue(), true);
                a3Var2.U3 = false;
                AndroidUtilities.runOnUIThread(runnable2, 400L);
                if (bool2.booleanValue()) {
                    a3Var2.f1(false);
                    return;
                }
                return;
        }
    }
}
