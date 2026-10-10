package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class sc0 implements Runnable {
    public final int f41713a;
    public final hd0 f41714b;
    public final IMapsProvider.IMapView f41715c;

    public sc0(hd0 hd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f41713a = i10;
        this.f41714b = hd0Var;
        this.f41715c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f41713a) {
            case 0:
                hd0 hd0Var = this.f41714b;
                IMapsProvider.IMapView iMapView = this.f41715c;
                if (hd0Var.K != null && hd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        hd0Var.K.getMapAsync(new tc0(hd0Var, 0));
                        hd0Var.f38326u0 = true;
                        if (hd0Var.f38327v0) {
                            hd0Var.K.onResume();
                            return;
                        }
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            default:
                hd0 hd0Var2 = this.f41714b;
                IMapsProvider.IMapView iMapView2 = this.f41715c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new sc0(hd0Var2, iMapView2, 0));
                return;
        }
    }
}
