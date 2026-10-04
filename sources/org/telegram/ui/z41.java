package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class z41 implements Runnable {
    public final int f43699a;
    public final e51 f43700b;

    public z41(e51 e51Var, int i10) {
        this.f43699a = i10;
        this.f43700b = e51Var;
    }

    @Override
    public final void run() {
        switch (this.f43699a) {
            case 0:
                e51 e51Var = this.f43700b;
                z41 z41Var = e51Var.Z;
                org.telegram.ui.Components.d81 d81Var = e51Var.f35925w;
                if (d81Var != null) {
                    e51Var.f35913a0 = ((float) d81Var.n()) / ((float) e51Var.f35925w.p());
                    c51 c51Var = e51Var.N;
                    if (c51Var != null) {
                        c51Var.Xd = (e51Var.f35925w.p() - e51Var.f35925w.n()) / 1000;
                        e51Var.N.q4();
                        org.telegram.ui.Components.bp0 seekBarWaveform = e51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = e51Var.f35913a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f25028n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (e51Var.f35925w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(z41Var);
                        AndroidUtilities.runOnUIThread(z41Var, 16L);
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
                e51 e51Var2 = this.f43700b;
                if (e51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new z41(e51Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = e51Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        e51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
