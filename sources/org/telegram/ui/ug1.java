package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class ug1 implements View.OnClickListener {
    public final int f41999a;
    public final jh1 f42000b;

    public ug1(jh1 jh1Var, int i10) {
        this.f41999a = i10;
        this.f42000b = jh1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f41999a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    jh1 jh1Var = this.f42000b;
                    AndroidUtilities.cancelRunOnUIThread(jh1Var.S0);
                    jh1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                jh1 jh1Var2 = this.f42000b;
                if (jh1Var2.f38217n0 && jh1Var2.m0 && System.currentTimeMillis() - jh1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(jh1Var2.S0);
                    jh1Var2.R0 = false;
                    jh1Var2.K0 = System.currentTimeMillis();
                    jh1Var2.Z.setRelativePosition(jh1Var2.Y);
                    jh1Var2.f38189a0 = true;
                    jh1Var2.H0 = true;
                    jh1Var2.f38220q0 = jh1Var2.f38219p0;
                    jh1Var2.G();
                    return;
                }
                return;
            case 2:
                jh1 jh1Var3 = this.f42000b;
                if (jh1Var3.H0 && System.currentTimeMillis() - jh1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(jh1Var3.S0);
                    jh1Var3.R0 = false;
                    jh1Var3.K0 = System.currentTimeMillis();
                    jh1Var3.Y.setRelativePosition(jh1Var3.Z);
                    jh1Var3.f38189a0 = false;
                    jh1Var3.H0 = false;
                    jh1Var3.f38220q0 = jh1Var3.f38219p0;
                    jh1Var3.G();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                jh1 jh1Var4 = this.f42000b;
                if (currentTimeMillis - jh1Var4.K0 >= 500) {
                    jh1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = jh1Var4.C0;
                    if (!z10 && jh1Var4.B0) {
                        jh1Var4.l(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                jh1 jh1Var5 = this.f42000b;
                if (currentTimeMillis2 - jh1Var5.K0 >= 500) {
                    jh1Var5.K0 = System.currentTimeMillis();
                    if (jh1Var5.B0) {
                        jh1Var5.l(!jh1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                jh1 jh1Var6 = this.f42000b;
                if (jh1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    jh1Var6.A();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(jh1Var6.f38191b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f42000b.o();
                return;
        }
    }
}
