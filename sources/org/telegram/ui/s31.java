package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class s31 implements Runnable {
    public final int f41358a;
    public final x31 f41359b;

    public s31(x31 x31Var, int i10) {
        this.f41358a = i10;
        this.f41359b = x31Var;
    }

    @Override
    public final void run() {
        switch (this.f41358a) {
            case 0:
                x31 x31Var = this.f41359b;
                s31 s31Var = x31Var.Z;
                org.telegram.ui.Components.c81 c81Var = x31Var.f43032w;
                if (c81Var != null) {
                    x31Var.f43021a0 = ((float) c81Var.n()) / ((float) x31Var.f43032w.p());
                    v31 v31Var = x31Var.N;
                    if (v31Var != null) {
                        v31Var.Xd = (x31Var.f43032w.p() - x31Var.f43032w.n()) / 1000;
                        x31Var.N.q4();
                        org.telegram.ui.Components.gp0 seekBarWaveform = x31Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = x31Var.f43021a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f26636n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (x31Var.f43032w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(s31Var);
                        AndroidUtilities.runOnUIThread(s31Var, 16L);
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
                x31 x31Var2 = this.f41359b;
                if (x31Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new s31(x31Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = x31Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        x31Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
