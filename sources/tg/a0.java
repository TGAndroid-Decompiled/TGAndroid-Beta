package tg;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.i10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.j80;
import org.telegram.ui.PremiumPreviewFragment;
public final class a0 implements View.OnClickListener {
    public final int f57847a;
    public final Object f57848b;

    public a0(Object obj, int i7) {
        this.f57847a = i7;
        this.f57848b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f57847a) {
            case 0:
                ((e21) this.f57848b).run();
                return;
            case 1:
                ((o2) this.f57848b).onBackPressed();
                return;
            case 2:
                ((j80) this.f57848b).performClick();
                return;
            case 3:
                PremiumPreviewFragment.u0();
                PremiumPreviewFragment.p0(((ug.h1) this.f57848b).f58810p2, null, "profile", null);
                return;
            case 4:
                final wg.f0 f0Var = (wg.f0) this.f57848b;
                yg.a aVar = f0Var.M2;
                if (!aVar.f61329a.R) {
                    aVar.b(true);
                    String str = f0Var.N2;
                    w10 w10Var = new w10() {
                        @Override
                        public final void a(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r62 = (Void) obj;
                                    f0 f0Var2 = f0Var;
                                    f0Var2.M2.b(false);
                                    f0Var2.dismiss();
                                    org.telegram.messenger.g0.h3(new d0(f0Var2, 1), 200L);
                                    return;
                                default:
                                    f0 f0Var3 = f0Var;
                                    f0Var3.M2.b(false);
                                    h.c((TLRPC.TL_error) obj, (FrameLayout) f0Var3.f30226b, f0Var3.J0, new d0(f0Var3, 0));
                                    return;
                            }
                        }
                    };
                    w10 w10Var2 = new w10() {
                        @Override
                        public final void a(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r62 = (Void) obj;
                                    f0 f0Var2 = f0Var;
                                    f0Var2.M2.b(false);
                                    f0Var2.dismiss();
                                    org.telegram.messenger.g0.h3(new d0(f0Var2, 1), 200L);
                                    return;
                                default:
                                    f0 f0Var3 = f0Var;
                                    f0Var3.M2.b(false);
                                    h.c((TLRPC.TL_error) obj, (FrameLayout) f0Var3.f30226b, f0Var3.J0, new d0(f0Var3, 0));
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10.f24637t0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new wg.n(w10Var2, w10Var, 0), 2);
                    return;
                }
                return;
            case 5:
                ((wg.i0) this.f57848b).dismiss();
                return;
            default:
                ((wg.a0) ((xg.e) this.f57848b)).f59824r.dismiss();
                return;
        }
    }
}
