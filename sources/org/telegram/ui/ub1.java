package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class ub1 implements View.OnClickListener {
    public final int f52527a;
    public final hc1 f52528b;

    public ub1(hc1 hc1Var, int i7) {
        this.f52527a = i7;
        this.f52528b = hc1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i7;
        switch (this.f52527a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    hc1 hc1Var = this.f52528b;
                    org.telegram.messenger.g0.r(hc1Var.S0);
                    hc1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                hc1 hc1Var2 = this.f52528b;
                if (hc1Var2.f48355n0 && hc1Var2.m0 && System.currentTimeMillis() - hc1Var2.K0 > 500) {
                    org.telegram.messenger.g0.r(hc1Var2.S0);
                    hc1Var2.R0 = false;
                    hc1Var2.K0 = System.currentTimeMillis();
                    hc1Var2.f48327a0.setRelativePosition(hc1Var2.Z);
                    hc1Var2.f48330b0 = true;
                    hc1Var2.H0 = true;
                    hc1Var2.f48358q0 = hc1Var2.f48357p0;
                    hc1Var2.y();
                    return;
                }
                return;
            case 2:
                hc1 hc1Var3 = this.f52528b;
                if (hc1Var3.H0 && System.currentTimeMillis() - hc1Var3.K0 > 500) {
                    org.telegram.messenger.g0.r(hc1Var3.S0);
                    hc1Var3.R0 = false;
                    hc1Var3.K0 = System.currentTimeMillis();
                    hc1Var3.Z.setRelativePosition(hc1Var3.f48327a0);
                    hc1Var3.f48330b0 = false;
                    hc1Var3.H0 = false;
                    hc1Var3.f48358q0 = hc1Var3.f48357p0;
                    hc1Var3.y();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                hc1 hc1Var4 = this.f52528b;
                if (currentTimeMillis - hc1Var4.K0 >= 500) {
                    hc1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = hc1Var4.C0;
                    if (!z10 && hc1Var4.B0) {
                        hc1Var4.d(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                hc1 hc1Var5 = this.f52528b;
                if (currentTimeMillis2 - hc1Var5.K0 >= 500) {
                    hc1Var5.K0 = System.currentTimeMillis();
                    if (hc1Var5.B0) {
                        hc1Var5.d(!hc1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                hc1 hc1Var6 = this.f52528b;
                if (hc1Var6.L.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    hc1Var6.s();
                    if (sharedInstance.isBluetoothOn()) {
                        i7 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i7 = 0;
                    } else {
                        i7 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(hc1Var6.f48329b, false, Integer.valueOf(i7));
                    return;
                }
                return;
            default:
                this.f52528b.g();
                return;
        }
    }
}
