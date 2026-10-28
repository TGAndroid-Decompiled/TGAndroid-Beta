package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yf1 implements RequestDelegate {
    public final int f46009a;
    public final fg1 f46010b;

    public yf1(fg1 fg1Var, int i10) {
        this.f46009a = i10;
        this.f46010b = fg1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f46009a) {
            case 0:
                final fg1 fg1Var = this.f46010b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                fg1.c0(fg1Var, tL_error, tLObject);
                                return;
                            default:
                                fg1.i0(fg1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new bg1(this.f46010b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new bg1(this.f46010b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new bg1(this.f46010b, tL_error, 2));
                return;
            default:
                final fg1 fg1Var2 = this.f46010b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                fg1.c0(fg1Var2, tL_error, tLObject);
                                return;
                            default:
                                fg1.i0(fg1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
