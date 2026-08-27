package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

public final class wg1 implements View.OnClickListener {

    public final int f44117a;

    public final lh1 f44118b;

    public wg1(lh1 lh1Var, int i10) {
        this.f44117a = i10;
        this.f44118b = lh1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        switch (this.f44117a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    lh1 lh1Var = this.f44118b;
                    AndroidUtilities.cancelRunOnUIThread(lh1Var.O0);
                    lh1Var.N0 = false;
                    VoIPService.getSharedInstance().hangUp();
                }
                break;
            case 1:
                lh1 lh1Var2 = this.f44118b;
                if (lh1Var2.f40112j0 && lh1Var2.f40110i0 && System.currentTimeMillis() - lh1Var2.G0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(lh1Var2.O0);
                    lh1Var2.N0 = false;
                    lh1Var2.G0 = System.currentTimeMillis();
                    lh1Var2.V.setRelativePosition(lh1Var2.U);
                    lh1Var2.W = true;
                    lh1Var2.D0 = true;
                    lh1Var2.m0 = lh1Var2.f40114l0;
                    lh1Var2.H();
                    break;
                }
                break;
            case 2:
                lh1 lh1Var3 = this.f44118b;
                if (lh1Var3.D0 && System.currentTimeMillis() - lh1Var3.G0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(lh1Var3.O0);
                    lh1Var3.N0 = false;
                    lh1Var3.G0 = System.currentTimeMillis();
                    lh1Var3.U.setRelativePosition(lh1Var3.V);
                    lh1Var3.W = false;
                    lh1Var3.D0 = false;
                    lh1Var3.m0 = lh1Var3.f40114l0;
                    lh1Var3.H();
                    break;
                }
                break;
            case 3:
                long jCurrentTimeMillis = System.currentTimeMillis();
                lh1 lh1Var4 = this.f44118b;
                if (jCurrentTimeMillis - lh1Var4.G0 >= 500) {
                    lh1Var4.G0 = System.currentTimeMillis();
                    boolean z10 = lh1Var4.f40132y0;
                    if (!z10 && lh1Var4.f40130x0) {
                        lh1Var4.m(!z10);
                    }
                    break;
                }
                break;
            case 4:
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                lh1 lh1Var5 = this.f44118b;
                if (jCurrentTimeMillis2 - lh1Var5.G0 >= 500) {
                    lh1Var5.G0 = System.currentTimeMillis();
                    if (lh1Var5.f40130x0) {
                        lh1Var5.m(!lh1Var5.f40132y0);
                    }
                    break;
                }
                break;
            case 5:
                lh1 lh1Var6 = this.f44118b;
                if (lh1Var6.G.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    lh1Var6.B();
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(lh1Var6.f40092b, false, Integer.valueOf(sharedInstance.isBluetoothOn() ? 2 : sharedInstance.isSpeakerphoneOn() ? 0 : 1));
                }
                break;
            default:
                this.f44118b.p();
                break;
        }
    }
}
