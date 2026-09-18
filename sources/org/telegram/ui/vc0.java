package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class vc0 implements Runnable {
    public final int f38391a;
    public final kd0 f38392b;
    public final IMapsProvider.IMapView f38393c;

    public vc0(kd0 kd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f38391a = i10;
        this.f38392b = kd0Var;
        this.f38393c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f38391a) {
            case 0:
                kd0 kd0Var = this.f38392b;
                IMapsProvider.IMapView iMapView = this.f38393c;
                if (kd0Var.K != null && kd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        kd0Var.K.getMapAsync(new wc0(kd0Var, 0));
                        kd0Var.f35245u0 = true;
                        if (kd0Var.f35246v0) {
                            kd0Var.K.onResume();
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
                kd0 kd0Var2 = this.f38392b;
                IMapsProvider.IMapView iMapView2 = this.f38393c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new vc0(kd0Var2, iMapView2, 0));
                return;
        }
    }
}
