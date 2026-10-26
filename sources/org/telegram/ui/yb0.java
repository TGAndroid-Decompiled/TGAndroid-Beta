package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
public final class yb0 implements Runnable {
    public final int f46022a;
    public final pc0 f46023b;
    public final IMapsProvider.IMapView f46024c;

    public yb0(pc0 pc0Var, IMapsProvider.IMapView iMapView, int i10) {
        this.f46022a = i10;
        this.f46023b = pc0Var;
        this.f46024c = iMapView;
    }

    @Override
    public final void run() {
        switch (this.f46022a) {
            case 0:
                pc0 pc0Var = this.f46023b;
                IMapsProvider.IMapView iMapView = this.f46024c;
                if (pc0Var.K != null && pc0Var.getParentActivity() != null) {
                    try {
                        iMapView.onCreate(null);
                        ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                        pc0Var.K.getMapAsync(new ac0(pc0Var, 0));
                        pc0Var.f42453t0 = true;
                        if (pc0Var.f42454u0) {
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
                pc0 pc0Var2 = this.f46023b;
                IMapsProvider.IMapView iMapView2 = this.f46024c;
                try {
                    iMapView2.onCreate(null);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(new yb0(pc0Var2, iMapView2, 0));
                return;
        }
    }
}
