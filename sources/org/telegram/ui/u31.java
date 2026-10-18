package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class u31 implements Runnable {
    public final int f41850a;
    public final z31 f41851b;

    public u31(z31 z31Var, int i10) {
        this.f41850a = i10;
        this.f41851b = z31Var;
    }

    @Override
    public final void run() {
        switch (this.f41850a) {
            case 0:
                z31 z31Var = this.f41851b;
                u31 u31Var = z31Var.Z;
                org.telegram.ui.Components.a81 a81Var = z31Var.f43542w;
                if (a81Var != null) {
                    z31Var.f43531a0 = ((float) a81Var.n()) / ((float) z31Var.f43542w.p());
                    x31 x31Var = z31Var.N;
                    if (x31Var != null) {
                        x31Var.Xd = (z31Var.f43542w.p() - z31Var.f43542w.n()) / 1000;
                        z31Var.N.q4();
                        org.telegram.ui.Components.fp0 seekBarWaveform = z31Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = z31Var.f43531a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f26342n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (z31Var.f43542w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(u31Var);
                        AndroidUtilities.runOnUIThread(u31Var, 16L);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                z31 z31Var2 = this.f41851b;
                if (z31Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new u31(z31Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = z31Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        z31Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
