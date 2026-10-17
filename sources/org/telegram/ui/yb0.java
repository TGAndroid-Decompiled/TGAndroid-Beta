package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class yb0 implements Runnable {
    public final int f43381a;
    public final pc0 f43382b;
    public final IMapsProvider.IMapView f43383c;

    public yb0(pc0 pc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f43381a = i10;
        this.f43382b = pc0Var;
        this.f43383c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f43381a) {
            case 0:
                pc0 pc0Var = this.f43382b;
                IMapsProvider.IMapView iMapView = this.f43383c;
                if (pc0Var.K != null && pc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        pc0Var.K.getMapAsync(new zb0(pc0Var, 0));
                        pc0Var.f40063u0 = true;
                        if (pc0Var.f40064v0) {
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
                pc0 pc0Var2 = this.f43382b;
                IMapsProvider.IMapView iMapView2 = this.f43383c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new yb0(pc0Var2, iMapView2, 0));
                return;
        }
    }
}
