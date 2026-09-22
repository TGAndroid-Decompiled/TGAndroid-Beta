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
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ib0;
public final class s4 implements Runnable {
    public final int f48060a = 1;
    public final u5 f48061b;
    public final TLObject f48062c;
    public final TLRPC.TL_error d;
    public final Utilities.Callback2 e;
    public final Context f48063f;
    public final org.telegram.ui.ActionBar.f6 h;
    public final long f48064n;
    public final String f48065r;
    public final long f48066s;
    public final TLObject v;
    public final TLObject f48067w;

    public s4(u5 u5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, long j10, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f48061b = u5Var;
        this.f48062c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f48063f = context;
        this.h = f6Var;
        this.f48064n = j3;
        this.f48065r = str;
        this.f48066s = j10;
        this.v = tLObject2;
        this.f48067w = tL_textWithEntities;
    }

    @Override
    public final void run() {
        xc X;
        ib0 ib0Var;
        String str;
        xc X2;
        ib0 ib0Var2;
        String str2 = "FAILED_SEND_STARS";
        switch (this.f48060a) {
            case 0:
                u5 u5Var = this.f48061b;
                TLObject tLObject = this.f48062c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f48063f;
                org.telegram.ui.ActionBar.f6 f6Var = this.h;
                long j3 = this.f48064n;
                String str3 = this.f48065r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.f48067w;
                long j10 = this.f48066s;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null && R.visibleDialog == null) {
                    X = xc.a0(R);
                } else {
                    X = xc.X();
                }
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(u5Var.f48132a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            u5.e0(context, f6Var);
                            return;
                        }
                        boolean[] zArr = {false};
                        l7 l7Var = new l7(context, f6Var, j3, 6, str3, new ga(u5Var, zArr, tL_payments_paymentFormStarGift, starGift, j10, callback2), 0L);
                        l7Var.setOnDismissListener(new u4(callback2, zArr, 2));
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
                        hg.k0.q(i11, new Object[]{str}, X, i10, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new t4(u5Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                u5Var.D = false;
                u5Var.E = true;
                u5Var.G = 0L;
                u5Var.V();
                u5Var.Q(j10);
                u5Var.T(true);
                callback2.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(u5Var.f48132a).contains(j10)) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(u5Var.f48132a).getMainSettings().edit();
                    edit.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j10, false).apply();
                }
                SharedPreferences.Editor edit2 = MessagesController.getInstance(u5Var.f48132a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean = edit2.putBoolean("show_gift_for_" + j10, true);
                putBoolean.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity != null && (ib0Var = launchActivity.f31163x0) != null) {
                    ib0Var.c(true);
                    return;
                }
                return;
            default:
                u5 u5Var2 = this.f48061b;
                TLObject tLObject2 = this.f48062c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f48063f;
                org.telegram.ui.ActionBar.f6 f6Var2 = this.h;
                long j11 = this.f48064n;
                String str4 = this.f48065r;
                long j12 = this.f48066s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f48067w;
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                if (R2 != null && R2.visibleDialog == null) {
                    X2 = xc.a0(R2);
                } else {
                    X2 = xc.X();
                }
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(u5Var2.f48132a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            u5.e0(context2, f6Var2);
                            return;
                        }
                        boolean[] zArr2 = {false};
                        l7 l7Var2 = new l7(context2, f6Var2, j11, 6, str4, new ga(u5Var2, zArr2, j12, tLObject3, tL_textWithEntities, callback22), 0L);
                        l7Var2.setOnDismissListener(new u4(callback22, zArr2, 1));
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
                        hg.k0.q(i13, new Object[]{str2}, X2, i12, 36);
                        return;
                    }
                }
                Utilities.stageQueue.postRunnable(new t4(u5Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                u5Var2.T(true);
                callback22.run(Boolean.TRUE, null);
                if (BirthdayController.getInstance(u5Var2.f48132a).contains(j12)) {
                    SharedPreferences.Editor edit3 = MessagesController.getInstance(u5Var2.f48132a).getMainSettings().edit();
                    edit3.putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j12, false).apply();
                }
                SharedPreferences.Editor edit4 = MessagesController.getInstance(u5Var2.f48132a).getMainSettings().edit();
                SharedPreferences.Editor putBoolean2 = edit4.putBoolean("show_gift_for_" + j12, true);
                putBoolean2.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j12, true).apply();
                LaunchActivity launchActivity2 = LaunchActivity.G1;
                if (launchActivity2 != null && (ib0Var2 = launchActivity2.f31163x0) != null) {
                    ib0Var2.c(true);
                    return;
                }
                return;
        }
    }

    public s4(u5 u5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.f48061b = u5Var;
        this.f48062c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f48063f = context;
        this.h = f6Var;
        this.f48064n = j3;
        this.f48065r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.f48067w = starGift;
        this.f48066s = j10;
    }
}
