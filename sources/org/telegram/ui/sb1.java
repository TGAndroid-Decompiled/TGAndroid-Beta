package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class sb1 implements View.OnClickListener {
    public final int f52048a;
    public final fc1 f52049b;

    public sb1(fc1 fc1Var, int i7) {
        this.f52048a = i7;
        this.f52049b = fc1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i7;
        switch (this.f52048a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    fc1 fc1Var = this.f52049b;
                    org.telegram.messenger.g0.r(fc1Var.S0);
                    fc1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                fc1 fc1Var2 = this.f52049b;
                if (fc1Var2.f47781n0 && fc1Var2.m0 && System.currentTimeMillis() - fc1Var2.K0 > 500) {
                    org.telegram.messenger.g0.r(fc1Var2.S0);
                    fc1Var2.R0 = false;
                    fc1Var2.K0 = System.currentTimeMillis();
                    fc1Var2.f47753a0.setRelativePosition(fc1Var2.Z);
                    fc1Var2.f47756b0 = true;
                    fc1Var2.H0 = true;
                    fc1Var2.f47784q0 = fc1Var2.f47783p0;
                    fc1Var2.y();
                    return;
                }
                return;
            case 2:
                fc1 fc1Var3 = this.f52049b;
                if (fc1Var3.H0 && System.currentTimeMillis() - fc1Var3.K0 > 500) {
                    org.telegram.messenger.g0.r(fc1Var3.S0);
                    fc1Var3.R0 = false;
                    fc1Var3.K0 = System.currentTimeMillis();
                    fc1Var3.Z.setRelativePosition(fc1Var3.f47753a0);
                    fc1Var3.f47756b0 = false;
                    fc1Var3.H0 = false;
                    fc1Var3.f47784q0 = fc1Var3.f47783p0;
                    fc1Var3.y();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                fc1 fc1Var4 = this.f52049b;
                if (currentTimeMillis - fc1Var4.K0 >= 500) {
                    fc1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = fc1Var4.C0;
                    if (!z10 && fc1Var4.B0) {
                        fc1Var4.d(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                fc1 fc1Var5 = this.f52049b;
                if (currentTimeMillis2 - fc1Var5.K0 >= 500) {
                    fc1Var5.K0 = System.currentTimeMillis();
                    if (fc1Var5.B0) {
                        fc1Var5.d(!fc1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                fc1 fc1Var6 = this.f52049b;
                if (fc1Var6.L.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    fc1Var6.s();
                    if (sharedInstance.isBluetoothOn()) {
                        i7 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i7 = 0;
                    } else {
                        i7 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(fc1Var6.f47755b, false, Integer.valueOf(i7));
                    return;
                }
                return;
            default:
                this.f52049b.g();
                return;
        }
    }
}
