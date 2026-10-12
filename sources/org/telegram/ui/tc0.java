package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class tc0 implements Runnable {
    public final int f42158a;
    public final id0 f42159b;
    public final IMapsProvider.IMapView f42160c;

    public tc0(id0 id0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f42158a = i10;
        this.f42159b = id0Var;
        this.f42160c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f42158a) {
            case 0:
                id0 id0Var = this.f42159b;
                IMapsProvider.IMapView iMapView = this.f42160c;
                if (id0Var.K != null && id0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        id0Var.K.getMapAsync(new uc0(id0Var, 0));
                        id0Var.f38869u0 = true;
                        if (id0Var.f38870v0) {
                            id0Var.K.onResume();
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
                id0 id0Var2 = this.f42159b;
                IMapsProvider.IMapView iMapView2 = this.f42160c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new tc0(id0Var2, iMapView2, 0));
                return;
        }
    }
}
