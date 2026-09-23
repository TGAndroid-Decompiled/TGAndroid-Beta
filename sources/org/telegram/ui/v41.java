package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class v41 implements Runnable {
    public final int f38296a;
    public final a51 f38297b;

    public v41(a51 a51Var, int i10) {
        this.f38296a = i10;
        this.f38297b = a51Var;
    }

    @Override
    public final void run() {
        switch (this.f38296a) {
            case 0:
                a51 a51Var = this.f38297b;
                v41 v41Var = a51Var.Z;
                org.telegram.ui.Components.f71 f71Var = a51Var.f31678w;
                if (f71Var != null) {
                    a51Var.f31667a0 = ((float) f71Var.n()) / ((float) a51Var.f31678w.p());
                    y41 y41Var = a51Var.N;
                    if (y41Var != null) {
                        y41Var.Xd = (a51Var.f31678w.p() - a51Var.f31678w.n()) / 1000;
                        a51Var.N.q4();
                        org.telegram.ui.Components.io0 seekBarWaveform = a51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = a51Var.f31667a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f25027n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (a51Var.f31678w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(v41Var);
                        AndroidUtilities.runOnUIThread(v41Var, 16L);
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
                a51 a51Var2 = this.f38297b;
                if (a51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new v41(a51Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = a51Var2.O;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        a51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
