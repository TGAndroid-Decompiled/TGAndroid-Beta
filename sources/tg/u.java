package tg;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.k10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.m80;
import org.telegram.ui.PremiumPreviewFragment;
public final class u implements View.OnClickListener {
    public final int f58186a;
    public final Object f58187b;

    public u(Object obj, int i7) {
        this.f58186a = i7;
        this.f58187b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f58186a) {
            case 0:
                ((f21) this.f58187b).run();
                return;
            case 1:
                ((l2) this.f58187b).onBackPressed();
                return;
            case 2:
                ((m80) this.f58187b).performClick();
                return;
            case 3:
                PremiumPreviewFragment.u0();
                PremiumPreviewFragment.p0(((ug.h1) this.f58187b).f58730p2, null, "profile", null);
                return;
            case 4:
                final wg.g0 g0Var = (wg.g0) this.f58187b;
                yg.a aVar = g0Var.M2;
                if (!aVar.f61245a.R) {
                    aVar.b(true);
                    String str = g0Var.N2;
                    y10 y10Var = new y10() {
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
                                    h.c((TLRPC.TL_error) obj, (FrameLayout) g0Var3.f30176b, g0Var3.J0, new e0(g0Var3, 0));
                                    return;
                            }
                        }
                    };
                    y10 y10Var2 = new y10() {
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
                                    h.c((TLRPC.TL_error) obj, (FrameLayout) g0Var3.f30176b, g0Var3.J0, new e0(g0Var3, 0));
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(k10.f24968t0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new wg.n(y10Var2, y10Var, 0), 2);
                    return;
                }
                return;
            case 5:
                ((wg.j0) this.f58187b).dismiss();
                return;
            default:
                ((wg.b0) ((xg.e) this.f58187b)).f59765r.dismiss();
                return;
        }
    }
}
