package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class yg1 implements View.OnClickListener {
    public final int f43849a;
    public final nh1 f43850b;

    public yg1(nh1 nh1Var, int i10) {
        this.f43849a = i10;
        this.f43850b = nh1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f43849a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    nh1 nh1Var = this.f43850b;
                    AndroidUtilities.cancelRunOnUIThread(nh1Var.S0);
                    nh1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                nh1 nh1Var2 = this.f43850b;
                if (nh1Var2.f39855n0 && nh1Var2.m0 && System.currentTimeMillis() - nh1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(nh1Var2.S0);
                    nh1Var2.R0 = false;
                    nh1Var2.K0 = System.currentTimeMillis();
                    nh1Var2.Z.setRelativePosition(nh1Var2.Y);
                    nh1Var2.f39827a0 = true;
                    nh1Var2.H0 = true;
                    nh1Var2.f39858q0 = nh1Var2.f39857p0;
                    nh1Var2.G();
                    return;
                }
                return;
            case 2:
                nh1 nh1Var3 = this.f43850b;
                if (nh1Var3.H0 && System.currentTimeMillis() - nh1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(nh1Var3.S0);
                    nh1Var3.R0 = false;
                    nh1Var3.K0 = System.currentTimeMillis();
                    nh1Var3.Y.setRelativePosition(nh1Var3.Z);
                    nh1Var3.f39827a0 = false;
                    nh1Var3.H0 = false;
                    nh1Var3.f39858q0 = nh1Var3.f39857p0;
                    nh1Var3.G();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                nh1 nh1Var4 = this.f43850b;
                if (currentTimeMillis - nh1Var4.K0 >= 500) {
                    nh1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = nh1Var4.C0;
                    if (!z10 && nh1Var4.B0) {
                        nh1Var4.l(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                nh1 nh1Var5 = this.f43850b;
                if (currentTimeMillis2 - nh1Var5.K0 >= 500) {
                    nh1Var5.K0 = System.currentTimeMillis();
                    if (nh1Var5.B0) {
                        nh1Var5.l(!nh1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                nh1 nh1Var6 = this.f43850b;
                if (nh1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    nh1Var6.A();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(nh1Var6.f39829b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f43850b.o();
                return;
        }
    }
}
