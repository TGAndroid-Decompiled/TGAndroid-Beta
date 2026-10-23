package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class wb0 implements Runnable {
    public final int f42535a;
    public final nc0 f42536b;
    public final IMapsProvider.IMapView f42537c;

    public wb0(nc0 nc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f42535a = i10;
        this.f42536b = nc0Var;
        this.f42537c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f42535a) {
            case 0:
                nc0 nc0Var = this.f42536b;
                IMapsProvider.IMapView iMapView = this.f42537c;
                if (nc0Var.K != null && nc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        nc0Var.K.getMapAsync(new xb0(nc0Var, 0));
                        nc0Var.f39528u0 = true;
                        if (nc0Var.f39529v0) {
                            nc0Var.K.onResume();
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
                nc0 nc0Var2 = this.f42536b;
                IMapsProvider.IMapView iMapView2 = this.f42537c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new wb0(nc0Var2, iMapView2, 0));
                return;
        }
    }
}
