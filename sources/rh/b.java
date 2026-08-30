package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f43464a;
    public final k f43465b;
    public final org.telegram.ui.ActionBar.d2 f43466c;

    public b(k kVar, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f43464a = i10;
        this.f43465b = kVar;
        this.f43466c = d2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43464a) {
            case 0:
                final k kVar = this.f43465b;
                final org.telegram.ui.ActionBar.d2 d2Var = this.f43466c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                k.y0(kVar, d2Var, tLObject, tL_error);
                                return;
                            default:
                                k.z0(kVar, d2Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final k kVar2 = this.f43465b;
                final org.telegram.ui.ActionBar.d2 d2Var2 = this.f43466c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                k.y0(kVar2, d2Var2, tLObject, tL_error);
                                return;
                            default:
                                k.z0(kVar2, d2Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
