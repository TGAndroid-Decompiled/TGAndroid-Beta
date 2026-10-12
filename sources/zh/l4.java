package zh;

import android.content.Context;
import android.content.SharedPreferences;
import bi.q9;
import java.util.Calendar;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jb0;
public final class l4 implements Runnable {
    public final int f50794a = 1;
    public final n5 f50795b;
    public final TLObject f50796c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 e;
    public final Context f50797f;
    public final org.telegram.ui.ActionBar.c6 h;
    public final long f50798n;
    public final String f50799r;
    public final long f50800s;
    public final TLObject v;
    public final TLObject f50801w;

    public l4(n5 n5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f50795b = n5Var;
        this.f50796c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f50797f = context;
        this.h = c6Var;
        this.f50798n = j10;
        this.f50799r = str;
        this.f50800s = j11;
        this.v = tLObject2;
        this.f50801w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        zc X;
        jb0 jb0Var;
        String str;
        zc X2;
        jb0 jb0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f50794a) {
            case 0:
                n5 n5Var = this.f50795b;
                TLObject tLObject = this.f50796c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f50797f;
                org.telegram.ui.ActionBar.c6 c6Var = this.h;
                long j10 = this.f50798n;
                String str3 = this.f50799r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f50801w;
                long j11 = this.f50800s;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    X = zc.a0(R);
                } else {
                    X = zc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(n5Var.f50864a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            n5.e0(context, c6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        e7 e7Var = new e7(context, c6Var, j10, 6, str3, new q9(n5Var, zArr, tL_payments_paymentFormStarGift, starGift, j11, callback2), 0L);
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
                        i2.d.q(i11, new Object[]{str}, X, i10, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new m4(n5Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                n5Var.D = false;
                n5Var.E = true;
                n5Var.G = 0L;
                n5Var.V();
                n5Var.Q(j11);
                n5Var.T(true);
                callback2.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(n5Var.f50864a).contains(j11)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(n5Var.f50864a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(n5Var.f50864a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j11, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && (jb0Var = launchActivity.f32147x0) != null) {
                    jb0Var.c(true);
                    return;
                }
                return;
            default:
                n5 n5Var2 = this.f50795b;
                TLObject tLObject2 = this.f50796c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f50797f;
                org.telegram.ui.ActionBar.c6 c6Var2 = this.h;
                long j12 = this.f50798n;
                String str4 = this.f50799r;
                long j13 = this.f50800s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f50801w;
                org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    X2 = zc.a0(R2);
                } else {
                    X2 = zc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(n5Var2.f50864a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            n5.e0(context2, c6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        e7 e7Var2 = new e7(context2, c6Var2, j12, 6, str4, new q9(n5Var2, zArr2, j13, tLObject3, tL_textWithEntities, callback22), 0L);
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
                        i2.d.q(i13, new Object[]{str2}, X2, i12, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new m4(n5Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                n5Var2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(n5Var2.f50864a).contains(j13)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(n5Var2.f50864a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(n5Var2.f50864a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j13, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.G1;
                if (launchActivity2 != null && (jb0Var2 = launchActivity2.f32147x0) != null) {
                    jb0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public l4(n5 n5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.f50795b = n5Var;
        this.f50796c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f50797f = context;
        this.h = c6Var;
        this.f50798n = j10;
        this.f50799r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f50801w = starGift;
        this.f50800s = j11;
    }
}
