package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class rc0 implements Runnable {
    public final int f41430a;
    public final hd0 f41431b;

    public rc0(hd0 hd0Var, int i10) {
        this.f41430a = i10;
        this.f41431b = hd0Var;
    }

    @Override
    public final void run() {
        switch (this.f41430a) {
            case 0:
                hd0 hd0Var = this.f41431b;
                IMapsProvider.ICameraUpdate iCameraUpdate = hd0Var.J;
                if (iCameraUpdate != null) {
                    hd0Var.I.moveCamera(iCameraUpdate);
                    hd0Var.J = null;
                    return;
                }
                return;
            case 1:
                hd0 hd0Var2 = this.f41431b;
                hd0Var2.getLocationController().setProximityLocation(hd0Var2.f38307e0, 0, true);
                hd0Var2.G = false;
                return;
            case 2:
                hd0 hd0Var3 = this.f41431b;
                IMapsProvider.IMap iMap = hd0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!hd0Var3.R.getRadiusSet()) {
                    double d = hd0Var3.P;
                    if (d > 0.0d) {
                        hd0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = hd0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            hd0Var3.O = null;
                        }
                    }
                }
                hd0Var3.R = null;
                return;
            case 3:
                ed0 ed0Var = this.f41431b.f38330x;
                if (ed0Var != null) {
                    ed0Var.a();
                    return;
                }
                return;
            case 4:
                hd0.V(this.f41431b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new rc0(this.f41431b, 0));
                return;
        }
    }
}
