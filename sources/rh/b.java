package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f43530a;
    public final j f43531b;
    public final org.telegram.ui.ActionBar.d2 f43532c;

    public b(j jVar, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f43530a = i10;
        this.f43531b = jVar;
        this.f43532c = d2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43530a) {
            case 0:
                final j jVar = this.f43531b;
                final org.telegram.ui.ActionBar.d2 d2Var = this.f43532c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                j.y0(jVar, d2Var, tLObject, tL_error);
                                return;
                            default:
                                j.z0(jVar, d2Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final j jVar2 = this.f43531b;
                final org.telegram.ui.ActionBar.d2 d2Var2 = this.f43532c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                j.y0(jVar2, d2Var2, tLObject, tL_error);
                                return;
                            default:
                                j.z0(jVar2, d2Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
