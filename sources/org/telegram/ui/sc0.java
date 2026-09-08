package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.IMapsProvider;
public final class sc0 implements Runnable {
    public final int f40438a;
    public final id0 f40439b;

    public sc0(id0 id0Var, int i10) {
        this.f40438a = i10;
        this.f40439b = id0Var;
    }

    @Override
    public final void run() {
        switch (this.f40438a) {
            case 0:
                id0 id0Var = this.f40439b;
                IMapsProvider.ICameraUpdate iCameraUpdate = id0Var.J;
                if (iCameraUpdate != null) {
                    id0Var.I.moveCamera(iCameraUpdate);
                    id0Var.J = null;
                    return;
                }
                return;
            case 1:
                id0 id0Var2 = this.f40439b;
                id0Var2.getLocationController().setProximityLocation(id0Var2.f37338e0, 0, true);
                id0Var2.G = false;
                return;
            case 2:
                id0 id0Var3 = this.f40439b;
                IMapsProvider.IMap iMap = id0Var3.I;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                if (!id0Var3.R.getRadiusSet()) {
                    double d = id0Var3.P;
                    if (d > 0.0d) {
                        id0Var3.O.setRadius(d);
                    } else {
                        IMapsProvider.ICircle iCircle = id0Var3.O;
                        if (iCircle != null) {
                            iCircle.remove();
                            id0Var3.O = null;
                        }
                    }
                }
                id0Var3.R = null;
                return;
            case 3:
                fd0 fd0Var = this.f40439b.f37361x;
                if (fd0Var != null) {
                    fd0Var.a();
                    return;
                }
                return;
            case 4:
                id0.W(this.f40439b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new sc0(this.f40439b, 0));
                return;
        }
    }
}
