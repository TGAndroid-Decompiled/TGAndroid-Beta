package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class sb1 implements View.OnClickListener {
    public final int f49716a;
    public final fc1 f49717b;

    public sb1(fc1 fc1Var, int i7) {
        this.f49716a = i7;
        this.f49717b = fc1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i7;
        switch (this.f49716a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    fc1 fc1Var = this.f49717b;
                    org.telegram.messenger.g0.r(fc1Var.R0);
                    fc1Var.Q0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                fc1 fc1Var2 = this.f49717b;
                if (fc1Var2.m0 && fc1Var2.f45566l0 && System.currentTimeMillis() - fc1Var2.J0 > 500) {
                    org.telegram.messenger.g0.r(fc1Var2.R0);
                    fc1Var2.Q0 = false;
                    fc1Var2.J0 = System.currentTimeMillis();
                    fc1Var2.Z.setRelativePosition(fc1Var2.Y);
                    fc1Var2.f45540a0 = true;
                    fc1Var2.G0 = true;
                    fc1Var2.f45570p0 = fc1Var2.f45569o0;
                    fc1Var2.y();
                    return;
                }
                return;
            case 2:
                fc1 fc1Var3 = this.f49717b;
                if (fc1Var3.G0 && System.currentTimeMillis() - fc1Var3.J0 > 500) {
                    org.telegram.messenger.g0.r(fc1Var3.R0);
                    fc1Var3.Q0 = false;
                    fc1Var3.J0 = System.currentTimeMillis();
                    fc1Var3.Y.setRelativePosition(fc1Var3.Z);
                    fc1Var3.f45540a0 = false;
                    fc1Var3.G0 = false;
                    fc1Var3.f45570p0 = fc1Var3.f45569o0;
                    fc1Var3.y();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                fc1 fc1Var4 = this.f49717b;
                if (currentTimeMillis - fc1Var4.J0 >= 500) {
                    fc1Var4.J0 = System.currentTimeMillis();
                    boolean z9 = fc1Var4.B0;
                    if (!z9 && fc1Var4.A0) {
                        fc1Var4.d(!z9);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                fc1 fc1Var5 = this.f49717b;
                if (currentTimeMillis2 - fc1Var5.J0 >= 500) {
                    fc1Var5.J0 = System.currentTimeMillis();
                    if (fc1Var5.A0) {
                        fc1Var5.d(!fc1Var5.B0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                fc1 fc1Var6 = this.f49717b;
                if (fc1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    fc1Var6.s();
                    if (sharedInstance.isBluetoothOn()) {
                        i7 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i7 = 0;
                    } else {
                        i7 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(fc1Var6.f45542b, false, Integer.valueOf(i7));
                    return;
                }
                return;
            default:
                this.f49717b.g();
                return;
        }
    }
}
