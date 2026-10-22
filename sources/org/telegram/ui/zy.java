package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zy implements RequestDelegate {
    public final int f43826a;
    public final lz f43827b;

    public zy(lz lzVar, int i10) {
        this.f43826a = i10;
        this.f43827b = lzVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43826a) {
            case 0:
                final lz lzVar = this.f43827b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                lz lzVar2 = lzVar;
                                lzVar2.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.g0.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(lzVar2), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                lz.U(lzVar, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final lz lzVar2 = this.f43827b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                lz lzVar22 = lzVar2;
                                lzVar22.F = 0;
                                if (tL_error == null) {
                                    org.telegram.messenger.g0.q(R.string.FilterInviteNameEdited, org.telegram.ui.Components.xc.a0(lzVar22), R.raw.contact_check, 36);
                                    return;
                                }
                                return;
                            default:
                                lz.U(lzVar2, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
