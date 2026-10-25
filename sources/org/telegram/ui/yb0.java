package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class yb0 implements Runnable {
    public final int f46019a;
    public final pc0 f46020b;
    public final IMapsProvider.IMapView f46021c;

    public yb0(pc0 pc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f46019a = i10;
        this.f46020b = pc0Var;
        this.f46021c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f46019a) {
            case 0:
                pc0 pc0Var = this.f46020b;
                IMapsProvider.IMapView iMapView = this.f46021c;
                if (pc0Var.K != null && pc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        pc0Var.K.getMapAsync(new ac0(pc0Var, 0));
                        pc0Var.f42450t0 = true;
                        if (pc0Var.f42451u0) {
                            pc0Var.K.onResume();
                            return;
                        }
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            default:
                pc0 pc0Var2 = this.f46020b;
                IMapsProvider.IMapView iMapView2 = this.f46021c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new yb0(pc0Var2, iMapView2, 0));
                return;
        }
    }
}
