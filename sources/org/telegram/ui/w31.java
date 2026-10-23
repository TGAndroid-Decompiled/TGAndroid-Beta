package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class w31 implements Runnable {
    public final int f42919a;
    public final b41 f42920b;

    public w31(b41 b41Var, int i10) {
        this.f42919a = i10;
        this.f42920b = b41Var;
    }

    @Override
    public final void run() {
        switch (this.f42919a) {
            case 0:
                b41 b41Var = this.f42920b;
                w31 w31Var = b41Var.Z;
                org.telegram.ui.Components.j81 j81Var = b41Var.f35868w;
                if (j81Var != null) {
                    b41Var.f35857a0 = ((float) j81Var.n()) / ((float) b41Var.f35868w.p());
                    z31 z31Var = b41Var.N;
                    if (z31Var != null) {
                        z31Var.Xd = (b41Var.f35868w.p() - b41Var.f35868w.n()) / 1000;
                        b41Var.N.p4();
                        org.telegram.ui.Components.kp0 seekBarWaveform = b41Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = b41Var.f35857a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f28112n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (b41Var.f35868w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(w31Var);
                        AndroidUtilities.runOnUIThread(w31Var, 16L);
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
                b41 b41Var2 = this.f42920b;
                if (b41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new w31(b41Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = b41Var2.O;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        b41Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
