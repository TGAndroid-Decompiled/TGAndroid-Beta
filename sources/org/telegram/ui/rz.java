package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rz implements RequestDelegate {
    public final int f37253a;
    public final c00 f37254b;

    public rz(c00 c00Var, int i10) {
        this.f37253a = i10;
        this.f37254b = c00Var;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37253a) {
            case 0:
                final c00 c00Var = this.f37254b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                c00 c00Var2 = c00Var;
                                c00Var2.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.l0.o(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(c00Var2), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                c00.U(c00Var, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final c00 c00Var2 = this.f37254b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                c00 c00Var22 = c00Var2;
                                c00Var22.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.l0.o(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(c00Var22), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                c00.U(c00Var2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
