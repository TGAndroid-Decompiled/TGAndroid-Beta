package xh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b implements RequestDelegate {
    public final int f53711a;
    public final i f53712b;
    public final org.telegram.ui.ActionBar.x1 f53713c;

    public b(i iVar, org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        this.f53711a = i10;
        this.f53712b = iVar;
        this.f53713c = x1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f53711a) {
            case 0:
                final i iVar = this.f53712b;
                final org.telegram.ui.ActionBar.x1 x1Var = this.f53713c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                i.B0(iVar, x1Var, tLObject, tL_error);
                                return;
                            default:
                                i.C0(iVar, x1Var, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
            default:
                final i iVar2 = this.f53712b;
                final org.telegram.ui.ActionBar.x1 x1Var2 = this.f53713c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                i.B0(iVar2, x1Var2, tLObject, tL_error);
                                return;
                            default:
                                i.C0(iVar2, x1Var2, tLObject, tL_error);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
