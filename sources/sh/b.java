package sh;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.j10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.k80;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.af;
import tg.k2;
import ug.i1;
import wg.b0;
import wg.g0;
import wg.j0;
public final class b implements View.OnClickListener {
    public final int f57420a;
    public final Object f57421b;

    public b(Object obj, int i7) {
        this.f57420a = i7;
        this.f57421b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f57420a) {
            case 0:
                ((af) this.f57421b).run();
                return;
            case 1:
                ((h01) this.f57421b).run();
                return;
            case 2:
                ((k2) this.f57421b).onBackPressed();
                return;
            case 3:
                ((k80) this.f57421b).performClick();
                return;
            case 4:
                PremiumPreviewFragment.u0();
                PremiumPreviewFragment.p0(((i1) this.f57421b).f58691p2, null, "profile", null);
                return;
            case 5:
                final g0 g0Var = (g0) this.f57421b;
                yg.a aVar = g0Var.M2;
                if (!aVar.f61199a.R) {
                    aVar.b(true);
                    String str = g0Var.N2;
                    x10 x10Var = new x10() {
                        @Override
                        public final void a(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r62 = (Void) obj;
                                    g0 g0Var2 = g0Var;
                                    g0Var2.M2.b(false);
                                    g0Var2.dismiss();
                                    org.telegram.messenger.g0.h3(new e0(g0Var2, 1), 200L);
                                    return;
                                default:
                                    g0 g0Var3 = g0Var;
                                    g0Var3.M2.b(false);
                                    h.c((TLRPC.TL_error) obj, (FrameLayout) g0Var3.f30192b, g0Var3.J0, new e0(g0Var3, 0));
                                    return;
                            }
                        }
                    };
                    x10 x10Var2 = new x10() {
                        @Override
                        public final void a(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r62 = (Void) obj;
                                    g0 g0Var2 = g0Var;
                                    g0Var2.M2.b(false);
                                    g0Var2.dismiss();
                                    org.telegram.messenger.g0.h3(new e0(g0Var2, 1), 200L);
                                    return;
                                default:
                                    g0 g0Var3 = g0Var;
                                    g0Var3.M2.b(false);
                                    h.c((TLRPC.TL_error) obj, (FrameLayout) g0Var3.f30192b, g0Var3.J0, new e0(g0Var3, 0));
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(j10.f24773t0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new wg.n(x10Var2, x10Var, 0), 2);
                    return;
                }
                return;
            case 6:
                ((j0) this.f57421b).dismiss();
                return;
            default:
                ((b0) ((xg.e) this.f57421b)).f59722r.dismiss();
                return;
        }
    }
}
