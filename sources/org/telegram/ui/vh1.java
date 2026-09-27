package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class vh1 implements View.OnClickListener {
    public final int f38611a;
    public final ki1 f38612b;

    public vh1(ki1 ki1Var, int i10) {
        this.f38611a = i10;
        this.f38612b = ki1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f38611a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ki1 ki1Var = this.f38612b;
                    AndroidUtilities.cancelRunOnUIThread(ki1Var.S0);
                    ki1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                ki1 ki1Var2 = this.f38612b;
                if (ki1Var2.f35073n0 && ki1Var2.m0 && System.currentTimeMillis() - ki1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ki1Var2.S0);
                    ki1Var2.R0 = false;
                    ki1Var2.K0 = System.currentTimeMillis();
                    ki1Var2.Z.setRelativePosition(ki1Var2.Y);
                    ki1Var2.f35045a0 = true;
                    ki1Var2.H0 = true;
                    ki1Var2.f35076q0 = ki1Var2.f35075p0;
                    ki1Var2.H();
                    return;
                }
                return;
            case 2:
                ki1 ki1Var3 = this.f38612b;
                if (ki1Var3.H0 && System.currentTimeMillis() - ki1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(ki1Var3.S0);
                    ki1Var3.R0 = false;
                    ki1Var3.K0 = System.currentTimeMillis();
                    ki1Var3.Y.setRelativePosition(ki1Var3.Z);
                    ki1Var3.f35045a0 = false;
                    ki1Var3.H0 = false;
                    ki1Var3.f35076q0 = ki1Var3.f35075p0;
                    ki1Var3.H();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ki1 ki1Var4 = this.f38612b;
                if (currentTimeMillis - ki1Var4.K0 >= 500) {
                    ki1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = ki1Var4.C0;
                    if (!z10 && ki1Var4.B0) {
                        ki1Var4.m(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ki1 ki1Var5 = this.f38612b;
                if (currentTimeMillis2 - ki1Var5.K0 >= 500) {
                    ki1Var5.K0 = System.currentTimeMillis();
                    if (ki1Var5.B0) {
                        ki1Var5.m(!ki1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ki1 ki1Var6 = this.f38612b;
                if (ki1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ki1Var6.B();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ki1Var6.f35047b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f38612b.p();
                return;
        }
    }
}
