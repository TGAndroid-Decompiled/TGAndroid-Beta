package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vz implements RequestDelegate {
    public final int f40806a;
    public final h00 f40807b;

    public vz(h00 h00Var, int i10) {
        this.f40806a = i10;
        this.f40807b = h00Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40806a) {
            case 0:
                final h00 h00Var = this.f40807b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                h00 h00Var2 = h00Var;
                                h00Var2.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.g0.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.zc.a0(h00Var2), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                h00.U(h00Var, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final h00 h00Var2 = this.f40807b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                h00 h00Var22 = h00Var2;
                                h00Var22.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.g0.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.zc.a0(h00Var22), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                h00.U(h00Var2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
