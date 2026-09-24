package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class w41 implements Runnable {
    public final int f38877a;
    public final b51 f38878b;

    public w41(b51 b51Var, int i10) {
        this.f38877a = i10;
        this.f38878b = b51Var;
    }

    @Override
    public final void run() {
        switch (this.f38877a) {
            case 0:
                b51 b51Var = this.f38878b;
                w41 w41Var = b51Var.Z;
                org.telegram.ui.Components.s71 s71Var = b51Var.f32320w;
                if (s71Var != null) {
                    b51Var.f32309a0 = ((float) s71Var.n()) / ((float) b51Var.f32320w.p());
                    z41 z41Var = b51Var.N;
                    if (z41Var != null) {
                        z41Var.Xd = (b51Var.f32320w.p() - b51Var.f32320w.n()) / 1000;
                        b51Var.N.q4();
                        org.telegram.ui.Components.vo0 seekBarWaveform = b51Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = b51Var.f32309a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.u1 u1Var = seekBarWaveform.f29232n;
                            if (u1Var != null) {
                                u1Var.invalidate();
                            }
                        }
                    }
                    if (b51Var.f32320w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(w41Var);
                        AndroidUtilities.runOnUIThread(w41Var, 16L);
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
                b51 b51Var2 = this.f38878b;
                if (b51Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new w41(b51Var2, 2));
                    org.telegram.ui.Cells.u1 u1Var2 = b51Var2.O;
                    if (u1Var2 != null) {
                        u1Var2.setVisibility(0);
                        b51Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
