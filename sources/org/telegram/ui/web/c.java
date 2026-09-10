package org.telegram.ui.web;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.m90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.p20;
import org.telegram.ui.uu0;
import org.telegram.ui.vg;
import pg.t2;
import xh.c3;
import xh.n7;
import xh.p7;
import xh.w3;
import xh.y5;
import xh.z7;
import zh.d7;
import zh.i4;
import zh.u7;
import zh.y6;
public final class c implements View.OnClickListener {
    public final int f37871a;
    public final Object f37872b;

    public c(Object obj, int i10) {
        this.f37871a = i10;
        this.f37872b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.ActionBar.p2 R;
        org.telegram.ui.ActionBar.p2 R2;
        switch (this.f37871a) {
            case 0:
                l lVar = (l) this.f37872b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lVar.getContext());
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.WebRecentClearTitle);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.WebRecentClearText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new a(lVar));
                hc.b.s(R.string.Cancel, alertDialog$Builder, null);
                return;
            case 1:
                ((uu0) this.f37872b).run();
                return;
            case 2:
                ((t2) this.f37872b).onBackPressed();
                return;
            case 3:
                ((vg) this.f37872b).run();
                return;
            case 4:
                ((m90) this.f37872b).performClick();
                return;
            case 5:
                PremiumPreviewFragment.p0();
                PremiumPreviewFragment.k0(((qg.m1) this.f37872b).f40830t0, null, "profile", null);
                return;
            case 6:
                final sg.h0 h0Var = (sg.h0) this.f37872b;
                ug.a aVar = h0Var.Q0;
                if (!aVar.f42665a.N) {
                    aVar.b(true);
                    String str = h0Var.R0;
                    Utilities.Callback callback = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r42 = (Void) obj;
                                    h0 h0Var2 = h0Var;
                                    h0Var2.Q0.b(false);
                                    h0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new e0(h0Var2, 1), 200L);
                                    return;
                                default:
                                    h0.c0(h0Var, (TLRPC.TL_error) obj);
                                    return;
                            }
                        }
                    };
                    Utilities.Callback callback2 = new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            switch (r2) {
                                case 0:
                                    Void r42 = (Void) obj;
                                    h0 h0Var2 = h0Var;
                                    h0Var2.Q0.b(false);
                                    h0Var2.dismiss();
                                    AndroidUtilities.runOnUIThread(new e0(h0Var2, 1), 200L);
                                    return;
                                default:
                                    h0.c0(h0Var, (TLRPC.TL_error) obj);
                                    return;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new sg.o(callback2, callback, 0), 2);
                    return;
                }
                return;
            case 7:
                ((sg.k0) this.f37872b).dismiss();
                return;
            case 8:
                ((sg.b0) ((tg.e) this.f37872b)).f41875r.dismiss();
                return;
            case 9:
                Runnable runnable = ((wg.c) this.f37872b).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 10:
                ((wh.c) this.f37872b).dismiss();
                return;
            case 11:
                ((wh.d0) this.f37872b).dismiss();
                return;
            case 12:
                if (((wh.p1) this.f37872b).f44292f0.f45777f > 0 && (R = LaunchActivity.R()) != 0) {
                    ?? obj = new Object();
                    obj.f18485a = true;
                    R.showAsSheet(new z7(), obj);
                    return;
                }
                return;
            case 13:
                ((xh.t) this.f37872b).dismiss();
                return;
            case 14:
                ((xh.e0) this.f37872b).dismiss();
                return;
            case 15:
                xh.i0 i0Var = (xh.i0) this.f37872b;
                yf.b bVar = i0Var.E.f46926a;
                yf.b bVar2 = yf.b.f46929b;
                if (bVar == bVar2) {
                    bVar2 = yf.b.f46928a;
                }
                i0Var.n(yf.a.i(0L, bVar2), true, false, true);
                i0Var.f45525c.setText("");
                return;
            case 16:
                ((xh.s0) this.f37872b).dismiss();
                return;
            case 17:
                ((xh.r1) this.f37872b).run();
                return;
            case 18:
                ((xh.r1) this.f37872b).run();
                return;
            case 19:
                c3 c3Var = (c3) this.f37872b;
                c3Var.getClass();
                new p7(c3Var.f45300b, c3Var.f45303g).show();
                return;
            case 20:
                ((w3) this.f37872b).dismiss();
                return;
            case 21:
                ((y5) this.f37872b).run();
                return;
            case 22:
                if (((n7) ((p20) this.f37872b).d).f45777f > 0 && (R2 = LaunchActivity.R()) != 0) {
                    ?? obj2 = new Object();
                    obj2.f18485a = true;
                    R2.showAsSheet(new z7(), obj2);
                    return;
                }
                return;
            case 23:
                yg.c0 c0Var = (yg.c0) this.f37872b;
                if (c0Var.f46957k) {
                    c0Var.d();
                    return;
                }
                return;
            case 24:
                zh.o1 o1Var = (zh.o1) this.f37872b;
                o1Var.q(!o1Var.f48670f0, true);
                return;
            case 25:
                ((u7) this.f37872b).N();
                return;
            case 26:
                ((i4) this.f37872b).dismiss();
                org.telegram.ui.ActionBar.p2 R3 = LaunchActivity.R();
                if (R3 != null) {
                    R3.showDialog(new qg.a1(R3, 14, false));
                    return;
                }
                return;
            case 27:
                y6 y6Var = (y6) this.f37872b;
                y6Var.onClick(y6Var.f49116b);
                return;
            default:
                d7 d7Var = (d7) this.f37872b;
                d7Var.f48353b.f48964u1.animate().alpha(0.0f).setDuration(150L).setListener(new zh.n7(d7Var, 0)).start();
                return;
        }
    }
}
