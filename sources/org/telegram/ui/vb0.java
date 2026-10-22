package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class vb0 implements Runnable {
    public final int f42198a;
    public final nc0 f42199b;

    public vb0(nc0 nc0Var, int i10) {
        this.f42198a = i10;
        this.f42199b = nc0Var;
    }

    @Override
    public final void run() {
        switch (this.f42198a) {
            case 0:
                nc0 nc0Var = this.f42199b;
                IMapsProvider.ICameraUpdate iCameraUpdate = nc0Var.J;
                if (iCameraUpdate != null) {
                    nc0Var.I.moveCamera(iCameraUpdate);
                    nc0Var.J = null;
                    return;
                }
                return;
            case 1:
                nc0 nc0Var2 = this.f42199b;
                nc0Var2.getLocationController().setProximityLocation(nc0Var2.f39508e0, 0, true);
                nc0Var2.G = false;
                return;
            case 2:
                nc0 nc0Var3 = this.f42199b;
                IMapsProvider.IMap iMap = nc0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!nc0Var3.R.getRadiusSet()) {
                    double d = nc0Var3.P;
                    if (d > 0.0d) {
                        nc0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = nc0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            nc0Var3.O = null;
                        }
                    }
                }
                nc0Var3.R = null;
                return;
            case 3:
                kc0 kc0Var = this.f42199b.f39531x;
                if (kc0Var != null) {
                    kc0Var.a();
                    return;
                }
                return;
            case 4:
                nc0.V(this.f42199b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new vb0(this.f42199b, 0));
                return;
        }
    }
}
