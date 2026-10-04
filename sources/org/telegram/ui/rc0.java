package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class rc0 implements Runnable {
    public final int f40015a;
    public final gd0 f40016b;
    public final IMapsProvider.IMapView f40017c;

    public rc0(gd0 gd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f40015a = i10;
        this.f40016b = gd0Var;
        this.f40017c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f40015a) {
            case 0:
                gd0 gd0Var = this.f40016b;
                IMapsProvider.IMapView iMapView = this.f40017c;
                if (gd0Var.K != null && gd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        gd0Var.K.getMapAsync(new sc0(gd0Var, 0));
                        gd0Var.f36589u0 = true;
                        if (gd0Var.f36590v0) {
                            gd0Var.K.onResume();
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
                gd0 gd0Var2 = this.f40016b;
                IMapsProvider.IMapView iMapView2 = this.f40017c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new rc0(gd0Var2, iMapView2, 0));
                return;
        }
    }
}
