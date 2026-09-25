package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class xh1 implements View.OnClickListener {
    public final int f39930a;
    public final mi1 f39931b;

    public xh1(mi1 mi1Var, int i10) {
        this.f39930a = i10;
        this.f39931b = mi1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f39930a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    mi1 mi1Var = this.f39931b;
                    AndroidUtilities.cancelRunOnUIThread(mi1Var.S0);
                    mi1Var.R0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                mi1 mi1Var2 = this.f39931b;
                if (mi1Var2.f35597n0 && mi1Var2.m0 && System.currentTimeMillis() - mi1Var2.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(mi1Var2.S0);
                    mi1Var2.R0 = false;
                    mi1Var2.K0 = System.currentTimeMillis();
                    mi1Var2.Z.setRelativePosition(mi1Var2.Y);
                    mi1Var2.f35569a0 = true;
                    mi1Var2.H0 = true;
                    mi1Var2.f35600q0 = mi1Var2.f35599p0;
                    mi1Var2.H();
                    return;
                }
                return;
            case 2:
                mi1 mi1Var3 = this.f39931b;
                if (mi1Var3.H0 && System.currentTimeMillis() - mi1Var3.K0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(mi1Var3.S0);
                    mi1Var3.R0 = false;
                    mi1Var3.K0 = System.currentTimeMillis();
                    mi1Var3.Y.setRelativePosition(mi1Var3.Z);
                    mi1Var3.f35569a0 = false;
                    mi1Var3.H0 = false;
                    mi1Var3.f35600q0 = mi1Var3.f35599p0;
                    mi1Var3.H();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                mi1 mi1Var4 = this.f39931b;
                if (currentTimeMillis - mi1Var4.K0 >= 500) {
                    mi1Var4.K0 = System.currentTimeMillis();
                    boolean z10 = mi1Var4.C0;
                    if (!z10 && mi1Var4.B0) {
                        mi1Var4.m(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                mi1 mi1Var5 = this.f39931b;
                if (currentTimeMillis2 - mi1Var5.K0 >= 500) {
                    mi1Var5.K0 = System.currentTimeMillis();
                    if (mi1Var5.B0) {
                        mi1Var5.m(!mi1Var5.C0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                mi1 mi1Var6 = this.f39931b;
                if (mi1Var6.K.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    mi1Var6.B();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(mi1Var6.f35571b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f39931b.p();
                return;
        }
    }
}
