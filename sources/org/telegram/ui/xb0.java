package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class xb0 implements Runnable {
    public final int f45719a;
    public final pc0 f45720b;

    public xb0(pc0 pc0Var, int i10) {
        this.f45719a = i10;
        this.f45720b = pc0Var;
    }

    @Override
    public final void run() {
        switch (this.f45719a) {
            case 0:
                pc0 pc0Var = this.f45720b;
                IMapsProvider.ICameraUpdate iCameraUpdate = pc0Var.J;
                if (iCameraUpdate != null) {
                    pc0Var.I.moveCamera(iCameraUpdate);
                    pc0Var.J = null;
                    return;
                }
                return;
            case 1:
                pc0 pc0Var2 = this.f45720b;
                pc0Var2.getLocationController().setProximityLocation(pc0Var2.f42435e0, 0, true);
                pc0Var2.G = false;
                return;
            case 2:
                pc0 pc0Var3 = this.f45720b;
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
                mc0 mc0Var = this.f45720b.f42458x;
                if (mc0Var != null) {
                    mc0Var.a();
                    return;
                }
                return;
            case 4:
                pc0.W(this.f45720b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new xb0(this.f45720b, 0));
                return;
        }
    }
}
