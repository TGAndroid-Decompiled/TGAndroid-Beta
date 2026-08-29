package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f45738a;
    public final j f45739b;
    public final org.telegram.ui.ActionBar.c2 f45740c;

    public b(j jVar, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.f45738a = i10;
        this.f45739b = jVar;
        this.f45740c = c2Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f45738a) {
            case 0:
                final j jVar = this.f45739b;
                final org.telegram.ui.ActionBar.c2 c2Var = this.f45740c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                j.y0(jVar, c2Var, tLObject, tL_error);
                                return;
                            default:
                                j.z0(jVar, c2Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final j jVar2 = this.f45739b;
                final org.telegram.ui.ActionBar.c2 c2Var2 = this.f45740c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                j.y0(jVar2, c2Var2, tLObject, tL_error);
                                return;
                            default:
                                j.z0(jVar2, c2Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
