package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class r41 implements Runnable {
    public final int f37698a;
    public final w41 f37699b;

    public r41(w41 w41Var, int i10) {
        this.f37698a = i10;
        this.f37699b = w41Var;
    }

    @Override
    public final void run() {
        switch (this.f37698a) {
            case 0:
                w41 w41Var = this.f37699b;
                r41 r41Var = w41Var.W;
                org.telegram.ui.Components.i71 i71Var = w41Var.f39272w;
                if (i71Var != null) {
                    w41Var.X = ((float) i71Var.n()) / ((float) w41Var.f39272w.p());
                    u41 u41Var = w41Var.K;
                    if (u41Var != null) {
                        u41Var.Ud = (w41Var.f39272w.p() - w41Var.f39272w.n()) / 1000;
                        w41Var.K.q4();
                        org.telegram.ui.Components.lo0 seekBarWaveform = w41Var.K.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = w41Var.X;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.s1 s1Var = seekBarWaveform.f26820n;
                            if (s1Var != null) {
                                s1Var.invalidate();
                            }
                        }
                    }
                    if (w41Var.f39272w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(r41Var);
                        AndroidUtilities.runOnUIThread(r41Var, 16L);
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
                w41 w41Var2 = this.f37699b;
                if (w41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new r41(w41Var2, 2));
                    org.telegram.ui.Cells.s1 s1Var2 = w41Var2.L;
                    if (s1Var2 != null) {
                        s1Var2.setVisibility(0);
                        w41Var2.L.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
