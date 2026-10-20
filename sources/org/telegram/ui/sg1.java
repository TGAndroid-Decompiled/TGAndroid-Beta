package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class sg1 implements View.OnClickListener {
    public final int f41464a;
    public final hh1 f41465b;

    public sg1(hh1 hh1Var, int i10) {
        this.f41464a = i10;
        this.f41465b = hh1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f41464a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    hh1 hh1Var = this.f41465b;
                    AndroidUtilities.cancelRunOnUIThread(hh1Var.S0);
                    hh1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                hh1 hh1Var2 = this.f41465b;
                if (hh1Var2.f37659n0 && hh1Var2.m0 && System.currentTimeMillis() - hh1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(hh1Var2.S0);
                    hh1Var2.R0 = false;
                    hh1Var2.K0 = System.currentTimeMillis();
                    hh1Var2.Z.setRelativePosition(hh1Var2.Y);
                    hh1Var2.f37631a0 = true;
                    hh1Var2.H0 = true;
                    hh1Var2.f37662q0 = hh1Var2.f37661p0;
                    hh1Var2.G();
                    return;
                }
                return;
            case 2:
                hh1 hh1Var3 = this.f41465b;
                if (hh1Var3.H0 && System.currentTimeMillis() - hh1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(hh1Var3.S0);
                    hh1Var3.R0 = false;
                    hh1Var3.K0 = System.currentTimeMillis();
                    hh1Var3.Y.setRelativePosition(hh1Var3.Z);
                    hh1Var3.f37631a0 = false;
                    hh1Var3.H0 = false;
                    hh1Var3.f37662q0 = hh1Var3.f37661p0;
                    hh1Var3.G();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                hh1 hh1Var4 = this.f41465b;
                if (currentTimeMillis - hh1Var4.K0 >= 500) {
                    hh1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = hh1Var4.C0;
                    if (!z10 && hh1Var4.B0) {
                        hh1Var4.l(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                hh1 hh1Var5 = this.f41465b;
                if (currentTimeMillis2 - hh1Var5.K0 >= 500) {
                    hh1Var5.K0 = System.currentTimeMillis();
                    if (hh1Var5.B0) {
                        hh1Var5.l(!hh1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                hh1 hh1Var6 = this.f41465b;
                if (hh1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    hh1Var6.A();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(hh1Var6.f37633b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f41465b.o();
                return;
        }
    }
}
