package yh;

import ai.ha;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Calendar;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ad;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eb0;
public final class l4 implements Runnable {
    public final int f52826a = 1;
    public final m5 f52827b;
    public final TLObject f52828c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 f52829e;
    public final Context f52830f;
    public final org.telegram.ui.ActionBar.e6 h;
    public final long f52831n;
    public final String f52832r;
    public final long f52833s;
    public final TLObject v;
    public final TLObject f52834w;

    public l4(m5 m5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, long j10, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f52827b = m5Var;
        this.f52828c = tLObject;
        this.d = tL_error;
        this.f52829e = callback2;
        this.f52830f = context;
        this.h = e6Var;
        this.f52831n = j3;
        this.f52832r = str;
        this.f52833s = j10;
        this.v = tLObject2;
        this.f52834w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        ad X;
        eb0 eb0Var;
        String str;
        ad X2;
        eb0 eb0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f52826a) {
            case 0:
                m5 m5Var = this.f52827b;
                TLObject tLObject = this.f52828c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.f52829e;
                Context context = this.f52830f;
                org.telegram.ui.ActionBar.e6 e6Var = this.h;
                long j3 = this.f52831n;
                String str3 = this.f52832r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f52834w;
                long j10 = this.f52833s;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    X = ad.a0(R);
                } else {
                    X = ad.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(m5Var.f52880a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            m5.e0(context, e6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        e7 e7Var = new e7(context, e6Var, j3, 6, str3, new ha(m5Var, zArr, tL_payments_paymentFormStarGift, starGift, j10, callback2), 0L);
                        e7Var.setOnDismissListener(new n4(callback2, zArr, 2));
                        e7Var.show();
                        return;
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        callback2.run(Boolean.FALSE, null);
                        int i10 = R.raw.error;
                        int i11 = R.string.UnknownErrorCode;
                        if (tL_error == null) {
                            str = "FAILED_SEND_STARS";
                        } else {
                            str = tL_error.text;
                        }
                        hg.c.q(i11, new Object[]{str}, X, i10, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new m4(m5Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                m5Var.D = false;
                m5Var.E = true;
                m5Var.G = 0L;
                m5Var.V();
                m5Var.Q(j10);
                m5Var.T(true);
                callback2.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(m5Var.f52880a).contains(j10)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(m5Var.f52880a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j10, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(m5Var.f52880a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j10, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && (eb0Var = launchActivity.f33821x0) != null) {
                    eb0Var.c(true);
                    return;
                }
                return;
            default:
                m5 m5Var2 = this.f52827b;
                TLObject tLObject2 = this.f52828c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.f52829e;
                Context context2 = this.f52830f;
                org.telegram.ui.ActionBar.e6 e6Var2 = this.h;
                long j11 = this.f52831n;
                String str4 = this.f52832r;
                long j12 = this.f52833s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f52834w;
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    X2 = ad.a0(R2);
                } else {
                    X2 = ad.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(m5Var2.f52880a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            m5.e0(context2, e6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        e7 e7Var2 = new e7(context2, e6Var2, j11, 6, str4, new ha(m5Var2, zArr2, j12, tLObject3, tL_textWithEntities, callback22), 0L);
                        e7Var2.setOnDismissListener(new n4(callback22, zArr2, 1));
                        e7Var2.show();
                        return;
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        callback22.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        return;
                    } else {
                        callback22.run(Boolean.FALSE, null);
                        int i12 = R.raw.error;
                        int i13 = R.string.UnknownErrorCode;
                        if (tL_error2 != null) {
                            str2 = tL_error2.text;
                        }
                        hg.c.q(i13, new Object[]{str2}, X2, i12, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new m4(m5Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                m5Var2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(m5Var2.f52880a).contains(j12)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(m5Var2.f52880a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j12, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(m5Var2.f52880a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j12, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j12, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.G1;
                if (launchActivity2 != null && (eb0Var2 = launchActivity2.f33821x0) != null) {
                    eb0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public l4(m5 m5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f52827b = m5Var;
        this.f52828c = tLObject;
        this.d = tL_error;
        this.f52829e = callback2;
        this.f52830f = context;
        this.h = e6Var;
        this.f52831n = j3;
        this.f52832r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f52834w = starGift;
        this.f52833s = j10;
    }
}
