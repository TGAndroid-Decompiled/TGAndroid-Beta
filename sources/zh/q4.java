package zh;

import android.content.Context;
import android.content.SharedPreferences;
import bi.n9;
import java.util.Calendar;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gb0;
public final class q4 implements Runnable {
    public final int f52468a = 1;
    public final s5 f52469b;
    public final TLObject f52470c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 f52471e;
    public final Context f52472f;
    public final org.telegram.ui.ActionBar.f6 h;
    public final long f52473n;
    public final String f52474r;
    public final long f52475s;
    public final TLObject v;
    public final TLObject f52476w;

    public q4(s5 s5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, long j10, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f52469b = s5Var;
        this.f52470c = tLObject;
        this.d = tL_error;
        this.f52471e = callback2;
        this.f52472f = context;
        this.h = f6Var;
        this.f52473n = j3;
        this.f52474r = str;
        this.f52475s = j10;
        this.v = tLObject2;
        this.f52476w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        yc X;
        gb0 gb0Var;
        String str;
        yc X2;
        gb0 gb0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f52468a) {
            case 0:
                s5 s5Var = this.f52469b;
                TLObject tLObject = this.f52470c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.f52471e;
                Context context = this.f52472f;
                org.telegram.ui.ActionBar.f6 f6Var = this.h;
                long j3 = this.f52473n;
                String str3 = this.f52474r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f52476w;
                long j10 = this.f52475s;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    X = yc.a0(R);
                } else {
                    X = yc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(s5Var.f52566a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            s5.e0(context, f6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        k7 k7Var = new k7(context, f6Var, j3, 6, str3, new n9(s5Var, zArr, tL_payments_paymentFormStarGift, starGift, j10, callback2), 0L);
                        k7Var.setOnDismissListener(new s4(callback2, zArr, 2));
                        k7Var.show();
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
                        i2.g.s(i11, new Object[]{str}, X, i10, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new r4(s5Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                s5Var.D = false;
                s5Var.E = true;
                s5Var.G = 0L;
                s5Var.V();
                s5Var.Q(j10);
                s5Var.T(true);
                callback2.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(s5Var.f52566a).contains(j10)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(s5Var.f52566a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j10, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(s5Var.f52566a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j10, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && (gb0Var = launchActivity.f33467x0) != null) {
                    gb0Var.c(true);
                    return;
                }
                return;
            default:
                s5 s5Var2 = this.f52469b;
                TLObject tLObject2 = this.f52470c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.f52471e;
                Context context2 = this.f52472f;
                org.telegram.ui.ActionBar.f6 f6Var2 = this.h;
                long j11 = this.f52473n;
                String str4 = this.f52474r;
                long j12 = this.f52475s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f52476w;
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    X2 = yc.a0(R2);
                } else {
                    X2 = yc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(s5Var2.f52566a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            s5.e0(context2, f6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        k7 k7Var2 = new k7(context2, f6Var2, j11, 6, str4, new n9(s5Var2, zArr2, j12, tLObject3, tL_textWithEntities, callback22), 0L);
                        k7Var2.setOnDismissListener(new s4(callback22, zArr2, 1));
                        k7Var2.show();
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
                        i2.g.s(i13, new Object[]{str2}, X2, i12, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new r4(s5Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                s5Var2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(s5Var2.f52566a).contains(j12)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(s5Var2.f52566a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j12, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(s5Var2.f52566a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j12, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j12, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.G1;
                if (launchActivity2 != null && (gb0Var2 = launchActivity2.f33467x0) != null) {
                    gb0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public q4(s5 s5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f52469b = s5Var;
        this.f52470c = tLObject;
        this.d = tL_error;
        this.f52471e = callback2;
        this.f52472f = context;
        this.h = f6Var;
        this.f52473n = j3;
        this.f52474r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f52476w = starGift;
        this.f52475s = j10;
    }
}
