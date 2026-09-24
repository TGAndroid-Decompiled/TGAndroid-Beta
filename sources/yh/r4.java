package yh;

import ai.ga;
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
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ab0;
public final class r4 implements Runnable {
    public final int f47937a = 1;
    public final t5 f47938b;
    public final TLObject f47939c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 e;
    public final Context f47940f;
    public final org.telegram.ui.ActionBar.d6 h;
    public final long f47941n;
    public final String f47942r;
    public final long f47943s;
    public final TLObject v;
    public final TLObject f47944w;

    public r4(t5 t5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, long j10, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f47938b = t5Var;
        this.f47939c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f47940f = context;
        this.h = d6Var;
        this.f47941n = j3;
        this.f47942r = str;
        this.f47943s = j10;
        this.v = tLObject2;
        this.f47944w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        yc X;
        ab0 ab0Var;
        String str;
        yc X2;
        ab0 ab0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f47937a) {
            case 0:
                t5 t5Var = this.f47938b;
                TLObject tLObject = this.f47939c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f47940f;
                org.telegram.ui.ActionBar.d6 d6Var = this.h;
                long j3 = this.f47941n;
                String str3 = this.f47942r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f47944w;
                long j10 = this.f47943s;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    X = yc.a0(R);
                } else {
                    X = yc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(t5Var.f48028a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            t5.e0(context, d6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        l7 l7Var = new l7(context, d6Var, j3, 6, str3, new ga(t5Var, zArr, tL_payments_paymentFormStarGift, starGift, j10, callback2), 0L);
                        l7Var.setOnDismissListener(new t4(callback2, zArr, 2));
                        l7Var.show();
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
                Utilities.stageQueue.postRunnable(new s4(t5Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                t5Var.D = false;
                t5Var.E = true;
                t5Var.G = 0L;
                t5Var.V();
                t5Var.Q(j10);
                t5Var.T(true);
                callback2.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(t5Var.f48028a).contains(j10)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(t5Var.f48028a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j10, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(t5Var.f48028a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j10, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && (ab0Var = launchActivity.f31130x0) != null) {
                    ab0Var.c(true);
                    return;
                }
                return;
            default:
                t5 t5Var2 = this.f47938b;
                TLObject tLObject2 = this.f47939c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f47940f;
                org.telegram.ui.ActionBar.d6 d6Var2 = this.h;
                long j11 = this.f47941n;
                String str4 = this.f47942r;
                long j12 = this.f47943s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f47944w;
                org.telegram.ui.ActionBar.m2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    X2 = yc.a0(R2);
                } else {
                    X2 = yc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(t5Var2.f48028a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            t5.e0(context2, d6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        l7 l7Var2 = new l7(context2, d6Var2, j11, 6, str4, new ga(t5Var2, zArr2, j12, tLObject3, tL_textWithEntities, callback22), 0L);
                        l7Var2.setOnDismissListener(new t4(callback22, zArr2, 1));
                        l7Var2.show();
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
                Utilities.stageQueue.postRunnable(new s4(t5Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                t5Var2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(t5Var2.f48028a).contains(j12)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(t5Var2.f48028a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j12, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(t5Var2.f48028a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j12, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j12, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.G1;
                if (launchActivity2 != null && (ab0Var2 = launchActivity2.f31130x0) != null) {
                    ab0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public r4(t5 t5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f47938b = t5Var;
        this.f47939c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f47940f = context;
        this.h = d6Var;
        this.f47941n = j3;
        this.f47942r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f47944w = starGift;
        this.f47943s = j10;
    }
}
