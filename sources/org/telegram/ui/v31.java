package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
public final class v31 implements Runnable {
    public final int f42559a;
    public final a41 f42560b;

    public v31(a41 a41Var, int i10) {
        this.f42559a = i10;
        this.f42560b = a41Var;
    }

    @Override
    public final void run() {
        switch (this.f42559a) {
            case 0:
                a41 a41Var = this.f42560b;
                v31 v31Var = a41Var.Z;
                org.telegram.ui.Components.j81 j81Var = a41Var.f35588w;
                if (j81Var != null) {
                    a41Var.f35577a0 = ((float) j81Var.n()) / ((float) a41Var.f35588w.p());
                    y31 y31Var = a41Var.N;
                    if (y31Var != null) {
                        y31Var.Xd = (a41Var.f35588w.p() - a41Var.f35588w.n()) / 1000;
                        a41Var.N.p4();
                        org.telegram.ui.Components.jp0 seekBarWaveform = a41Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f7 = a41Var.f35577a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f7;
                            org.telegram.ui.Cells.t1 t1Var = seekBarWaveform.f27773n;
                            if (t1Var != null) {
                                t1Var.invalidate();
                            }
                        }
                    }
                    if (a41Var.f35588w.y()) {
                        AndroidUtilities.cancelRunOnUIThread(v31Var);
                        AndroidUtilities.runOnUIThread(v31Var, 16L);
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
                a41 a41Var2 = this.f42560b;
                if (a41Var2.d == null) {
                    AndroidUtilities.runOnUIThread(new v31(a41Var2, 2));
                    org.telegram.ui.Cells.t1 t1Var2 = a41Var2.O;
                    if (t1Var2 != null) {
                        t1Var2.setVisibility(0);
                        a41Var2.O.invalidate();
                    }
                }
                MediaController.getInstance().tryResumePausedAudio();
                return;
        }
    }
}
