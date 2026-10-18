package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class yb0 implements Runnable {
    public final int f43405a;
    public final pc0 f43406b;
    public final IMapsProvider.IMapView f43407c;

    public yb0(pc0 pc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f43405a = i10;
        this.f43406b = pc0Var;
        this.f43407c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f43405a) {
            case 0:
                pc0 pc0Var = this.f43406b;
                IMapsProvider.IMapView iMapView = this.f43407c;
                if (pc0Var.K != null && pc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        pc0Var.K.getMapAsync(new zb0(pc0Var, 0));
                        pc0Var.f40082u0 = true;
                        if (pc0Var.f40083v0) {
                            pc0Var.K.onResume();
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
                pc0 pc0Var2 = this.f43406b;
                IMapsProvider.IMapView iMapView2 = this.f43407c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new yb0(pc0Var2, iMapView2, 0));
                return;
        }
    }
}
