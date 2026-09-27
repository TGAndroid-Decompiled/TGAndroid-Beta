package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class z41 implements Runnable {
    public final int f40401a;
    public final e51 f40402b;

    public z41(e51 e51Var, int i10) {
        this.f40401a = i10;
        this.f40402b = e51Var;
    }

    @Override
    public final void run() {
        switch (this.f40401a) {
            case 0:
                e51 e51Var = this.f40402b;
                z41 z41Var = e51Var.Z;
                org.telegram.ui.Components.u71 u71Var = e51Var.f33148w;
                if (u71Var != null) {
                    e51Var.f33137a0 = ((float) u71Var.n()) / ((float) e51Var.f33148w.p());
                    c51 c51Var = e51Var.N;
                    if (c51Var != null) {
                        c51Var.Xd = (e51Var.f33148w.p() - e51Var.f33148w.n()) / 1000;
                        e51Var.N.q4();
                        org.telegram.ui.Components.wo0 seekBarWaveform = e51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = e51Var.f33137a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f30140n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (e51Var.f33148w.y()) {
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
                e51 e51Var2 = this.f40402b;
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
