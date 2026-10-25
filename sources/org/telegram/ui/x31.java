package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class x31 implements Runnable {
    public final int f45628a;
    public final c41 f45629b;

    public x31(c41 c41Var, int i10) {
        this.f45628a = i10;
        this.f45629b = c41Var;
    }

    @Override
    public final void run() {
        switch (this.f45628a) {
            case 0:
                c41 c41Var = this.f45629b;
                x31 x31Var = c41Var.Z;
                org.telegram.ui.Components.s81 s81Var = c41Var.f38258w;
                if (s81Var != null) {
                    c41Var.f38247a0 = ((float) s81Var.n()) / ((float) c41Var.f38258w.p());
                    a41 a41Var = c41Var.N;
                    if (a41Var != null) {
                        a41Var.Yd = (c41Var.f38258w.p() - c41Var.f38258w.n()) / 1000;
                        c41Var.N.s4();
                        org.telegram.ui.Components.pp0 seekBarWaveform = c41Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = c41Var.f38247a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.s1 s1Var = seekBarWaveform.f31683n;
                            if (s1Var != null) {
                                s1Var.invalidate();
                            }
                        }
                    }
                    if (c41Var.f38258w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(x31Var);
                        AndroidUtilities.runOnUIThread(x31Var, 16L);
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
                c41 c41Var2 = this.f45629b;
                if (c41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new x31(c41Var2, 2));
                    org.telegram.ui.Cells.s1 s1Var2 = c41Var2.O;
                    if (s1Var2 != null) {
                        s1Var2.setVisibility(0);
                        c41Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
