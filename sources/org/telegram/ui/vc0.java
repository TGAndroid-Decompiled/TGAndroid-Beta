package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class vc0 implements Runnable {
    public final int f40673a;
    public final ld0 f40674b;

    public vc0(ld0 ld0Var, int i10) {
        this.f40673a = i10;
        this.f40674b = ld0Var;
    }

    @Override
    public final void run() {
        switch (this.f40673a) {
            case 0:
                ld0 ld0Var = this.f40674b;
                IMapsProvider.ICameraUpdate iCameraUpdate = ld0Var.J;
                if (iCameraUpdate != null) {
                    ld0Var.I.moveCamera(iCameraUpdate);
                    ld0Var.J = null;
                    return;
                }
                return;
            case 1:
                ld0 ld0Var2 = this.f40674b;
                ld0Var2.getLocationController().setProximityLocation(ld0Var2.f37690e0, 0, true);
                ld0Var2.G = false;
                return;
            case 2:
                ld0 ld0Var3 = this.f40674b;
                IMapsProvider.IMap iMap = ld0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!ld0Var3.R.getRadiusSet()) {
                    double d = ld0Var3.P;
                    if (d > 0.0d) {
                        ld0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = ld0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            ld0Var3.O = null;
                        }
                    }
                }
                ld0Var3.R = null;
                return;
            case 3:
                id0 id0Var = this.f40674b.f37713x;
                if (id0Var != null) {
                    id0Var.a();
                    return;
                }
                return;
            case 4:
                ld0.V(this.f40674b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new vc0(this.f40674b, 0));
                return;
        }
    }
}
