package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.voip.VoIPService;
public final class ub1 implements View.OnClickListener {
    public final int f50361a;
    public final ic1 f50362b;

    public ub1(ic1 ic1Var, int i7) {
        this.f50361a = i7;
        this.f50362b = ic1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i7;
        switch (this.f50361a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    ic1 ic1Var = this.f50362b;
                    org.telegram.messenger.g0.r(ic1Var.R0);
                    ic1Var.Q0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                ic1 ic1Var2 = this.f50362b;
                if (ic1Var2.m0 && ic1Var2.f46598l0 && System.currentTimeMillis() - ic1Var2.J0 > 500) {
                    org.telegram.messenger.g0.r(ic1Var2.R0);
                    ic1Var2.Q0 = false;
                    ic1Var2.J0 = System.currentTimeMillis();
                    ic1Var2.Z.setRelativePosition(ic1Var2.Y);
                    ic1Var2.f46572a0 = true;
                    ic1Var2.G0 = true;
                    ic1Var2.f46602p0 = ic1Var2.f46601o0;
                    ic1Var2.y();
                    return;
                }
                return;
            case 2:
                ic1 ic1Var3 = this.f50362b;
                if (ic1Var3.G0 && System.currentTimeMillis() - ic1Var3.J0 > 500) {
                    org.telegram.messenger.g0.r(ic1Var3.R0);
                    ic1Var3.Q0 = false;
                    ic1Var3.J0 = System.currentTimeMillis();
                    ic1Var3.Y.setRelativePosition(ic1Var3.Z);
                    ic1Var3.f46572a0 = false;
                    ic1Var3.G0 = false;
                    ic1Var3.f46602p0 = ic1Var3.f46601o0;
                    ic1Var3.y();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                ic1 ic1Var4 = this.f50362b;
                if (currentTimeMillis - ic1Var4.J0 >= 500) {
                    ic1Var4.J0 = System.currentTimeMillis();
                    boolean z9 = ic1Var4.B0;
                    if (!z9 && ic1Var4.A0) {
                        ic1Var4.d(!z9);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                ic1 ic1Var5 = this.f50362b;
                if (currentTimeMillis2 - ic1Var5.J0 >= 500) {
                    ic1Var5.J0 = System.currentTimeMillis();
                    if (ic1Var5.A0) {
                        ic1Var5.d(!ic1Var5.B0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ic1 ic1Var6 = this.f50362b;
                if (ic1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    ic1Var6.s();
                    if (sharedInstance.isBluetoothOn()) {
                        i7 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i7 = 0;
                    } else {
                        i7 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(ic1Var6.f46574b, false, Integer.valueOf(i7));
                    return;
                }
                return;
            default:
                this.f50362b.g();
                return;
        }
    }
}
