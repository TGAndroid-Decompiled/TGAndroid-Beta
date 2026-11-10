package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class wb1 implements View.OnClickListener {
    public final int f50976a;
    public final jc1 f50977b;

    public wb1(jc1 jc1Var, int i7) {
        this.f50976a = i7;
        this.f50977b = jc1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i7;
        switch (this.f50976a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    jc1 jc1Var = this.f50977b;
                    org.telegram.messenger.g0.r(jc1Var.R0);
                    jc1Var.Q0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                jc1 jc1Var2 = this.f50977b;
                if (jc1Var2.m0 && jc1Var2.f46934l0 && System.currentTimeMillis() - jc1Var2.J0 > 500) {
                    org.telegram.messenger.g0.r(jc1Var2.R0);
                    jc1Var2.Q0 = false;
                    jc1Var2.J0 = System.currentTimeMillis();
                    jc1Var2.Z.setRelativePosition(jc1Var2.Y);
                    jc1Var2.f46908a0 = true;
                    jc1Var2.G0 = true;
                    jc1Var2.f46938p0 = jc1Var2.f46937o0;
                    jc1Var2.y();
                    return;
                }
                return;
            case 2:
                jc1 jc1Var3 = this.f50977b;
                if (jc1Var3.G0 && System.currentTimeMillis() - jc1Var3.J0 > 500) {
                    org.telegram.messenger.g0.r(jc1Var3.R0);
                    jc1Var3.Q0 = false;
                    jc1Var3.J0 = System.currentTimeMillis();
                    jc1Var3.Y.setRelativePosition(jc1Var3.Z);
                    jc1Var3.f46908a0 = false;
                    jc1Var3.G0 = false;
                    jc1Var3.f46938p0 = jc1Var3.f46937o0;
                    jc1Var3.y();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                jc1 jc1Var4 = this.f50977b;
                if (currentTimeMillis - jc1Var4.J0 >= 500) {
                    jc1Var4.J0 = System.currentTimeMillis();
                    boolean z9 = jc1Var4.B0;
                    if (!z9 && jc1Var4.A0) {
                        jc1Var4.d(!z9);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                jc1 jc1Var5 = this.f50977b;
                if (currentTimeMillis2 - jc1Var5.J0 >= 500) {
                    jc1Var5.J0 = System.currentTimeMillis();
                    if (jc1Var5.A0) {
                        jc1Var5.d(!jc1Var5.B0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                jc1 jc1Var6 = this.f50977b;
                if (jc1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    jc1Var6.s();
                    if (sharedInstance.isBluetoothOn()) {
                        i7 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i7 = 0;
                    } else {
                        i7 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(jc1Var6.f46910b, false, Integer.valueOf(i7));
                    return;
                }
                return;
            default:
                this.f50977b.g();
                return;
        }
    }
}
