package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class th1 implements View.OnClickListener {
    public final int f38523a;
    public final ii1 f38524b;

    public th1(ii1 ii1Var, int i10) {
        this.f38523a = i10;
        this.f38524b = ii1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f38523a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ii1 ii1Var = this.f38524b;
                    AndroidUtilities.cancelRunOnUIThread(ii1Var.P0);
                    ii1Var.O0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                ii1 ii1Var2 = this.f38524b;
                if (ii1Var2.f34968k0 && ii1Var2.f34966j0 && System.currentTimeMillis() - ii1Var2.H0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ii1Var2.P0);
                    ii1Var2.O0 = false;
                    ii1Var2.H0 = System.currentTimeMillis();
                    ii1Var2.W.setRelativePosition(ii1Var2.V);
                    ii1Var2.X = true;
                    ii1Var2.E0 = true;
                    ii1Var2.f34971n0 = ii1Var2.m0;
                    ii1Var2.H();
                    return;
                }
                return;
            case 2:
                ii1 ii1Var3 = this.f38524b;
                if (ii1Var3.E0 && System.currentTimeMillis() - ii1Var3.H0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ii1Var3.P0);
                    ii1Var3.O0 = false;
                    ii1Var3.H0 = System.currentTimeMillis();
                    ii1Var3.V.setRelativePosition(ii1Var3.W);
                    ii1Var3.X = false;
                    ii1Var3.E0 = false;
                    ii1Var3.f34971n0 = ii1Var3.m0;
                    ii1Var3.H();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ii1 ii1Var4 = this.f38524b;
                if (currentTimeMillis - ii1Var4.H0 >= 500) {
                    ii1Var4.H0 = System.currentTimeMillis();
                    boolean z4 = ii1Var4.f34988z0;
                    if (!z4 && ii1Var4.f34987y0) {
                        ii1Var4.m(!z4);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ii1 ii1Var5 = this.f38524b;
                if (currentTimeMillis2 - ii1Var5.H0 >= 500) {
                    ii1Var5.H0 = System.currentTimeMillis();
                    if (ii1Var5.f34987y0) {
                        ii1Var5.m(!ii1Var5.f34988z0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ii1 ii1Var6 = this.f38524b;
                if (ii1Var6.H.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ii1Var6.B();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ii1Var6.f34947b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f38524b.p();
                return;
        }
    }
}
