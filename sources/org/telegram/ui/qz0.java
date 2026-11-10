package org.telegram.ui;

import org.telegram.messenger.MediaController;
public final class qz0 implements Runnable {
    public final int f49180a;
    public final vz0 f49181b;

    public qz0(vz0 vz0Var, int i7) {
        this.f49180a = i7;
        this.f49181b = vz0Var;
    }

    @Override
    public final void run() {
        switch (this.f49180a) {
            case 0:
                vz0 vz0Var = this.f49181b;
                qz0 qz0Var = vz0Var.Z;
                org.telegram.ui.Components.t51 t51Var = vz0Var.f50843x;
                if (t51Var != null) {
                    vz0Var.f50830a0 = ((float) t51Var.S()) / ((float) vz0Var.f50843x.U());
                    tz0 tz0Var = vz0Var.N;
                    if (tz0Var != null) {
                        tz0Var.f29972oc = (vz0Var.f50843x.U() - vz0Var.f50843x.S()) / 1000;
                        vz0Var.N.S3();
                        org.telegram.ui.Components.pm0 seekBarWaveform = vz0Var.N.getSeekBarWaveform();
                        if (seekBarWaveform != null) {
                            float f10 = vz0Var.f50830a0;
                            seekBarWaveform.J = true;
                            seekBarWaveform.K = f10;
                            org.telegram.ui.Cells.q1 q1Var = seekBarWaveform.f37028n;
                            if (q1Var != null) {
                                q1Var.invalidate();
                            }
                        }
                    }
                    if (vz0Var.f50843x.d0()) {
                        org.telegram.messenger.g0.r(qz0Var);
                        org.telegram.messenger.g0.i3(qz0Var, 16L);
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
                vz0 vz0Var2 = this.f49181b;
                if (vz0Var2.d == null) {
                    org.telegram.messenger.g0.h3(new qz0(vz0Var2, 2));
                    org.telegram.ui.Cells.q1 q1Var2 = vz0Var2.O;
                    if (q1Var2 != null) {
                        q1Var2.setVisibility(0);
                        vz0Var2.O.invalidate();
                    }
                }
                MediaController.B().F0();
                return;
        }
    }
}
