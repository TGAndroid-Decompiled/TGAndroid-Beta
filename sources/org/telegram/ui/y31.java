package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class y31 implements Runnable {
    public final int f44709a;
    public final d41 f44710b;

    public y31(d41 d41Var, int i9) {
        this.f44709a = i9;
        this.f44710b = d41Var;
    }

    @Override
    public final void run() {
        switch (this.f44709a) {
            case 0:
                d41 d41Var = this.f44710b;
                y31 y31Var = d41Var.V;
                org.telegram.ui.Components.k61 k61Var = d41Var.f37412w;
                if (k61Var != null) {
                    d41Var.W = ((float) k61Var.o()) / ((float) d41Var.f37412w.q());
                    b41 b41Var = d41Var.J;
                    if (b41Var != null) {
                        b41Var.Td = (d41Var.f37412w.q() - d41Var.f37412w.o()) / 1000;
                        d41Var.J.q4();
                        org.telegram.ui.Components.rn0 seekBarWaveform = d41Var.J.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = d41Var.W;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f32220n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (d41Var.f37412w.z()) {
                        AndroidUtilities.cancelRunOnUIThread(y31Var);
                        AndroidUtilities.runOnUIThread(y31Var, 16L);
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
                d41 d41Var2 = this.f44710b;
                if (d41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new y31(d41Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = d41Var2.K;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        d41Var2.K.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
