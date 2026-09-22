package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class vc0 implements Runnable {
    public final int f38537a;
    public final kd0 f38538b;
    public final IMapsProvider.IMapView f38539c;

    public vc0(kd0 kd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f38537a = i10;
        this.f38538b = kd0Var;
        this.f38539c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f38537a) {
            case 0:
                kd0 kd0Var = this.f38538b;
                IMapsProvider.IMapView iMapView = this.f38539c;
                if (kd0Var.K != null && kd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        kd0Var.K.getMapAsync(new wc0(kd0Var, 0));
                        kd0Var.f35141u0 = true;
                        if (kd0Var.f35142v0) {
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
                kd0 kd0Var2 = this.f38538b;
                IMapsProvider.IMapView iMapView2 = this.f38539c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new vc0(kd0Var2, iMapView2, 0));
                return;
        }
    }
}
