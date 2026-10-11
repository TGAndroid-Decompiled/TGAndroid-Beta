package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class rc0 implements Runnable {
    public final int f41446a;
    public final gd0 f41447b;
    public final IMapsProvider.IMapView f41448c;

    public rc0(gd0 gd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f41446a = i10;
        this.f41447b = gd0Var;
        this.f41448c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f41446a) {
            case 0:
                gd0 gd0Var = this.f41447b;
                IMapsProvider.IMapView iMapView = this.f41448c;
                if (gd0Var.K != null && gd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        gd0Var.K.getMapAsync(new sc0(gd0Var, 0));
                        gd0Var.f38074u0 = true;
                        if (gd0Var.f38075v0) {
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
                gd0 gd0Var2 = this.f41447b;
                IMapsProvider.IMapView iMapView2 = this.f41448c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new rc0(gd0Var2, iMapView2, 0));
                return;
        }
    }
}
