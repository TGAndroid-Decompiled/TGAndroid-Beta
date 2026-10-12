package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class yc0 implements Runnable {
    public final int f42133a;
    public final nd0 f42134b;
    public final IMapsProvider.IMapView f42135c;

    public yc0(nd0 nd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f42133a = i10;
        this.f42134b = nd0Var;
        this.f42135c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f42133a) {
            case 0:
                nd0 nd0Var = this.f42134b;
                IMapsProvider.IMapView iMapView = this.f42135c;
                if (nd0Var.K != null && nd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        nd0Var.K.getMapAsync(new zc0(nd0Var, 0));
                        nd0Var.f38673u0 = true;
                        if (nd0Var.f38674v0) {
                            nd0Var.K.onResume();
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
                nd0 nd0Var2 = this.f42134b;
                IMapsProvider.IMapView iMapView2 = this.f42135c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new yc0(nd0Var2, iMapView2, 0));
                return;
        }
    }
}
