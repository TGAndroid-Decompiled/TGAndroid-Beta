package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class rb1 implements View.OnClickListener {
    public final int f50903a;
    public final ec1 f50904b;

    public rb1(ec1 ec1Var, int i7) {
        this.f50903a = i7;
        this.f50904b = ec1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i7;
        switch (this.f50903a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ec1 ec1Var = this.f50904b;
                    org.telegram.messenger.g0.r(ec1Var.S0);
                    ec1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                ec1 ec1Var2 = this.f50904b;
                if (ec1Var2.f46700n0 && ec1Var2.m0 && System.currentTimeMillis() - ec1Var2.K0 > 500) {
                    org.telegram.messenger.g0.r(ec1Var2.S0);
                    ec1Var2.R0 = false;
                    ec1Var2.K0 = System.currentTimeMillis();
                    ec1Var2.f46672a0.setRelativePosition(ec1Var2.Z);
                    ec1Var2.f46675b0 = true;
                    ec1Var2.H0 = true;
                    ec1Var2.f46703q0 = ec1Var2.f46702p0;
                    ec1Var2.y();
                    return;
                }
                return;
            case 2:
                ec1 ec1Var3 = this.f50904b;
                if (ec1Var3.H0 && System.currentTimeMillis() - ec1Var3.K0 > 500) {
                    org.telegram.messenger.g0.r(ec1Var3.S0);
                    ec1Var3.R0 = false;
                    ec1Var3.K0 = System.currentTimeMillis();
                    ec1Var3.Z.setRelativePosition(ec1Var3.f46672a0);
                    ec1Var3.f46675b0 = false;
                    ec1Var3.H0 = false;
                    ec1Var3.f46703q0 = ec1Var3.f46702p0;
                    ec1Var3.y();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ec1 ec1Var4 = this.f50904b;
                if (currentTimeMillis - ec1Var4.K0 >= 500) {
                    ec1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = ec1Var4.C0;
                    if (!z10 && ec1Var4.B0) {
                        ec1Var4.d(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ec1 ec1Var5 = this.f50904b;
                if (currentTimeMillis2 - ec1Var5.K0 >= 500) {
                    ec1Var5.K0 = System.currentTimeMillis();
                    if (ec1Var5.B0) {
                        ec1Var5.d(!ec1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ec1 ec1Var6 = this.f50904b;
                if (ec1Var6.L.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ec1Var6.s();
                    if (sharedInstance.isBluetoothOn()) {
                        i7 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i7 = 0;
                    } else {
                        i7 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ec1Var6.f46674b, false, Integer.valueOf(i7));
                    return;
                }
                return;
            default:
                this.f50904b.g();
                return;
        }
    }
}
