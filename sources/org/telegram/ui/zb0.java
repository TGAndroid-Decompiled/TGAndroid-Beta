package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class zb0 implements Runnable {
    public final int f45127a;
    public final rc0 f45128b;

    public zb0(rc0 rc0Var, int i10) {
        this.f45127a = i10;
        this.f45128b = rc0Var;
    }

    @Override
    public final void run() {
        switch (this.f45127a) {
            case 0:
                rc0 rc0Var = this.f45128b;
                IMapsProvider.ICameraUpdate iCameraUpdate = rc0Var.F;
                if (iCameraUpdate != null) {
                    rc0Var.E.moveCamera(iCameraUpdate);
                    rc0Var.F = null;
                    return;
                }
                return;
            case 1:
                rc0 rc0Var2 = this.f45128b;
                rc0Var2.getLocationController().setProximityLocation(rc0Var2.f42033a0, 0, true);
                rc0Var2.C = false;
                return;
            case 2:
                rc0 rc0Var3 = this.f45128b;
                IMapsProvider.IMap iMap = rc0Var3.E;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!rc0Var3.N.getRadiusSet()) {
                    double d = rc0Var3.L;
                    if (d > 0.0d) {
                        rc0Var3.K.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = rc0Var3.K;
                        if (iCircle != null) {
                            iCircle.remove();
                            rc0Var3.K = null;
                        }
                    }
                }
                rc0Var3.N = null;
                return;
            case 3:
                oc0 oc0Var = this.f45128b.f42063x;
                if (oc0Var != null) {
                    oc0Var.a();
                    return;
                }
                return;
            case 4:
                rc0.W(this.f45128b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new zb0(this.f45128b, 0));
                return;
        }
    }
}
