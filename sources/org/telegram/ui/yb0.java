package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class yb0 implements Runnable {
    public final int f44812a;
    public final pc0 f44813b;
    public final IMapsProvider.IMapView f44814c;

    public yb0(pc0 pc0Var, IMapsProvider.IMapView iMapView, int i9) {
        this.f44812a = i9;
        this.f44813b = pc0Var;
        this.f44814c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f44812a) {
            case 0:
                pc0 pc0Var = this.f44813b;
                IMapsProvider.IMapView iMapView = this.f44814c;
                if (pc0Var.G != null && pc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        pc0Var.G.getMapAsync(new zb0(pc0Var, 0));
                        pc0Var.f41462q0 = true;
                        if (pc0Var.f41464r0) {
                            pc0Var.G.onResume();
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            default:
                pc0 pc0Var2 = this.f44813b;
                IMapsProvider.IMapView iMapView2 = this.f44814c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new yb0(pc0Var2, iMapView2, 0));
                return;
        }
    }
}
