package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;

public final class x31 implements Runnable {

    public final int f44271a;

    public final c41 f44272b;

    public x31(c41 c41Var, int i10) {
        this.f44271a = i10;
        this.f44272b = c41Var;
    }

    @Override
    public final void run() {
        switch (this.f44271a) {
            case 0:
                c41 c41Var = this.f44272b;
                x31 x31Var = c41Var.V;
                org.telegram.ui.Components.m61 m61Var = c41Var.f36945w;
                if (m61Var != null) {
                    c41Var.W = m61Var.o() / c41Var.f36945w.q();
                    a41 a41Var = c41Var.J;
                    if (a41Var != null) {
                        a41Var.Td = (c41Var.f36945w.q() - c41Var.f36945w.o()) / 1000;
                        c41Var.J.p4();
                        org.telegram.ui.Components.sn0 seekBarWaveform = c41Var.J.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = c41Var.W;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.s1 s1Var = seekBarWaveform.f32501n;
                            if (s1Var != null) {
                                s1Var.invalidate();
                            }
                        }
                    }
                    if (c41Var.f36945w.z()) {
                        AndroidUtilities.cancelRunOnUIThread(x31Var);
                        AndroidUtilities.runOnUIThread(x31Var, 16L);
                    }
                    break;
                }
                break;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                c41 c41Var2 = this.f44272b;
                if (c41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new x31(c41Var2, 2));
                    org.telegram.ui.Cells.s1 s1Var2 = c41Var2.K;
                    if (s1Var2 != null) {
                        s1Var2.setVisibility(0);
                        c41Var2.K.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                break;
        }
    }
}
