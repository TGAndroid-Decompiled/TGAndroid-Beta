package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class zg1 implements View.OnClickListener {
    public final int f44143a;
    public final oh1 f44144b;

    public zg1(oh1 oh1Var, int i10) {
        this.f44143a = i10;
        this.f44144b = oh1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f44143a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    oh1 oh1Var = this.f44144b;
                    AndroidUtilities.cancelRunOnUIThread(oh1Var.S0);
                    oh1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                oh1 oh1Var2 = this.f44144b;
                if (oh1Var2.f40192n0 && oh1Var2.m0 && System.currentTimeMillis() - oh1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(oh1Var2.S0);
                    oh1Var2.R0 = false;
                    oh1Var2.K0 = System.currentTimeMillis();
                    oh1Var2.Z.setRelativePosition(oh1Var2.Y);
                    oh1Var2.f40164a0 = true;
                    oh1Var2.H0 = true;
                    oh1Var2.f40195q0 = oh1Var2.f40194p0;
                    oh1Var2.G();
                    return;
                }
                return;
            case 2:
                oh1 oh1Var3 = this.f44144b;
                if (oh1Var3.H0 && System.currentTimeMillis() - oh1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(oh1Var3.S0);
                    oh1Var3.R0 = false;
                    oh1Var3.K0 = System.currentTimeMillis();
                    oh1Var3.Y.setRelativePosition(oh1Var3.Z);
                    oh1Var3.f40164a0 = false;
                    oh1Var3.H0 = false;
                    oh1Var3.f40195q0 = oh1Var3.f40194p0;
                    oh1Var3.G();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                oh1 oh1Var4 = this.f44144b;
                if (currentTimeMillis - oh1Var4.K0 >= 500) {
                    oh1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = oh1Var4.C0;
                    if (!z10 && oh1Var4.B0) {
                        oh1Var4.l(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                oh1 oh1Var5 = this.f44144b;
                if (currentTimeMillis2 - oh1Var5.K0 >= 500) {
                    oh1Var5.K0 = System.currentTimeMillis();
                    if (oh1Var5.B0) {
                        oh1Var5.l(!oh1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                oh1 oh1Var6 = this.f44144b;
                if (oh1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    oh1Var6.A();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(oh1Var6.f40166b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f44144b.o();
                return;
        }
    }
}
