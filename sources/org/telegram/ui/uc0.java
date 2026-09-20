package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class uc0 implements Runnable {
    public final int f38056a;
    public final kd0 f38057b;

    public uc0(kd0 kd0Var, int i10) {
        this.f38056a = i10;
        this.f38057b = kd0Var;
    }

    @Override
    public final void run() {
        switch (this.f38056a) {
            case 0:
                kd0 kd0Var = this.f38057b;
                IMapsProvider.ICameraUpdate iCameraUpdate = kd0Var.J;
                if (iCameraUpdate != null) {
                    kd0Var.I.moveCamera(iCameraUpdate);
                    kd0Var.J = null;
                    return;
                }
                return;
            case 1:
                kd0 kd0Var2 = this.f38057b;
                kd0Var2.getLocationController().setProximityLocation(kd0Var2.f35100e0, 0, true);
                kd0Var2.G = false;
                return;
            case 2:
                kd0 kd0Var3 = this.f38057b;
                IMapsProvider.IMap iMap = kd0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!kd0Var3.R.getRadiusSet()) {
                    double d = kd0Var3.P;
                    if (d > 0.0d) {
                        kd0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = kd0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            kd0Var3.O = null;
                        }
                    }
                }
                kd0Var3.R = null;
                return;
            case 3:
                hd0 hd0Var = this.f38057b.f35123x;
                if (hd0Var != null) {
                    hd0Var.a();
                    return;
                }
                return;
            case 4:
                kd0.W(this.f38057b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new uc0(this.f38057b, 0));
                return;
        }
    }
}
