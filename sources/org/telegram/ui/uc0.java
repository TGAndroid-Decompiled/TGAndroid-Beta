package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class uc0 implements Runnable {
    public final int f37964a;
    public final jd0 f37965b;
    public final IMapsProvider.IMapView f37966c;

    public uc0(jd0 jd0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f37964a = i10;
        this.f37965b = jd0Var;
        this.f37966c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f37964a) {
            case 0:
                jd0 jd0Var = this.f37965b;
                IMapsProvider.IMapView iMapView = this.f37966c;
                if (jd0Var.K != null && jd0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        jd0Var.K.getMapAsync(new vc0(jd0Var, 0));
                        jd0Var.f34837u0 = true;
                        if (jd0Var.f34838v0) {
                            jd0Var.K.onResume();
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
                jd0 jd0Var2 = this.f37965b;
                IMapsProvider.IMapView iMapView2 = this.f37966c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new uc0(jd0Var2, iMapView2, 0));
                return;
        }
    }
}
