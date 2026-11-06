package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class rb1 implements View.OnClickListener {
    public final int f49444a;
    public final ec1 f49445b;

    public rb1(ec1 ec1Var, int i7) {
        this.f49444a = i7;
        this.f49445b = ec1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i7;
        switch (this.f49444a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ec1 ec1Var = this.f49445b;
                    org.telegram.messenger.g0.r(ec1Var.R0);
                    ec1Var.Q0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                ec1 ec1Var2 = this.f49445b;
                if (ec1Var2.m0 && ec1Var2.f45298l0 && System.currentTimeMillis() - ec1Var2.J0 > 500) {
                    org.telegram.messenger.g0.r(ec1Var2.R0);
                    ec1Var2.Q0 = false;
                    ec1Var2.J0 = System.currentTimeMillis();
                    ec1Var2.Z.setRelativePosition(ec1Var2.Y);
                    ec1Var2.f45272a0 = true;
                    ec1Var2.G0 = true;
                    ec1Var2.f45302p0 = ec1Var2.f45301o0;
                    ec1Var2.y();
                    return;
                }
                return;
            case 2:
                ec1 ec1Var3 = this.f49445b;
                if (ec1Var3.G0 && System.currentTimeMillis() - ec1Var3.J0 > 500) {
                    org.telegram.messenger.g0.r(ec1Var3.R0);
                    ec1Var3.Q0 = false;
                    ec1Var3.J0 = System.currentTimeMillis();
                    ec1Var3.Y.setRelativePosition(ec1Var3.Z);
                    ec1Var3.f45272a0 = false;
                    ec1Var3.G0 = false;
                    ec1Var3.f45302p0 = ec1Var3.f45301o0;
                    ec1Var3.y();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ec1 ec1Var4 = this.f49445b;
                if (currentTimeMillis - ec1Var4.J0 >= 500) {
                    ec1Var4.J0 = System.currentTimeMillis();
                    boolean z9 = ec1Var4.B0;
                    if (!z9 && ec1Var4.A0) {
                        ec1Var4.d(!z9);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ec1 ec1Var5 = this.f49445b;
                if (currentTimeMillis2 - ec1Var5.J0 >= 500) {
                    ec1Var5.J0 = System.currentTimeMillis();
                    if (ec1Var5.A0) {
                        ec1Var5.d(!ec1Var5.B0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ec1 ec1Var6 = this.f49445b;
                if (ec1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ec1Var6.s();
                    if (sharedInstance.isBluetoothOn()) {
                        i7 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i7 = 0;
                    } else {
                        i7 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ec1Var6.f45274b, false, Integer.valueOf(i7));
                    return;
                }
                return;
            default:
                this.f49445b.g();
                return;
        }
    }
}
