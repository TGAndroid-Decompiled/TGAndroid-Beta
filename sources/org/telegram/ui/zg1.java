package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class zg1 implements View.OnClickListener {
    public final int f45215a;
    public final oh1 f45216b;

    public zg1(oh1 oh1Var, int i10) {
        this.f45215a = i10;
        this.f45216b = oh1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i10;
        switch (this.f45215a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    oh1 oh1Var = this.f45216b;
                    AndroidUtilities.cancelRunOnUIThread(oh1Var.O0);
                    oh1Var.N0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                oh1 oh1Var2 = this.f45216b;
                if (oh1Var2.f41159j0 && oh1Var2.f41157i0 && System.currentTimeMillis() - oh1Var2.G0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(oh1Var2.O0);
                    oh1Var2.N0 = false;
                    oh1Var2.G0 = System.currentTimeMillis();
                    oh1Var2.V.setRelativePosition(oh1Var2.U);
                    oh1Var2.W = true;
                    oh1Var2.D0 = true;
                    oh1Var2.m0 = oh1Var2.f41161l0;
                    oh1Var2.H();
                    return;
                }
                return;
            case 2:
                oh1 oh1Var3 = this.f45216b;
                if (oh1Var3.D0 && System.currentTimeMillis() - oh1Var3.G0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(oh1Var3.O0);
                    oh1Var3.N0 = false;
                    oh1Var3.G0 = System.currentTimeMillis();
                    oh1Var3.U.setRelativePosition(oh1Var3.V);
                    oh1Var3.W = false;
                    oh1Var3.D0 = false;
                    oh1Var3.m0 = oh1Var3.f41161l0;
                    oh1Var3.H();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                oh1 oh1Var4 = this.f45216b;
                if (currentTimeMillis - oh1Var4.G0 >= 500) {
                    oh1Var4.G0 = System.currentTimeMillis();
                    boolean z10 = oh1Var4.f41179y0;
                    if (!z10 && oh1Var4.f41177x0) {
                        oh1Var4.m(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                oh1 oh1Var5 = this.f45216b;
                if (currentTimeMillis2 - oh1Var5.G0 >= 500) {
                    oh1Var5.G0 = System.currentTimeMillis();
                    if (oh1Var5.f41177x0) {
                        oh1Var5.m(!oh1Var5.f41179y0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                oh1 oh1Var6 = this.f45216b;
                if (oh1Var6.G.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    oh1Var6.B();
                    if (sharedInstance.isBluetoothOn()) {
                        i10 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(oh1Var6.f41139b, false, Integer.valueOf(i10));
                    return;
                }
                return;
            default:
                this.f45216b.p();
                return;
        }
    }
}
