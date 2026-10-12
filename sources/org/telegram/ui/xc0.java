package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class xc0 implements Runnable {
    public final int f41832a;
    public final nd0 f41833b;

    public xc0(nd0 nd0Var, int i10) {
        this.f41832a = i10;
        this.f41833b = nd0Var;
    }

    @Override
    public final void run() {
        switch (this.f41832a) {
            case 0:
                nd0 nd0Var = this.f41833b;
                IMapsProvider.ICameraUpdate iCameraUpdate = nd0Var.J;
                if (iCameraUpdate != null) {
                    nd0Var.I.moveCamera(iCameraUpdate);
                    nd0Var.J = null;
                    return;
                }
                return;
            case 1:
                nd0 nd0Var2 = this.f41833b;
                nd0Var2.getLocationController().setProximityLocation(nd0Var2.f38654e0, 0, true);
                nd0Var2.G = false;
                return;
            case 2:
                nd0 nd0Var3 = this.f41833b;
                IMapsProvider.IMap iMap = nd0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!nd0Var3.R.getRadiusSet()) {
                    double d = nd0Var3.P;
                    if (d > 0.0d) {
                        nd0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = nd0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            nd0Var3.O = null;
                        }
                    }
                }
                nd0Var3.R = null;
                return;
            case 3:
                kd0 kd0Var = this.f41833b.f38677x;
                if (kd0Var != null) {
                    kd0Var.a();
                    return;
                }
                return;
            case 4:
                nd0.V(this.f41833b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new xc0(this.f41833b, 0));
                return;
        }
    }
}
