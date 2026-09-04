package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class tc0 implements Runnable {
    public final int f40712a;
    public final id0 f40713b;
    public final IMapsProvider.IMapView f40714c;

    public tc0(id0 id0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f40712a = i10;
        this.f40713b = id0Var;
        this.f40714c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f40712a) {
            case 0:
                id0 id0Var = this.f40713b;
                IMapsProvider.IMapView iMapView = this.f40714c;
                if (id0Var.K != null && id0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        id0Var.K.getMapAsync(new uc0(id0Var, 0));
                        id0Var.f37330u0 = true;
                        if (id0Var.f37331v0) {
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
                id0 id0Var2 = this.f40713b;
                IMapsProvider.IMapView iMapView2 = this.f40714c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new tc0(id0Var2, iMapView2, 0));
                return;
        }
    }
}
