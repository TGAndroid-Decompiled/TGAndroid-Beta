package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class tc0 implements Runnable {
    public final int f37690a;
    public final jd0 f37691b;

    public tc0(jd0 jd0Var, int i10) {
        this.f37690a = i10;
        this.f37691b = jd0Var;
    }

    @Override
    public final void run() {
        switch (this.f37690a) {
            case 0:
                jd0 jd0Var = this.f37691b;
                IMapsProvider.ICameraUpdate iCameraUpdate = jd0Var.J;
                if (iCameraUpdate != null) {
                    jd0Var.I.moveCamera(iCameraUpdate);
                    jd0Var.J = null;
                    return;
                }
                return;
            case 1:
                jd0 jd0Var2 = this.f37691b;
                jd0Var2.getLocationController().setProximityLocation(jd0Var2.f34818e0, 0, true);
                jd0Var2.G = false;
                return;
            case 2:
                jd0 jd0Var3 = this.f37691b;
                IMapsProvider.IMap iMap = jd0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!jd0Var3.R.getRadiusSet()) {
                    double d = jd0Var3.P;
                    if (d > 0.0d) {
                        jd0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = jd0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            jd0Var3.O = null;
                        }
                    }
                }
                jd0Var3.R = null;
                return;
            case 3:
                gd0 gd0Var = this.f37691b.f34841x;
                if (gd0Var != null) {
                    gd0Var.a();
                    return;
                }
                return;
            case 4:
                jd0.W(this.f37691b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new tc0(this.f37691b, 0));
                return;
        }
    }
}
