package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class xb0 implements Runnable {
    public final int f44456a;
    public final pc0 f44457b;

    public xb0(pc0 pc0Var, int i9) {
        this.f44456a = i9;
        this.f44457b = pc0Var;
    }

    @Override
    public final void run() {
        switch (this.f44456a) {
            case 0:
                pc0 pc0Var = this.f44457b;
                IMapsProvider.ICameraUpdate iCameraUpdate = pc0Var.F;
                if (iCameraUpdate != null) {
                    pc0Var.E.moveCamera(iCameraUpdate);
                    pc0Var.F = null;
                    return;
                }
                return;
            case 1:
                pc0 pc0Var2 = this.f44457b;
                pc0Var2.getLocationController().setProximityLocation(pc0Var2.f41442a0, 0, true);
                pc0Var2.C = false;
                return;
            case 2:
                pc0 pc0Var3 = this.f44457b;
                IMapsProvider.IMap iMap = pc0Var3.E;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!pc0Var3.N.getRadiusSet()) {
                    double d = pc0Var3.L;
                    if (d > 0.0d) {
                        pc0Var3.K.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = pc0Var3.K;
                        if (iCircle != null) {
                            iCircle.remove();
                            pc0Var3.K = null;
                        }
                    }
                }
                pc0Var3.N = null;
                return;
            case 3:
                mc0 mc0Var = this.f44457b.f41472x;
                if (mc0Var != null) {
                    mc0Var.a();
                    return;
                }
                return;
            case 4:
                pc0.V(this.f44457b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new xb0(this.f44457b, 0));
                return;
        }
    }
}
