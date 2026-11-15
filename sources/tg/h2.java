package tg;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.m10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
import org.telegram.ui.PremiumPreviewFragment;
public final class h2 implements View.OnClickListener {
    public final int f57333a;
    public final Object f57334b;

    public h2(Object obj, int i7) {
        this.f57333a = i7;
        this.f57334b = obj;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f57333a) {
            case 0:
                ((l2) this.f57334b).onBackPressed();
                return;
            case 1:
                ((z70) this.f57334b).performClick();
                return;
            case 2:
                PremiumPreviewFragment.u0();
                PremiumPreviewFragment.p0(((ug.g1) this.f57334b).f58101p2, null, "profile", null);
                return;
            case 3:
                final wg.e0 e0Var = (wg.e0) this.f57334b;
                yg.a aVar = e0Var.M2;
                if (!aVar.f60632a.R) {
                    aVar.b(true);
                    String str = e0Var.N2;
                    z10 z10Var = new z10() {
                        @Override
                        public final void a(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r62 = (Void) obj;
                                    e0 e0Var2 = e0Var;
                                    e0Var2.M2.b(false);
                                    e0Var2.dismiss();
                                    org.telegram.messenger.g0.i3(new c0(e0Var2, 1), 200L);
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    e0Var3.M2.b(false);
                                    h.c((TLRPC.TL_error) obj, (FrameLayout) e0Var3.f29682b, e0Var3.J0, new c0(e0Var3, 0));
                                    return;
                            }
                        }
                    };
                    z10 z10Var2 = new z10() {
                        @Override
                        public final void a(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r62 = (Void) obj;
                                    e0 e0Var2 = e0Var;
                                    e0Var2.M2.b(false);
                                    e0Var2.dismiss();
                                    org.telegram.messenger.g0.i3(new c0(e0Var2, 1), 200L);
                                    return;
                                default:
                                    e0 e0Var3 = e0Var;
                                    e0Var3.M2.b(false);
                                    h.c((TLRPC.TL_error) obj, (FrameLayout) e0Var3.f29682b, e0Var3.J0, new c0(e0Var3, 0));
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(m10.f24940t0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new wg.n(z10Var2, z10Var, 0), 2);
                    return;
                }
                return;
            case 4:
                ((wg.h0) this.f57334b).dismiss();
                return;
            default:
                ((wg.z) ((xg.f) this.f57334b)).f59296r.dismiss();
                return;
        }
    }
}
