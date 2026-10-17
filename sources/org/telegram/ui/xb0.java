package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class xb0 implements Runnable {
    public final int f43077a;
    public final pc0 f43078b;

    public xb0(pc0 pc0Var, int i10) {
        this.f43077a = i10;
        this.f43078b = pc0Var;
    }

    @Override
    public final void run() {
        switch (this.f43077a) {
            case 0:
                pc0 pc0Var = this.f43078b;
                IMapsProvider.ICameraUpdate iCameraUpdate = pc0Var.J;
                if (iCameraUpdate != null) {
                    pc0Var.I.moveCamera(iCameraUpdate);
                    pc0Var.J = null;
                    return;
                }
                return;
            case 1:
                pc0 pc0Var2 = this.f43078b;
                pc0Var2.getLocationController().setProximityLocation(pc0Var2.f40044e0, 0, true);
                pc0Var2.G = false;
                return;
            case 2:
                pc0 pc0Var3 = this.f43078b;
                IMapsProvider.IMap iMap = pc0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!pc0Var3.R.getRadiusSet()) {
                    double d = pc0Var3.P;
                    if (d > 0.0d) {
                        pc0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = pc0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            pc0Var3.O = null;
                        }
                    }
                }
                pc0Var3.R = null;
                return;
            case 3:
                mc0 mc0Var = this.f43078b.f40067x;
                if (mc0Var != null) {
                    mc0Var.a();
                    return;
                }
                return;
            case 4:
                pc0.V(this.f43078b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new xb0(this.f43078b, 0));
                return;
        }
    }
}
