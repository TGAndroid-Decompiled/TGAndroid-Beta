package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class wb0 implements Runnable {
    public final int f42531a;
    public final nc0 f42532b;
    public final IMapsProvider.IMapView f42533c;

    public wb0(nc0 nc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f42531a = i10;
        this.f42532b = nc0Var;
        this.f42533c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f42531a) {
            case 0:
                nc0 nc0Var = this.f42532b;
                IMapsProvider.IMapView iMapView = this.f42533c;
                if (nc0Var.K != null && nc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        nc0Var.K.getMapAsync(new xb0(nc0Var, 0));
                        nc0Var.f39524u0 = true;
                        if (nc0Var.f39525v0) {
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
                nc0 nc0Var2 = this.f42532b;
                IMapsProvider.IMapView iMapView2 = this.f42533c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new wb0(nc0Var2, iMapView2, 0));
                return;
        }
    }
}
