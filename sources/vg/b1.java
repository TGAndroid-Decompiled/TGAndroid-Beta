package vg;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.h10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
public final class b1 implements View.OnClickListener {
    public final int f56573a;
    public final Object f56574b;

    public b1(Object obj, int i3) {
        this.f56573a = i3;
        this.f56574b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f56573a) {
            case 0:
                PremiumPreviewFragment.u0();
                PremiumPreviewFragment.p0(((h1) this.f56574b).f56635m2, null, "profile", null);
                return;
            case 1:
                final xg.g0 g0Var = (xg.g0) this.f56574b;
                zg.a aVar = g0Var.J2;
                if (!aVar.f60461a.R) {
                    aVar.b(true);
                    String str = g0Var.K2;
                    u10 u10Var = new u10() {
                        @Override
                        public final void a(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r62 = (Void) obj;
                                    g0 g0Var2 = g0Var;
                                    g0Var2.J2.b(false);
                                    g0Var2.dismiss();
                                    org.telegram.messenger.g0.i3(new e0(g0Var2, 1), 200L);
                                    return;
                                default:
                                    g0 g0Var3 = g0Var;
                                    g0Var3.J2.b(false);
                                    j.c((TLRPC.TL_error) obj, (FrameLayout) g0Var3.f28586b, g0Var3.J0, new e0(g0Var3, 0));
                                    return;
                            }
                        }
                    };
                    u10 u10Var2 = new u10() {
                        @Override
                        public final void a(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r62 = (Void) obj;
                                    g0 g0Var2 = g0Var;
                                    g0Var2.J2.b(false);
                                    g0Var2.dismiss();
                                    org.telegram.messenger.g0.i3(new e0(g0Var2, 1), 200L);
                                    return;
                                default:
                                    g0 g0Var3 = g0Var;
                                    g0Var3.J2.b(false);
                                    j.c((TLRPC.TL_error) obj, (FrameLayout) g0Var3.f28586b, g0Var3.J0, new e0(g0Var3, 0));
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(h10.f22829t0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new xg.p(u10Var2, u10Var, 0), 2);
                    return;
                }
                return;
            case 2:
                ((xg.j0) this.f56574b).dismiss();
                return;
            default:
                ((xg.b0) ((yg.e) this.f56574b)).f58656r.dismiss();
                return;
        }
    }
}
