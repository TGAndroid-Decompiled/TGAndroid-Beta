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
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fb0;
public final class l4 implements Runnable {
    public final int f53062a = 1;
    public final n5 f53063b;
    public final TLObject f53064c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 f53065e;
    public final Context f53066f;
    public final org.telegram.ui.ActionBar.c6 h;
    public final long f53067n;
    public final String f53068r;
    public final long f53069s;
    public final TLObject v;
    public final TLObject f53070w;

    public l4(n5 n5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j3, String str, long j10, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f53063b = n5Var;
        this.f53064c = tLObject;
        this.d = tL_error;
        this.f53065e = callback2;
        this.f53066f = context;
        this.h = c6Var;
        this.f53067n = j3;
        this.f53068r = str;
        this.f53069s = j10;
        this.v = tLObject2;
        this.f53070w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        zc X;
        fb0 fb0Var;
        String str;
        zc X2;
        fb0 fb0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f53062a) {
            case 0:
                n5 n5Var = this.f53063b;
                TLObject tLObject = this.f53064c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.f53065e;
                Context context = this.f53066f;
                org.telegram.ui.ActionBar.c6 c6Var = this.h;
                long j3 = this.f53067n;
                String str3 = this.f53068r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f53070w;
                long j10 = this.f53069s;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    X = zc.a0(R);
                } else {
                    X = zc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(n5Var.f53146a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            n5.e0(context, c6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        e7 e7Var = new e7(context, c6Var, j3, 6, str3, new ha(n5Var, zArr, tL_payments_paymentFormStarGift, starGift, j10, callback2), 0L);
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
                        hg.c.s(i11, new Object[]{str}, X, i10, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new m4(n5Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                n5Var.D = false;
                n5Var.E = true;
                n5Var.G = 0L;
                n5Var.V();
                n5Var.Q(j10);
                n5Var.T(true);
                callback2.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(n5Var.f53146a).contains(j10)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(n5Var.f53146a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j10, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(n5Var.f53146a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j10, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && (fb0Var = launchActivity.f33660x0) != null) {
                    fb0Var.c(true);
                    return;
                }
                return;
            default:
                n5 n5Var2 = this.f53063b;
                TLObject tLObject2 = this.f53064c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.f53065e;
                Context context2 = this.f53066f;
                org.telegram.ui.ActionBar.c6 c6Var2 = this.h;
                long j11 = this.f53067n;
                String str4 = this.f53068r;
                long j12 = this.f53069s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f53070w;
                org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    X2 = zc.a0(R2);
                } else {
                    X2 = zc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(n5Var2.f53146a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            n5.e0(context2, c6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        e7 e7Var2 = new e7(context2, c6Var2, j11, 6, str4, new ha(n5Var2, zArr2, j12, tLObject3, tL_textWithEntities, callback22), 0L);
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
                        hg.c.s(i13, new Object[]{str2}, X2, i12, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new m4(n5Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                n5Var2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(n5Var2.f53146a).contains(j12)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(n5Var2.f53146a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j12, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(n5Var2.f53146a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j12, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j12, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.G1;
                if (launchActivity2 != null && (fb0Var2 = launchActivity2.f33660x0) != null) {
                    fb0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public l4(n5 n5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f53063b = n5Var;
        this.f53064c = tLObject;
        this.d = tL_error;
        this.f53065e = callback2;
        this.f53066f = context;
        this.h = c6Var;
        this.f53067n = j3;
        this.f53068r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f53070w = starGift;
        this.f53069s = j10;
    }
}
