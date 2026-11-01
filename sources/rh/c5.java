package rh;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.k20;
import org.telegram.messenger.r00;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.v90;
public final class c5 implements Runnable {
    public final int f46721a = 1;
    public final e6 f46722b;
    public final TLObject f46723c;
    public final TLRPC.TL_error d;
    public final k20 e;
    public final Context f46724f;
    public final org.telegram.ui.ActionBar.p6 h;
    public final long f46725n;
    public final String f46726r;
    public final long f46727s;
    public final TLObject f46728w;
    public final TLObject f46729x;

    public c5(e6 e6Var, TLObject tLObject, TLRPC.TL_error tL_error, k20 k20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f46722b = e6Var;
        this.f46723c = tLObject;
        this.d = tL_error;
        this.e = k20Var;
        this.f46724f = context;
        this.h = p6Var;
        this.f46725n = j10;
        this.f46726r = str;
        this.f46727s = j11;
        this.f46728w = tLObject2;
        this.f46729x = tL_textWithEntities;
    }

    @Override
    public final void run() {
        cc X;
        v90 v90Var;
        String str;
        cc X2;
        v90 v90Var2;
        String str2;
        switch (this.f46721a) {
            case 0:
                e6 e6Var = this.f46722b;
                TLObject tLObject = this.f46723c;
                TLRPC.TL_error tL_error = this.d;
                k20 k20Var = this.e;
                Context context = this.f46724f;
                org.telegram.ui.ActionBar.p6 p6Var = this.h;
                long j10 = this.f46725n;
                String str3 = this.f46726r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.f46728w;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f46729x;
                long j11 = this.f46727s;
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null && Q.visibleDialog == null) {
                    X = cc.a0(Q);
                } else {
                    X = cc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (wp.r1(e6Var.f46863a).f19174k7) {
                            k20Var.a(Boolean.FALSE, null);
                            e6.c0(context, p6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        x7 x7Var = new x7(context, p6Var, j10, 6, str3, new r00(e6Var, zArr, tL_payments_paymentFormStarGift, starGift, j11, k20Var), 0L);
                        x7Var.setOnDismissListener(new d5(k20Var, zArr, 2));
                        x7Var.show();
                        return;
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        k20Var.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        k20Var.a(Boolean.FALSE, null);
                        if (tL_error == null) {
                            str = "FAILED_SEND_STARS";
                        } else {
                            str = tL_error.text;
                        }
                        X.Q(2131624011, 36, dd.a0(null, null, 2131743903, str)).j();
                        return;
                    }
                }
                Utilities.d.c(new b5(e6Var, (TLRPC.TL_payments_paymentResult) tLObject, 4));
                e6Var.D = false;
                e6Var.E = true;
                e6Var.G = 0L;
                e6Var.U();
                e6Var.P(j11);
                e6Var.S(true);
                k20Var.a(Boolean.TRUE, null);
                org.telegram.messenger.w1 b10 = org.telegram.messenger.y1.a(e6Var.f46863a).b();
                if (b10 != null && b10.a(j11)) {
                    SharedPreferences.Editor edit = wp.r1(e6Var.f46863a).f7.edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                }
                SharedPreferences.Editor edit2 = wp.r1(e6Var.f46863a).f7.edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j11, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity != null && (v90Var = launchActivity.f33398x0) != null) {
                    v90Var.c(true);
                    return;
                }
                return;
            default:
                e6 e6Var2 = this.f46722b;
                TLObject tLObject2 = this.f46723c;
                TLRPC.TL_error tL_error2 = this.d;
                k20 k20Var2 = this.e;
                Context context2 = this.f46724f;
                org.telegram.ui.ActionBar.p6 p6Var2 = this.h;
                long j12 = this.f46725n;
                String str4 = this.f46726r;
                long j13 = this.f46727s;
                TLObject tLObject3 = this.f46728w;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f46729x;
                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                if (Q2 != null && Q2.visibleDialog == null) {
                    X2 = cc.a0(Q2);
                } else {
                    X2 = cc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (wp.r1(e6Var2.f46863a).f19174k7) {
                            k20Var2.a(Boolean.FALSE, null);
                            e6.c0(context2, p6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        x7 x7Var2 = new x7(context2, p6Var2, j12, 6, str4, new r00(e6Var2, zArr2, j13, tLObject3, tL_textWithEntities, k20Var2), 0L);
                        x7Var2.setOnDismissListener(new d5(k20Var2, zArr2, 1));
                        x7Var2.show();
                        return;
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        k20Var2.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        k20Var2.a(Boolean.FALSE, null);
                        if (tL_error2 == null) {
                            str2 = "FAILED_SEND_STARS";
                        } else {
                            str2 = tL_error2.text;
                        }
                        X2.Q(2131624011, 36, dd.a0(null, null, 2131743903, str2)).j();
                        return;
                    }
                }
                Utilities.d.c(new b5(e6Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 3));
                e6Var2.S(true);
                k20Var2.a(Boolean.TRUE, null);
                org.telegram.messenger.w1 b11 = org.telegram.messenger.y1.a(e6Var2.f46863a).b();
                if (b11 != null && b11.a(j13)) {
                    SharedPreferences.Editor edit3 = wp.r1(e6Var2.f46863a).f7.edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                }
                SharedPreferences.Editor edit4 = wp.r1(e6Var2.f46863a).f7.edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j13, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.I1;
                if (launchActivity2 != null && (v90Var2 = launchActivity2.f33398x0) != null) {
                    v90Var2.c(true);
                    return;
                }
                return;
        }
    }

    public c5(e6 e6Var, TLObject tLObject, TLRPC.TL_error tL_error, k20 k20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f46722b = e6Var;
        this.f46723c = tLObject;
        this.d = tL_error;
        this.e = k20Var;
        this.f46724f = context;
        this.h = p6Var;
        this.f46725n = j10;
        this.f46726r = str;
        this.f46728w = tL_payments_paymentFormStarGift;
        this.f46729x = starGift;
        this.f46727s = j11;
    }
}
