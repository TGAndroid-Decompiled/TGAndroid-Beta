package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class zb0 implements Runnable {
    public final int f44057a;
    public final rc0 f44058b;

    public zb0(rc0 rc0Var, int i10) {
        this.f44057a = i10;
        this.f44058b = rc0Var;
    }

    @Override
    public final void run() {
        switch (this.f44057a) {
            case 0:
                rc0 rc0Var = this.f44058b;
                IMapsProvider.ICameraUpdate iCameraUpdate = rc0Var.J;
                if (iCameraUpdate != null) {
                    rc0Var.I.moveCamera(iCameraUpdate);
                    rc0Var.J = null;
                    return;
                }
                return;
            case 1:
                rc0 rc0Var2 = this.f44058b;
                rc0Var2.getLocationController().setProximityLocation(rc0Var2.f41099e0, 0, true);
                rc0Var2.G = false;
                return;
            case 2:
                rc0 rc0Var3 = this.f44058b;
                IMapsProvider.IMap iMap = rc0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!rc0Var3.R.getRadiusSet()) {
                    double d = rc0Var3.P;
                    if (d > 0.0d) {
                        rc0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = rc0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            rc0Var3.O = null;
                        }
                    }
                }
                rc0Var3.R = null;
                return;
            case 3:
                oc0 oc0Var = this.f44058b.f41122x;
                if (oc0Var != null) {
                    oc0Var.a();
                    return;
                }
                return;
            case 4:
                rc0.V(this.f44058b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new zb0(this.f44058b, 0));
                return;
        }
    }
}
