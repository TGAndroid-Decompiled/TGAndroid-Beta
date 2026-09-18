package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tz implements RequestDelegate {
    public final int f37896a;
    public final e00 f37897b;

    public tz(e00 e00Var, int i10) {
        this.f37896a = i10;
        this.f37897b = e00Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37896a) {
            case 0:
                final e00 e00Var = this.f37897b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e00 e00Var2 = e00Var;
                                e00Var2.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.w1.o(R.string.FilterInviteNameEdited, org.telegram.ui.Components.vc.a0(e00Var2), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                e00.U(e00Var, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final e00 e00Var2 = this.f37897b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e00 e00Var22 = e00Var2;
                                e00Var22.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.w1.o(R.string.FilterInviteNameEdited, org.telegram.ui.Components.vc.a0(e00Var22), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                e00.U(e00Var2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
