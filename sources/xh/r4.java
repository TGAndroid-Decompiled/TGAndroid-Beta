package xh;

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
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gb0;
public final class r4 implements Runnable {
    public final int f45956a = 1;
    public final v5 f45957b;
    public final TLObject f45958c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 e;
    public final Context f45959f;
    public final org.telegram.ui.ActionBar.f6 h;
    public final long f45960n;
    public final String f45961r;
    public final long f45962s;
    public final TLObject v;
    public final TLObject f45963w;

    public r4(v5 v5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, long j10, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f45957b = v5Var;
        this.f45958c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f45959f = context;
        this.h = f6Var;
        this.f45960n = j3;
        this.f45961r = str;
        this.f45962s = j10;
        this.v = tLObject2;
        this.f45963w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        wc X;
        gb0 gb0Var;
        String str;
        wc X2;
        gb0 gb0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f45956a) {
            case 0:
                v5 v5Var = this.f45957b;
                TLObject tLObject = this.f45958c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f45959f;
                org.telegram.ui.ActionBar.f6 f6Var = this.h;
                long j3 = this.f45960n;
                String str3 = this.f45961r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f45963w;
                long j10 = this.f45962s;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    X = wc.a0(R);
                } else {
                    X = wc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(v5Var.f46176a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            v5.e0(context, f6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        o7 o7Var = new o7(context, f6Var, j3, 6, str3, new org.telegram.tgnet.c(v5Var, zArr, tL_payments_paymentFormStarGift, starGift, j10, callback2), 0L);
                        o7Var.setOnDismissListener(new t4(callback2, zArr, 2));
                        o7Var.show();
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
                        com.google.android.gms.internal.vision.e2.o(i11, new Object[]{str}, X, i10, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new s4(v5Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                v5Var.D = false;
                v5Var.E = true;
                v5Var.G = 0L;
                v5Var.V();
                v5Var.Q(j10);
                v5Var.T(true);
                callback2.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(v5Var.f46176a).contains(j10)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(v5Var.f46176a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j10, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(v5Var.f46176a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j10, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && (gb0Var = launchActivity.f29971x0) != null) {
                    gb0Var.c(true);
                    return;
                }
                return;
            default:
                v5 v5Var2 = this.f45957b;
                TLObject tLObject2 = this.f45958c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f45959f;
                org.telegram.ui.ActionBar.f6 f6Var2 = this.h;
                long j11 = this.f45960n;
                String str4 = this.f45961r;
                long j12 = this.f45962s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f45963w;
                org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    X2 = wc.a0(R2);
                } else {
                    X2 = wc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(v5Var2.f46176a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            v5.e0(context2, f6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        o7 o7Var2 = new o7(context2, f6Var2, j11, 6, str4, new org.telegram.tgnet.c(v5Var2, zArr2, j12, tLObject3, tL_textWithEntities, callback22, 4), 0L);
                        o7Var2.setOnDismissListener(new t4(callback22, zArr2, 1));
                        o7Var2.show();
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
                        com.google.android.gms.internal.vision.e2.o(i13, new Object[]{str2}, X2, i12, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new s4(v5Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                v5Var2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(v5Var2.f46176a).contains(j12)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(v5Var2.f46176a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j12, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(v5Var2.f46176a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j12, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j12, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.G1;
                if (launchActivity2 != null && (gb0Var2 = launchActivity2.f29971x0) != null) {
                    gb0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public r4(v5 v5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f45957b = v5Var;
        this.f45958c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f45959f = context;
        this.h = f6Var;
        this.f45960n = j3;
        this.f45961r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f45963w = starGift;
        this.f45962s = j10;
    }
}
