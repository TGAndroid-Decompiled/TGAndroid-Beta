package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class wc0 implements Runnable {
    public final int f40929a;
    public final ld0 f40930b;
    public final IMapsProvider.IMapView f40931c;

    public wc0(ld0 ld0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f40929a = i10;
        this.f40930b = ld0Var;
        this.f40931c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f40929a) {
            case 0:
                ld0 ld0Var = this.f40930b;
                IMapsProvider.IMapView iMapView = this.f40931c;
                if (ld0Var.K != null && ld0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        ld0Var.K.getMapAsync(new xc0(ld0Var, 0));
                        ld0Var.f37709u0 = true;
                        if (ld0Var.f37710v0) {
                            ld0Var.K.onResume();
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
                ld0 ld0Var2 = this.f40930b;
                IMapsProvider.IMapView iMapView2 = this.f40931c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new wc0(ld0Var2, iMapView2, 0));
                return;
        }
    }
}
