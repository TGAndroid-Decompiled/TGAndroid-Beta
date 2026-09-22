package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class tc0 implements Runnable {
    public final int f37634a;
    public final id0 f37635b;
    public final IMapsProvider.IMapView f37636c;

    public tc0(id0 id0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f37634a = i10;
        this.f37635b = id0Var;
        this.f37636c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f37634a) {
            case 0:
                id0 id0Var = this.f37635b;
                IMapsProvider.IMapView iMapView = this.f37636c;
                if (id0Var.K != null && id0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        id0Var.K.getMapAsync(new uc0(id0Var, 0));
                        id0Var.f34632u0 = true;
                        if (id0Var.f34633v0) {
                            id0Var.K.onResume();
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
                id0 id0Var2 = this.f37635b;
                IMapsProvider.IMapView iMapView2 = this.f37636c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new tc0(id0Var2, iMapView2, 0));
                return;
        }
    }
}
