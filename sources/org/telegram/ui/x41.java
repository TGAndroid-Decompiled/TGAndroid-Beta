package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class x41 implements Runnable {
    public final int f42812a;
    public final c51 f42813b;

    public x41(c51 c51Var, int i10) {
        this.f42812a = i10;
        this.f42813b = c51Var;
    }

    @Override
    public final void run() {
        switch (this.f42812a) {
            case 0:
                c51 c51Var = this.f42813b;
                x41 x41Var = c51Var.Z;
                org.telegram.ui.Components.e81 e81Var = c51Var.f35323w;
                if (e81Var != null) {
                    c51Var.f35311a0 = ((float) e81Var.n()) / ((float) c51Var.f35323w.p());
                    a51 a51Var = c51Var.N;
                    if (a51Var != null) {
                        a51Var.Xd = (c51Var.f35323w.p() - c51Var.f35323w.n()) / 1000;
                        c51Var.N.q4();
                        org.telegram.ui.Components.cp0 seekBarWaveform = c51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = c51Var.f35311a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f25489n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (c51Var.f35323w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(x41Var);
                        AndroidUtilities.runOnUIThread(x41Var, 16L);
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
                c51 c51Var2 = this.f42813b;
                if (c51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new x41(c51Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = c51Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        c51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
