package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class xg1 implements View.OnClickListener {
    public final int f44518a;
    public final mh1 f44519b;

    public xg1(mh1 mh1Var, int i9) {
        this.f44518a = i9;
        this.f44519b = mh1Var;
    }

    @Override
    public final void onClick(View view) {
        VoIPService sharedInstance;
        int i9;
        switch (this.f44518a) {
            case 0:
                if (VoIPService.getSharedInstance() != null) {
                    mh1 mh1Var = this.f44519b;
                    AndroidUtilities.cancelRunOnUIThread(mh1Var.O0);
                    mh1Var.N0 = false;
                    VoIPService.getSharedInstance().hangUp();
                    return;
                }
                return;
            case 1:
                mh1 mh1Var2 = this.f44519b;
                if (mh1Var2.f40451j0 && mh1Var2.f40449i0 && System.currentTimeMillis() - mh1Var2.G0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(mh1Var2.O0);
                    mh1Var2.N0 = false;
                    mh1Var2.G0 = System.currentTimeMillis();
                    mh1Var2.V.setRelativePosition(mh1Var2.U);
                    mh1Var2.W = true;
                    mh1Var2.D0 = true;
                    mh1Var2.m0 = mh1Var2.f40453l0;
                    mh1Var2.H();
                    return;
                }
                return;
            case 2:
                mh1 mh1Var3 = this.f44519b;
                if (mh1Var3.D0 && System.currentTimeMillis() - mh1Var3.G0 > 500) {
                    AndroidUtilities.cancelRunOnUIThread(mh1Var3.O0);
                    mh1Var3.N0 = false;
                    mh1Var3.G0 = System.currentTimeMillis();
                    mh1Var3.U.setRelativePosition(mh1Var3.V);
                    mh1Var3.W = false;
                    mh1Var3.D0 = false;
                    mh1Var3.m0 = mh1Var3.f40453l0;
                    mh1Var3.H();
                    return;
                }
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                mh1 mh1Var4 = this.f44519b;
                if (currentTimeMillis - mh1Var4.G0 >= 500) {
                    mh1Var4.G0 = System.currentTimeMillis();
                    boolean z10 = mh1Var4.f40471y0;
                    if (!z10 && mh1Var4.f40469x0) {
                        mh1Var4.m(!z10);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                long currentTimeMillis2 = System.currentTimeMillis();
                mh1 mh1Var5 = this.f44519b;
                if (currentTimeMillis2 - mh1Var5.G0 >= 500) {
                    mh1Var5.G0 = System.currentTimeMillis();
                    if (mh1Var5.f40469x0) {
                        mh1Var5.m(!mh1Var5.f40471y0);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                mh1 mh1Var6 = this.f44519b;
                if (mh1Var6.G.getTag() != null && (sharedInstance = VoIPService.getSharedInstance()) != null) {
                    mh1Var6.B();
                    if (sharedInstance.isBluetoothOn()) {
                        i9 = 2;
                    } else if (sharedInstance.isSpeakerphoneOn()) {
                        i9 = 0;
                    } else {
                        i9 = 1;
                    }
                    sharedInstance.toggleSpeakerphoneOrShowRouteSheet(mh1Var6.f40431b, false, Integer.valueOf(i9));
                    return;
                }
                return;
            default:
                this.f44519b.p();
                return;
        }
    }
}
